package akmal_dzaki.Js4;

public class tanaman{
    String nama;
    int tinggi;
    int nutrisi;
    int air;

    void buah(){
        int n = 5; // Ukuran pola (tinggi)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
