public class ArrayBalok24 {
    public static void main(String[] args) {
        Balok24[] blArray = new Balok24[3];
        blArray[0] = new Balok24(100, 30, 12);
        blArray[1] = new Balok24(120, 40, 15);
        blArray[2] = new Balok24(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}

