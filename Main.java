//Encapsulation
abstract class kendaraan {
    private String merek;
    private String warna;
    private int kecepatan;
//constructor
    public kendaraan(String m, String w, int k){
        this.merek = m;
        this.warna = w;
        this.kecepatan = k;
    }
//setter
    void setMerek(String m){
        merek = m;
    }
    void setWarna(String w){
        warna = w;
    }
    void setKecepatan(int k){
        if (kecepatan <= 0) {
            System.out.println("Kendaraan Mogok");
        } else {
            kecepatan = k;
        }
        
    }
//getter
    String getMerek(){
        return merek;
    }
    String getWarna(){
        return warna;
    }
    int getKecepatan(){
        return kecepatan;
    }

    void displayInfo(){
          System.out.println("Merek: " + merek);
          System.out.println("Warna: " + warna);
          System.out.println("Kecepatan: " + kecepatan);
    }
    abstract void gas();
}

//inheritance
class mobil extends kendaraan {
    public mobil(String m, String w, int k){
        super(m,w,k);
    }

    @Override
    void gas(){
        System.out.println("Mobil melaju");
    }
    void rem(){
        System.out.println("Mobil melambat");
    }
}

class kapal extends kendaraan {
    public kapal(String m, String w, int k){
        super(m,w,k);
    }

    @Override
    void gas(){
        System.out.println("Kapal melaju");
    }
    void rem(){
        System.out.println("Kapal melambat");
    }
}

public class Main {
    public static void main(String[] args){
        mobil m1 = new mobil("lambo", "merah", 200);
        mobil m2 = new mobil("tesla", "putih", 100);

        kapal k1 = new kapal("speedboat", "coklat", 50);
        kapal k2 = new kapal("ferry", "putih", 10);

        System.out.println("DATA MOBIL");
        m1.displayInfo();
        m1.gas();
        m1.rem();
        System.out.println("DATA MOBIL");
        m2.displayInfo();
        m2.gas();
        m2.rem();

        System.out.println();

         System.out.println("DATA KAPAL");
        k1.displayInfo();
        k1.gas();
        k1.rem();
        System.out.println("DATA KAPAL");
        k2.displayInfo();
        k2.gas();
        k2.rem();
    }
}