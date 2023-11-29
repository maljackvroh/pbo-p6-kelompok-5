package studi_kasus.bangun_ruang;

public class limas extends bangun_ruang {
    private segi_empat alas;
    private double tinggi;

    public limas(segi_empat alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 2 * Math.PI * alas.hitungLuas() * tinggi / alas.hitungKeliling();
    }

    @Override
    double hitungKeliling() {
        return 4 * Math.PI * alas.hitungKeliling() * tinggi / alas.hitungKeliling();
    }
}