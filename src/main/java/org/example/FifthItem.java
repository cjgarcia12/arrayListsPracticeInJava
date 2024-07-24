package org.example;

import java.util.ArrayList;
import  java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            String line = scanner.nextLine();
            list.add(line);

            if (line.isEmpty()) {
                stop = true;
            }
        }

        try {
            String fifthItem = list.get(4);
            System.out.println("\nThe fifth item in the list is: " + fifthItem);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("there is no fifth item in the list");
        }


    }
}
