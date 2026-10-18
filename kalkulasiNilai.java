public class kalkulasiNilai {
    public static void main(String[] args) {
        String[] namaMahasiswa = {"Parama", "Gatot", "Komeng"};
        double[] nilaiTugas = {90.0, 75.0, 60.0};
        double[] nilaiUts = {85.0, 70.0, 50.0};
        double[] nilaiUas = {95.0, 80.0, 65.0};
        int[] persentaseKehadiran = {100, 80, 60};

        System.out.println("PROGRAM SISTEM KALKULASI NILAI MAHASISWA");
        System.out.println("Program Studi: Sistem Informasi\n");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            String nama = namaMahasiswa[i];
            int kehadiran = persentaseKehadiran[i];

            double nilaiAkhir = (nilaiTugas[i] * 0.30) + (nilaiUts[i] * 0.30) + (nilaiUas[i] * 0.40);
            String grade;
            if (nilaiAkhir >= 90) {
                grade = "A";
            } else if (nilaiAkhir >= 80) { 
                grade = "B";
            } else if (nilaiAkhir >= 70) {
                grade = "C";
            } else if (nilaiAkhir >= 60) {
                grade = "D";
            } else {
                grade = "E";
            }
            boolean statusLulus = (nilaiAkhir >= 70) && (kehadiran >= 75);

            System.out.println("Nama Mahasiswa : " + nama);
            System.out.println("Nilai Akhir    : " + nilaiAkhir);
            System.out.println("Grade          : " + grade);
            System.out.println("Kehadiran      : " + kehadiran + "%");

            if (statusLulus) {
                System.out.println("Status         : LULUS");
                if (nilaiAkhir >= 85 && kehadiran >= 90) {
                    System.out.println("Keterangan     : Memenuhi syarat Kelas Unggulan!");
                }
            } else {
                System.out.println("Status         : TIDAK LULUS (Silakan mengulang semester depan)");
            }
            
            System.out.println("----------------------------------------");
        }
    }
}