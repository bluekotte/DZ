package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.processor = "Intel";
        comp.memory = "8 gb";
        comp.disk = "240 gb";
        comp.resource = 3;
        comp.description();
        comp.turnOn();
        comp.turnOff();
        comp.turnOn();
        comp.turnOff();
    }
}

class Computer {
    String processor;
    String memory;
    String disk;
    int resource;
    boolean burned = false;

    public void description() {
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память: " + memory);
        System.out.println("Жесткий диск: " + disk);
        System.out.println("Ресурс полных циклов работы: " + resource);
    }

    public void turnOn() {
        if (!burned && resource > 0){
            int random = (int)(Math.random() * 2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int number = sc.nextInt();
            if (number == random) {
                System.out.println("Компьютер включился");
                resource--;
            }
            else {
                burned = true;
                System.out.println("Компьютер сгорел");
            }
        }
        else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void turnOff() {
        if (!burned && resource > 0){
            int random = (int)(Math.random() * 2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int number = sc.nextInt();
            if (number == random) {
                System.out.println("Компьютер выключился");
                resource--;
            }
            else {
                burned = true;
                System.out.println("Компьютер сгорел");
            }
        }
        else {
            System.out.println("Компьютер сгорел");
        }
    }

}
