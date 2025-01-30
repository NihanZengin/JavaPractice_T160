package Exercises;

import java.util.Scanner;

public class E07_AverageOfThreeNumbers {
    public static void main(String[] args) {


    /*
    Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc sayi giriniz..");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();

        System.out.println((sayi1+sayi2+sayi3)/2);
    }
}
