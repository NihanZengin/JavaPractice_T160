package day05;

import java.util.Scanner;

public class P02_ziplayanTop {
    public static void main(String[] args) {
        // Bir top belirli bir yükseklikten atılmaktadır.
// Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
// Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
// Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Topun birakilma yuksekligini giriniz: ");
        double h=scanner.nextDouble();
        double alinanYol=0;
        int sayac=0;

        while(h>1){       //1 metrenin altina indiginde duruyor
            alinanYol+=h; //dustugu yuksekligi alinan yola ekledik
            h*=0.75;      //her seferinde 3/4 u kadar yukseklikten geri duser
            sayac++; //her carpmada sayac bir artirilarak carpma sayisi bulunur
        }
        System.out.println("Top " +sayac+" kez zipladi ve toplamda "+alinanYol+" metre yol aldi");
    }
}
