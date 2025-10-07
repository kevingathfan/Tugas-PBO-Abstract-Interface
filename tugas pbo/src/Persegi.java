// Persegi.java
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi, String warna) {
        super(warna); // Memanggil constructor dari superclass (BangunDatar)
        this.sisi = sisi;
    }

    @Override
    public String getNama() {
        return "Persegi";
    }

    // --- IMPLEMENTASI INHERITANCE ---
    // Memberikan implementasi konkret untuk metode abstract dari BangunDatar
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    // --- IMPLEMENTASI INTERFACE ---
    // Memberikan implementasi untuk metode dari interface IDrawable
   
}