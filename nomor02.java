import java.util.Scanner;

public class nomor02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        if (teks.length() == 5) {
            System.out.println("Panjang teks adalah 5 karakter.");
        } else {
            System.out.println("Panjang teks bukan 5 karakter.");
        }
    }
}