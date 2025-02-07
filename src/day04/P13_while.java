package day04;

import java.util.Scanner;

public class P13_while {
    public static void main(String[] args) {

        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner scanner=new Scanner(System.in);
        String input=""; //kullanicinin girdigi degeri saklamak icin olusturelan variable

        while(!input.equalsIgnoreCase("x")){
            System.out.println("Program calisiyor");
            System.out.println("Devam etmek icin bir tusa basiniz.. \nCikis icin x tusuna basiniz..");
            input=scanner.nextLine();
        }
        System.out.println("Programdan ciktiniz..");
    }

}
