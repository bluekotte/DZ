package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = 0;
        if (sc.hasNextInt()){
            num = sc.nextInt();
            System.out.println("Вы ввели: " + num);
            if (num > 3){
                int[] mas;
                mas = new int[num];
                int count = 0;
                for (int i = 0; i < mas.length; i++){
                    mas[i] = (int)(Math.random() * (num + 1)) - 0;
                    System.out.print(mas[i] + " ");
                    if (mas[i] % 2 == 0){
                        count++;
                    }
                }
                System.out.println();
                int[]mas2;
                mas2 = new int[count];
                int index = 0;
                for (int i = 0; i < mas.length; i++){
                    if (mas[i] % 2 == 0){
                        mas2[index] = mas[i];
                        index++;
                    }
                }
                for(int i = 0; i < count; i++){
                    System.out.print(mas2[i] + " ");
                }
            } else {
                System.out.println("Число меньше 3");
            }
        }
        else {
            System.out.println("Что-то пошло не так");
        }
    }
}
