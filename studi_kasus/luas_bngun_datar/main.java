package studi_kasus.luas_bngun_datar;
/*Luas jajar genjang, Luas persegi, Luas lingkaran
 * a. L =  alas*tinggi
 * b. L = s*s
 * c. L = p*l
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ling math = new ling();
        Scanner in = new Scanner(System.in);

        int pill;

        System.out.println("PROGRAM MENCARI NILAI");
        System.out.println("1. Luas Jajar Genjang");
        System.out.println("2. Luas Persegi");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Keluar");

        do {
            System.out.println("\nMana yang ingin anda cari?");
            System.out.print("Pilihan: ");
            pill = in.nextInt();

            switch (pill) {
                case 1:
                    System.out.print("Masukan nilai alas: ");
                    float a = in.nextFloat();
                    System.out.print("Masukan nilai tinggi: ");
                    float b = in.nextFloat();

                    System.out.print("Hasil = "+math.jajar_gen(a, b));
                    break;
                
                case 2:
                    System.out.print("Masukan nilai sisi: ");
                    float c = in.nextFloat();

                    System.out.print("Hasil = "+math.persegi(c));
                    break;

                case 3:
                    System.out.print("Masukan nilai panjang: ");
                    float d = in.nextFloat();
                    System.out.print("Masukan nilai lebar");
                    float e = in.nextFloat();

                    System.out.print("Hasil = "+math.ling(d, e));
                    break;

                default:
                System.out.println("Byee..");
                    break;
            }


        } while(pill <= 3 && pill >= 1);


    }
}
