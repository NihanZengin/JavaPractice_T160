package SN_1;

import java.util.HashMap;
import java.util.Map;

public class S3 {

    public static void main(String[] args) {

        //  Java'da bir Map kullanarak
        //  bir metin içindeki kelimelerin kaç kez tekrarlandığını hesaplayan bir program yazın.

        String metin = "Java programlama dili Java platformunda çalışır Java";


        Map<String, Integer> kelimeSayilari = new HashMap<>();

        String[] kelimeler = metin.split(" ");

        for (String eachKelime : kelimeler) {

            eachKelime = eachKelime.toLowerCase();

            kelimeSayilari.put(eachKelime, kelimeSayilari.getOrDefault(eachKelime, 0) + 1);

        }
        /*
         // Ayrılan kelimeler üzerinde döngüye gir
        for (String eachkelime : kelimeler) {
            // Küçük-büyük harf duyarlılığını kaldır
            eachkelime = eachkelime.toLowerCase();

            // getOrDefault yerine containsKey kullanımı
            if (kelimeSayilari.containsKey(eachkelime)) {
                // Eğer kelime varsa değeri bir artır
                kelimeSayilari.put(eachKelime, kelimeSayilari.get(kelime) + 1);
            } else {
                // Eğer kelime yoksa değeri 1 olarak ekle
                kelimeSayilari.put(kelime, 1);
            }
        }
         */

        System.out.println(kelimeSayilari);
    }


    }
