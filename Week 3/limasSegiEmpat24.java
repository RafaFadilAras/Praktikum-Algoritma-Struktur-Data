public class limasSegiEmpat24 {
    public double alas;
    public double tinggi;

    public limasSegiEmpat24(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaanLimas() {
        double alas = this.alas * this.alas;
        double kelilingAlas = 4 * alas;
        double selimut = kelilingAlas * tinggi / 2;
        return alas + selimut;
    }

    public double hitungVolumeLimas() {
        return (1.0 / 3.0) * alas * alas * tinggi;
    }

    public void tampilInformasi() {
        System.out.println("Limas Segi Empat:");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas permukaan: " + hitungLuasPermukaanLimas());
        System.out.println("Volume: " + hitungVolumeLimas());
        System.out.println();
    }
}
