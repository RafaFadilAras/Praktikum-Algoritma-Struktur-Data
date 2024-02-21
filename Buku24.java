public class Buku24 {

    static String judul, pengarang;
    static int halaman, stok, harga;
    
    void tampilInformasi() {
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Jumlah halaman : " +halaman);
        System.out.println("Sisa stok : " +stok);
        System.out.println("Harga : " +harga);
    }

    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println("Sisa stok buku " +judul+ "berkurang" + jml + "");
        } else {
            System.out.println("Stok tidak cukup");
        }
    }

    void restock (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }

    public Buku24() {

    }

    public Buku24 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}


