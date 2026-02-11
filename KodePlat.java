import java.util.Scanner;

public class KodePlat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[] KOTA = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };
        
        System.out.println("===========================================");
        System.out.println("     PROGRAM PENCARIAN KOTA DARI KODE PLAT");
        System.out.println("===========================================");
        System.out.println("\nDaftar Kode Plat yang Tersedia:");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < KODE.length; i++) {
            System.out.println(KODE[i] + " - " + KOTA[i]);
        }
        System.out.println("===========================================");
        
        System.out.print("\nMasukkan kode plat nomor: ");
        char kodePlat = input.next().toUpperCase().charAt(0);
        
        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                System.out.println("\nKode plat " + kodePlat + " adalah kota " + KOTA[i]);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("\nKode plat tidak ditemukan!");
        }
        
        input.close();
    }
}