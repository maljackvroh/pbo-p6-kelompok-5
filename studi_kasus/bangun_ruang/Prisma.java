package studi_kasus.bangun_ruang;

public class Prisma extends BangunRuang {
    double p, l, t;

    public Prisma(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
        Volume();
    }

    public void Volume() {
        super.volume = (1.0 / 3 * this.p * this.l * this.t);
    }
}
