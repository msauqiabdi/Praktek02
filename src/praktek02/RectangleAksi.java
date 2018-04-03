package praktek02;
public class RectangleAksi {
    public static void main(String[] args) {
     Rectangle r1 = new Rectangle();
     r1.panjang = 10;
     r1.lebar = 5;
     
     r1.cetakinfo();
     System.out.println("Luas rectangle = "+r1.hitungluas());
     r1.cetakLuas();
    }
}