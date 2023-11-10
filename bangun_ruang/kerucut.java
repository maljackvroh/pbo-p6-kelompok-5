package bangun_ruang;

public class kerucut extends BangunRuang {
    double r, t;
    double pi = 3.14;

    public kerucut(double r, double t) {
        this.r = r;
        this.t = t;
        Volume();
    }

    private void Volume() {
        super.volume = (1.0 / 3 * this.pi * this.r * this.r * this.t);
    }

}
