package com.codegym.quadraticEquation;

class QuadraticEquation {
    private double a, b, c;
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }
    private double getDiscriminant() {
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }
    private double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant()))/ (2*this.a));
    }
    private double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant()))/ (2*this.a));
    }

    String display() {
        if (getA() == 0 && getB() == 0 && getC() == 0) return "The equation has countless roots";
        else if (getDiscriminant() > 0)
        return "The equation has two roots " + getRoot1() + " and " + getRoot2();
        else if (getDiscriminant() == 0)
            return "The equation has one roots " + getRoot1();
        return "The equation has no real roots!";
    }
}
