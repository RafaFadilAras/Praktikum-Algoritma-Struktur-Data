public class Hotel24Main {
    public static void main(String[] args) {
        HotelService24 list = new HotelService24();
        Hotel24 m1 = new Hotel24("Puri Nusa Indah II", "Denpasar", 799000, (byte)3);
        Hotel24 m2 = new Hotel24("Garden Palace", "Surabaya", 2000000, (byte) 4);
        Hotel24 m3 = new Hotel24("Citra Dream", "Yogyakarta", 250000, (byte) 2);
        Hotel24 m4 = new Hotel24("Augusta Surapati", "Bandung", 100000, (byte)1);
        Hotel24 m5 = new Hotel24("Mandarin Oriental", "Jakarta", 3999000, (byte)5);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Daftar Harga sebelum sorting : ");
        System.out.println("============================");
        list.tampil();
        System.out.println();

        System.out.println("Daftar Harga setelah sorting menggunakan Bubble Sort : ");
        System.out.println("============================");
        list.bubbleSort();
        list.tampil();
        System.out.println();

        System.out.println("Daftar Harga setelah sorting menggunakan Selection Sort : ");
        System.out.println("============================");
        list.selectionSort();
        list.tampil();
        System.out.println();
    }
}
