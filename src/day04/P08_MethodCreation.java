package day04;

import java.util.Scanner;

public class P08_MethodCreation {
    public static void main(String[] args) {
        //isim soyisim yazdir methodu

        isimSoyisimYazdir();

    }
    public static void isimSoyisimYazdir(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Isminiz: ");
        String isim=scanner.nextLine();

        System.out.print("Soyisminiz: ");
        String soyisim=scanner.nextLine();

        System.out.println(isim.toUpperCase().charAt(0)+". "+soyisim.toUpperCase());
    }
}
