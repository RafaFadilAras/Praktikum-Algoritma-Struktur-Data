public class Segitiga24Main {
    public static void main(String[] args) {
        Segitiga24[] sgArray = new Segitiga24[4];

        sgArray[0] = new Segitiga24(10, 4);
        sgArray[1] = new Segitiga24(20, 10);
        sgArray[2] = new Segitiga24(15, 6);
        sgArray[3] = new Segitiga24(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke - : " + i);
            System.out.println("Alas : " + sgArray[i].alas);
            System.out.println("Tinggi : " + sgArray[i].tinggi);
            System.out.println("Luas : " + sgArray[i].hitungLuas());
            System.out.println("Keliling : " + sgArray[i].hitungKeliling());
            System.out.println();
        }
    }
}
