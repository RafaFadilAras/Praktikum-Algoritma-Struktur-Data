public class PencarianMhs24 {
    Mahasiswa24 listMhs[] = new Mahasiswa24[5];
    int idx;

    void tambah(Mahasiswa24 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil () {
        for (Mahasiswa24 m : listMhs) {
            m.tampil();
            System.out.println("---------------------------");
        }
    }

    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi (int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan.");
        }
    }

    public void tampilData (int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim     : " + x);
            System.out.println("Nama    : " + listMhs[pos].nama);
            System.out.println("Umur    : " + listMhs[pos].umur);
            System.out.println("IPK     : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + "tidak ditemukan.");
        }
    }
}
