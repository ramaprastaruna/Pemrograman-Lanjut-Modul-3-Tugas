import java.util.Scanner;

public class HitungPersegi {
    /**
     * Method untuk menghitung luas persegi.
     *
     * @param sisi Panjang sisi persegi.
     * @return Luas dari persegi.
     */
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    /**
     * Method untuk menghitung keliling persegi.
     *
     * @param sisi Panjang sisi persegi.
     * @return Keliling dari persegi.
     */
    public static double hitungKeliling(double sisi) {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        double luas = hitungLuas(sisi);
        double keliling = hitungKeliling(sisi);

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);

        input.close();
    }
}