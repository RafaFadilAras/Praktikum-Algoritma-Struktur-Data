// import java.util.Scanner;
public class ArrayObject24 {
    public static void main(String[] args) {

        PersegiPanjang24[][] ppArray = new PersegiPanjang24[3][2];

        for (int i = 0; i < ppArray.length; i++) {
            for ( int j = 0; j<ppArray[i].length; j++) {
                ppArray[i][j] = new PersegiPanjang24();
                if (j==1) {
                    ppArray[i][j].persegiPj = 5 * (i+j+1);
                } else {
                    ppArray[i][j].persegiPj = 4 * (i+1);
                }
            }
        }

        for  (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke - " + (i+1));
            for (int j = 0; j<ppArray[0].length; j++) {
                System.out.print("Panjang : " + ppArray[i][j].persegiPj);
                j++;
                System.out.println(", lebar : " + ppArray[i][j].persegiPj);
            }
        }
    }
}
