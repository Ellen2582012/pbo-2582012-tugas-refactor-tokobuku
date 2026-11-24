public class Transfer implements MetodeBayar {
    @Override
    public String namaMetode() {
        return "Transfer (+Rp2.500)";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja + 2500;
    }
}