import java.util.Scanner;


public class Kasir {
    public static void main(String[] args) {
        double harga, diskon ;
        int hasil, kuantitas;

        //harga barang
        Scanner scan =new Scanner(System.in);
        System.out.print("Masukkan harga barang ");
        harga = scan.nextDouble();
       
        //diskon barang
        System.out.print("Masukkan diskon barang ");
        diskon = scan.nextDouble();
        

        //jumlah barang
        System.out.print("Masukkan jumlah barang");
        kuantitas = scan.nextInt();

        diskon = (diskon / 100);
        hasil = (int) ((int) harga * kuantitas * diskon);
        System.out.println("Total yang harus dibayar adalah "+hasil);
    }
    
}


