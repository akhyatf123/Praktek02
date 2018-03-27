
package praktek02;

public class kainaksi {
    public static void main(String[] args) {
        
         kain A1 = new kain();
         A1.panjang = 10;
         A1.lebar = 20;
         
         A1.cetakInfo();
         System.out.println("Luas kain = "+A1.hitungLuas());
         A1.cetakLuasKain();
         
         kain A2 = new kain();
         A2.cetakInfo();
         
         kain A3 = new kain(50,60);
         A3.cetakInfo();
         
    }
    
}
