package main.java.az.edu.turing.module0.lesson2;

import java.util.Scanner;

public class TwoDigitNumberApp {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        if (number / 10 > -10 && number / 10 < 10 && number / 10 != 0) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}

