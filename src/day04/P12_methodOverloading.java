package day04;

public class P12_methodOverloading {
    public static void main(String[] args) {

        System.out.println(topla(5,3));
        System.out.println(topla(5,3,2.1));
        System.out.println(topla(5.6,3));
        System.out.println(topla(5.6,3.3));

    }
    public static int topla(int a, int b){
        System.out.println("1 numarali method: ");
        return a+b;
    }
    public static double topla(int a, int b , double c){
        System.out.println("2 numarali method: ");
        return a+b+c;
    }
    public static double topla(double c, double d){
        System.out.println("3 numarali method: ");
        return c+d;
    }


}
