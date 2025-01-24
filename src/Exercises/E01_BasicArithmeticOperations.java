package Exercises;

import java.util.Scanner;

public class E01_BasicArithmeticOperations {
    public static void main(String[] args) {

       /* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
                Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Iki tamsayi giriniz... ");

        System.out.print("sayi1: ");
        int sayi1=scan.nextInt();

        System.out.print("sayi2: ");
        int sayi2=scan.nextInt();

        System.out.println(sayi1+" + "+sayi2+" = "+ (sayi1+sayi2));
        System.out.println(sayi1+" - "+sayi2+" = "+ (sayi1-sayi2));
        System.out.println(sayi1+" x "+sayi2+" = "+ (sayi1*sayi2));
        System.out.println(sayi1+" / "+sayi2+" = "+ (sayi1/sayi2));
        System.out.println(sayi1+" mod "+sayi2+" = "+ (sayi1%sayi2));








    }
}
