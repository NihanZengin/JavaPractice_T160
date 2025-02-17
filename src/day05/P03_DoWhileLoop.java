package day05;

public class P03_DoWhileLoop {
    public static void main(String[] args) {
        /*
    ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
     */
       /* Kodum en az bir kere calissin dersem do while loop kullanirim
                Sartim saglanirsa calissin dersem while */

        char harf='k';
        do {
            System.out.println(harf+"");
            harf++;

        }while(harf=='t');

    }
}
