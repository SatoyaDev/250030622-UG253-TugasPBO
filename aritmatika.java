public class aritmatika{
    public static void main(String[] args) {
        // Inisialisasi variabel implementasi
        int angka1 = 15;
        int angka2 = 4;

        // Proses operasi aritmatika
        int hasilJumlah = angka1 + angka2;
        int hasilKurang = angka1 - angka2;
        int hasilKali = angka1 * angka2;
        double hasilBagi = (double) angka1 / angka2; 
        int sisaBagi = angka1 % angka2;

        // Menampilkan output ke layar
        System.out.println("Angka Pertama : " + angka1);
        System.out.println("Angka Kedua   : " + angka2);
        System.out.println("===============================");
        System.out.println("Penjumlahan (+) : " + hasilJumlah);
        System.out.println("Pengurangan (-) : " + hasilKurang);
        System.out.println("Perkalian (*)   : " + hasilKali);
        System.out.println("Pembagian (/)   : " + hasilBagi);
        System.out.println("Sisa Bagi (%)   : " + sisaBagi);
    }
}