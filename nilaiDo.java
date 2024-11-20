import  java.util.Scanner;
class nilaiDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double uts1,uts2,uas,niltot;

        do{
            System.out.print("Masukkan Nilai Uts 1 : ");
            uts1 = input.nextDouble();
            if (uts1 < 0 || uts1 > 100) {
                System.out.println("Nilai UTS 1 tidak boleh kurang dari 0 maupun lenih dari 100. Silahkan Coba Lagi");
            }
        } while (uts1 < 0 || uts1 > 100);
        do{
            System.out.print("Masukkan Nilai Uts 2 : ");
            uts2 = input.nextDouble();
            if (uts2 < 0 || uts2 > 100) {
                System.out.println("Nilai UTS 2 tidak boleh kurang dari 0. Silahkan Coba Lagi");
            }
        } while (uts2 < 0 || uts2 > 100);

        do{
            System.out.print("Masukkan Nilai UAS : ");
            uas = input.nextDouble();
            if (uas < 0 || uas > 100) {
                System.out.println("Nilai UAS tidak boleh kurang dari 0. Silahkan Coba Lagi");
            }
        } while (uas < 0 || uas > 100);

        niltot = 0.30 * uts1 + 0.30* uts2 + 0.40 * uas;
        if (niltot >= 80) {
            System.out.println(" Predikat Anda A");
        } else if (65 <= niltot && niltot <80) {
            System.out.println("Predikat Anda B");
        } else if (55 <= niltot && niltot < 65) {
            System.out.println("Predikat Anda C");
        } else if (50 <= niltot && niltot < 55) {
            System.out.println("Predikat Anda D");
    } else {
        System.out.println("Predikat Anda E");

}
    }
}