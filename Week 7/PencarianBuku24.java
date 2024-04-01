public class PencarianBuku24 {
    Buku24 listBk[] = new Buku24[5];
    int idx;

    void tambah(Buku24 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !");
        }
    }

    void tampil() {
        for (Buku24 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data : " + x + "tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode buku     : " + x);
            System.out.println("Judul buku    : " +listBk[pos].judulBuku);
            System.out.println("Tahun terbit  : " +listBk[pos].tahunTerbit);
            System.out.println("Pengarang     : " +listBk[pos].pengarang);
            System.out.println("Stock         : " +listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " todak ditemukan");
        }
    }

    public static Buku24 FindBuku24(Buku24[] dataBuku, String cari) {
        Buku24 bukuFound = null;
        for (Buku24 buku : dataBuku) {
            if (buku.judulBuku.equals(cari)) {
                bukuFound = buku;
                break;
            }
        }
        return bukuFound;
    }
}
