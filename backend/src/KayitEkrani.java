import java.util.Scanner;

public class KayitEkrani{

    public KayitEkrani(){
        main();
    }


    public static void main(){

        Scanner girdi = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String kul_ad = girdi.nextLine();

        System.out.print("Parola: ");
        String password = girdi.nextLine();

        System.out.print("Isim: ");
        String ad = girdi.nextLine();

        System.out.print("Soyisim: ");
        String soy_ad = girdi.nextLine();

        Kullanici gec1 = new Kullanici(kul_ad, password, ad, soy_ad);
    }


}