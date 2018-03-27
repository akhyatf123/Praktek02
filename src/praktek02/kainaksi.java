
package praktek02;

public class kainaksi {
    public static void main(String[] args) {
        
         kain A1 = new kain();
         A1.panjang = 10;
         A1.lebar = 20;
         
         A1.cetakInfo();
         System.out.println("Luas kain = "+A1.hitungLuas());
         A1.cetakLuasKain();
        
    }
    
}
