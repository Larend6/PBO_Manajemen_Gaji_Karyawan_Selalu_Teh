/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_manajemen_selalu_teh;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class ManajemenGaji {
    private List<Karyawan> daftarKaryawan;

    public ManajemenGaji() {
        daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan k) {
        daftarKaryawan.add(k);
    }

    public void tampilkanTotalGaji() {
        System.out.println("=== Daftar Gaji Karyawan Toko Selalu Teh ===");
        for (Karyawan k : daftarKaryawan) {
            String tipe = (k instanceof KaryawanKontrak) ? "Karyawan Kontrak" : "Karyawan Paruh Waktu";
            System.out.println("Nama       : " + k.getNama());
            System.out.println("Tipe       : " + tipe);
            System.out.println("Gaji Diterima : Rp" + k.hitungGaji());
            System.out.println("--------------------------------------------");
        }
    }
}