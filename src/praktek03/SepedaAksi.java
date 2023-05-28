package praktek03;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        
        s.setMerk("ButterFly");
        s.setWarna("Merah");
        s.setHarga(1000);
        
        s.cetakInfo();
        
        System.out.println("Merknya \t : ");
        System.out.println(s.getMerk());
        System.out.println("Warnanya \t : ");
        System.out.println(s.getWarna());
        System.out.println("Harganya \t : ");
        System.out.println(s.getHarga());
        
    }
}
