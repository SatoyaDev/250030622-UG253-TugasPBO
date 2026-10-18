public class logic {
    public static void main(String[] args) {
        int skorUjian = 85;
        int batasLulus = 75;
        boolean adaCatatanBuruk = false;

        // Proses Logika
        boolean nilaiMencukupi = skorUjian >= batasLulus;
        boolean berkelakuanBaik = !adaCatatanBuruk;
        
        // Kesimpulan akhir
        boolean statusLulus = nilaiMencukupi && berkelakuanBaik;

        System.out.println("Fakta 1 (Nilai cukup)      : " + nilaiMencukupi);
        System.out.println("Fakta 2 (Kelakuan baik)    : " + berkelakuanBaik);
        System.out.println("Kesimpulan Akhir (Lulus)   : " + statusLulus);
    }
}