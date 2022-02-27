package com.company;
import  java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] mas1;
        int[] mas2;
        mas1 = new int[10];
        mas2 = new int[10];
        for (int i = 0; i < mas1.length; i++){
            mas1[i] = (int)(Math.random() * (9+1)) - 0;
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++){
            mas2[i] = (int)(Math.random() * (9+1)) - 0;
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        double[] mas3;
        mas3 = new double[10];
        for (int i = 0; i < mas3.length; i++){
            mas3[i] = (double)mas1[i] / mas2[i];
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < mas3.length; i++){
            if (mas3[i] % 1 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

