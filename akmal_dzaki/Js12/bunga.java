package akmal_dzaki.Js12;

public class bunga extends tanaman{
    void penyemaian(){
        if(nutrisi < 6){
            System.out.println("\nButuh lebih bnyak nutrisi");
            System.out.println("Tambah lebih banyak nutrisi");
        } else if(air < 5){
            System.out.println("\nbutuh lebih banyak air");
            System.out.println("Tambah lebih banyak air");
        }else if (nutrisi == 6 && air == 5){
            System.out.println("\nair dan nutrisi terpenuhi, buah akan terbentuk");
            buah();
        } 
    }
}
