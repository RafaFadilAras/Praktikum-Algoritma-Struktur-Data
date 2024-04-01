public class Buku24 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku24 (int kd, String jdl, int thn, String peng, int stok) {
        kodeBuku = kd;
        judulBuku = jdl;
        tahunTerbit = thn;
        pengarang = peng;
        stock = stok;
    }

    public void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode buku : " +kodeBuku);
        System.out.println("Judul Buku : " +judulBuku);
        System.out.println("Tahun terbit : " +tahunTerbit);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Stock : " +stock);
    }
}
