import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class InventarisApp {
    private List<Barang> inventaris = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        inventaris.add(barang);
    }

    public void tampilkanDaftarBarang() {
        System.out.println("Daftar Barang:");
        for (Barang barang : inventaris) {
            System.out.println(barang.toString());
        }
    }

    public double hitungTotalNilai() {
        double total = 0;
        for (Barang barang : inventaris) {
            total += barang.hitungNilai();
        }
        return total;
    }

    public static void main(String[] args) {
        InventarisApp app = new InventarisApp();

        Barang barang1 = new BarangElektronik("E001", "Laptop", 5000000, 2);
        Barang barang2 = new BarangPakaian("P001", "Baju", 150000, 5);

        app.tambahBarang(barang1);
        app.tambahBarang(barang2);

        app.tampilkanDaftarBarang();

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Total Nilai Inventaris: Rp " + df.format(app.hitungTotalNilai()));
    }
}
