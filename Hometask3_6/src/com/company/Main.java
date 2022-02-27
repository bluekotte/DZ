package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] mas;
        mas = new int[4];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * (10 +1)) - 0;
            System.out.print(mas[i] + " ");
        }
        boolean res = true;
        for (int i = 1; i < mas.length; i++){
            if (mas[i] < mas[i - 1]){
                res = false;
                break;
            }
        }
        System.out.println();
        if (res){
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else{
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
