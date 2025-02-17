package MarketProjesi;

import java.util.Scanner;

public class Market {
    static Scanner scan=new Scanner(System.in);
    static int urunKodu;
    static boolean ekUrun=false;
    static int urunMiktari;
    static String urunAdi;
    static int urunFiyati;
    static int toplam;
    static String sepet;

       /*

   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1-ŞARKÜTERİ ÜRÜNLERİ
   2-MANAV ÜRÜNLERİ
   3-MARKET ÜRÜNLERİ
   secime gore  reyona gidip ilgili ürünleri seçerek sepete ekleyecek
   4-FİŞ YAZDIR
   5-ÇIKIŞ
*/

    public static void main(String[] args) {

        girisEkrani();
    }

    public static void girisEkrani() {
        System.out.println("========= T160WiseMarket =========");
        System.out.println("------------ Hoşgeldiniz ------------");
        System.out.println("....... Menüden Seçim Yapınız ........");
        System.out.println(
                "\t1-Şarküteri Reyonu\n" +
                "\t2-Manav Reyonu\n" +
                "\t3-Market Reyonu\n" +
                "\t4-Fiş Yazdır\n" +
                "\t5-Çıkış Yap");
        System.out.print("Seçiminiz: ");
        int secim= scan.nextInt();

        if (!(secim>=1 && secim<=5 )){
            System.out.println("Yanlış bir seçim yaptınız. Yeniden Deneyiniz!");
            girisEkrani();
        }else{
            switch (secim){
                case 1: sarkuteri(); break;
                case 2: manav(); break;
                case 3: market(); break;
                case 4: fisYazdir(); break;
                case 5: cikis(); break;
                default:
            }
        }

    }

    public static void sarkuteri() {
        System.out.println("------------ Şarküteri Reyonuna Hoşgeldiniz ------------");
        System.out.println("................. Menüden Seçim Yapınız ................");
        System.out.println();

        System.out.println("Alacağınız Ürünün Ürün Kodunu Giriniz\n\t101-Kaşar Peyniri (1 Paket)       200₺" +
                "\n\t102-Beyaz peynir (1 Paket)              225₺\n\t103-Yumurta (1 Paket)         150₺" +
                "\n\t104-Sucuk (1 Paket)        420₺\n\t105-Pastırma (1 Paket)        100₺" );

        while (!ekUrun){
            urunKodu=scan.nextInt();
            if(urunKodu>=101 && urunKodu<=105){
                System.out.print("Lütfen Miktar Giriniz: ");
                urunMiktari=scan.nextInt();
                switch (urunKodu){
                    case 101:
                        urunAdi="Kaşar Peyniri";
                        urunFiyati=200;
                        System.out.println(urunMiktari +" paket" +urunAdi+"     Fiyatı: "+urunFiyati*urunMiktari);
                        break;
                    case 102:
                        urunAdi="Beyaz peynir";
                        urunFiyati=225;
                        System.out.println(urunMiktari +" paket" +urunAdi+"     Fiyatı: "+urunFiyati*urunMiktari);
                        break;
                    case 103:
                        urunAdi="Yumurta";
                        urunFiyati=150;
                        System.out.println(urunMiktari +" paket" +urunAdi+"     Fiyatı: "+urunFiyati*urunMiktari);
                        break;
                    case 104:
                        urunAdi="Sucuk";
                        urunFiyati=420;
                        System.out.println(urunMiktari +" paket" +urunAdi+"     Fiyatı: "+urunFiyati*urunMiktari);
                        break;
                    case 105:
                        urunAdi="Pastırma";
                        urunFiyati=100;
                        System.out.println(urunMiktari +" paket " +urunAdi+"     Fiyatı: "+urunFiyati*urunMiktari);
                        break;
                    default:

                }
                urunFiyati=urunFiyati*urunMiktari;
                toplam+=urunFiyati;
                sepet+="\n\t"+urunMiktari+" paket "+urunAdi+" "+urunFiyati+"$\n\t";
                System.out.println("Eklemek istedigin urun kodunu giriniz. Cikmak icin 0 tusuna basiniz\nSecim:");

            } else if (urunKodu==0) {
                girisEkrani();

            }else{
                
            }

        }

    }

    public static void manav() {
        System.out.println("------------ Manav Reyonuna Hoşgeldiniz ------------");
        System.out.println("................. Menüden Seçim Yapınız ................");
    }

    public static void market() {
        System.out.println("------------ Market Reyonuna Hoşgeldiniz ------------");
        System.out.println("................. Menüden Seçim Yapınız ................");
    }

    public static void fisYazdir() {
        System.out.println("------------ İyi Günler Dileriz ------------");
        System.out.println("....... Alışveriş Ayrıntılarınız Yazdırılacak ........");
    }

    public static void cikis() {
        System.out.println("Çıkış Yapılıyor....\n\n");
        System.exit(0);
    }
}
