package day04;

import java.util.Scanner;

public class P04_ {
    public static void main(String[] args) {
        // Aşağıdaki şekilde çıktı veren programı print içerisinde
        // sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

        Scanner scanner=new Scanner(System.in);

        System.out.print("Satir sayisi: ");
        int satir=scanner.nextInt();

        System.out.print("Sutun sayisi: ");
        int sutun=scanner.nextInt();

        System.out.print("Sembol sayisi: ");
        String sembol=scanner.next();

        for (int i = 1; i <= satir ; i++) {
            for (int j = 1; j <= sutun ; j++) {
                System.out.print(sembol+" ");
            }
            System.out.println();               //her satir bittikten sonra alta gecmesi icin

        }
    }
}
