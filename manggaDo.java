import java.util.Scanner;
class manggaDo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mangga
        System.out.print("Masukkan jumlah mangga yang akan diproses: ");
        int jumlahMangga = scanner.nextInt();

        // Inisialisasi counter untuk setiap kualitas mangga
        int biasa = 0, bagus = 0, unggul = 0;

        int i = 1; // Inisialisasi penghitung mangga
        do {
            double beratMangga;

            // Menggunakan do-while untuk memastikan berat valid
            do {
                System.out.print("Masukkan berat mangga ke-" + i + " (dalam gram, > 0): ");
                beratMangga = scanner.nextDouble();

                if (beratMangga <= 0) {
                    System.out.println("Berat mangga harus lebih dari 0. Silakan masukkan kembali.");
                }
            } while (beratMangga <= 0);

            // Tentukan kualitas mangga
            if (beratMangga < 500) {
                biasa++;
            } else if (beratMangga >= 500 && beratMangga < 750) {
                bagus++;
            } else {
                unggul++;
            }

            i++; // Increment penghitung mangga
        } while (i <= jumlahMangga);

        // Tampilkan hasil
        System.out.println("\nHasil Kualitas Mangga:");
        System.out.println("BIASA  : " + biasa + " buah");
        System.out.println("BAGUS  : " + bagus + " buah");
        System.out.println("UNGGUL : " + unggul + " buah");

    }
}

