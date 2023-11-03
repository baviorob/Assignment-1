public class array {
    public static void main(String[] args) {
        // Membuat sebuah array dengan tipe data int
        int[] angka = {1, 2, 3, 4, 5};

        // Menggunakan perulangan for untuk menampilkan nilai dalam array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}
