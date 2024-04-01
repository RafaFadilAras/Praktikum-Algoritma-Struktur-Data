import java.util.Scanner;
public class BukuMain24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner (System.in);

        PencarianBuku24 data = new PencarianBuku24();
        int jumBuku = 5;      
        
        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil");
        for (int i=0; i < jumBuku; i++) {
            System.out.println("------------------------------------------------------");
            System.out.print("Kode buku    : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku   : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang    : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock        : ");
            int stock = s.nextInt();

            Buku24 m = new Buku24(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("____________________________");
        System.out.println("____________________________");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan kode buku yang dicari");
        System.out.print("Kode buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        Buku24 dataBuku24 = data.FindBuku24(null, null);
        dataBuku24.tampilDataBuku();
    }
}
