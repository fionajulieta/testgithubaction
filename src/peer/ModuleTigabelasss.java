package peer;

import java.util.Scanner;

public class ModuleTigabelasss {
    public static void main(String[] args) {
        /* Buat program Java yang meminta pengguna untuk memasukkan dua bilangan bulat,
        lalu membandingkannya menggunakan operator relasional / perbandingan.
        Program Anda harus menggunakan operator relasional / perbandingan berikut: ==, !=, >, >=, <, <=.
        Untuk setiap perbandingan, cetak hasilnya (benar atau salah) dan penjelasan singkat
        tentang arti perbandingan tersebut
         */
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input 1st integer number: ");
        int a = scanner.nextInt();
        System.out.print("Input 2nd integer number: ");
        int b = scanner.nextInt();

        System.out.println("Is a equal to b? " + (a==b));
        System.out.println("Is a not equal to b? " + (a!=b));
        System.out.println("Is a greater than b? " + (a>b));
        System.out.println("Is a greater than or equal to b? " + (a>=b));
        System.out.println("Is a less than b? " + (a<b));
        System.out.println("Is a less than or equal to b? " + (a<=b));

    }
}
