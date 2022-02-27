package com.company;

public class Main {

    public static void main(String[] args) {
        int size = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                size++;
            }
        }
        int [] mas = new int[size];
        int a = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                mas[a] = i;
                a++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = mas.length - 1; i >= 0; i--){
            System.out.print(mas[i] + " ");
        }
    }
}
