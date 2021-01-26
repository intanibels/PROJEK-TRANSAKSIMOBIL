package projek.transaksimobil;
import java.util.Scanner;
public class Pembelian {
    //deklarasi variabel
    String judul;
    int pilihan, pilihwarna, bayar, kurang, kembali;
    String[] jual = {" ","BRIO","HR-V","MOBILIO","JAZZ","CITY"};
    int[] harga = {0, 149000000, 303000000, 207500000, 250000000, 352000000};
    String[] warna = {" ","Hitam", "Putih", "Silver", "Merah"};
    
    //method non void judul untuk membuat judul
    String judul(){
        System.out.println("|               DAFTAR HARGA MOBIL                |");
        System.out.println("===================================================");
        return judul;
    }
    //method non void daftarjual untuk menampilkan daftar pilihan penjualan mobil
    int daftarjual(){
        //membuat Scanner
        Scanner input = new Scanner(System.in);
        //perulangan untuk menampilkan jenis mobil dan harga
        for(int a=1; a<jual.length; a++){
            System.out.println(a+". Honda "+jual[a]);
            System.out.println("   Harga : Rp."+harga[a]+",00");}
        //menerima inputan variabel pilihan dari user
        System.out.print("Masukkan Nomor Pilihan Anda : ");
        pilihan = input.nextInt();
        //perulangan untuk menampilkan pilihan warna mobil
        System.out.println("PILIHAN WARNA :");
        for(int b=1; b<warna.length; b++){
            System.out.println(b+". "+warna[b]);}
        //menerima inputan variabel pilihwarna dari user 
        System.out.print("Masukkan Nomor Pilihan Anda : ");
        pilihwarna = input.nextInt();
        return pilihan;
    }
    //method non void pembayaran untuk melakukan pembayaran 
    int pembayaran(){
        //membuat Scanner
        Scanner input = new Scanner(System.in);
        //menerima inputan variabel bayar dari user
        System.out.print("PEMBAYARAN ANDA : ");
        bayar = input.nextInt();
        System.out.println("");
        return bayar;
    }
    //method non void penampilan digunakan sebagai output nota terakhir
    int penampilan(){
        System.out.println("---------------------------------------------------");
        System.out.println("Jenis Mobil     : "+jual[pilihan]);
        System.out.println("Warna Mobil     : "+warna[pilihwarna]);
        System.out.println("Harga Mobil     : "+harga[pilihan]);
        System.out.println("Pembayaran      : "+bayar);
        //percabangan harga
        if(bayar>=harga[pilihan]){ 
            kembali = bayar-harga[pilihan];
            System.out.println("Keterangan      : LUNAS");
            System.out.println("Kembalian       : Rp."+kembali);
        }else if(bayar<harga[pilihan]){
            kurang = harga[pilihan]-bayar;
            System.out.println("Keterangan      : BELUM LUNAS");
            System.out.println("Kurang          : Rp."+kurang);
        }
        return kembali;
    }
}