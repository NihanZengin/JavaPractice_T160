package ODEV_emre.H1;

import java.util.Scanner;

public class RG09_StrConcat {
    public static void main(String[] args) {
        /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki String ifade giriniz : ");


        String str1=scanner.nextLine();
        String str2= scanner.nextLine();

        String birlesim=str1+" "+str2;

        System.out.println(birlesim);
    }
}
