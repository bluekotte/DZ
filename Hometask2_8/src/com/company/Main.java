package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 4;
        for (int i = 4; x < i; i--){
            for (int j = i; j < x; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
