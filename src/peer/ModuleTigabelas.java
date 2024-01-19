package peer;

import java.util.Scanner;

public class ModuleTigabelas {
    public static void main(String[] args) {
        // Tulis program Java yang mengambil dua variabel integer "a" dan "b" dan melakukan operasi berikut:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a : ");
        int a = scanner.nextInt();
        System.out.print("Please enter b : ");
        int b = scanner.nextInt();

        // Tambahkan "a" dan "b" dan berikan hasilnya ke variabel baru "sum".
        int sum = a + b;
        System.out.println("Hasil SUM adalah " + sum);
        // Kurangi "b" dari "a" dan berikan hasilnya ke variabel baru "difference".
        int difference = b - a;
        System.out.println("Hasil DIFFERENCE adalah " + difference);
        // Mengalikan "a" dan "b" dan menugaskan hasilnya ke variabel baru "product".
        int product = a * b;
        System.out.println("Hasil PRODUCT adalah " + product);
        // Membagi "a" dengan "b" dan menugaskan hasilnya ke variabel baru "quotient".
        int quotient = a / b;
        System.out.println("Hasil QUOTIENT adalah " + quotient);
        // Menghitung sisa ketika "a" dibagi dengan "b" dan menugaskan hasilnya ke variabel baru "remainder".
        int remainder = a % b;
        System.out.println("Hasil REMAINDER adalah " + remainder);
        // Mencetak semua nilai variabel di konsol. (see above)
    }
}
