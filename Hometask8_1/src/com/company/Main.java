package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] mas = new String[size];
        for (int i = 0; i < size; i++){
            mas[i] = in.next();
        }
        String strMax = mas[0];
        String strMin = mas[0];
        for (int i = 1; i < size; i++){
            if(strMax.length() < mas[i].length()){
                strMax = mas[i];
            }
            if(strMin.length() > mas[i].length()){
                strMin = mas[i];
            }
        }
        StringBuilder str = new StringBuilder("Result: ");
        str.append("Max String is ").append(strMax);
        str.append(" Size is ").append(strMax.length());
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("Result: ");
        str1.append("Min String is ").append(strMin);
        str1.append(" Size is ").append(strMin.length());
        System.out.println(str1);
    }
}
