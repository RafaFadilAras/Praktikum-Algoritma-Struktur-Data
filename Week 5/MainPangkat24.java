import java.net.Socket;
import java.util.Scanner;
public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        Pangkat24[] png = new Pangkat24[3];
        png[0] = new Pangkat24(8, 2);
        png[1] = new Pangkat24(2, 4);
        png[2] = new Pangkat24(6, 4);

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        System.out.println();
            for (int i=0; i<png.length; i++) {
                System.out.print("Hasil dari " 
                + png [i].nilai + " pangkat " 
                + png [i].pangkat + " adalah " 
                + png [i].pangkatBF(png[i].nilai, png[i].pangkat));
                System.out.println();
            }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        System.out.println();
            for (int i=0; i<png.length; i++) {
                System.out.print("Hasil dari " 
                + png [i].nilai 
                + " pangkat " + png [i].pangkat 
                + " adalah " + png [i].pangkatDC(png[i].nilai, png[i].pangkat));
                System.out.println();
            }
        }
    }

