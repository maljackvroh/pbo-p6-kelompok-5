package bangun_ruang;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("1. Hitung Volume Kerucut");
        System.out.print("masukkan nilai jari-jari : ");
        int r = in.nextInt();
        System.out.print("masukkan nilai tinggi : ");
        int t = in.nextInt();
        kerucut satu = new kerucut(r, t);
        System.out.println("Volume kerucut: " + satu.getVolume());
        System.out.println();
        System.out.println("2. Hitung Volume Limas Segi Empat");
        System.out.print("masukkan nilai sisi :");
        int sisi = in.nextInt();
        System.out.print("masukkan nilai tinggi : ");
        int tinggi = in.nextInt();
        Limas dua = new Limas(sisi, tinggi);
        System.out.println("Volume Limas: " + dua.getVolume());
        System.out.println();
        System.out.println();
        System.out.println("3. Hitung Volume Prisma Segi Empat");
        System.out.print("masukkan nilai panjang : ");
        int p = in.nextInt();
        System.out.print("masukkan nilai lebar : ");
        int l = in.nextInt();
        System.out.print("masukkan nilai tinggi : ");
        int ti = in.nextInt();
        Prisma tiga = new Prisma(p, l, ti);
        System.out.println("Volume Prisma: " + tiga.getVolume());

        System.out.println();

    }
}
