public class MainMhs24 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi24 ListMhs = new DaftarMahasiswaBerprestasi24();
        Mahasiswa24 m1 = new Mahasiswa24("Nusa", 2017, 25, 3);
        Mahasiswa24 m2 = new Mahasiswa24("Rara", 2012, 19, 4);
        Mahasiswa24 m3 = new Mahasiswa24("Dompu", 2018, 19, 3.5);
        Mahasiswa24 m4 = new Mahasiswa24("Abdul", 2017, 23, 2);
        Mahasiswa24 m5 = new Mahasiswa24("Ummi", 2019, 21, 3.75);

        ListMhs.tambah(m1);
        ListMhs.tambah(m2);
        ListMhs.tambah(m3);
        ListMhs.tambah(m4);
        ListMhs.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting : ");
        ListMhs.tampil();
        System.out.println();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan IPK : ");
        System.out.println();
        ListMhs.insertionSort();
        ListMhs.tampil();
    }
}