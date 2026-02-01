package org.example;

import java.util.ArrayList;

public class ClassWork {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Melon");
        list.add("Coconut");
        list.add("Pineapple");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}