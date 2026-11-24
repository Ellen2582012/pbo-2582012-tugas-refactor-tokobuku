public class Main {
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();

        keranjang.tambah(
                new BukuCetak("Pemrograman Java", "John Doe", 120000, 750)
        );

        keranjang.tambah(
                new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400)
        );

        keranjang.tambah(
                new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5)
        );

        keranjang.tambah(
                new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240)
        );

        MetodeBayar pembayaran = new EWallet();

        StrukPrinter printer = new ConsoleStrukPrinter();
        RiwayatPenyimpan penyimpan = new FileRiwayat();
        NotifikasiPengirim pengirim = new EmailSender();

        CheckoutService checkout = new CheckoutService(
                keranjang,
                pembayaran,
                printer,
                penyimpan,
                pengirim
        );

        checkout.checkout("Sari", "sari@mail.com");
    }
}