package org.example;

import java.util.Scanner;
import java.util.ArrayList;

class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Kl: ");
        grades.add(sc.nextInt());

        System.out.print("Ec: ");
        grades.add(sc.nextInt());

        System.out.print("Math: ");
        grades.add(sc.nextInt());

        System.out.print("Calculus: ");
        grades.add(sc.nextInt());

        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        double avg = (double) sum / grades.size();

        System.out.println("Student: " + name);
        System.out.println("Average: " + avg);
    }
}