package akmal_dzaki.Js5;

public class bunga extends daun{
    void bunga(){
        if(nutrisi < 2){
            System.out.println("\nButuh lebih bnyak nutrisi");
            System.out.println("Tambah lebih banyak nutrisi");
        } else if(air < 1){
            System.out.println("\nbutuh lebih banyak air");
            System.out.println("Tambah lebih banyak air");
        }else if (nutrisi == 2 && air == 1){
            System.out.println("\nair dan nutrisi terpenuhi, buah akan terbentuk");
            tanaman();
        } 
    }
}
