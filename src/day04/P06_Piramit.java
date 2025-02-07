package day04;

import java.util.Scanner;

public class P06_Piramit {
    public static void main(String[] args) {



    /*
 Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *


           şeklini konsola yazdiriniz.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Piramidin taban boyutunu giriniz: ");
        int boyut=scanner.nextInt();
        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }





    }
}
