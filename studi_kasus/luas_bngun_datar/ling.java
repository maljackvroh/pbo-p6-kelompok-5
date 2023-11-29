package studi_kasus.luas_bngun_datar;

public class ling extends dat{
    float p;
    float l;

    ling(float p, float l){
        this.p = p;
        this.l = l;
    }

    @Override
    float luas(){
        return p*l;
    }
}
