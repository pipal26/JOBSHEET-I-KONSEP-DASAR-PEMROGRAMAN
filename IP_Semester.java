import java.util.Scanner;

public class IP_Semester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine(); 
        
        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = input.nextLine();
            
            System.out.print("Bobot SKS: ");
            sks[i] = input.nextInt();
            input.nextLine(); 
            
            System.out.print("Nilai Huruf (A/B+/B/C+/C/D/E): ");
            nilaiHuruf[i] = input.nextLine();
        }
        
        System.out.println("\nhasil Konversi Nilai");
        System.out.println("===============================");
        System.out.println("MK\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        
        int totalSKS = 0;
        double totalBobotNilai = 0;
        
        for (int i = 0; i < jumlahMK; i++) {
            
            switch (nilaiHuruf[i]) {
                case "A":
                    nilaiAngka[i] = 4.0;
                    break;
                case "B+":
                    nilaiAngka[i] = 3.5;
                    break;
                case "B":
                    nilaiAngka[i] = 3.0;
                    break;
                case "C+":
                    nilaiAngka[i] = 2.5;
                    break;
                case "C":
                    nilaiAngka[i] = 2.0;
                    break;
                case "D":
                    nilaiAngka[i] = 1.0;
                    break;
                case "E":
                    nilaiAngka[i] = 0.0;
                    break;
                default:
                    nilaiAngka[i] = 0.0;
            }
            
            bobotNilai[i] = nilaiAngka[i] * sks[i];
            totalSKS += sks[i];
            totalBobotNilai += bobotNilai[i];
            
            
            String mkPadded = String.format("%-35s", namaMK[i]);
            System.out.printf("%s\t%.2f\t\t%s\t\t%.2f\n", 
                             mkPadded, nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        
        double ipSemester = totalBobotNilai / totalSKS;
        
        System.out.println("===============================");
        System.out.printf("IP : %.2f\n", ipSemester);
        
        input.close();
    }
}