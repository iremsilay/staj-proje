import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kullanici kontrol = new Kullanici();
        Scanner girdi = new Scanner(System.in);

        boolean ana_menu_tekrar = true;
        int ana_menu_secenek = 3;



        while(ana_menu_tekrar){


            System.out.println("1-Kayıt Ol\n2-Giriş Yap\n3-Kullanıcıları Listele\n4-Çıkış Yap");
            System.out.print("Hangi İşlemi Yapmak İstersiniz: ");
            ana_menu_secenek=girdi.nextInt();

            switch (ana_menu_secenek){
                case 1:
                    KayitEkrani yeniKullanici = new KayitEkrani();
                    break;

                case 2:
                    System.out.println("Case 2");
                    break;

                case 3:
                    kontrol.yazdir();
                    break;
                case 4:
                    ana_menu_tekrar = false;
                    break;
            }
        }


    }
}
