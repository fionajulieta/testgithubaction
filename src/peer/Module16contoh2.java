package peer;

import java.util.Arrays;
import java.util.Scanner;

    public class Module16contoh2 {
        /* Buatlah metode yang memiliki tipe pengembalian boolean untuk memeriksa
        apakah dua string adalah anagram. String A dan String B adalah anagram jika
        mengandung karakter yang sama dalam frekuensi yang sama. String tidak peka huruf besar-kecil.
        Misalnya, anagram CAT adalah CAT, ACT, tac, TCA, aTC, dan CtA. Jadi, jika inputnya adalah
        String A = “CAT” dan String B = “tac”, metode akan mengembalikan “true”.
        */

        // Kriteria :
        // Metode akan memiliki tipe pengembalian boolean
        // Metode akan memiliki 2 parameter String

        // cara ke-2 / sesuai contoh dari mentor:

        static boolean cekAnagram (String A, String B) {
            A = A.toLowerCase();
            B = B.toLowerCase();
            char[] charArrayA = A.toCharArray();
            char[] charArrayB = B.toCharArray();
            Arrays.sort(charArrayA);
            Arrays.sort(charArrayB);

            return Arrays.equals(charArrayA,charArrayB);
        }
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter String A: ");
            String strA = scanner.nextLine();
            System.out.print("Enter String B: ");
            String strB = scanner.nextLine();

            if(cekAnagram(strA,strB)) {
                // if Arrays.equals(charArrayA,charArrayB) = true
                System.out.println("Kedua String tersebut adalah sebuah anagram");
            }
            else {
                System.out.println("Kedua String tersebut bukanlah sebuah anagram");
            }
        }
    }
