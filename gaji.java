import java.util.Scanner;

public class gaji {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        //Mengisi Jam Kerja
        System.out.print("Masukkan jam kerja ");
        int jam = scan.nextInt();

        //Mengisi Tarif Per Jam
        System.out.print("Masukkan tarif per jam ");
        int tarif = scan.nextInt();

        //Perhitungan
        int gajiKotor = jam * tarif;
        double pajak = gajiKotor * 0.10;
        double gajiBersih = gajiKotor - pajak;

        //Hasil
        System.out.println("Gaji Kotor : "+gajiKotor);
        System.out.println("Potongan Pajak : "+pajak);
        System.out.println("Gaji Bersih : "+gajiBersih);
    }
}
