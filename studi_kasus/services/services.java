package studi_kasus.services;

abstract class services {
    protected String jenis;
    protected double biaya;

    public services(String jenis, double biaya){
        this.jenis = jenis;
        this.biaya = biaya;
    }

    public void information(){
        System.out.println("Jenis pembayaran: "+jenis);
        System.out.println("Banyak biaya: "+biaya);
    }
}
