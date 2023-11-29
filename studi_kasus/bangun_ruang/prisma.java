package studi_kasus.bangun_ruang;

public class prisma extends bangun_ruang {
    private segi_empat alas;
    private double tinggi;

    public prisma(segi_empat alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return alas.hitungLuas() + alas.hitungKeliling() * tinggi;
    }

    @Override
    double hitungKeliling() {
        return 2 * (alas.hitungKeliling() + alas.hitungKeliling() * tinggi / alas.hitungKeliling());
    }
}
