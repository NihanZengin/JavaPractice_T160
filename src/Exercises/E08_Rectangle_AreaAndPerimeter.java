package Exercises;

import java.util.Scanner;

public class E08_Rectangle_AreaAndPerimeter {
    public static void main(String[] args) {
        /*
        Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Dikdortgenin kenar uzunluklarini giriniz..");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();

        double area=kenar1*kenar2;
        double perimeter=2*(kenar1+kenar2);

        System.out.println("Area is "+kenar1+" * "+kenar2+" = "+area+"\nPerimeter is 2 * ("+kenar1+" + "+kenar2+") = "+perimeter);



    }
}
