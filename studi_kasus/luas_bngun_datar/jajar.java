package studi_kasus.luas_bngun_datar;

public class jajar extends dat{
    float alas;
    float tinggi;

    jajar(float alas, float tinggi){
        
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas(){
        return alas*tinggi;
    }
}
