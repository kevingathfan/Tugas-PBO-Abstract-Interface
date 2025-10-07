public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(5.0, "Biru");
        BangunDatar lingkaran = new Lingkaran(7.0, "Merah");

        BangunDatar[] semuaBangun = {persegi, lingkaran};

        System.out.println("--- Menjalankan Metode Secara Polimorfik ---");
        for (BangunDatar bangun : semuaBangun) {
            System.out.println("\n========================");
            System.out.println("Bentuk: " + bangun.getNama());
            System.out.println("Warna: " + bangun.getWarna());

            System.out.printf("Luas: %.2f cm^2\n", bangun.hitungLuas());
            System.out.printf("Keliling: %.2f cm\n", bangun.hitungKeliling());

            if (bangun instanceof IDrawable) {

                ((IDrawable) bangun).draw();
            }
            else{
                System.err.println("objek bukan instance dari IDrawable");
            }
            System.out.println("========================");
        }
    }
}