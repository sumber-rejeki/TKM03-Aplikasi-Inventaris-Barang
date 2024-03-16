public class BarangPakaian extends Barang {
    private double hargaSatuan;
    private int jumlah;

    public BarangPakaian(String kodeBarang, String namaBarang, double hargaSatuan, int jumlah) {
        super(kodeBarang, namaBarang);
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Barang Pakaian - " + super.toString() + ", Harga Satuan: " + hargaSatuan + ", Jumlah: " + jumlah;
    }

    @Override
    public double hitungNilai() {
        return hargaSatuan * jumlah;
    }
}
