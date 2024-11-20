import java.util.Scanner;
class manggaDo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bagus,biasa,unggul,berat;

        do {
            System.out.println("Masukkan Berat Mangga : ");
            berat = sc.nextInt();
            if (berat > 0 &&  berat <= 500) {
                System.out.println(" Kualitas Biasa");
                
                } else if (berat >= 500 && berat < 750 ) {
                    System.out.println("Kualitas Bagus");
        } else if (berat >= 750) {
              System.out.println("Kualitas Unggul");
        } else {
            System.out.println("Berat Tidak Valid Silahkan Masukan Berat Yang Benar");
        }
        
    } while (berat <= 0);
}
}