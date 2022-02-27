package com.company;

public class Main {

    public static void main(String[] args) {
        int days = 7;
        double dayGoal = 10;
        double result = 0;
        int day;
        for (day = 1; day <= days; day++){
            if (day == 1){
                result = dayGoal;
            } else {
                dayGoal = dayGoal + (dayGoal * 0.1);
                result = result + dayGoal;
            }
        }
        System.out.println("За " + days + " дней пробежит " + result + " км");
    }
}
