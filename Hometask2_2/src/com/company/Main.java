package com.company;

public class Main {

    public static void main(String[] args) {
        int allTime = 24;
        int sum = 1;
        for (int time = 1; time <= allTime; time++){
            if (time % 3 == 0){
                sum = sum * 2;
            }
        }
        System.out.println("Количество амёб за " + allTime + " часов составляет " + sum);
    }
}
