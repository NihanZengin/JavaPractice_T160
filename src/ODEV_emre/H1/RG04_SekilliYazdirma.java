package ODEV_emre.H1;

public class RG04_SekilliYazdirma {
    public static void main(String[] args) {


    /*4----
    1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.

     Beklenen çıktı:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910

    */


        System.out.println(1 +"\n"+12+"\n"+123+"\n"+1234+"\n"+12345+"\n"+
                123456+"\n"+1234567+"\n"+12345678+"\n"+123456789);


        int a =1;

        String b="";

        b+=a;
        System.out.println(b); //"1"

        a++;    //2
        b+=a;   //String b= "12"
        System.out.println(b);

        a++;     //3
        b+=a;    //String b="123"
        System.out.println(b);

        a++;     //4
        b+=a;    //String b="1234"
        System.out.println(b);

        a++;     //5
        b+=a;    //String b="12345"
        System.out.println(b);

        a++;     //6
        b+=a;    //String b="123456"
        System.out.println(b);

        a++;     //7
        b+=a;    //String b="123467"
        System.out.println(b);

        a++;     //8
        b+=a;    //String b="1234678"
        System.out.println(b);

        a++;     //9
        b+=a;    //String b="123456789"
        System.out.println(b);

        a++;     //10
        b+=a;    //String b="12345678910"
        System.out.println(b);

    }
}


