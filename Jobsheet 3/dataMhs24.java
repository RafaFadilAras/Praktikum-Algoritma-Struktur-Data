public class dataMhs24 {
    String namaMhs, nim;
    char kelamin;
    double ipk;

    public dataMhs24 (String nama, String nim, char kelamin, double ipk) {
        this.namaMhs = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
    }
    public void tampilInformasi() {
        System.out.println("Nama: " + namaMhs);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + (kelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}
