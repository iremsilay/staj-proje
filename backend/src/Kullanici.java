import java.util.ArrayList;
import java.util.List;

public class Kullanici {

    private static int idCounter=0;

    private String kullanici_adi;
    private String parola;
    private String isim;
    private String soyisim;
    private boolean admin_yetki;

    private static List<Kullanici> kullanici_Listesi= new ArrayList<>();

    public Kullanici(){

    }

    public Kullanici(String kullanici_adi, String parola, String isim, String soyisim) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.isim = isim;
        this.soyisim = soyisim;
        this.admin_yetki = false;
        kullanici_Listesi.add(this);
    }


    public void yazdir(){

        for(int i=0;i<kullanici_Listesi.size();i++){
            System.out.println(kullanici_Listesi.get(i).kullanici_adi);
        }
    }


    public static List<Kullanici> getKullanici_Listesi() {
        return kullanici_Listesi;
    }

    public static void setKullanici_Listesi(List<Kullanici> kullanici_Listesi) {
        Kullanici.kullanici_Listesi = kullanici_Listesi;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public boolean isAdmin_yetki() {
        return admin_yetki;
    }

    public void setAdmin_yetki(boolean admin_yetki) {
        this.admin_yetki = admin_yetki;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Kullanici.idCounter = idCounter;
    }
}