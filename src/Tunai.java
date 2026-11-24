public class Tunai implements MetodeBayar {
    @Override
    public String namaMetode() {
        return "Tunai";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja;
    }
}