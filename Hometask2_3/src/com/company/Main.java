package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        for (num = 1; num <= 256; num *= 2) {
            sum = sum + num;
            }
        System.out.println(sum);
    }
}
