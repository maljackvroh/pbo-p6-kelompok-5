package akmal_dzaki.Js7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

abstract class pil {
    public ArrayList<Integer> dat = new ArrayList<Integer>();

    public abstract void input();
    public abstract void sort();
    public abstract void del();
}


class procces extends pil{
    Scanner in = new Scanner(System.in);

    @Override
    public void input() {
        System.out.print("Masukan banyak nilai yang ingin anda masukan: ");
        int qty = in.nextInt();

        for(int i = 1; i <= qty;i++){
            System.out.print("Masukan nilai ke "+i+" : ");
            dat.add(in.nextInt());
        }
    }

    @Override
    public void sort() {
        System.out.println("Before: "+dat);
        Collections.sort(dat);
        System.out.println("After: "+dat);
    }

    @Override
    public void del() {
        dat.clear();
        System.out.println("Ur data now: "+dat);
    }
}