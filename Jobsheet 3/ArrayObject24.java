import java.util.Scanner;
public class ArrayObject24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah persegi panjang : ");
        int n = sc.nextInt();

        PersegiPanjang24[] ppArray = new PersegiPanjang24[n];

        for (int i = 0; i < n; i++) {
            ppArray[i] = new PersegiPanjang24();
            System.out.println("Persegi panjang ke- " + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for  (int i = 0; i < n; i++){
            System.out.println("Persegi panjang ke - " + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}
