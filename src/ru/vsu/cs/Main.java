package ru.vsu.cs;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        double t1= GetValue("температура 1");
        double t2= GetValue("температура 2");
        double v1= GetValue("объём 1");
        double v2= GetValue("объём 2");

        double volume = MixVolume(v1, v2);
        double temp = MixTemp(t1, t2);
        PrintMixTempAndMixVolume(volume, temp);
    }

    private static double MixTemp (double t1, double t2) {
        return ((t1+t2) / 2);
    }

    private static double MixVolume (double v1, double v2) {
        return (v1+v2);
    }

    private static double GetValue(String NameOfValue) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("%s=", NameOfValue);
        return scanner.nextDouble();

    }

    private static void PrintMixTempAndMixVolume(double volume, double temp) {
        System.out.println("Объём смеси равен: " + volume);
        System.out.println("Температура смеси равна: " + temp);
    }

}




