package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Done entering integers into the list");
                stop = true;
            } else {
                list.add(number);
            }
        }

        System.out.println("What number are you looking for in the list?");
        int lookForNumber = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number == lookForNumber) {
                System.out.println(number + " is at index " + i);
            }
        }
    }
}
