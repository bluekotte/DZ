package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] mas1;
        mas1 = new int[5];
        int[] mas2;
        mas2 = new int[5];
        for (int i = 0; i < mas1.length; i++){
            mas1[i] = (int)(Math.random() * (15 + 1)) - 0;
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas2.length; i++){
            mas2[i] = (int)(Math.random() * (15 + 1)) - 0;
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        double avg1 = 0;
        double avg2 = 0;
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < mas1.length; i++){
            sum1 += mas1[i];
        }
        avg1 = sum1 / mas1.length;
        System.out.println(avg1);
        for (int i = 0; i < mas2.length; i++){
            sum2 += mas2[i];
        }
        avg2 = sum2 / mas2.length;
        System.out.println(avg2);
        if (avg1 > avg2){
            System.out.println("Среднее значение первого оказалось больше второго ");}
            else if (avg1 < avg2){
                System.out.println("Среднее значение первого оказалось меньше второго ");}
            else if (avg1 == avg2){
                System.out.println("Средние значения равны");
            }
        }

    }


