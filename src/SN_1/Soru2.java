package SN_1;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 17’den kucuk bir pozitif tamsayi giriniz..");

        int sayi= scan.nextInt();
        int faktoriel=1;

        System.out.print(sayi+"! = ");

        for (int i=sayi; i>=2; i--){
            faktoriel*=i;

            System.out.print(i+" * ");
        }
        System.out.println("1 = "+faktoriel);







    }
}
