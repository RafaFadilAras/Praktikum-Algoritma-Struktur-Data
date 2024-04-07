import java.util.Scanner;
public class Utama24 {
    public static void main(String[] args) {
        Gudang24 gudang = new Gudang24(7);
        Scanner sc = new Scanner (System.in);
        //System.out.print("Masukkan kapasitas gudang : ");
        //int kapasitasGudang = sc.nextInt();
        //sc.nextLine();
        //Gudang24 gudang = new Gudang24(kapasitasGudang);
        
        while (true) {
            System.out.println();
            System.out.println("MENU : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. tampilkan barang terbawah");
            System.out.println("6. Cari Barang (kode)");
            System.out.println("7. Cari Barang (nama)");
            System.out.println("8. Keluar");
            System.out.print("Pilih Menu : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
      
            switch (pilihan) {
                case 1 :
                System.out.print("Masukkan kode barang      : ");
                int kode = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan nama barang      : ");
                String nama = sc.nextLine();
                System.out.print("Masukkan nama kategori    : ");
                String kategori = sc.nextLine();
                Barang24 barangBaru = new Barang24(kode, nama, kategori);
                gudang.tambahBarang(barangBaru);
                break;

                case 2 :
                gudang.ambilBarang24();
                break;

                case 3 :
                gudang.tampilBarang();
                break;

                case 4 :
                gudang.lihatBarangTeratas();
                break;

                case 5 :
                gudang.lihatBarangTerbawah();
                break;

                case 6 :
                System.out.print("Masukkan kode barang yang dicari : ");
                kode = sc.nextInt();
                sc.nextLine();
                gudang.cariBarang(kode);
                break;

                case 7 :
                System.out.print("Masukkan nama barang yang dicari : ");
                nama = sc.nextLine();
                gudang.cariBarang(nama);
                break;

                case 8 :
                System.exit(0);

                default :
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            
            }
        }
    }
}
