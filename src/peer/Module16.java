package peer;

import java.util.Arrays;
import java.util.Scanner;

public class Module16 {
    /* Buatlah metode yang memiliki tipe pengembalian boolean untuk memeriksa
apakah dua string adalah anagram. String A dan String B adalah anagram jika
mengandung karakter yang sama dalam frekuensi yang sama. String tidak peka huruf besar-kecil.
Misalnya, anagram CAT adalah CAT, ACT, tac, TCA, aTC, dan CtA. Jadi, jika inputnya adalah
String A = “CAT” dan String B = “tac”, metode akan mengembalikan “true”.
 */
// Kriteria :
// Metode akan memiliki tipe pengembalian boolean
// Metode akan memiliki 2 parameter String

    // cara pertama (lebih manual/panjang):

    static boolean cekAnagram (char[] strA, char[] strB) {
        int A = strA.length;
        int B = strB.length;
        if (A != B)
            return false;

        Arrays.sort(strA);
        Arrays.sort(strB);

        for (int i = 0; i < strA.length; i++)
            if (strA[i] != strB[i])
                return false;
        return true;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String A: ");
        String strA = scanner.nextLine();
        System.out.print("Enter String B: ");
        String strB = scanner.nextLine();

        strA = strA.toLowerCase();
        strB = strB.toLowerCase();
        char[] arrayA = strA.toCharArray();
        char[] arrayB = strB.toCharArray();

        if(cekAnagram(arrayA, arrayB)) {
            System.out.println("Kedua String tersebut adalah sebuah anagram");
        }
        else {
            System.out.println("Kedua String tersebut bukanlah sebuah anagram");
        }
    }
}
