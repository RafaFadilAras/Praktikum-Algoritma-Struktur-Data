public class Bola24 {
    public double jariJari;

    public Bola24(double jariJari) {
        this.jariJari = jariJari;
        hitungLuasPermukaanBola();
        hitungVolumeBola();
    }

    public double hitungLuasPermukaanBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
