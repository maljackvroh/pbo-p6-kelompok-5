/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dini_ayuastina;

/**
 *
 * @author DINI AYUASTINA
 */
class Parent {
    Parent() {
        System.out.println("Constructor of Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Constructor of Child");
    }
}

public class Main {
    public static void main(String[] args) {
        String nim = "14"; 
        char lastDigit = nim.charAt(nim.length() - 2);

        if (lastDigit == '1' && nim.charAt(nim.length() - 1) == '4') {
            new Child();
        } else {
            new Parent();
        }
    }
}



