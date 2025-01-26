package Exercises;

public class E06_Circle_AreaAndPerimeter {
    public static void main(String[] args) {
        /*
        Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
         */

        //circle of radius --> r
        //Area=pi*r*r --> πr2
        //perimeter=2*pi*r

        double radius=7.5;

        double perimeter=2*Math.PI*radius;

        double area=Math.PI*radius*radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);





    }
}
