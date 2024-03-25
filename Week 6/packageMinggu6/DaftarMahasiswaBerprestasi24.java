public class DaftarMahasiswaBerprestasi24 {
    Mahasiswa24 ListMhs[] = new Mahasiswa24[5];
    int idx;

    void tambah(Mahasiswa24 m) {
        if (idx<ListMhs.length) {
            ListMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Mahasiswa24 m : ListMhs) {
             m.tampil();
            System.out.println("-------------------------------");
        }
    }
    void bubbleSort() {
        for (int i=0; i<ListMhs.length-1; i++) {
            for (int j=1; j<ListMhs.length-i; j++) {
                if (ListMhs[j].ipk > ListMhs[j-1].ipk) {
                    // swap
                    Mahasiswa24 temp = ListMhs[j];
                    ListMhs [j] = ListMhs [j-1];
                    ListMhs [j-1] = temp;
                }
            }
        }
    }
}
