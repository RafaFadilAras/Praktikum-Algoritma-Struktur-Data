import java.util.Scanner;
public class Utama24 {
    public static void main(String[] args) {
        Gudang24 gudang = new Gudang24(7);

        Scanner sc = new Scanner (System.in);

        while (true) {
            System.out.println();
            System.out.println("MENU : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
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
                System.exit(0);
                break;

                default :
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            
            }
        }
    }
}
