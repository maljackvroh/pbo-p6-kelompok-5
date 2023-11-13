package studi_kasus.services;

public class online extends services{
    private String platform;

    public online(String jenis, double biaya, String platform){
        super(jenis, biaya);
        this.platform = platform;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("Platform: "+platform);
    }
}
