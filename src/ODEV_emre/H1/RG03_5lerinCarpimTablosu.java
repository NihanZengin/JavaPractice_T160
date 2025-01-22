package ODEV_emre.H1;

import java.util.Scanner;

public class RG03_5lerinCarpimTablosu {

    public static void main(String[] args) {
        /*3----
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */

        Scanner scanner = new Scanner (System.in);
        System.out.print("Carpim tablosunu gormek istediginiz rakami giriniz: ");

        int rakam= scanner.nextInt();

        System.out.println(rakam+" x "+1+" = "+rakam*1);

        System.out.println(rakam+" x "+2+" = "+rakam*2);

        System.out.println(rakam+" x "+3+" = "+rakam*3);
        System.out.println(rakam+" x "+4+" = "+rakam*4);
        System.out.println(rakam+" x "+5+" = "+rakam*5);
        System.out.println(rakam+" x "+6+" = "+rakam*6);
        System.out.println(rakam+" x "+7+" = "+rakam*7);
        System.out.println(rakam+" x "+8+" = "+rakam*8);
        System.out.println(rakam+" x "+9+" = "+rakam*9);
        System.out.println(rakam+" x "+10+" = "+rakam*10);

        //Carpim tablosunu gormek istediginiz rakami giriniz:5
        //5 x 1 = 5
        //5 x 2 = 10
        //5 x 3 = 15
        //5 x 4 = 20
        //5 x 5 = 25
        //5 x 6 = 30
        //5 x 7 = 35
        //5 x 8 = 40
        //5 x 9 = 45
        //5 x 10 = 50



    }
}
