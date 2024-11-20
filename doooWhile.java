import java.util.Scanner;
class doooWhile{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,d,x1,x2,x,imajiner,real;

      
        do { 
        System.out.print("Masukkan Nilai Koefisien A :");
        a = scan.nextDouble();
        if (a == 0) {
            System.out.println("Nilai A Tidak Boleh 0. Silahkan coba lagi");
        }
        } while (a==0);
 
        System.out.print("Masukkan Nilai Koefisien B :");
        b = scan.nextDouble();
        System.out.print("Masukkan Nilai Koefisien C :");
        c = scan.nextDouble();

        d = Math.pow(b, 2)-4 * a * c;

        if ( d > 0 ){
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Akar- Akar persamaan adalah: x1 = "+x1+", x2 = "+ x2);
        } else if (d == 0) {
            x = -b / (2 * a);
            System.out.println("Persamaan memiliki dua akar kembar");
            System.out.println(" persamaan akar adalah x = "+x);
        } else {
            System.out.println("Persamaan memiliki dua akar kompleks");
            real = -b / (2 * a);
            imajiner = Math.sqrt(-d) / (2 * a);
            System.out.println("Persamaan akar adalah x = "+real+" + "+imajiner);
        }
    }
} 