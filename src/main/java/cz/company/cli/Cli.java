package cz.company.cli;

import cz.company.logic.Logic;

import java.util.Scanner;

public class Cli {
    private Scanner sc = new Scanner(System.in);
    private Logic logic = new Logic();

    public void start() {
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

    public void plus() {
        double[] a = getInput();
        System.out.println("Součet čísel "+a[0]+" a "+a[1]+" je "+logic.plus(a[0], a[1]));
    }

    public void minus() {
        double[] a = getInput();
        System.out.println("Rozdíl čísel "+a[0]+" a "+a[1]+" je "+logic.minus(a[0], a[1]));
    }

    public void times() {
        double[] a = getInput();
        System.out.println("Součin čísel "+a[0]+" a "+a[1]+" je "+logic.times(a[0], a[1]));
    }

    public void devided() {
        double[] a = getInput();
        try {
            System.out.println("Podíl čísel "+a[0]+" a "+a[1]+" je "+logic.divided(a[0], a[1]));
        } catch (Exception e) {
            System.out.println("Nulou nelze dělit!!!");
        }

    }

    public void power() {
        double[] a = getInput();
        System.out.println(a[0]+" na "+a[1]+" je "+logic.power(a[0], a[1]));
    }

    public void factorial() {
        System.out.println("Zadej číslo, ze kterého chceš vypočítat faktoriál: ");
        int num = getInt();
        try {
            System.out.println("Faktoriál z čísla "+num+" je "+logic.factorial(num));
        } catch (Exception e) {
            System.out.println("Faktoriál ze záporného čísla nelze vypočítat");
        }
    }

    public int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception ignored) {
            System.out.println("Toto není číslo");
        }
        return getInt();
    }

    public double getDouble() {
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (Exception ignored) {
            System.out.println("Toto není číslo");
        }
        return getDouble();
    }

    public double[] getInput() {
        System.out.println("Zadej první číslo:");
        double a = getDouble();
        System.out.println("Zadej druhé číslo:");
        double b = getDouble();
        return new double[]{a,b};
    }
}
