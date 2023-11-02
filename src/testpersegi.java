import java.util.Scanner;
public class testpersegi {
    /**
     * Method untuk menghitung luas persegi
     *
     * @param sisi panjang sisi persegi
     * @return luas dari persegi
     */
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    /**
     * Method untuk menghitung keliling persegi
     *
     * @param sisi panjang sisi dari persegi
     * @return keliling dari persegi
     */
    public static double hitungKeliling(double sisi) {
            return 4 * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();

        double luas = hitungLuas(sisi);
        double keliling = hitungKeliling(sisi);

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);

        input.close();
    }
}