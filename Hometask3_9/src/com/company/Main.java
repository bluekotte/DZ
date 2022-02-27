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
        } else {
            System.out.println("Что-то не так, перезапустите программу.");
        }
        if (num > 0){
            int[] mas;
            mas = new int[num];
            for (int i = 0; i < mas.length; i++){
                mas[i] = (int)(Math.random() * (15+1)) - 0;
                System.out.print(mas[i] + " ");
            }
            System.out.println();
            int  leftSide = 0;
            int rightSide = 0;
            int index;
            if (mas.length % 2 == 0){
                index = mas.length / 2;
            } else {
                index = mas.length / 2 + 1;
            }
            for (int i = 0; i < index; i++){
                leftSide = leftSide + mas[i];
            }
            for (int i = index; i < mas.length; i++){
                rightSide = rightSide + mas[i];
            }
            if (leftSide > rightSide){
                System.out.println("Сумма левой половины больше");
            } else if (leftSide < rightSide){
                System.out.println("Сумма правой половины больше");
            }
            else {
                System.out.println("Суммы левой и правой половины равны");
            }
        } else {
            System.out.println("Число меньше 0");
        }
    }
}
