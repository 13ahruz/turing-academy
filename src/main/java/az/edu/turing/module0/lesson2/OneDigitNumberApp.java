package main.java.az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class OneDigitNumberApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        if (number / 10 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Ok");
        }
    }
}
