package studi_kasus.services;

class offline extends services {
    private String lokasi;

    public offline(String jenis, double biaya, String lokasi){
        super(jenis, biaya);
        this.lokasi = lokasi;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("Lokasi pembayaran: "+lokasi);
    }
}