package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, String> hashmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        for (String element : list) {
            hashmap.put(element.length(), element);
        }
        for (Map.Entry<Integer, String> map : hashmap.entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue());
        }
    }
}