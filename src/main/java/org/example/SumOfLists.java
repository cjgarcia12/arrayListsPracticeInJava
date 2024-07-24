package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfLists {
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

        int sum = 0;
        int i = 1;
        for (int num : list) {
            if (list.size() == i) {
                System.out.print(" and " + num + " ");
            } else {
                System.out.print(num + ", ");
            }
            sum += num;
            i++;
        }

        System.out.println("The sum of this list is: " + "\n" + sum);
    }

}
