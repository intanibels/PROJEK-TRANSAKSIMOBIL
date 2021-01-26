package projek.transaksimobil;
public class PROJEKTransaksiMobil {
    public static void main(String[] args) {
        //supaya dapat memanggil dari kelas yang lain
        Biodata output = new Biodata();
        Pembelian output2 = new Pembelian();
        Pengantaran output3 = new Pengantaran();
        //memanggil method method yang telah diprogram
        output.persetujuan();
        output2.judul();
        output2.daftarjual();
        output2.pembayaran();
        Pengantaran.judul();
        output3.waktu();
        //memanggil method method yang menampilkan nota akhir
        output.penampilan();
        output2.penampilan();
        output3.penampilan();
        output.toPengantaran();
    }
}