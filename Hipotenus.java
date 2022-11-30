import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        //klavyeden iki dik kenarı girilen dik üçgenin hipoteüsünü bul. (pisagor teoremi)
        double a,b,c;
        System.out.println();
        Scanner klavye = new Scanner(System.in);
        System.out.print("Hipotenüsü bulabilmek için,\nÜçgenin birinci dik kenarını giriniz: ");
        a = klavye.nextDouble();
        System.out.print("Üçgenin ikinci dik kenarını giriniz: ");
        b = klavye.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hipotenüs : " + c);
    }
}
