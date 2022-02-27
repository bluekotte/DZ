package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] mas;
        mas = new int[12];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * (12 + 1)) - 0;
            System.out.print(mas[i] + " ");
        }
        int max = mas[0];
        int maxIndex = 0;
        for (int i = 0; i < mas.length; i++){
            if (max <= mas[i]){
                max = mas[i];
                maxIndex = i;
            }
        }
        System.out.print("\n" + "максимум: " + max + "\n" + "индекс последнего вхождения в массив: " + maxIndex);
    }
}
