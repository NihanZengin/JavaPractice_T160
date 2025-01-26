package Exercises;

import java.util.Scanner;

public class E01_MultiplicationTable {
    public static void main(String[] args) {
        /*

        Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
         */
        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen bir rakam giriniz: ");
        int rakam=scan.nextInt();

        System.out.println(rakam+" x "+1+" = "+(rakam*1)+"\n"+
                rakam+" x "+2+" = "+(rakam*2)+"\n"+
                rakam+" x "+3+" = "+(rakam*3)+"\n"+
                rakam+" x "+4+" = "+(rakam*4)+"\n"+
                rakam+" x "+5+" = "+(rakam*5)+"\n"+
                rakam+" x "+6+" = "+(rakam*6)+"\n"+
                rakam+" x "+7+" = "+(rakam*7)+"\n"+
                rakam+" x "+8+" = "+(rakam*8)+"\n"+
                rakam+" x "+9+" = "+(rakam*9)+"\n"+
                rakam+" x "+10+" = "+(rakam*10)+"\n");


    }
}
