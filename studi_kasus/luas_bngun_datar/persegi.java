package studi_kasus.luas_bngun_datar;

public class persegi extends dat {
    float s;

    persegi(float s){
        this.s = s;
    }

    @Override
    float luas() {
        return s*s;
    }
}
