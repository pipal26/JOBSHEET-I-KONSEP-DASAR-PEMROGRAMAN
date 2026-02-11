import java.util.Scanner;

public class ProgramNilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        
       
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = input.nextDouble();
        
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        
        System.out.println("===============================");
        
        
        if (nilaiTugas < 0 || nilaiTugas > 100 || 
            nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || 
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
        } else {
            
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + 
                               (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
            
            
            String nilaiHuruf;
            String keterangan;
            
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }
            
            
            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf :" + nilaiHuruf);
            System.out.println("===============================");
            System.out.println(keterangan);
        }
        
        input.close();
    }
}