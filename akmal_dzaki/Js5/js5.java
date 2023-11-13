package akmal_dzaki.Js5;

import java.util.Scanner;

public class js5 {
    public static void main(String[] args) {
        bunga tumbuhan = new bunga();
        Scanner in = new Scanner(System.in);

        int pill;

        do {
            System.out.println("\nApa yang ingin anda lakukan?");
            System.out.println("1. Nutrisi\n2. Air\n3. Tampilkan buah\n4. Keluar");
            pill = in.nextInt();
            if(pill == 1){
                tumbuhan.daun();
                
            } else if (pill == 2){
                tumbuhan.akar();
                
            } else if(pill == 3){
                tumbuhan.bunga();
                
            }
        } while(pill == 1 && pill == 2 && pill == 3);
    }
}
