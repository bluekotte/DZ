package com.company;

import java.util.Scanner;

public class Main {
    // Проверить произведение элементов какой диагонали больше.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num >= 2) {
                int[][] mas;
                mas = new int[num][num];
                int sum  = 0;
                for (int i = 0; i < mas.length; i++) {
                    for (int j = 0; j < mas[0].length; j++) {
                        mas[i][j] = (int) (Math.random() * 51);
                        System.out.print(mas[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                int multy1 = 1;
                int multy2 = 1;
                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < mas[0].length; j++){
                        if(i == j){
                            multy1 = multy1 * mas[i][j];
                        }
                        if (i + j == num - 1){
                            multy2 = multy2 * mas[i][j];
                        }
                    }
                }
                System.out.println();
                System.out.println("Произведение главной: " + multy1 + " Произведение побочной: " + multy2);
                if(multy1 > multy2){
                    System.out.println("Произведение элементов главной диагонали больше");
                } else {
                    System.out.println("Произведение элементов побочной диагонали больше");
                }
            } else {
                System.out.println("Число меньше 2");
            }
        } else {
            System.out.println("Что-то не так, перезапустите программу.");
        }
    }
}
