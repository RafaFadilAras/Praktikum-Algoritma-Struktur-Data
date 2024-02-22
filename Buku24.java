public class Buku24 {

    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, hargaBayar;
    double diskon;
    
    void tampilInformasi() {
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Jumlah halaman : " +halaman);
        System.out.println("Sisa stok : " +stok);
        System.out.println("Harga : " +harga);
        System.out.println("Harga Total : " +hargaTotal);
        System.out.println("Diskon : " +diskon);
        System.out.println("Harga yang harus dibayar :" +hargaBayar);
        System.out.println();
    }

    void terjual (int jml) {
        if (stok<0) {
            stok -= jml;
            hitungHargaTotal(jml);
        }
    }

    void restock (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int jml) {
        hargaTotal = harga*jml;
        hitungDiskon();
    }

    void hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = (int)(hargaTotal * 0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = (int) (hargaTotal * 0.05);
        } else if (hargaTotal < 72000) {
            System.out.println("Tidak ada diskon");
        }
        hitungHargaBayar();
    }

    void hitungHargaBayar() {
        hargaBayar = (int) (hargaTotal - diskon);
        tampilInformasi();
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


