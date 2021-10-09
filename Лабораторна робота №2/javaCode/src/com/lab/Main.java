package com.lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте значення абсциси точки: ");
        float x = scanner.nextFloat();  // Введення значення x
        System.out.println("Задайте значення ординати точки: ");
        float y = scanner.nextFloat();  // Введення значення y

        // Перевірка належності точки до заштрихованої частини площини
        if (!(x < 0 && y > 0) && Math.pow(x, 2) + Math.pow(y, 2) >= 9 && Math.abs(x) <= 3 && Math.abs(y) <= 3) {
            System.out.println("Точка з координатами (" + x + ", " + y + ") належить заштрихованій частині площини"); // Вивід результату 1
        }
        else {
            System.out.println("Точка з координатами (" + x + ", " + y + ") не належить заштрихованій частині площини"); // Вивід результату 2
        }

        scanner.close();
    }
}
