package projek.transaksimobil;
import java.util.Scanner;
public class Pengantaran {
    //deklarasi variabel
    int tanggal,bulan,tahun;
    //method static untuk menampilkan judul
    static void judul(){
        System.out.println("|                  PENGANTARAN                    |");
        System.out.println("===================================================");
    }
    //method void untuk menerima inputan tanggal
    void waktu(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //menerima inputan user
        System.out.print("Masukkan Tanggal Pengantaran : ");
        tanggal = input.nextInt();
        System.out.print("Masukkan Bulan Pengantaran   : ");
        bulan = input.nextInt();
        System.out.print("Masukkan Tahun Pengantaran   : ");
        tahun = input.nextInt();
    }
    //method void untuk menampilkan output nota akhir
    void penampilan(){
        //menampilkan output
        System.out.println("---------------------------------------------------");
        System.out.println("Tanggal kirim   : "+tanggal+"/"+bulan+"/"+tahun);
    }
}