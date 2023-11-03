import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan batas awal: ");
            int batasAwal = scanner.nextInt();
            System.out.print("Masukkan batas akhir: ");
            int batasAkhir = scanner.nextInt();

            int angka = batasAwal;

            while (angka <= batasAkhir) {
                if (angka % 2 == 0) {
                    System.out.println(angka + " adalah bilangan genap");
                } else {
                    System.out.println(angka + " adalah bilangan ganjil");
                }
                angka++;
            }
        }
    }
}
