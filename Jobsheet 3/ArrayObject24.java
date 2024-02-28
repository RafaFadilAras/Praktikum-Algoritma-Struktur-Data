import java.util.Scanner;
public class ArrayObject24 {
    public static void main(String[] args) {
        PersegiPanjang24[] ppArray = new PersegiPanjang24[3];

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang24();
            System.out.println("Persegi panjang ke- " + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }

        for  (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke - " + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }
    }
}
