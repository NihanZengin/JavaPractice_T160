package day04;

import java.util.Scanner;

public class P07_BaklavaDeseni {
    public static void main(String[] args) {
        /*
        Baklava deseni olusturunuz.
          *
         * *
        * * *
       * * * *
      * * * * *
       * * * *
        * * *
         * *
          *


         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Baklava deseninin orta yanal uzunlugunu  giriniz: ");
        int boyut=scanner.nextInt();
        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = boyut-1; i >=1 ; i--) {
            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }
}
