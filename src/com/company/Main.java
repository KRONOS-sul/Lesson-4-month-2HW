package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        String cC = "Список С: ";
//        Set listC = new TreeSet();

        for (int i = 1; i < 6; i++) {
            System.out.print("Введите имя(" + i + "): ");
            listA.add(scanner.next());
        }
        System.out.println("Список А: " + listA + "\n");

        for (int i = 1; i < 6; i++) {
            System.out.print("Введите имя(" + i + "): ");
            listB.add(scanner.next());
        }
        System.out.println("Список B: " + listB);

        listA.addAll(listB);
        listC.addAll(listA);

        Comparator<String> stringLengthComparator = new StringLengthComparator();

        Collections.shuffle(listC);
        System.out.println("Список С: " + listC + "\n");

        Collections.sort(listC, stringLengthComparator);
        for (String str : listC) {
            System.out.print("Список С: " + str + "\n");
        }

    }
}
