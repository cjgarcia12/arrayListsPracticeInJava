package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            String line = scanner.nextLine();

            if (line.isEmpty()) {
                stop = true;
            } else {
                list.add(line);
            }
        }

        if (list.isEmpty()) {
            System.out.println("\nNothing in the list");
        } else {
            System.out.println("\nThe total amount of items in the list was: " + list.size());
        }

    }
}
