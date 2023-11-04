package akmal_dzaki.Js2;

public class makan extends manusia {
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
