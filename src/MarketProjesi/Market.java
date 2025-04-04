package MarketProjesi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Market {
    static Scanner scan = new Scanner(System.in);
    static int urunKodu;
    static boolean ekUrun = false;
    static int urunMiktari;
    static String urunAdi;
    static int urunFiyati;
    static int toplam;
    static String sepet = "";
    static int fisNo = 1001;

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
        int secim = scan.nextInt();

        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Yanlış bir seçim yaptınız. Yeniden Deneyiniz!");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }

    }

    public static void sarkuteri() {
        System.out.println("------------ Şarküteri Reyonuna Hoşgeldiniz ------------");
        System.out.println("................. Menüden Seçim Yapınız ................");
        System.out.println();

        System.out.println("Alacağınız Ürünün Ürün Kodunu Giriniz" +
                "\n\t101-Kaşar Peyniri (1 Paket)   200₺" +
                "\n\t102-Beyaz peynir (1 Paket)    225₺" +
                "\n\t103-Yumurta (1 Paket)         150₺" +
                "\n\t104-Sucuk (1 Paket)           420₺" +
                "\n\t105-Pastırma (1 Paket)        100₺" +
                "\n\tKod: ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 101 && urunKodu <= 105) {
                System.out.print("Lütfen Miktar Giriniz: ");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 101:
                        urunAdi = "Kaşar Peyniri";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + " paket " + urunAdi + " Fiyatı: " + urunFiyati * urunMiktari);
                        break;
                    case 102:
                        urunAdi = "Beyaz peynir";
                        urunFiyati = 225;
                        System.out.println(urunMiktari + " paket " + urunAdi + "     Fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 103:
                        urunAdi = "Yumurta";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + " paket " + urunAdi + "     Fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 104:
                        urunAdi = "Sucuk";
                        urunFiyati = 420;
                        System.out.println(urunMiktari + " paket " + urunAdi + "     Fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 105:
                        urunAdi = "Pastırma";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + " paket " + urunAdi + "     Fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    default:

                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                sepet += "\t" + urunMiktari + " paket " + urunAdi + " " + urunFiyati + "₺\n";
                System.out.println("Eklemek istedigin urun kodunu giriniz.\nReyon degisikligi icin ana menuye donmek icin 0 tusuna basiniz\nSecim:");

            } else if (urunKodu == 0) {
                ekUrun = false;
                girisEkrani();

            } else {
                System.out.println("Yanlis giris yaptiniz, Yeniden deneyiniz.. Ana Ekrana Yonlendiriliyorsunuz");
            }

        }

    }

    public static void manav() {
        System.out.println("------------ Manav Reyonuna Hoşgeldiniz ------------");
        System.out.println("................. Menüden Seçim Yapınız ................");
        System.out.println("Alacağınız Ürünün Ürün Kodunu Giriniz" +
                "\n\t201-Domates (1 kg)       50₺" +
                "\n\t202-Patates (1 kg)       45₺" +
                "\n\t203-Soğan (1 kg)         25₺" +
                "\n\t204-İthal Muz (1 kg)     70₺" +
                "\n\t205-Elma (1 kg)          60₺" +
                "\n\t206-Portakal (1 kg)      60₺" +
                "\n\t207-Salatalık (1 kg)     40₺" +
                "\n\tKod: ");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 201 && urunKodu <= 207) {
                System.out.print("Kaç kg alacaksınız?: ");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 201:
                        urunAdi = "Domates";
                        urunFiyati = 50;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 202:
                        urunAdi = "Patates";
                        urunFiyati = 45;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 203:
                        urunAdi = "Soğan";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 204:
                        urunAdi = "İhtal Muz";
                        urunFiyati = 70;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 205:
                        urunAdi = "Elma";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 206:
                        urunAdi = "Portakal";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    case 207:
                        urunAdi = "Salatalık";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                        break;
                    default:
                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                sepet += "\t" + urunMiktari + " kg " + urunAdi + "  " + urunFiyati + "₺\n";
                System.out.println("Başka ürün alacaksanız Ürün kodunu giriniz. \nReyon degisikligi icin ana menuye donmek icin 0 tuşuna basınız");
            } else if (urunKodu == 0) {
                ekUrun = false;
                girisEkrani();
            } else {
                System.out.println("Yanlış giriş yaptınız yeniden deneyiniz.\nAna menüye yönlendiriliyorsunuz");
                girisEkrani();
            }
        }
    }

        public static void market () {
            System.out.println("------------ Market Reyonuna Hoşgeldiniz ------------");
            System.out.println("................. Menüden Seçim Yapınız ................");
            System.out.println("Alacağınız Ürünün Ürün Kodunu Giriniz" +
                    "\n\t301-Sabun (1 adet)       20₺" +
                    "\n\t302-Deterjan (1 adet)    45₺" +
                    "\n\t303-Sampuan (1 adet)     35₺" +
                    "\n\t304-T. Kagidi (1 adet)   30₺" +
                    "\n\t305-Dis Macunu (1 adet)  20₺" +
                    "\n\t306-Firca (1 adet)       20₺" +
                    "\n\t307-Sunger (1 adet)      10₺" +
                    "\n\tKod: ");
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 301 && urunKodu <= 307) {
                    System.out.print("Kaç adet alacaksınız?: ");
                    urunMiktari = scan.nextInt();
                    switch (urunKodu) {
                        case 301:
                            urunAdi = "Sabun";
                            urunFiyati = 20;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        case 302:
                            urunAdi = "Deterjan";
                            urunFiyati = 45;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        case 303:
                            urunAdi = "Sampuan";
                            urunFiyati = 35;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        case 304:
                            urunAdi = "Tuvalat Kagidi";
                            urunFiyati = 30;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        case 305:
                            urunAdi = "Dis Macunu";
                            urunFiyati = 20;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        case 306:
                            urunAdi = "Firca";
                            urunFiyati = 20;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        case 307:
                            urunAdi = "Sunger";
                            urunFiyati = 10;
                            System.out.println(urunMiktari + " adet " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "₺");
                            break;
                        default:
                    }
                    urunFiyati = urunFiyati * urunMiktari;
                    toplam += urunFiyati;
                    sepet += "\t" + urunMiktari + " adet3 " + urunAdi + "  " + urunFiyati + "₺\n";
                    System.out.println("Başka ürün alacaksanız Ürün kodunu giriniz. \nReyon degisikligi icin ana menuye donmek icin 0 tuşuna basınız");
                } else if (urunKodu == 0) {
                    ekUrun = false;
                    girisEkrani();
                } else {
                    System.out.println("Yanlış giriş yaptınız yeniden deneyiniz.\nAna menüye yönlendiriliyorsunuz");
                    girisEkrani();
                }
            }
        }

        public static void fisYazdir () {

            fisNo();
            System.out.println("------------ İyi Günler Dileriz ------------");
            System.out.println("....... Alışveriş Ayrıntılarınız Yazdırılacak ........");
            System.out.println();
            System.out.println("Fatura No: "+fisNo);
            System.out.println("Satın Aldığınız Ürünler                   :\n-----------------------------------------");
            System.out.println(sepet);
            System.out.println("Alışveriş Tutarı: "+toplam);
            System.out.print("Ödenen: ");
            int odenen= scan.nextInt();
            if(odenen<toplam){
                System.out.println("Ödediğiniz miktar yeterli değildir "+(toplam-odenen)+" daha odemelisiniz");
                fisYazdir();
            }else{
                int paraustu=(odenen-toplam);
                System.out.println("Ödenen Tutar: "+odenen);
                System.out.println("Para üstü: "+paraustu);
            }

            LocalDateTime saat = LocalDateTime.now();
            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");
            DateTimeFormatter format4 = DateTimeFormatter.ofPattern("HH:mm");

            System.out.println();
            System.out.println("Alışverişinizde bizi tercih ettiğiniz için teşekkür ederiz\nYine bekleriz\nTarih: "+saat.format(format1)+"\nSaat: "+saat.format(format4));
            cikis();
        }

    private static void fisNo() {
        fisNo++;
    }

    public static void cikis () {
            System.out.println("Çıkış Yapılıyor....\n\n");
            System.exit(0);
        }

}

