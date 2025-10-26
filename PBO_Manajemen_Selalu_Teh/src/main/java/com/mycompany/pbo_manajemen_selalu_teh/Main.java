/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_manajemen_selalu_teh;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        KaryawanKontrak k1 = new KaryawanKontrak("Larend", "2409116010", "Jl. Melati No.5", 4000000, 500000);
        KaryawanParuhWaktu k2 = new KaryawanParuhWaktu("Rezky", "2409116029", "Jl. Kenanga No.8", 80, 25000);

        // Membuat manajemen gaji
        ManajemenGaji mg = new ManajemenGaji();
        mg.tambahKaryawan(k1);
        mg.tambahKaryawan(k2);

        // Menampilkan hasil total gaji semua karyawan
        mg.tampilkanTotalGaji();
    }
}