package day05;

import java.util.Scanner;

public class P03_SayiTahminOyunu {
    public static void main(String[] args) {
        /*
    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bilince de tebrik edip durduran bir kod yazalim
     */
        //double sayi=Math.random(); boyle de rastgele sayi uretebilirim.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Aklimdan 1-100 arasi sayi tuttum.\nHaydi sayiyi tahmin et: ");

        boolean dogruMu=false;
        int sayi=94;

        while(!dogruMu){
            int tahmin =scanner.nextInt();
            if(tahmin>sayi){
                System.out.println("artir biraz");
            }else if(tahmin<sayi){
                System.out.println("azalt bakalim");
            } else if (tahmin==sayi) {
                System.out.println("nasil bildin ya! Tebrikler");
            }
            else {
                System.out.println("Lutfen sayi girdiginizden emin olun");
            }
        }
    }
}
