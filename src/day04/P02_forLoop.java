package day04;

import java.util.Scanner;

public class P02_forLoop {

    public static void main(String[] args) {


        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cumle yaziniz: ");
        String str=scanner.nextLine();

        int sayac=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toUpperCase().charAt(i)=='A'){
                sayac++;
            }
            if (str.toUpperCase().charAt(i)=='C'){
                break;
            }
        }
        System.out.println("Girilen cumlede c harfine kadar "+sayac+ " adet a harfi var");


    }
}
