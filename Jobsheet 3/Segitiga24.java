public class Segitiga24 {
    public int alas;
    public int tinggi;

    public Segitiga24 (int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }
    public double hitungLuas() {
        return (0.5 * alas * tinggi);
    }
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return (alas + tinggi + sisiMiring);
    }
}


