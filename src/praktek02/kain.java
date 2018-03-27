package praktek02;


public class kain {
    double panjang;
    double lebar;

    public kain() {
        panjang=3;
        lebar=8;
    }

    public kain(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    
    
    void cetakInfo(){
        System.out.println("===========================");
        System.out.println("Panjang         :"+panjang);
        System.out.println("Lebar           :"+lebar);
        System.out.println("===========================");


}
    double hitungLuas(){
        double luas;
        luas=panjang+lebar;
        return luas;
    }
    
    void cetakLuasKain(){
        System.out.println("Luasnya adalah : "+hitungLuas());
    }
}
