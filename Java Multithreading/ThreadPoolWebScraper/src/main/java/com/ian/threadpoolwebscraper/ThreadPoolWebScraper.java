
package com.ian.threadpoolwebscraper;



/*
    Create a web scraper that uses a thread pool to fetch and process multiple URLs concurrently.
*/




import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;

public class ThreadPoolWebScraper {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(5);  // Thread pool with 5 threads

    public static void main(String[] args) {
        // List of URLs to scrape
        List<String> urls = Arrays.asList(
            "https://www.youtube.com",
            "sample",
            ""
        );

        // Results list to store titles and links
        List<String> results = new ArrayList<>();

        // Submit tasks for each URL to the thread pool
        List<Future<Void>> futures = new ArrayList<>();
        for (String url : urls) {
            futures.add((Future<Void>) executorService.submit(() -> {
                try {
                    String result = scrapeWebsite(url);
                    synchronized (results) {
                        results.add(result);
                    }
                } catch (Exception e) {
                    System.err.println("Error processing URL: " + url + " | " + e.getMessage());
                }
            }));
        }

        // Wait for all tasks to finish
        for (Future<Void> future : futures) {
            try {
                future.get();  // Wait for each task to complete
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor service
        executorService.shutdown();

        // Save results to file
        saveResultsToFile(results);
        System.out.println("Scraping completed. Results saved to 'scraping_results.txt'");
    }

    // Scrapes a website and extracts the title and all links
    private static String scrapeWebsite(String url) throws IOException {
        System.out.println("Scraping: " + url);
        Document doc = Jsoup.connect(url).get();

        // Extract the title
        String title = doc.title();

        // Extract all links
        Elements links = doc.select("a[href]");  // All anchor tags with href attribute
        StringBuilder linkBuilder = new StringBuilder();
        for (Element link : links) {
            linkBuilder.append(link.absUrl("href")).append("\n");
        }

        // Combine title and links in a result string
        return "Title: " + title + "\nLinks:\n" + linkBuilder.toString();
    }

    // Saves the results to a file
    private static void saveResultsToFile(List<String> results) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("scraping_results.txt"))) {
            for (String result : results) {
                writer.write(result);
                writer.newLine();
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing results to file: " + e.getMessage());
        }
    }
}
