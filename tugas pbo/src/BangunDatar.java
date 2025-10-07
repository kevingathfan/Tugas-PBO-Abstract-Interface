// BangunDatar.java
public abstract class BangunDatar {
    private String warna;

    public BangunDatar(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    // Metode abstract, tidak memiliki isi.
    // Implementasinya diserahkan kepada kelas anak (subclass).
    public abstract String getNama();
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}