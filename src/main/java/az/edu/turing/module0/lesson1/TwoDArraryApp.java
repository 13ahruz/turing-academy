package main.java.az.edu.turing.module0.lesson1;

import java.util.Scanner;

public class TwoDArraryApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
