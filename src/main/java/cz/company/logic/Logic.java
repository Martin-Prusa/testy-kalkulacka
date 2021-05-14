package cz.company.logic;

public class Logic {
    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double times(double a, double b) {
        return a * b;
    }

    public double divided(double a, double b) {
        if(b == 0) throw new IllegalArgumentException("Nulou nelze dělit!!!") ;
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public int factorial(int a) {
        if(a < 0) throw new IllegalArgumentException("Nelze vypočítat faktoriál ze záporného číslo");
        if(a == 0) return 1;
        if(a == 1) return 1;
        return a * factorial(a-1);
    }
}
