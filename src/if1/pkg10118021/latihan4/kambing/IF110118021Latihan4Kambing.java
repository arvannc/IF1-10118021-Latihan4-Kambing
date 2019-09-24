/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan4.kambing;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Program banyaknya kambing
 */
public class IF110118021Latihan4Kambing {
    
            private static Object kambingJantan;
            public void tambahKambing (){
                //Deklarasi variabel lokal
                int jumlahKambing = 0;
                
                jumlahKambing = jumlahKambing + 5;
                System.out.println("Jumlah Kambing setelah ditambah: " 
                        + jumlahKambing);
            }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IF110118021Latihan4Kambing kambingJantan = new IF110118021Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}