public class BukuMain24 {
    public static void main(String[] args) {

        Buku24 bk1 = new Buku24();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1. gantiHarga(60000);
        bk1.tampilInformasi();

        Buku24 bk2 = new Buku24("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku24 bukuRafa = new Buku24 ("The Miracle of Science", "H.M.Yusuf bin Abdurrahman", 208, 1, 89000); 
        bukuRafa.tampilInformasi();

    }
}
