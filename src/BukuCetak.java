public class BukuCetak extends Buku implements BisaDikirim {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int getBeratGram() {
        return beratGram;
    }

    public int hitungOngkir() {
        int kelipatan = (beratGram + 499) / 500;
        return kelipatan * 5000;
    }

    @Override
    public int hargaAkhir() {
        return harga + hitungOngkir();
    }

    @Override
    public String keterangan() {
        return beratGram + " gram, ongkir " +
                CheckoutService.formatRupiah(hitungOngkir());
    }
}