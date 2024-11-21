import java.util.Scanner;
class resistFor{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Resistor disususun dengan Seri (S) atau Paralel (P)? : ");
        char jenis = scan.next().charAt(0);
        double totalTahanan = 0;
       
            System.out.println("Masukkan Jumlah Resistor yang akan dihitung : ");
        int n = scan.nextInt();
        
        if (jenis == 's' || jenis == 'S') {
            for (int i = 1; i < n; i++){
            System.out.println("Resistor ke "+i+" : ");
           double tahanan = scan.nextDouble(); 
                totalTahanan += tahanan;
            }
            System.out.println("Tahanan Total (Seri) = "+totalTahanan);
        }
            
        
            else if(jenis == 'p' || jenis == 'P') {
                    for (int i = 1; i < n; i++){
                                    System.out.println("Resistor ke "+i+" : ");
                                    double tahanan = scan.nextDouble(); 
                                        totalTahanan += 1 / tahanan;
                                
                                System.out.println("Tahanan Total (Paralel) = "+ totalTahanan);
                            }
            }
          
         else {
            System.out.println("Jenis Penyusunan Tidak Ditemukan, Mohon masukkan yang benar!");
        }
    }
    }


