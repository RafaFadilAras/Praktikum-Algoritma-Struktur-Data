import java.net.Socket;
import java.util.Scanner;
public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pangkat24[] png = new Pangkat24[3];
        png[0] = new Pangkat24(8, 2);
        png[1] = new Pangkat24(2, 4);
        png[2] = new Pangkat24(6, 4);

        do {
            System.out.println("==================");
            System.out.println("       MENU       ");
            System.out.println("==================");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide Conquer");
            System.out.println("3. Keluar");
            System.out.println("Pilih Menu : ");
            int pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                    System.out.println();
                    for (int i=0; i<png.length; i++) {
                        System.out.print("Hasil dari " 
                        + png [i].nilai + " pangkat " 
                        + png [i].pangkat + " adalah " 
                        + png [i].pangkatBF(png[i].nilai, png[i].pangkat));
                        System.out.println();
                    }
                    System.out.println();
                break;

                case 2:
                    System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                    System.out.println();
                    for (int i=0; i<png.length; i++) {
                        System.out.print("Hasil dari " 
                        + png [i].nilai 
                        + " pangkat " + png [i].pangkat 
                        + " adalah " + png [i].pangkatDC(png[i].nilai, png[i].pangkat));
                        System.out.println();
                    }
                    System.out.println();
                break;

                case 3:
                System.out.println("=============");
                System.out.println("Terima kasih");
                System.out.println("=============");
                System.exit(0);
                break;
                default:
                break;
            }
       }while(true);

        }
    }

