package SN_1;

import java.util.Scanner;

public class day03_length {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // ve girilen metinde kac karakter kullanildigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String str=scan.nextLine();

        System.out.println(str.length());

        //girilen metnin son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1));

        //bastan 3. karakteri yazdirin

        System.out.println(str.charAt(2));

        //metindeki bastan 2. ve sondan 3. karakterleri yanyana yazdirin

        System.out.println(str.charAt(1)+""+str.charAt(str.length()-3));



    }
}
