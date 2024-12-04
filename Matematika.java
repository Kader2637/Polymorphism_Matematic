public class Matematika {


    //  overload pertambahan
    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.printf("Hasil pertambahan: %.1f%n", hasil);
    }

    void pertambahan(int a, int b, int c) {
        int hasil = a + b + c;
        System.out.println("Hasil pertambahan : " + hasil);
    }

    void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil pertambahan : " + hasil);
    }

    void pertambahan(double a, double b) {
        double hasil = a + b;
        System.out.printf("Hasil pertambahan: %.1f%n", hasil);
    }

    //  overload pengurangan
    void pengurangan(double a, double b, double c) {
        double hasil = a - b - c;
        System.out.println("Hasil pengurangan : " + hasil);
    }

    void pengurangan(int a, int b, int c) {
        int hasil = a - b - c;
        System.out.println("Hasil pengurangan : " + hasil);
    }

    void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil pengurangan : " + hasil);
    }

    void pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.printf("Hasil pengurangan: %.1f%n", hasil);
    }

        //  overload perkalian
    void perkalian(double a, double b, double c) {
        double hasil = a * b * c;
        System.out.println("Hasil perkalian : " + hasil);
    }

    void perkalian(int a, int b, int c) {
        int hasil = a * b * c;
        System.out.println("Hasil perkalian : " + hasil);
    }

    void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil perkalian : " + hasil);
    }

    void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian : " + hasil);
    }

        //  overload pembagian
    void pembagian(double a, double b, double c) {
        double hasil = a / b / c;
        System.out.printf("Hasil pertambahan: %.11f%n", hasil);
    }

    void pembagian(int a, int b, int c) {
        int hasil = a / b / c;
        System.out.println("Hasil pembagian : " + hasil);
    }

    void pembagian(int a, int b) {
        int hasil = a / b;
        System.out.println("Hasil pembagian : " + hasil);
    }

    void pembagian(double a, double b) {
        double hasil = a / b;
        System.out.printf("Hasil pertambahan: %.11f%n", hasil);
    }

}
