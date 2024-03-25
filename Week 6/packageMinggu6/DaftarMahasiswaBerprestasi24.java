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
    void selectionSort() {
        for (int i=0; i<ListMhs.length; i++) {
            int idxMin = 1;
            for (int j = i+1; j<ListMhs.length; j++) {
                if (ListMhs[j].ipk < ListMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // swap
            Mahasiswa24 tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i=1; i < ListMhs.length; i++) {
            Mahasiswa24 temp = ListMhs[i];
            int j = i;
            while ( j > 0 && ListMhs [j-1].ipk > temp.ipk) {
                ListMhs[j] = ListMhs [j-1];
                j--;
            }
            ListMhs[j] = temp;
        }
    }
}
