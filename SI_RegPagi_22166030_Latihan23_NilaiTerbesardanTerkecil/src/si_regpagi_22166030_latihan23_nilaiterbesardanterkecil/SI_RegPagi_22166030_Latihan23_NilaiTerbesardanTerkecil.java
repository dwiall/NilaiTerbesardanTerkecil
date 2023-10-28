package si_regpagi_22166030_latihan23_nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program nilai terbesar dan terkecil yang inputannya berasal dari user
 */
public class SI_RegPagi_22166030_Latihan23_NilaiTerbesardanTerkecil {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====\n");
            // Meminta nama petugas
            System.out.print("Masukkan Nama Petugas \t\t\t: ");
            String namaPetugas = input.nextLine();
            
            // Meminta banyaknya nilai mahasiswa
            System.out.print("Masukkan Banyaknya Nilai Mahasiswa \t: ");
            int banyakNilai = input.nextInt();
            
            int[] nilaiMahasiswa = new int[banyakNilai];
            
            // Meminta nilai-nilai mahasiswa
            for (int i = 0; i < banyakNilai; i++) {
                System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
                nilaiMahasiswa[i] = input.nextInt();
            }
            System.out.println("\n");
            
            System.out.println("=====Hasil Nilai Mahasiswa=====\n");
            
            // Menampilkan nilai-nilai mahasiswa dengan kondisi perulangan menggunakan for
            for (int i = 0; i < banyakNilai; i++) {
                System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
            }
            
            // Variabel
            int nilaiTerbesar = nilaiMahasiswa[0];
            int nilaiTerkecil = nilaiMahasiswa[0];
            
            //menampilkan nilai terbesar dan terkecil menggunakan kondisi perulangan for
            for (int i = 1; i < banyakNilai; i++) {
                if (nilaiMahasiswa[i] > nilaiTerbesar) {
                    nilaiTerbesar = nilaiMahasiswa[i];
                }
                if (nilaiMahasiswa[i] < nilaiTerkecil) {
                    nilaiTerkecil = nilaiMahasiswa[i];
                }
            }
            System.out.println("\n");
            
            //mencetak hasil nilai terbesar dan terkecil yang sudah diinputkan sebelumnya
            System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
            System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
            System.out.println("\n");
            
            //Mencetak hasil inputan nama petugas
            System.out.println("Petugas : " + namaPetugas);
        }
    }
}

        // TODO code application logic here

