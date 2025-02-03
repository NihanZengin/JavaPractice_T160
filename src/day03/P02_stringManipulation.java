package day03;

public class P02_stringManipulation {
    public static void main(String[] args) {

        String ad="ali";
        String soyad="veli";
        String kcard="1234 4568 1548 1548";

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\w","*");

        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*");

        if(kcard.length()>16){
            System.out.println("Gecersiz kart numarasi girdiniz");
        } else if (kcard.length()<16) {
            System.out.println("Gecersiz kart numarasi girdiniz");

        }
        else{
            kcard=kcard.substring(0,4).replaceAll("\\d","*")+
                    " "+kcard.substring(4,8).replaceAll("\\d","*")+" "+
                kcard.substring(4,8).replaceAll("\\d","*");
        }
    }
}
