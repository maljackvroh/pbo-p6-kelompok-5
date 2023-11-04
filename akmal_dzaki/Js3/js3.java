package akmal_dzaki.Js3;

import java.util.Scanner;

public class js3 extends manusia{
    
    public void setUmur(int umur){
        this.umur = umur;
    }

    public int getUmur(){
        return umur;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        js3 mns = new js3();

        System.out.println("Masukan nama: ");
        mns.nama = in.nextLine();
        System.out.println("Masukan umur: ");
        mns.setUmur(in.nextInt());
        System.out.println("Masukan berat badan: ");
        mns.berat = in.nextDouble();

        System.out.println("\nNamanya: "+mns.nama);
        System.out.println("Usianya: "+mns.getUmur());
        System.out.println("Beratnya: "+mns.berat);
        mns.makan();
        mns.pup();
    }
}
