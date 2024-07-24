package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
            System.out.println("\nNo items found");
        } else {
            String lastItem = list.get(list.size() - 1);
            System.out.println("\nThe last item in the list is: " + lastItem);
        }
    }
}
