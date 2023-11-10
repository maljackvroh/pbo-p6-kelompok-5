package studi_kasus.bangun_ruang;

public class Limas extends BangunRuang {
    double sisi, t;

    public Limas(double sisi, double t) {
        this.sisi = sisi;
        this.t = t;
        Volume();
    }

    private void Volume() {
        super.volume = (this.sisi * this.sisi * 1 / 3 * this.t);
    }
}
