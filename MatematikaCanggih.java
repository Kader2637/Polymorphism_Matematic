public class MatematikaCanggih extends Matematika {

    // Overload modulus
    public double modulus(double a, double b, double c) {
        return a % b % c;
    }

    public int modulus(int a, int b, int c) {
        return a % b % c;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    // Method operasiGabunganTigaAngka
    public void operasiGabunganTigaAngka(int a, int b, int c) {
        int hasil = a + (b * c);
        System.out.println("\nHasil operasi gabungan: " + hasil);
    }
}