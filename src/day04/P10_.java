package day04;

import java.util.Scanner;

public class P10_ {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        /*
                Problem tanımı :
                Bir String içinde kaç harf olduğunu yazdıran bir method yazınız.
                Test Data:
                Input the string: The quick brown fox jumps over the lazy dog.
                Expected Output: Number of letter in the string: 9
    */

        System.out.print("Bir cumle yaziniz: ");
        String cumle=scanner.nextLine();
        harfleriSay(cumle);

    }

    private static void harfleriSay(String cumle) {
        String cumle1=cumle.toLowerCase().replaceAll("\\s","");
        cumle1=cumle.toLowerCase().replaceAll("\\W","");

        int harfAdedi=cumle1.length();
        System.out.println("Cumlenizde "+harfAdedi+" adet harf vardir.");;
    }
}
