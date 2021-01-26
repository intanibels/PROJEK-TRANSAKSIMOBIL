package projek.transaksimobil;
import java.util.Scanner;
public class Biodata {
    //deklarasi variabel
    String nama, alamat, kel, kec, kota, jawab;
    int NIK, rt, rw;
    boolean a = true;
    //method void persetujuan
    void persetujuan(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //membuat judul
        System.out.println("|                BUKTI TRANSAKSI                  |");
        System.out.println("===================================================");
        //membuat perulangan persetujuan
        while(a){
            System.out.print("Keterangan Memiliki SIM (sudah/belum) : ");
            jawab = input.nextLine();
            //membuat percabangan
            if(jawab.equalsIgnoreCase("sudah")){ //jika user menjawab sudah, maka akan lanjut ke method pendataan
            pendataan();
            a=false;
            }else if(jawab.equalsIgnoreCase("belum")){ //jika user menjawab belum, maka akan kembali ke pertanyaan sebelumnya
            a=true;
            System.out.println("Mohon Maaf, Anda Harus Membawa Kerabat Anda Yang Memiliki SIM");}}
    }
    //method void pendataan
    void pendataan(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //menerima inputan user
        System.out.print("Masukkan Nama  Anda  : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        alamat = input.nextLine();
        System.out.print("           Kota      : ");
        kota = input.nextLine();
        System.out.print("           Kelurahan : ");
        kel = input.nextLine();
        System.out.print("           Kecamatan : ");
        kec = input.nextLine();
        System.out.print("           RT        : ");
        rt = input.nextInt();
        System.out.print("           RW        : ");
        rw = input.nextInt();
        System.out.print("Masukkan NIK Anda    : ");
        NIK = input.nextInt();
        System.out.println("");
    }
    //method void penampilan untuk menampilkan nota terakhir
    void penampilan(){
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("|            TRANSAKSI PEMBELIAN MOBIL            |");
        System.out.println("===================================================");
        System.out.println("Nama Lengkap    : "+nama);
        System.out.println("NIK             : "+NIK);
        System.out.println("Alamat Lengkap  : "+alamat);
        System.out.println("      Kota      : "+kota);
        System.out.println("      Kelurahan : "+kel);
        System.out.println("      Kecamatan : "+kec);
        System.out.println("      RT        : "+rt);
        System.out.println("      RW        : "+rw);
    }
    //method void toPengantaran saya gunakan untuk mengirim output
    void toPengantaran(){
        System.out.println("Alamat          : "+alamat+", Kelurahan "+kel+",");
        System.out.println("                  Kecamatan "+kec+", RT "+rt+", RW "+rw+", Kota "+kota);
    }
}