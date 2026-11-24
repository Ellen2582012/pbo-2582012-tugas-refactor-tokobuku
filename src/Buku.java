public abstract class Buku implements Produk {
    protected String judul;
    protected String penulis;
    protected int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    @Override
    public String getJudul() {
        return judul;
    }

    @Override
    public String getPenulis() {
        return penulis;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    public abstract int hargaAkhir();

    public abstract String keterangan();
}