import java.util.Scanner;

public class JadwalKuliah {
    static Scanner input = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n) {
        System.out.println("\n=== INPUT JADWAL KULIAH ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang: ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = input.nextLine();
        }
    }

    public static void tampilkanSemuaJadwal(String[][] jadwal, int n) {
        System.out.println("\n=========================================================================");
        System.out.println("                         JADWAL KULIAH");
        System.out.println("=========================================================================");
        System.out.printf("%-5s %-30s %-20s %-10s %-15s\n",
                "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-30s %-20s %-10s %-15s\n",
                    (i + 1), jadwal[i][0], jadwal[i][1],
                    jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("=========================================================================");
    }

    public static void tampilkanJadwalByHari(String[][] jadwal, int n, String hari) {
        System.out.println("\n=========================================================================");
        System.out.println("               JADWAL KULIAH HARI " + hari.toUpperCase());
        System.out.println("=========================================================================");
        System.out.printf("%-5s %-30s %-20s %-15s\n",
                "No", "Mata Kuliah", "Ruang", "Jam");
        System.out.println("-------------------------------------------------------------------------");

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                count++;
                System.out.printf("%-5d %-30s %-20s %-15s\n",
                        count, jadwal[i][0], jadwal[i][1], jadwal[i][3]);
            }
        }

        if (count == 0) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
        System.out.println("=========================================================================");
    }

    public static void tampilkanJadwalByMataKuliah(String[][] jadwal, int n, String mataKuliah) {
        System.out.println("\n=========================================================================");
        System.out.println("          JADWAL MATA KULIAH: " + mataKuliah.toUpperCase());
        System.out.println("=========================================================================");

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mataKuliah)) {
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
        System.out.println("=========================================================================");
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("    PROGRAM PENGELOLA JADWAL KULIAH");
        System.out.println("===========================================");

        System.out.print("\nMasukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        int pilihan;
        do {
            System.out.println("\n===========================================");
            System.out.println("              MENU UTAMA");
            System.out.println("===========================================");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Input Ulang Jadwal");
            System.out.println("0. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(jadwal, n);
                    break;
                case 2:
                    System.out.print("\nMasukkan hari yang dicari: ");
                    String hari = input.nextLine();
                    tampilkanJadwalByHari(jadwal, n, hari);
                    break;
                case 3:
                    System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
                    String mataKuliah = input.nextLine();
                    tampilkanJadwalByMataKuliah(jadwal, n, mataKuliah);
                    break;
                case 4:
                    inputJadwal(jadwal, n);
                    break;
                case 0:
                    System.out.println("\nTerima kasih!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}