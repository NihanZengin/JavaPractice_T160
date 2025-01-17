package ODEV;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {

        /*
    Ödev2: Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        ******       KAYIT BAŞARILI      ******
            Adınız: Tarık
            Soyadınız: Yiğit
            Yaşınız:44
            Mail Adresiniz:tarik@yigit.com.tr
            Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

         */
        Scanner scan= new Scanner(System.in);

        System.out.print("Lutfen Isim giriniz...");
        String isim=scan.nextLine();

        System.out.print("Lutfen Soyisim giriniz...");
        String soyisim=scan.nextLine();

        System.out.print("Lutfen Yasinizi giriniz...");
        int yas=scan.nextInt();

        //  mail adresinizi giriniz der demez sifre giriniz diyor ve mail girmeme izin vermiyor
        //Lutfen Mail Adresi giriniz...Lutfen Şifre giriniz...
        // nextInt() metodu, sayısal bir giriş aldığında yeni bir satıra geçmez;
        // bu yüzden bir sonraki nextLine() çağrısında,
        // önceki satırdaki yeni satır karakterini (\n) okur ve hemen çalışır.
        //
        //Bu durumu çözmek için nextInt()'ten sonra bir scan.nextLine() kullanarak
        // boş bir satır okuyarak tamponu temizlememiz gerekmektedir.

        scan.nextLine(); // Sorunu cozmek icin

        System.out.print("Lutfen Mail Adresi giriniz...");
        String mAdres=scan.nextLine();

        System.out.print("Lutfen Şifre giriniz...");
        String sifre=scan.nextLine();

        System.out.println("******       KAYIT BAŞARILI      ******"+"\n    Adınız: "+isim+
                "\n    Soyadınız: "+soyisim+"\n    Yaşınız:"+yas+"\n    Mail Adresiniz:"+mAdres+
                "\n    Şifreniz: "+sifre);


/* TERMINAL CIKTI:
 * Lutfen Isim giriniz...Tarik
 * Lutfen Soyisim giriniz...Yigit
 * Lutfen Yasinizi giriniz...44
 * Lutfen Mail Adresi giriniz...tarik@yigit.com.tr
 * Lutfen Şifre giriniz...A2e365
 * ******       KAYIT BAŞARILI      ******
 *     Adınız: Tarik
 *     Soyadınız: Yigit
 *     Yaşınız:44
 *     Mail Adresiniz:tarik@yigit.com.tr
 *     Şifreniz: A2e365
 */


    }

}
