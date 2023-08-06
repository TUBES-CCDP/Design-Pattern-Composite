public class Main {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(5.0);
        BangunDatar segitiga = new Segitiga(4.0, 3.0);

        KelompokBangunDatar kelompok = new KelompokBangunDatar();
        kelompok.tambahBangunDatar(lingkaran);
        kelompok.tambahBangunDatar(segitiga);

        double luasKelompok = kelompok.hitungLuas();
        System.out.println("Luas kelompok bangun datar: " + luasKelompok);
    }
}