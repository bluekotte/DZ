package com.company;
import java.util.Scanner;
public class Main {
    // Посчитать сумму четных элементов стоящих на главной диагонали.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num >= 2) {
                int[][] mas;
                mas = new int[num][num];
                int sum  = 0;
                for (int i = 0; i < mas.length; i++) {
                    for (int j = 0; j < mas[0].length; j++) {
                        mas[i][j] = (int) (Math.random() * 51);
                        System.out.print(mas[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                for (int i = 0; i < num; i++){
                    for(int j = 0; j < mas[0].length; j++){
                        if(i == j && mas[i][j] % 2 == 0){
                            sum = sum + mas[i][j];
                        }
                    }
                }
                if (sum > 0){
                    System.out.println("Сумма четных элементов главной диагонали равна: " + sum);
                }
                else{
                    System.out.println("Нет четных элементов на главной диагонали");
                }
            } else {
                System.out.println("Число меньше 2");
            }
        } else {
            System.out.println("Что-то не так, перезапустите программу.");
        }
    }
}
