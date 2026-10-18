public class percabangan {
    public static void main(String[] args) {
        boolean statusLulus = true; 

        System.out.println("PROGRAM PERCABANGAN");
        System.out.println("Status Kelulusan      : " + statusLulus);
        if (statusLulus) {
            System.out.println("Selamat! Anda berhak mencetak sertifikat.");
        } else {
            System.out.println("Mohon maaf, silakan ikuti kelas remedial.");
        }
    }
}