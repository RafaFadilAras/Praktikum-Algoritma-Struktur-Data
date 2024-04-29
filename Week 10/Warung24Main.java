import java.util.Scanner;
public class Warung24Main {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian Pelanggan baru");
        System.out.println("2. Antrian Pelanggan keluar");
        System.out.println("3. Cek Pelanggan terdepan");
        System.out.println("4. Cek semua Pelanggan");
        System.out.println("5. Cek Antrian Pelanggan di posisi belakang");
        System.out.println("6. Cek Posisi Pelanggan");
        System.out.println("7. Tampilkan daftar Pelanggan");
        System.out.println("----------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Warung24 antri = new Warung24(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) { 
                case 1:
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                System.out.print("Nomor HP : ");
                int nomorHP = sc.nextInt();
                Warung24 ps = new Warung24(nama, nomorHP);
                sc.nextLine();
                antri.Enqueue(ps);
                break;
            case 2:
                Warung24 data = antri.Dequeue();
                if (!"".equals(data.nama) && !"".equals(data.nomorHP)) {
                    System.out.println("Antrian yang keluar : " + data.nama + " " + data.nomorHP);
                    break;
                }
            case 3:
                antri.peek();
                break;
            case 4:
                antri.print();
                break;
            case 5:
                antri.peekRear();
                break;
            case 6:
                System.out.print("Nama Pelanggan : ");
                String namaPelanggan = sc.nextLine();
                antri.peekPosition(namaPelanggan);
                break;
            case 7:
                antri.daftarPelanggan();
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}