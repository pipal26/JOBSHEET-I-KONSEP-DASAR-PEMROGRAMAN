public class ProgramRoyalGarden {
    
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;
    
    
    static int[][] stock = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}     
    };
    
    
    public static int hitungPendapatan(int cabang) {
        int aglonema = stock[cabang][0];
        int keladi = stock[cabang][1];
        int alocasia = stock[cabang][2];
        int mawar = stock[cabang][3];
        
        int pendapatan = (aglonema * HARGA_AGLONEMA) + 
                        (keladi * HARGA_KELADI) + 
                        (alocasia * HARGA_ALOCASIA) + 
                        (mawar * HARGA_MAWAR);
        
        return pendapatan;
    }
    
    
    public static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    
    
    public static void tampilkanLaporan() {
        System.out.println("=======================================================");
        System.out.println("           LAPORAN PENDAPATAN ROYAL GARDEN");
        System.out.println("=======================================================");
        System.out.println("Cabang\t\t\tPendapatan\t\tStatus");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = tentukanStatus(pendapatan);
            
            System.out.printf("RoyalGarden %d\t\tRp %,d\t\t%s\n", 
                             (i + 1), pendapatan, status);
        }
        
        System.out.println("=======================================================");
    }
    
    public static void main(String[] args) {
        
        System.out.println("=======================================================");
        System.out.println("              DATA STOCK BUNGA ROYAL GARDEN");
        System.out.println("=======================================================");
        System.out.println("Cabang\t\t\tAglonema\tKeladi\tAlocasia\tMawar");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("RoyalGarden %d\t\t%d\t\t%d\t%d\t\t%d\n", 
                             (i + 1), stock[i][0], stock[i][1], 
                             stock[i][2], stock[i][3]);
        }
        
        System.out.println("=======================================================");
        System.out.println("\nRincian Harga:");
        System.out.println("Aglonema  = Rp " + String.format("%,d", HARGA_AGLONEMA));
        System.out.println("Keladi    = Rp " + String.format("%,d", HARGA_KELADI));
        System.out.println("Alocasia  = Rp " + String.format("%,d", HARGA_ALOCASIA));
        System.out.println("Mawar     = Rp " + String.format("%,d", HARGA_MAWAR));
        System.out.println();
        
        
        tampilkanLaporan();
    }
}