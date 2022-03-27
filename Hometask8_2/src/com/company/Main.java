package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] mas = new String[size];
        for (int i = 0; i < size; i++) {
            mas[i] = in.next();
        }
        double average = 0;
        for (String item : mas) {
            average += item.length();
        }
        average /= mas.length;
        System.out.println("Average length of string is " + average);
        StringBuilder str = new StringBuilder("Result: ");
        for (int i = 0; i < size; i++) {
            if (mas[i].length() > average) {
                str.append(mas[i]).append(" longer than average ")
                        .append(" Size is ").append(mas[i].length())
                        .append("; ").append("\n");
            }
        }
        System.out.println(str);
    }
}
