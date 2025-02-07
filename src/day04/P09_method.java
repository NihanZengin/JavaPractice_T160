package day04;

import java.util.Scanner;

public class P09_method {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        // Saati saniyeye,
        // kilometreyi metreye,
        // kilogrami gram'a
        // ceviren bir method yaziniz.

        System.out.println("----------- Donusturucu Programa Hosgeldiniz ----------");
        System.out.println("Donusum Methodunuzu Seciniz");
        System.out.println("1- Saat --> Saniye");
        System.out.println("2- Km --> Metre");
        System.out.println("3- Kg --> Gram");
        System.out.print("Seciminiz: ");

        Scanner scan=new Scanner(System.in);
        int secim=scan.nextInt();

        if (secim<1 || secim>3){
            System.out.println("Yanlis Secim Yaptiniz");
        }
        else{
            switch (secim){
                case 1: saatToSaniye(); break;
                case 2: kmToMetre(); break;
                case 3: kgToGram(); break;
            }
        }

    }

    private static void kgToGram() {
        System.out.print("kg cinsinden grama donusturmek istediginiz degeri giriniz...\nDeger: ");
        int kgDeger=scan.nextInt();
        System.out.println("Girdiginiz "+kgDeger+" kg "+(kgDeger*10000)+" gramdir.");
    }

    private static void kmToMetre() {
        System.out.println("km cinsinden metreye donusturmek istediginiz degeri giriniz\nDeger: ");
        int kmDeger=scan.nextInt();
        System.out.println("Girdiginiz "+kmDeger+" km "+(kmDeger*10000)+" metredir.");
    }

    private static void saatToSaniye() {
        System.out.println("saat cinsinden saniyeye donusturmek istediginiz degeri giriniz\nDeger: ");
        int saat=scan.nextInt();
        System.out.println("Girdiginiz "+saat+" saat "+(saat*10000)+" saniyedir.");
    }



}
