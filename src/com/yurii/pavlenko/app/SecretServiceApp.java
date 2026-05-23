package com.yurii.pavlenko.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Application for sorting intercepted secret service messages by their length using optimized comparators.
 */
public class SecretServiceApp {

    public static void main(String[] args) {
        List<String> messages = new ArrayList<>(List.of(
                "Agreement reached at 11:40 PM",
                "Urgent!",
                "Alpha Cipher"
        ));

        // Sorting the list directly using the most efficient and readable modern syntax
        messages.sort(Comparator.comparingInt(String::length));

        System.out.println("=== Intercepted Messages Sorted by Priority ===");
        messages.forEach(System.out::println);
    }
}