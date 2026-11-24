public class CheckoutService {
    private Keranjang keranjang;
    private MetodeBayar metodeBayar;
    private StrukPrinter printer;
    private RiwayatPenyimpan riwayat;
    private NotifikasiPengirim notifikasi;

    public CheckoutService(
            Keranjang keranjang,
            MetodeBayar metodeBayar,
            StrukPrinter printer,
            RiwayatPenyimpan riwayat,
            NotifikasiPengirim notifikasi) {

        this.keranjang = keranjang;
        this.metodeBayar = metodeBayar;
        this.printer = printer;
        this.riwayat = riwayat;
        this.notifikasi = notifikasi;
    }

    public void checkout(String pelanggan, String alamatEmail) {
        printer.cetak("================ STRUK =================");
        printer.cetak("Pelanggan : " + pelanggan);

        int total = 0;

        for (Buku b : keranjang.getDaftarBuku()) {
            printer.cetak(b.getJudul() + " (" + b.getPenulis() + ")");
            printer.cetak("  Harga       : " + formatRupiah(b.getHarga()));
            printer.cetak("  Keterangan  : " + b.keterangan());
            printer.cetak("  Harga akhir : " + formatRupiah(b.hargaAkhir()));

            total += b.hargaAkhir();
        }

        int bayar = metodeBayar.totalBayar(total);

        printer.cetak("-----------------------------------------");
        printer.cetak("Total belanja : " + formatRupiah(total));
        printer.cetak("Metode bayar  : " + metodeBayar.namaMetode());
        printer.cetak("Total bayar   : " + formatRupiah(bayar));

        int totalBerat = 0;

        for (Buku b : keranjang.getDaftarBuku()) {
            if (b instanceof BisaDikirim) {
                totalBerat += ((BisaDikirim) b).getBeratGram();
            }
        }

        printer.cetak("Berat kiriman : " + totalBerat + " gram");

        printer.cetak("-------------- LINK UNDUH ---------------");

        for (Buku b : keranjang.getDaftarBuku()) {
            if (b instanceof BisaDiunduh) {
                printer.cetak(((BisaDiunduh) b).linkUnduh());
            }
        }

        printer.cetak("-----------------------------------------");

        riwayat.simpan(
                pelanggan + ";" +
                        keranjang.jumlahBuku() + " buku;" +
                        formatRupiah(bayar)
        );

        notifikasi.kirim(
                alamatEmail,
                "Terima kasih " + pelanggan +
                        ", total bayar " + formatRupiah(bayar)
        );
    }

    public static String formatRupiah(int angka) {
        return String.format("Rp%,d", angka).replace(',', '.');
    }
}