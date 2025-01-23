package ODEV_emre.H1;

import java.util.Scanner;

public class RG08_StrTerstenYazdirma {
    public static void main(String[] args) {
         /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen maksimum 5 harfli bir kelime giriniz : ");
        String kelime = scanner.nextLine();

        String tersKelime = "";

        if(kelime.length()==1){
            tersKelime=kelime;
        }
        else if(kelime.length()==2){
            tersKelime=kelime.charAt(1)+""+kelime.charAt(0);
        }
        else if(kelime.length()==3){
            tersKelime=kelime.charAt(2)+""+kelime.charAt(1)+kelime.charAt(0);
        }
        else if(kelime.length()==4){
            tersKelime=kelime.charAt(3)+""+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0);
        }
        else if(kelime.length()==5){
            tersKelime=kelime.charAt(4)+""+kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0);
        }
        else System.out.println("Lutfen girdiginiz kelime maksimum 5 harfli olsun");

        System.out.println("Kelime'nin tersten yazilisi: "+ tersKelime);




    }
}
