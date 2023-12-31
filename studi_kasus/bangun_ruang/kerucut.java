package studi_kasus.bangun_ruang;

public class kerucut extends bangun_ruang {
    private segi_empat alas;
    private double tinggi;

    public kerucut(segi_empat alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return Math.PI * alas.hitungLuas() * tinggi / alas.hitungKeliling();
    }

    @Override
    double hitungKeliling() {
        return Math.PI * alas.hitungKeliling() * tinggi / alas.hitungKeliling();
    }
}