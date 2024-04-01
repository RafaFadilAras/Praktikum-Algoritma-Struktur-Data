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

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findSeqSearchJudul(String cari) {
        int count = 0;
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.toLowerCase().contains(cari.toLowerCase())) {
                posisi = j;
                count++;
            }
        }
        if (count > 1) {
            System.out.println(count + " data ditemukan dengan judul yang sama!");
        }
        return posisi;
    }

    public void bubblesort() {
        for (int i=0; i<listBk.length -1; i++) {
            for (int j = 0; j < listBk.length - i- 1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j+1].judulBuku) > 0) {
                    Buku24 temp = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = temp;
                }
            }
        }
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode buku     : " + x);
            System.out.println("Judul buku    : " +listBk[pos].judulBuku);
            System.out.println("Tahun terbit  : " +listBk[pos].tahunTerbit);
            System.out.println("Pengarang     : " +listBk[pos].pengarang);
            System.out.println("Stock         : " +listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch (String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparison = cari.compareToIgnoreCase(listBk[mid].kodeBuku);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindBinarySearchJdl(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) /2;
            int comparison = listBk[mid].judulBuku.compareToIgnoreCase(cari);
        
        if (comparison == 0) {
            return mid;
        } else if (comparison < 0) {
            return FindBinarySearchJdl(cari, mid + 1, right);
        } else {
            return FindBinarySearchJdl(cari, left, mid-1);
        }
        }
    return -1;
    }

}

