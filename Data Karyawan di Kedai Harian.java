
package datakaryawan;

// mengimpor Scanner ke program
import java.util.Scanner ;


public class DataKaryawan {

   
    public static void main(String[] args) {
        //Deklarasi variabel
        String nama, alamat;
        int usia, gaji;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in) ;
        
        //tampilan ouput
        System.out.println("=== Pendataan Karyawan di kedai harian tiga bersaudara ===");
        System.out.println("Nama karyawan:");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        
        // tampilan output lagi
        System.out.println("Alamat:");
        //mlenggunakan scanner lagi
        alamat = keyboard.next();
        
        System.out.println("Usia:");
        usia = keyboard.nextInt();
        
        System.out.println("Gaji:");
        gaji = keyboard.nextInt();
        
        
        // menampilkan apa yang sudah di simpan di variabel
        System.out.println("--------------");
        System.out.println("Nama Karyawan:" + nama);
        System.out.println("Alamat:" + alamat);
        System.out.println("Usia:" + usia);
        System.out.println("Gaji: Rp" + gaji);
    }
    
}
