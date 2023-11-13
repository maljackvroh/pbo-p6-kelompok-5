package studi_kasus.services;

public class utama {
    public static void main(String[] args) {
        offline off = new offline("Cicilan", 345000, "Pondok Labu");
        online on = new online("Cicilan mobil", 12000000, "Danacita");

        System.out.println("");
        off.information();
        System.out.println("");
        on.information();


    }
}
