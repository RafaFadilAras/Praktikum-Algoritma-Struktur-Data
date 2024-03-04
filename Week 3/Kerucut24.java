public class Kerucut24 {
    public double jariJari;
    public double sisiMiring;
    public double tinggi;

    public Kerucut24 (double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring; 
    }

    public double hitungLuasPermukaanKerucut () {
        double selimut = Math.PI * jariJari * sisiMiring;
        double alas = Math.PI * jariJari * jariJari;
        return selimut + alas;
    }

    public double hitungVolumeKerucut () {
        tinggi = Math.sqrt(sisiMiring * sisiMiring - jariJari * jariJari);
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }
    
    public void tampilInformasi () {
        System.out.println("Kerucut : ");
        System.out.println("Jari - jari : " + jariJari);
        System.out.println("Sisi miring : " + sisiMiring);
        System.out.println("Luas permukaan : " + hitungLuasPermukaanKerucut());
        System.out.println("Volume : " + hitungVolumeKerucut());
        System.out.println();
    }
}
