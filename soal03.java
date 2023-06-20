import java.util.Scanner;

public class soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int totalNumbers = 10;

        System.out.println("Masukkan " + totalNumbers + " angka:");

        for (int i = 0; i < totalNumbers; i++) {
            int number = input.nextInt();

            if (number % 5 == 0) {
                count++;
            }
        }
        System.out.println("Jumlah angka kelipatan 5 =  " + count);

        input.close();
    }
}