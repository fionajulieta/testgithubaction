package peer;

public class ModuleLimabelas {
    public static void main(String[] args) {
        /* Buat kelas Java sederhana untuk mencetak larik string ini
        {“hitam”, “biru”, “putih”, “merah”, “kuning”} menggunakan For Each loop
         */
        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        // Kriteria :
        // Buat array string bernama "warna" yang berisi {"hitam", "biru", "putih", "merah", "kuning"}
        // Cetak pernyataan ini dan warnanya -> “Warnanya adalah “ + warna
        /* Diberikan deretan string {"hitam", "biru", "putih", "merah", "kuning"}, buat kelas Java sederhana
        untuk mencetak semua elemen dalam larik kecuali "putih".*/
        for(int i=0; i<warna.length; i++) {
            if (i==2) continue;
            System.out.println("Warnanya adalah " + warna[i]);
        }

        // Kriteria :
        // Buat array string bernama "warna" yang berisi {"hitam", "biru", "putih", "merah", "kuning"}
        /* Cetak semua elemen menggunakan For Each loop tetapi lewati warna "putih" (menggunakan
        pernyataan Lanjutkan) sehingga hasilnya akan menjadi "hitam", "biru", "merah", "kuning".*/
        for(String j : warna) {
            if (j=="putih") continue;
            System.out.println(j);
        }
    }
}
