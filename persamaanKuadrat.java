import java.util.Scanner;
public class persamaanKuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input koefisien
        System.out.print("Masukkan koefisien a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan koefisien b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan koefisien c: ");
        double c = scanner.nextDouble();

        // Hitung diskriminan
        double D = (b * b) - (4 * a * c);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            double start = Math.min(x1, x2), end = Math.max(x1, x2);

            System.out.println("Persamaan: y = " + a + "x^2 + " + b + "x + " + c);
System.out.println("Akar-akar: " + x1 + " dan " + x2);
System.out.println("Nilai y antara akar:");
System.out.println("------------------------------------------");
System.out.println("x          y");
System.out.println("------------------------------------------");


            for (double x = start; x <= end; x += 0.25) {
                System.out.println(x + "          " + ((a * x * x) + (b * x) + c));
            }
            System.out.println("------------------------------------------");
        } else {
            System.out.println("Persamaan tidak memiliki dua akar nyata (D <= 0).");
        }
        
    }
}
