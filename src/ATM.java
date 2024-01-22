import java.util.Scanner;

public class ATM {

    private static double saldo = 1000.0; // Saldo awal

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("Menu ATM:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            // Membaca pilihan user
            pilihan = scanner.nextInt();

            // Memproses pilihan user
            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    tarikTunai();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan ATM. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static void cekSaldo() {
        System.out.println("Saldo Anda saat ini: $" + saldo);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deposit: $");
        double jumlah = scanner.nextDouble();
        saldo += jumlah;
        System.out.println("Deposit berhasil. Saldo Anda saat ini: $" + saldo);
    }

    private static void tarikTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah tarik tunai: $");
        double jumlah = scanner.nextDouble();
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi. Transaksi gagal.");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil. Saldo Anda saat ini: $" + saldo);
 }
}}
