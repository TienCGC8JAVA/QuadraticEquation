package com.codegym.quadraticEquation;

import java.util.Scanner;

public class InputAndDisplayResultEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a:");
        double a = scanner.nextDouble();
        System.out.println("Enter the b:");
        double b = scanner.nextDouble();
        System.out.println("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation.display());
    }
}