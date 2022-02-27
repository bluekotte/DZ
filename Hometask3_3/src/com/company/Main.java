package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] mas;
        mas = new int[15];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * (99 + 1)) - 0;
            System.out.print(mas[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("\n"+  count);
    }
}
