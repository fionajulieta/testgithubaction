package peer;

import java.util.Arrays;

public class tugasmodule12 {
    public static void main(String[] args) {
        /*Buat kelas Java sederhana untuk mendeklarasikan dan mencetak array yang terdiri
        dari beberapa merek mobil: Mitsubishi, Tesla, Honda, Nissan, Kia dan Hyundai.
         */

        String[] merkMobil = {"Mitsubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};
        System.out.println(Arrays.toString(merkMobil));
        System.out.println();

        System.out.println("Print isi array berurutan: ");
        for (String mobil: merkMobil) {
            System.out.println(mobil);
        };

        for(int i=0; i<merkMobil.length; i++) {
            System.out.println(merkMobil[i]);
        }
    }
}
