import java.util.Scanner;
public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("--------------------------");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        Faktorial24 [] fk = new Faktorial24 [10];
        for (int i = 0; i < iJml; i++) {
            fk [i] = new Faktorial24 ();
            System.out.print("Masukkan nilai data ke- " + (i+1) + " : ");
            fk [i].nilai = sc.nextInt();
        }

        System.out.println();
        System.out.println("HASIL - BRUTE FORCE");
        for (int i=0; i<iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println();
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i=0; i< iJml; i++) {
        System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk [i].faktorialDC(fk[i].nilai));
        }
    }
}
