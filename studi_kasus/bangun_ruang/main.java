package studi_kasus.bangun_ruang;

public class main {
    public static void main(String[] args) {

        segi_empat alas = new segi_empat(5, 4);
        kerucut kerucut = new kerucut(alas, 6);
        prisma prisma = new prisma(alas, 6);
        limas limas = new limas(alas, 6);

        System.out.println("\nKerucut:");
        System.out.println(kerucut);
        System.out.println("\nPrisma Segi Empat:");
        System.out.println(prisma);
        System.out.println("\nLimas:");
        System.out.println(limas);
    }
}
