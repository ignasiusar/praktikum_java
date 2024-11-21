import java.util.Scanner;
class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double kuadratData = 0;
        double akarData = 0;
        double kebalikan = 0;
        System.out.print("Masukkan Jumlah Data : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
           System.out.println("Masukkan Nilai  "+i+": ");
            double data = sc.nextDouble();

            kuadratData+= Math.pow(data, 2);

            if(data >= 0){
                akarData += Math.sqrt(data);
            }
            else if(data != 0){
                kebalikan += 1 /data;
            }
        }
        System.out.println("Jumlah Kuadrat Data : "+kuadratData);
        System.out.println("Jumlah Akar Data : "+akarData);
        System.out.println("Jumlah Kebalikan Data : "+kebalikan);
    }
}