package ru.vsu.cs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double t1 = getValue("температура 1");
        double t2 = getValue("температура 2");
        double v1 = getValue("объём 1");
        double v2 = getValue("объём 2");

        double volume = mixVolume(v1, v2);
        double temp = mixTemp(t1, t2);

        printValue("объем смеси", volume);
        printValue("температура смеси", temp);
    }

    private static double mixTemp(double t1, double t2) {
        return ((t1 + t2) / 2);
    }

    private static double mixVolume(double v1, double v2) {
        return (v1 + v2);
    }

    private static double getValue(String NameOfValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s = ", NameOfValue);
        return scanner.nextDouble();

    }

    private static void printValue(String name, double x) {
        System.out.printf("%s = %.1f%n", name, x);
    }

}



