public abstract class Barang {
    private String kodeBarang;
    private String namaBarang;

    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang + ", Nama Barang: " + namaBarang;
    }

    public abstract double hitungNilai();
}
