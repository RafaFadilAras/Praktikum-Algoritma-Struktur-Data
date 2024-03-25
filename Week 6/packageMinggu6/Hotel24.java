public class Hotel24 {
    String nama, kota;
    int harga;
    byte bintang;
    
    Hotel24(String n, String k, int h, byte i) {
        nama = n;
        kota = k;
        harga = h;
        bintang = i;
    }
    
    void tampil() {
        System.out.println("Nama    : " +nama);
        System.out.println("Kota    : " +kota);
        System.out.println("Harga   : " +harga);
        System.out.println("Rate    : " +bintang);
    }

}
