/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

import java.util.Scanner;

public class ProgramPboRuang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM SEWA RUANG ===");
        System.out.println("1. Ruang Rapat Kecil");
        System.out.println("2. Ruang Rapat Besar");
        System.out.println("3. Ruang Aula");
        System.out.print("Pilih jenis ruang: ");
        int pilih = sc.nextInt();
        Ruang ruang = null;

        if (pilih == 1) {
            sc.nextLine();
            System.out.print("Nama Ruang: ");
            String nama = sc.nextLine();

            System.out.print("Durasi sewa (jam): ");
            int durasi = sc.nextInt();

            System.out.print("Jumlah kursi: ");
            int kursi = sc.nextInt();
            ruang = new RuangRapatKecil(nama, durasi, kursi);

        } else if (pilih == 2) {
            sc.nextLine();
            System.out.print("Nama Ruang: ");
            String nama = sc.nextLine();

            System.out.print("Durasi sewa (jam): ");
            int durasi = sc.nextInt();

            System.out.print("Jumlah kursi: ");
            int kursi = sc.nextInt();

            System.out.print("Tambah Sound System? (true/false): ");
            boolean sound = sc.nextBoolean();

            System.out.print("Tambah Proyektor? (true/false): ");
            boolean proyektor = sc.nextBoolean();
            ruang = new RuangRapatBesar(nama, durasi, kursi, sound, proyektor);

        } else if (pilih == 3) {
            sc.nextLine();
            System.out.print("Nama Ruang: ");
            String nama = sc.nextLine();

            System.out.print("Durasi sewa (jam): ");
            int durasi = sc.nextInt();

            ruang = new RuangAula(nama, durasi);
        }
        System.out.println("\nTotal Biaya Sewa: Rp " + ruang.hitungBiaya());
        sc.close();
    }
}