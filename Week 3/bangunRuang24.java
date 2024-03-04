import java.util.Scanner;
public class bangunRuang24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Pilih bangun datar");
        System.out.println("1. Kerucut");
        System.out.println("2. Limas segi empat sama sisi");
        System.out.println("3. Bola");
        System.out.print("Masukkan pilihan : ");
        int terpilih = sc.nextInt();

        switch(terpilih) {
        // Kerucut
        case 1:
            System.out.print("Masukkan jumlah bangun ruang yang ingin dihitung: ");
            int jumlahKerucut = sc.nextInt();
            Kerucut24[] kerucut = new Kerucut24[jumlahKerucut];
                for (int i = 0; i < kerucut.length; i++) {
                    System.out.println("Kerucut ke - " + (i+1) );
                    System.out.print("Jari-jari Kerucut : ");
                    double r = sc.nextDouble();
                    System.out.print("Sisi miring Kerucut : ");
                    double s = sc.nextDouble();
                    kerucut [i] = new Kerucut24(r,s);
                }
            
            System.out.println();
            for(int i = 0; i < kerucut.length; i++) {
            System.out.println("Luas Permukaan Kerucut ke - " + (i+1) + " : " + kerucut[i].hitungLuasPermukaanKerucut() );
            System.out.println("Volume kerucut ke - " + (i+1) + " : " + kerucut[i].hitungVolumeKerucut() );
            }
        break;

        // Limas Segi Empat
        case 2:
            System.out.print("Masukkan jumlah bangun ruang yang ingin dihitung: ");
            int jumlahLimas = sc.nextInt();
            limasSegiEmpat24[] limas = new limasSegiEmpat24[jumlahLimas];
                for (int i = 0; i < limas.length; i++) {
                    System.out.println("Limas ke - " + (i+1));
                    System.out.print("Panjang sisi alas : ");
                    double alas = sc.nextDouble();
                    System.out.print("Tinggi limas : ");
                    double tinggi = sc.nextDouble();
                    limas [i] = new limasSegiEmpat24(alas, tinggi);
                }

            System.out.println();
            for (int i = 0; i < limas.length; i++) {
            System.out.println("Luas permukaan limas ke - " + (i+1) + " : " + limas[i].hitungLuasPermukaanLimas());
            System.out.println("Volume limas ke - " + (i+1) + " : " + limas[i].hitungVolumeLimas());
            }

        break;

        // Bola
        case 3:
            System.out.print("Masukkan jumlah bangun ruang yang ingin dihitung: ");
            int jumlahBola = sc.nextInt();
            Bola24[] bola = new Bola24[jumlahBola];
                for (int i = 0; i < bola.length; i++) {
                    System.out.println("Bola ke - " + (i+1));
                    System.out.print("Jari - jari : ");
                    double jariJari = sc.nextDouble();
                    bola [i] = new Bola24(jariJari);
                }

            System.out.println();
            for (int i = 0; i < bola.length; i++) {
                System.out.println("Luas permukaan bola ke - " + (i+1) + " : " + bola[i].hitungLuasPermukaanBola());
                System.out.println("Volume bola ke - " + (i+1) + ": " + bola[i].hitungVolumeBola());
                }
        break;

        default:
        System.out.println("Pilihan tidak valid ! ");

        break;
        }
        sc.close();
    }
}