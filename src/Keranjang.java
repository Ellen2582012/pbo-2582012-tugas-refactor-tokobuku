import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambah(Buku buku) {
        daftarBuku.add(buku);
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public int jumlahBuku() {
        return daftarBuku.size();
    }
}