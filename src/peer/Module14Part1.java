package peer;

import java.util.Scanner;

public class Module14Part1 {
    // Buat kelas Java sederhana untuk memeriksa dan mencetak apakah angkanya "ganjil" atau "genap" antara rentang 1 - 10 ini.
    // Kriteria :
    // Akan mencetak "ganjil" jika angkanya sama dengan 1 atau 3 atau 5 atau 7 atau 9
    // Akan dicetak “genap” jika angkanya sama dengan 2 atau 4 atau 6 atau 8 atau 10.
    // Akan mencetak “angka di luar jangkauan” jika angka > 10 atau < 1.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int number = scanner.nextInt();
        int x = number % 2;

        if (number>10) {
            System.out.println("Angka di luar jangkauan");
        }
        else if (x==0) {
            System.out.println("Angka Genap");
        }
        else {
            System.out.println("Angka Ganjil");
        }
    }
}
