package akmal_dzaki.Js1;


public class js1{
    public static void main(String[] args) {
        makan mnsi = new makan();

        System.out.println("PROGRAM MANUSIA");
        System.out.println("===============");

        mnsi.nama = "Akmal Dzaki";
        mnsi.usia = 21;
        mnsi.berat = 62;

        mnsi.tampil();
        mnsi.makan();
        mnsi.pup();
    }
}