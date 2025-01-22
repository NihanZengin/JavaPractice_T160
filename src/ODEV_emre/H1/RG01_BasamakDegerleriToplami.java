package ODEV_emre.H1;

import java.util.Scanner;

public class RG01_BasamakDegerleriToplami {

    public static void main(String[] args) {
         /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi= scanner.nextInt();
        int sayilarToplami=0;

        int birlerBasamagi=sayi%10; //birler basamagi

        System.out.println("birler basamagi: "+birlerBasamagi);

        sayilarToplami+= birlerBasamagi;
        System.out.println("sayilar toplami: " + sayilarToplami);

        int onlarBasamagi=sayi/10; //3
        System.out.println("onlar basamagi: "+ onlarBasamagi);

        sayilarToplami+=onlarBasamagi;
        System.out.println("sayilar toplami: "+ sayilarToplami);


    }
}
