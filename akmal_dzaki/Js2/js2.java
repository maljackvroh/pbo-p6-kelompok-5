package akmal_dzaki.Js2;

public class js2 {
    public static void main(String[] args) {
        makan msia = new makan();

        System.out.println("PROGRAM MANUSIA");
        System.out.println("===============");

        msia.nama = "Akmal Dzaki";
        msia.usia = 21;
        msia.berat = 62;

        msia.tampil();
        msia.makan();
        msia.pup();
    }
}
