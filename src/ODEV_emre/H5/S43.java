package ODEV_emre.H5;

import java.util.Scanner;

public class S43 {
    public static void main(String[] args) {
         /*43----
    Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
    Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.


    Örnekler

    kayipHarfler("abdefg")
    Çıktı : c

    kayipHarfler("mnopqs")
    Çıktı : r

    kayipHarfler("abcdefgh")
    Çıktı : Sıralı Harfler

    ilk örnekte :  /// b harfinden sonra c gelmemiş
    ikinci örnekte : /// p harfinden sonra r gelmemiş
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String kelime=scanner.nextLine().toLowerCase();

        String eksikHarfler = eksikHarfleriBul(kelime);
        if (eksikHarfler.isEmpty()) { System.out.println("Sıralı Harfler"); }
        else { System.out.println("Eksik harfler: " + eksikHarfler); }

    }

    public static String eksikHarfleriBul(String kelime) {

        StringBuilder eksikler = new StringBuilder(); //String immutable oldugundan
                                                     // her defasinda atama yapmak yerine
                                                     //StringBuilder kullandik

        for (int i = 0; i < kelime.length() - 1; i++) {
            char mevcutHarf = kelime.charAt(i);
            char sonrakiHarf = kelime.charAt(i + 1); // Mevcut harften sonraki harfe kadar eksik harfleri bul
            for (char harf = (char) (mevcutHarf + 1);
                 harf < sonrakiHarf; harf++)
            { eksikler.append(harf).append(" "); } }
        return eksikler.toString().trim();

    }
}


