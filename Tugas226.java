import java.util.Locale;
import java.util.Scanner;
public class Tugas226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int jenis, durasi;
        int total = 0;
        
        do {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi jam parkir: ");
                durasi = sc.nextInt();
                
                if (jenis == 1) {
                    total += durasi * 3000; // Tarif mobil Rp 3.000 per jam
                } else if (jenis == 2) {
                    total += durasi * 2000; // Tarif motor Rp 2.000 per jam
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 1, 2, atau 0.");
            }
            
        } while (jenis != 0);
        
        System.out.println("\n----------------------------------------");
        System.out.println("Total pembayaran parkir seluruh kendaraan: Rp " + total);
        System.out.println("----------------------------------------");
        
        sc.close();
    }
}
