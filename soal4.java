package pkgfor;

import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, seri = 0, paralel = 0, r = 0;
        int i, pilih;

        System.out.print("Masukan Jumlah Data : ");
        n = input.nextDouble();

        for (i = 1; i <= n; i++) {
            System.out.print("Masukkan r" + i + " : ");
            r = input.nextDouble();
            seri += r;
            paralel += 1 / r;
        }

        System.out.print("Apakah Tahanan \n1. Seri \n2. Paralel \nPilih ? ");
        pilih = input.nextInt();

        if (pilih == 1) {
            System.out.println("Nilai tahanan seri adalah rt = " + seri);
        } else if (pilih == 2) {
            System.out.println("Nilai tahanan paralel adalah rt = " + paralel);
        } else {
            System.out.println("Masukkan Salah");
        }
    }

}
