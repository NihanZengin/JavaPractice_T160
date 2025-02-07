package day04;

import java.util.Scanner;

public class P14_While {
    public static void main(String[] args) {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime=scanner.next();

        int sayac=0;

        while (sayac<=kelime.length()-1) {
            if (sayac%2==1){
                System.out.println(sayac + " indexteki harf: "+kelime.charAt(sayac));

            }
            System.out.println();
            sayac++;

        }
    }
}
