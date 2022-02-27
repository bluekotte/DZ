package com.company;

public class Main {

    public static void main(String[] args) {
        int [] mas = new int[10];
        int a = 0;
        for (int i = 1; i < 21; i++){
            if (i % 2 == 0){
                mas[a] = i;
                a++;
            }
        }
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}
