import java.util.Scanner;
public class dataMhs24Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        dataMhs24[] mhsArray = new dataMhs24[3];

        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Masukkan data mahasiswa ke - " + (i + 1) + " : ");
            System.out.print("Masukkan Nama : " );
            String namaMhs = sc.nextLine();
            System.out.print("Masukkan NIM : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin  (L/P): ");
            char kelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mhsArray [i] = new dataMhs24(namaMhs, nim, kelamin, ipk);
        }

        System.out.println();
        System.out.println("Informasi Mahasiwa : ");
        System.out.println();
        for (dataMhs24 mahasiswa : mhsArray) {
            mahasiswa.tampilInformasi();
        }
    }
}
