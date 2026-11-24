public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    public double getUkuranMB() {
        return ukuranMB;
    }

    @Override
    public String linkUnduh() {
        String slug = judul.toLowerCase().replace(' ', '-');
        String url = "https://toko.buku/ebook/" + slug;
        return "[" + url + "](" + url + ")";
    }

    @Override
    public int hargaAkhir() {
        return harga * 80 / 100;
    }

    @Override
    public String keterangan() {
        return ukuranMB + " MB, diskon 20%";
    }
}