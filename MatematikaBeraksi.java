public class MatematikaBeraksi {
    public static void main(String[] args) {

        MatematikaCanggih mtk = new MatematikaCanggih();

        System.out.println("\n====== Pertambahan =======");
        System.out.printf("Hasil pertambahan: %.1f%n", mtk.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Hasil pertambahan: " + mtk.pertambahan(12, 28, 14));
        System.out.println("Hasil pertambahan: " + mtk.pertambahan(23, 34));
        System.out.printf("Hasil pertambahan: %.1f%n", mtk.pertambahan(3.4, 4.9));

        System.out.println("\n====== Perkalian =======");
        System.out.printf("Hasil perkalian: %.2f%n", mtk.perkalian(12.5, 28.7, 14.2));
        System.out.println("Hasil perkalian: " + mtk.perkalian(12, 28, 14));
        System.out.println("Hasil perkalian: " + mtk.perkalian(23, 34));
        System.out.printf("Hasil perkalian: %.2f%n", mtk.perkalian(3.4, 4.9));

        System.out.println("\n====== Pengurangan =======");
        System.out.printf("Hasil pengurangan: %.1f%n", mtk.pengurangan(12.5, 28.7, 14.2));
        System.out.println("Hasil pengurangan: " + mtk.pengurangan(12, 28, 14));
        System.out.println("Hasil pengurangan: " + mtk.pengurangan(23, 34));
        System.out.printf("Hasil pengurangan: %.1f%n", mtk.pengurangan(3.4, 4.9));

        System.out.println("\n====== Pembagian =======");
        System.out.printf("Hasil Pembagian: %.11f%n", mtk.pembagian(12.5, 28.7, 14.2));
        System.out.println("Hasil Pembagian: " + mtk.pembagian(12, 28, 14));
        System.out.println("Hasil Pembagian: " + mtk.pembagian(23, 34));
        System.out.printf("Hasil Pembagian: %.11f%n", mtk.pembagian(3.4, 4.9));

        System.out.println("\n====== Modulus =======");
        System.out.printf("Hasil Modulus: %.1f%n", mtk.modulus(12.5, 28.7, 14.2));
        System.out.println("Hasil Modulus: " + mtk.modulus(12, 28, 14));
        System.out.println("Hasil Modulus: " + mtk.modulus(23, 34));
        System.out.printf("Hasil Modulus: %.1f%n", mtk.modulus(3.4, 4.9));

        // Uji method tambahan kalkulasi
        mtk.operasiGabunganTigaAngka(10, 5, 2);
    }
}