package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 5;
        Student[] students;
        students = Student.createGroup(count);
        Student.printHigh(Student.getHigh(students));
        Student.printMedium(Student.getMedium(students));
        Student.printLow(Student.getLow(students));
    }
}

class Student{
    String name;
    String group;
    int score;
    Student() {
        group = "QA18";
        score = (int)(Math.random() * 10) + 1;
    }

    public static Student[] createGroup(int count) {
        Student[] array = new Student[count];
        for (int i = 0; i < array.length; i++){
            array[i] = new Student();
            array[i].name = "Student_" + i;
            System.out.println(array[i].name + " " + array[i].group + " " + array[i].score);
        }
        return array;
    }

    public static Student[] getHigh(Student[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].score > 8){
                count++;
            }
        }
        Student[] high = new Student[10];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].score > 8){
                high[index] = array[i];
                index++;
            }
        }
        return high;
    }

    public static Student[] getMedium(Student[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].score > 3 && array[i].score < 9){
                count++;
            }
        }
        Student[] medium = new Student[10];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].score > 3 && array[i].score < 9){
                medium[index] = array[i];
                index++;
            }
        }
        return medium;
    }

    public static Student[] getLow(Student[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].score < 4){
                count++;
            }
        }
        Student[] low = new Student[count];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].score < 4){
                low[index] = array[i];
                index++;
            }
        }
        return low;
    }

    public static void printHigh(Student[] array){
        System.out.println("Список отличников: ");
        for(int i = 0; i < array.length; i++){
            if (array[i] != null) {
                System.out.println(array[i].name);
            }
        }
    }

    public static void printMedium(Student[] array){
        System.out.println("Список хорошистов: ");
        for(int i = 0; i < array.length; i++){
            if (array[i] != null) {
                System.out.println(array[i].name);
            }
        }
    }

    public static void printLow(Student[] array){
        System.out.println("Список двоечников: ");
        for(int i = 0; i < array.length; i++){
            if (array[i] != null) {
                System.out.println(array[i].name);
            }
        }
    }
}
