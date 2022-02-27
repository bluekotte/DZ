package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int [] mas;
        mas = new int[20];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * (20 + 1)) - 0;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++){
            if (i % 2 != 0){
                mas [i] = 0;
            }
            System.out.print(mas[i] + " ");
        }
    }
}
