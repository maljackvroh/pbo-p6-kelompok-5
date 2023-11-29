package studi_kasus.bangun_ruang;


public class segi_empat extends bangun_ruang {
    private double panjang;
    private double lebar;

    public segi_empat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
