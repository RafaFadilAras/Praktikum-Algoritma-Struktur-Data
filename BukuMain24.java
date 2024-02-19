public class BukuMain24 {
    public static void main(String[] args) {

        String judul, pengarang;
        int halaman, stok, harga, jml;

        Buku24 bk1 = new Buku24();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(jml=5);
        bk1. gantiHarga(harga=60000);
        bk1.tampilInformasi();

    }
}
