package day01;

import java.util.Scanner;

public class P03_kullanicidanVeriAlma {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Adinizi yaziniz.."); // ln ifadesini sildik. Boylece yanina yazdirmis oluruz.
                                               // println olursa bir sonraki satırdan yazdırmaya başlar
//        String isim=scanner.next();// kullanicinin girdigi kelimeyi ilk bosliga kadar alir.
//        System.out.println("Adi: " + isim);

          String isim1 = scanner.nextLine();// kullanicinin yazdigi her seyi yazdirir.
//        System.out.println("Adi: " + isim1);

        System.out.print("Soyadinizi girin... ");

          String soyisim= scanner.next();
          System.out.println("Adi: "+isim1+"\nSoyadi: "+soyisim);
          System.out.println("Adi Soyadi: "+isim1+" "+soyisim);

        /**Adinizi yaziniz..Tarik Berk
         Adi: Tarik
         Adi:  Berk
         Soyadinizi girin...
         Burada nextLine'in atlama problemini burada goruyoruz.
         Buna iliskin makaleyi oku*/


    }
}
