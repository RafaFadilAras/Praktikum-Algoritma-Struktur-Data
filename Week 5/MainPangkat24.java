import java.util.Scanner;
public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc.nextInt();

        Pangkat24 [] png = new Pangkat24 [elemen];
        for (int i=0; i<elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan ke- " +(i+1)+ " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke -" + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat24(nilai, pangkat);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i=0; i<elemen; i++) {
            System.out.print("Hasil dari " + png [i].nilai + " pangkat " + png [i].pangkat + " adalah " + png [i].pangkatBF(png [i].nilai, png[i].pangkat));
            System.out.println();
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i=0; i<elemen; i++) {
            System.out.print("Hasil dari " + png [i].nilai + " pangkat " + png [i].pangkat + " adalah " + png [i].pangkatDC(png [i].nilai, png[i].pangkat));
            System.out.println();
        }
    }
}
    
