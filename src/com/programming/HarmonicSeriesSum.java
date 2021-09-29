package com.programming;

import java.util.Scanner;

public class HarmonicSeriesSum {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N with decimal place (0.0) :");
        double N = sc.nextDouble();
        double sum = 0;

        for (double i = 1.0; i <= N; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
    }
}
