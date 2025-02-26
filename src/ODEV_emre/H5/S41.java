package ODEV_emre.H5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S41 {
    public static void main(String[] args) {


     /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin= scanner.nextLine();

        String[] kelimeler=metin.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        String sonHali="";

        for (int i = 0; i < kelimeler.length; i++) {
            sonHali+=Character.toUpperCase(kelimeler[i].charAt(0))+kelimeler[i].substring(1)+" ";
        }

        System.out.println(sonHali);








    }
}
