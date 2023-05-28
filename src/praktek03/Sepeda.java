package praktek03;
public class Sepeda {
    private String Merk;
    private String Warna;
    private double Harga;
    
    void cetakInfo(){
        System.out.println("Merk \t : " + Merk + "\n" +
                           "Warna \t : " + Warna + "\n" +
                           "Harga \t : " + Harga);
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }
    
    
}
