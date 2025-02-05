package SN_1;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degeri olarak pozitif sayilar giriniz ");
        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();

        int toplam=0;

        if (baslangic>bitis){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        }
        else {

            for (int i=baslangic; i<=bitis; i++){
                toplam+=i;

            }

            System.out.println("Verilen degerler arasindaki sayilarin toplami : "+toplam);

        }



    }
}
