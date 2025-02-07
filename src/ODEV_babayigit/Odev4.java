package ODEV_babayigit;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
         /*
            Kullanicidan satir sayisini alip
            asagidaki sekli olusturun

                1
               1 1
              1 2 1
             1 2 2 1
            1 2 3 2 1
           1 2 3 3 2 1

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen piramidin satir sayisini veriniz: ");
        int n = scanner.nextInt();  // Kullanıcının girdiği sayıyı alıyoruz

        for (int i = 1; i <= n; i++) {  // Dış döngü: Toplam `n` satır oluşturacak

            // 1. **Boşlukları Yazdır** (Sağa yaslamak için)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");  // Boşluk basıyoruz
            }

            // 2. **Artan Sayıları Yazdır** (1'den `i`'ye kadar)
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j);  //   bir boşluk bırak ve Sayıyı yazdır
            }

            // 3. **Azalan Sayıları Yazdır** (`i-1`'den 1'e kadar)
            for (int j = i-1 ; j >= 1; j--) {
                System.out.print(" "+j);  // bir boşluk bırak ve Sayıyı yazdır
            }

            // 4. **Bir Satır Aşağı İn** (Bir sonraki satıra geç)
            System.out.println();


        }
    }
}
