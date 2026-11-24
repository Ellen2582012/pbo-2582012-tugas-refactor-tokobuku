public class EmailSender implements NotifikasiPengirim {
    @Override
    public void kirim(String alamat, String isi) {
        System.out.println("[EMAIL " + alamat + "] " + isi);
    }
}