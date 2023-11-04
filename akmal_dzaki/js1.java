package akmal_dzaki;

// import java.util.Scanner;

class manusia{
    String nama;
    int usia;
    double berat;

    void tampil(){
        System.out.println("Namanya: "+this.nama);
        System.out.println("Usianya: "+this.usia);
        System.out.println("Beratnya: "+this.berat);
    }
}

class makan extends manusia {

    void pup(){
        System.out.println(nama+" Sedang puupp........");
        berat = berat - 0.45;
        System.out.println("Berat "+nama+" menjadi "+berat);
    }

    void makan(){
        System.out.println(nama+" Sedang makan........");
        berat = berat + 1.3;
        System.out.println("Berat "+nama+" menjadi "+berat);
    }
}

public class js1{
    public static void main(String[] args) {
        manusia mnsi = new manusia();
        // Scanner in = new Scanner(System.in);

        System.out.println("PROGRAM MANUSIA");
        System.out.println("===============");

        mnsi.nama = "Akmal Dzaki";
        mnsi.usia = 21;
        mnsi.berat = 62;

        makan mkn = new makan();

        mnsi.tampil();
        System.out.println(" ");
        mkn.makan();
        System.out.println(" ");
        mkn.pup();
    }
}