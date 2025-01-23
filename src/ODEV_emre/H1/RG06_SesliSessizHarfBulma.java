package ODEV_emre.H1;

import java.util.Scanner;

public class RG06_SesliSessizHarfBulma {
    public static void main(String[] args) {
        /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */


        Scanner scanner= new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");

     //  String harf= scanner.next().toLowerCase();
        char harf=scanner.next().charAt(0);



        if(harf>='a'&& harf<='z') {
            switch (harf) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(harf+" harfi sesli harftir");
                    break;
                default:
                    System.out.println(harf+" harfi sessiz harftir");
                    break;

            }
        }
        else {
            System.out.println("Yanlis karakter girdiniz!!!");
        }

        //we yazdigimda yani kullanici bir harften fazla yazdiginda  uyari vermeyi yapamadim.
        // charAt(0) tek harfe donostoryor


    }
}
