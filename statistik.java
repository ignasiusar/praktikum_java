import java.util.Scanner;

class statistik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Banyak Data Yang Akan Diproses: ");
        int data = scan.nextInt();

    
        int n = 0;
        int sum = 0;
        int max; // Deklarasi tanpa inisialisasi
        int min; // Deklarasi tanpa inisialisasi
        double kuadrat = 0;

        // Mengumpulkan data pertama untuk inisialisasi max dan min
        System.out.print("data ke 1: ");
        int dat1 = scan.nextInt();
        // sum += dat1;
        max = dat1; // Inisialisasi max dengan data pertama
        min = dat1; // Inisialisasi min dengan data pertama
        kuadrat += Math.pow(dat1, 2);

        // Mengumpulkan data selanjutnya
        do{ 
            if (n < data-1) { // -1 karena kita sudah mengambil data pertama
            n += 1;
            System.out.print("data ke " + (n + 1) + ": ");
            dat1 = scan.nextInt();

            sum += dat1;
            if (dat1 > max) {
                max = dat1; // Memperbarui max
            }
            if (dat1 < min) {
                min = dat1; // Memperbarui min
            }
        }
            kuadrat += Math.pow(dat1, 2);
        } while (n < data-1); // Loop sampai semua data dimasukkan

        // Perhitungan setelah semua data dimasukkan
        int rentDat = max - min;
        double rat = (double) sum / data; // Rata-rata sebagai double
        double variansi = (kuadrat - (data * Math.pow(rat, 2))) / data;
        double deviasi = Math.sqrt(variansi);

        System.out.println("============================");
        System.out.println("Rata Rata data adalah: " + rat);
        System.out.println("Nilai Maks: " + max);
        System.out.println("Nilai Min: " + min);
        System.out.println("Rentang Data: " + rentDat);
        System.out.println("Variansi: " + variansi);
        System.out.println("Deviasi Standar: " + deviasi);

        
    }
}