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
        StringBuilder str = new StringBuilder();
        str.append(mas[2] + "\n")
                .append(mas[1].toUpperCase() + "\n")
                .append(mas[0].toLowerCase());
        System.out.println(str);
    }
}
