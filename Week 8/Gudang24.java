public class Gudang24 {
    Barang24[] tumpukan;
    int size, top;

    public Gudang24 (int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang24[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang24 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    } 

    public Barang24 ambilBarang24() {
        if (!cekKosong()) {
            Barang24 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam Biner : " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public Barang24 lihatBarangTeratas() {
        if (!isEmpty()) {
            Barang24 barangTeratas = tumpukan [top];
            System.out.println("Barang teratas : " + barangTeratas.nama );
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilBarang () {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner (int kode) {
        StackKonversi24 stack = new StackKonversi24();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        } 
        return biner;
    }

    public Barang24 lihatBarangTerbawah () {
        if (!isEmpty()) {
            Barang24 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah : " +barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang24 cariBarang (int kodeBarang) {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].kode == kodeBarang) {
                System.out.println("Barang dengan kode " + kodeBarang + " ditemukan.");
                System.out.println("Informasi barang");
                System.out.println("Kode barang : " + tumpukan[i].kode);
                System.out.println("Nama barang : " + tumpukan[i].nama);
                System.out.println("Kategori    : " + tumpukan[i].kategori);
                return tumpukan[i];
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return null;
        } else {
            System.out.println("tumpukan barang kosong.");
            return null;
        }
    }

}
