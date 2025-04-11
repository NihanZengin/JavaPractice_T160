package VJ_Calismalari.H14;

import java.util.Scanner;

public class S1 {
    /*
    1) Kullanicidan TC kimlik numarasini isteyin. Bu kimlik
numarasinin son rakaminin cift rakam olarak bittigini ve Tc
kimlik numarasinin 11 haneden olustugunu kontrol eden nonstatic bir method’ ta kontrol edin. Aksi durumda
IllegalArgumentException olusturun. Kontrol edeceginiz son
rakami ve 11 haneyi ic ice try-catch kullanarak yapin. Finally
blogunda Scanner’ i kapatin
     */


        public void tcKimlikNoKontrol() {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Lütfen TC kimlik numaranızı giriniz: ");
                String tcKimlikNo = scanner.nextLine();

                try {
                    // 11 hane kontrolü
                    if (tcKimlikNo.length() != 11) {
                        throw new IllegalArgumentException("TC kimlik numarası 11 haneli olmalıdır.");
                    }

                    // Tüm karakterler rakam mı?
                    boolean sadeceRakamMi = true;
                    for (int i = 0; i < tcKimlikNo.length(); i++) {
                        if (!Character.isDigit(tcKimlikNo.charAt(i))) {
                            sadeceRakamMi = false;
                            break;
                        }
                    }

                    if (!sadeceRakamMi) {
                        throw new IllegalArgumentException("TC kimlik numarası sadece rakamlardan oluşmalıdır.");
                    }

                    // Son rakamı substring ile al ve integer'a çevir
                    int sonRakam = Integer.parseInt(tcKimlikNo.substring(tcKimlikNo.length() - 1));

                    if (sonRakam % 2 != 0) {
                        throw new IllegalArgumentException("TC kimlik numarasının son rakamı çift olmalıdır.");
                    }

                    System.out.println("TC kimlik numarası geçerli.");

                } catch (IllegalArgumentException e) {
                    System.out.println("Hata: " + e.getMessage());
                }

            } catch (Exception e) {
                System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Scanner kapatıldı.");
            }
        }

        public static void main(String[] args) {
            S1 kontrol = new S1();
            kontrol.tcKimlikNoKontrol();
        }
    }

