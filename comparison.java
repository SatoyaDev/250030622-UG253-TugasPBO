public class comparison {
    public static void main(String[] args) {
        int angka1 = 20;
        int angka2 = 15;

        System.out.println("Angka Pertama : " + angka1);
        System.out.println("Angka Kedua   : " + angka2);
        System.out.println("===============================");

        // Operator Sama Dengan (==)
        boolean isSama = (angka1 == angka2);
        System.out.println("Apakah angka 1 == angka 2 ? " + isSama);

        // Operator Tidak Sama Dengan (!=)
        boolean isTidakSama = (angka1 != angka2);
        System.out.println("Apakah angka 1 != angka 2 ? " + isTidakSama);

        // Operator Lebih Besar Dari (>)
        boolean isLebihBesar = (angka1 > angka2);
        System.out.println("Apakah angka 1 > angka 2  ? " + isLebihBesar);

        // Operator Lebih Kecil Dari (<)
        boolean isLebihKecil = (angka1 < angka2);
        System.out.println("Apakah angka 1 < angka 2  ? " + isLebihKecil);

        // Operator Lebih Besar atau Sama Dengan (>=)
        boolean isLebihBesarSama = (angka1 >= angka2);
        System.out.println("Apakah angka 1 >= angka 2 ? " + isLebihBesarSama);

        // Operator Lebih Kecil atau Sama Dengan (<=)
        boolean isLebihKecilSama = (angka1 <= angka2);
        System.out.println("Apakah angka 1 <= angka 2 ? " + isLebihKecilSama);
    }
}