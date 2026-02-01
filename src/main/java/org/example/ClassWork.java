package org.example;

import java.util.ArrayList;

public class ClassWork {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Banan");
        list.add("Apple");
        list.add("Pineapple");

        for (String s : list) {
            System.out.println(s);
        }
    }
}