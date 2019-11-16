package com.company;
import java.util.Scanner;

public class Main {

    public static double km2Landmiles(double km) {
        double meilen=km*0.6214;
        return meilen;
        //alternativ: return km * 0.6213 ohne Zwischenvariable
    }

    public static double Landmiles2km(double meilen) {
        double km=meilen/0.6214;
        return km;
    }

    public static void main(String[] args) {
        System.out.println("Bitte Kilometer eingeben: ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        System.out.println(km+ " Kilometer entsprechen " +km2Landmiles(km)+ " Meilen");

        System.out.println("Bitte Meilen eingeben: ");
        double meilen = sc.nextDouble();
        System.out.println(meilen+ " Meilen entsprechen " +Landmiles2km(meilen)+ " Kilometer");
    }
}
