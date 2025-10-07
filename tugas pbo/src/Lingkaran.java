// Lingkaran.java
public class Lingkaran extends BangunDatar implements IDrawable {
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    @Override
    public String getNama() {
        return "Lingkaran";
    }

    // --- IMPLEMENTASI INHERITANCE ---
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    // --- IMPLEMENTASI INTERFACE ---
    @Override
    public void draw() {
        System.out.println("Menggambar sebuah " + getNama() + " berwarna " + getWarna() + " dengan radius " + radius + " cm.");
    }
}