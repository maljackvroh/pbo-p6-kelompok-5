package akmal_dzaki.Js7;

import java.util.Scanner;

public class js7 extends procces{
    Scanner in = new Scanner(System.in);
    procces dats = new procces();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        js7 dats = new js7();
        int pil = 1;

        System.out.println("\nSelamat datang diprogram ini!");
        System.out.println("=============================");

        do{
            System.out.println("Berikut beberapa program yang dapat kamu lakukan: ");
            System.out.println("1. Input");
            System.out.println("2. Sort");
            System.out.println("3. Delete");
            System.out.print("Pilih: ");

            int pill = in.nextInt();
            switch (pill) {
                case 1:
                    dats.input();
                    break;

                case 2:
                    dats.sort();
                    break;
            
                case 3:
                    dats.del();
                    break;

                default:
                    System.out.println("Inputan salah");
                    break;
            }

            System.out.print("Apakah anda ingin coba lagi?(1/0): ");
            pil = in.nextInt();
        } while(pil == 1);

        


    }
}
