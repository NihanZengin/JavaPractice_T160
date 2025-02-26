package ODEV_emre.H5;

public class S42 {
    public static void main(String[] args) {
        /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */
        String kelime1="gozl";
        String kelime2="emlemek";

        System.out.println("Kelimenin birlesmis hali: "+getKelime(kelime1, kelime2));

        //kelimeBirlestir("void ile yapilmis hali: "+kelime1,kelime2);
    }

    public static String getKelime(String kelime1, String kelime2){
       String sonHali= kelime1+kelime2;
        sonHali=Character.toUpperCase(sonHali.charAt(0))+sonHali.substring(1);
        return sonHali;
    }

    public static void kelimeBirlestir(String kelime1,String kelime2){
        System.out.println(kelime1+kelime2);
    }

}
