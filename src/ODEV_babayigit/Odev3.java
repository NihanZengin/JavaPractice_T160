package ODEV_babayigit;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
//        SORU: // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lutfen bir metin giriniz: ");
        String str=scanner.nextLine();
        System.out.println(str.contains(" ") ? "Metin bosluk iceriyor" : "Metin bosluk icermiyor");




//        SORU:  // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
//        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        System.out.print("Lutfen ad ve soyad giriniz: ");
        String adSoyad=scanner.nextLine();


        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad=adSoyad.substring(adSoyad.indexOf(" "));

        System.out.println("Ad: "+ad+"\nSoyad:"+soyad);




//        SORU:String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
//        String  str 1= %13.99
//        String str 2= %10.55
//        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.


        String  str1= "%13.99";
        String str2= "%10.55";

        // '%' işaretini kaldır ve String'i double'a çevir
        double price1 = Double.parseDouble(str1.replace("%", ""));
        double price2 = Double.parseDouble(str2.replace("%", ""));

        // Toplamı hesapla
        double total = price1 + price2;

        // Sonucu yazdır
        System.out.println("Toplam fiyat: $" + total);



    }



}
