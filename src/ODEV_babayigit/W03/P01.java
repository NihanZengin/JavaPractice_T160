package ODEV_babayigit.W03;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        //Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz..");
        int sayi=scan.nextInt();


        if(sayi<100 || sayi>999) {
            System.out.println("Lutfen uc basamakli bir tamsayi giriniz");
            return; // return ile kosul saglaniyorsa program sonlanir.

        }

        int yuzler=sayi/100;
        int onlar=(sayi/10)%10;
        int birler=sayi%10;


        switch(yuzler){
            case 1: System.out.print("yuz ");break;
            case 2: System.out.print("ikiyuz ");break;
            case 3: System.out.print("ucyuz ");break;
            case 4: System.out.print("dortyuz ");break;
            case 5: System.out.print("besyuz ");break;
            case 6: System.out.print("altiyuz ");break;
            case 7: System.out.print("yediyuz ");break;
            case 8: System.out.print("sekizyuz ");break;
            case 9: System.out.print("dokuzyuz ");break;

            }
        switch(onlar){
            case 1: System.out.print("on ");break;
            case 2: System.out.print("yirmi ");break;
            case 3: System.out.print("otuz ");break;
            case 4: System.out.print("kirk ");break;
            case 5: System.out.print("elli ");break;
            case 6: System.out.print("altmis ");break;
            case 7: System.out.print("yetmis ");break;
            case 8: System.out.print("seksen ");break;
            case 9: System.out.print("doksan ");break;

        }
        switch(birler){
            case 1: System.out.print("bir "); break;
            case 2: System.out.print("iki "); break;
            case 3: System.out.print("uc ");break;
            case 4: System.out.print("dort ");break;
            case 5: System.out.print("bes ");break;
            case 6: System.out.print("alti ");break;
            case 7: System.out.print("yedi ");break;
            case 8: System.out.print("sekiz ");break;
            case 9: System.out.print("dokuz ");break;

        }




    }

}
