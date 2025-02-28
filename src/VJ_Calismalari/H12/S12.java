package VJ_Calismalari.H12;

public class S12 {
    public static void main(String[] args) {
        /*
        For loop ile 1000 defa bir islem yapalim.
        ("1" yazan bir String olusturun ve sonuna " " boşluk atayın 1000 defa)
        ("1" yazan bir StringBuilder olusturun ve sonuna " " boşluk atayın 1000 defa)

		// Oncesinde ve sonrasinda zamani kontrol edip
		// StringBuilder ve String class’larinin performanslarini karsilastiralim.
		aradaki zaman farkına göre hangisi yavaş ise ekrana onu yazdıralım

		// Ipucu:  long TimeSb = System.nanoTime();  kullanalim
         */
        long time1 = System.nanoTime();
        String name="1";
        for (int i=0; i<1000; i++){
            name=name.concat(" ");
        }
        System.out.println(name);
        long time2 = System.nanoTime();

        StringBuilder nameStrd=new StringBuilder("1");
        for (int i=0; i<1000; i++){
            nameStrd.append(" ");
        }
        System.out.println(nameStrd);
        long time3 = System.nanoTime();

        if((time3-time2)>(time2-time1)){
            System.out.println("StringBuilder daha yavaş");
        } else if ((time2-time1)>(time3-time2)) {
            System.out.println("String daha yavaş");

        }
    }
}
