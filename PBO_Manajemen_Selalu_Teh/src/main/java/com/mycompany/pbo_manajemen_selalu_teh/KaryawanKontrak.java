/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_manajemen_selalu_teh;

/**
 *
 * @author ASUS
 */
public class KaryawanKontrak extends Karyawan {
    private int gajiPokok;
    private int bonusProyek;

    public KaryawanKontrak(String nama, String nip, String alamat, int gajiPokok, int bonusProyek) {
        super(nama, nip, alamat);
        this.gajiPokok = gajiPokok;
        this.bonusProyek = bonusProyek;
    }

    // Override hitungGaji (Polymorphism)
    @Override
    public double hitungGaji() {
        return gajiPokok + bonusProyek;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getBonusProyek() {
        return bonusProyek;
    }

    public void setBonusProyek(int bonusProyek) {
        this.bonusProyek = bonusProyek;
    }
}