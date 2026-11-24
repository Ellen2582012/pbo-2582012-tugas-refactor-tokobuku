public class FileRiwayat implements RiwayatPenyimpan {
    @Override
    public void simpan(String baris) {
        System.out.println("[FILE riwayat.txt] " + baris);
    }
}