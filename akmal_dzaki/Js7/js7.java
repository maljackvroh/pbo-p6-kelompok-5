package akmal_dzaki.Js7;

import java.util.Scanner;

public class js7 extends pil{
    Scanner in = new Scanner(System.in);
    
    @Override
    public void procces() {
        // js4 data = new js4();
        // int x = data.dat.size();

        // System.out.println(data.dat);
        System.out.println("Berikut beberapa program yang dapat kamu lakukan: ");
        System.out.println("1. Say Hi");
        System.out.println("2. Say Bye");
        System.out.println("3. Say u love urself");
        System.out.print("Pilih: ");

        int pill = in.nextInt();
        switch (pill) {
            case 1:
                System.out.println("Hiii....");
                
                break;

            case 2:
                System.out.println("Bye byee!!");
                break;
            
            case 3:
                System.out.println("I love myself!!!!");
                break;

            default:
                System.out.println("Inputan salah");
                break;
        }
        
    }


    
    public static void main(String[] args) {
        js7 nilai = new js7();

        System.out.println("\nIni adalah program ini dh");
        
        nilai.procces();


    }
}
