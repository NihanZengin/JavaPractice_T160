package D01_;

import javax.swing.*;

public class P04_kullanicidanVeriALma {
    public static void main(String[] args) {

        /* Kullanicidan veri alarak

        * Adi Soyadi : Murat Yigit
        * Meslegi: Instructor
        * Yasi: 45
        * Kayit Basariyla Tamamlandi
         ifadesini yazdir.*/

        String isim= JOptionPane.showInputDialog("Adiniz: ");
        String soyisim= JOptionPane.showInputDialog("Soyadiniz: ");
        String meslek= JOptionPane.showInputDialog("Mesleginiz: ");
        String yas= JOptionPane.showInputDialog("Yasiniz: ");

        JOptionPane.showConfirmDialog(null,"Adi Soyadi: "+isim+" "+ soyisim+"\nMeslegi: "+meslek+"\nYasi:"+yas+"\nKaydiniz Basariyla Gerceklestirilmistir.");

        System.out.println("Adi Soyadi :" + isim+" "+soyisim +"\nMeslegi: "+meslek+"\nYasi: "+yas+"\nKayit Basariyla Tamamlandi");

        //Adi Soyadi :Murat Yigit
        //Meslegi: Instructor
        //Yasi: 45
        //Kayit Basariyla Tamamlandi


    }
}
