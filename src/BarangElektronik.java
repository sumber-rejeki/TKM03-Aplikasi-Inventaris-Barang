public class BarangElektronik extends Barang {
    private double harga;
    private int jumlah;

    public BarangElektronik(String kodeBarang, String namaBarang, double harga, int jumlah) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Barang Elektronik - " + super.toString() + ", Harga: " + harga + ", Jumlah: " + jumlah;
    }

    @Override
    public double hitungNilai() {
        return harga * jumlah;
    }
}
