package com.lab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте значення кута β у градусах:");
        float beta = scanner.nextFloat();   //Введення градусної міри beta
        float rad = (float) ((beta * Math.PI) / 180);   //Обчислення радіанної міри beta
        System.out.println("Радіанна міра кута β: " + rad); //Вивід результату
        scanner.close();
    }
}



