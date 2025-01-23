package ODEV_emre.H1;

import java.util.Scanner;

public class RG10_KelimeBulma {
    public static void main(String[] args) {
        /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen String ifadeler giriniz.");
        String cumle= scanner.nextLine();

        String arananString="is";

        System.out.println(cumle.contains(arananString) ? true : false );


    }
}
