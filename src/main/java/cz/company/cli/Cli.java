package cz.company.cli;

import cz.company.logic.Logic;

import java.util.Scanner;

public class Cli {
    private static Scanner sc = new Scanner(System.in);
    private static Logic logic = new Logic();

    public static void start() {
        while(true) {
            System.out.println("Vyber co chceš udělat: ");
            System.out.println("1) Sčítání");
            System.out.println("2) Odčítání");
            System.out.println("3) Násobení");
            System.out.println("4) Dělení");
            System.out.println("5) Umocňování");
            System.out.println("6) Faktoriál");
            System.out.println("ostatní = Ukončit");
            int input = getInt();
            if(input == 1) plus();
            else if(input == 2) minus();
            else if(input == 3) times();
            else if(input == 4) devided();
            else if(input == 5) power();
            else if(input == 6) factorial();
            else System.exit(0);
        }
    }

    public static void plus() {
        System.out.println("Zadej první číslo:");
        double a = getDouble();
        System.out.println("Zadej druhé číslo:");
        double b = getDouble();
        System.out.println("Součet čísel "+a+" a "+b+" je "+logic.plus(a, b));
    }

    public static void minus() {
        System.out.println("Zadej první číslo:");
        double a = getDouble();
        System.out.println("Zadej druhé číslo:");
        double b = getDouble();
        System.out.println("Rozdíl čísel "+a+" a "+b+" je "+logic.minus(a, b));
    }

    public static void times() {
        System.out.println("Zadej první číslo:");
        double a = getDouble();
        System.out.println("Zadej druhé číslo:");
        double b = getDouble();
        System.out.println("Součin čísel "+a+" a "+b+" je "+logic.times(a, b));
    }

    public static void devided() {
        System.out.println("Zadej první číslo:");
        double a = getDouble();
        System.out.println("Zadej druhé číslo:");
        double b = getDouble();
        System.out.println("Podíl čísel "+a+" a "+b+" je "+logic.divided(a, b));
    }

    public static void power() {
        System.out.println("Zadej první číslo:");
        double a = getDouble();
        System.out.println("Zadej druhé číslo:");
        double b = getDouble();
        System.out.println(a+" na "+b+" je "+logic.power(a, b));
    }

    public static void factorial() {
        System.out.println("Zadej číslo, ze kterého chceš vypočítat faktoriál: ");
        int num = getInt();
        System.out.println("Faktoriál z čísla "+num+" je "+logic.factorial(num));
    }

    public static int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception ignored) {
            System.out.println("Toto není číslo");
        }
        return getInt();
    }

    public static double getDouble() {
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (Exception ignored) {
            System.out.println("Toto není číslo");
        }
        return getDouble();
    }
}
