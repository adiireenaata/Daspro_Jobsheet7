import java.util.Locale;
import java.util.Scanner;
public class Tugas126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        String lanjut;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
           
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Masukkan ulang.");
                sc.nextLine(); // Clear the buffer
                lanjut = "ya";
                continue;
            }

            double diskon = 0; 

            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket >= 5) {
                diskon = 0.10; 
            }

            double totalHarga = jumlahTiket * hargaTiket;
            totalHarga -= totalHarga * diskon;

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga: Rp " + totalHarga);

            System.out.print("Input transaksi lagi? (ya/tidak): ");
            sc.nextLine(); // Clear the buffer
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));
            System.out.println("\n === REKAP PENJUALAN ===");
            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total penjualan: Rp " + totalPenjualan);
            
        sc.close();
    }
}
