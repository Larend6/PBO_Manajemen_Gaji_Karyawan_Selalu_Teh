# PBO_Manajemen_Gaji_Karyawan_Selalu_Teh

## 📋 Deskripsi Proyek

**Toko Selalu Teh** merupakan UMKM yang berlokasi di **Tenggarong, Kalimantan Timur**, yang menjual berbagai produk teh seperti teh ori, thai tea, teh tarik, dan lain lain.  
Program ini dirancang untuk membantu pengelolaan **gaji karyawan** di toko tersebut dengan memanfaatkan konsep **Pemrograman Berorientasi Objek (OOP)** dalam bahasa Java.

Sistem ini menghitung gaji untuk dua jenis karyawan:
- **Karyawan Kontrak**: gaji tetap + bonus proyek  
- **Karyawan Paruh Waktu**: berdasarkan jam kerja × tarif per jam  

---

## 🧠 Konsep OOP yang Diterapkan

### 🔹 Encapsulation
Atribut seperti `nama`, `nip`, dan `alamat` bersifat `private` dan hanya bisa diakses melalui getter dan setter, untuk menjaga keamanan data.

**Contoh kode:**
```java
public abstract class Karyawan {
    private String nama;
    private String nip;
    private String alamat;

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
}
```

> ✨ **Penjelasan:**
> - Atribut `nama`, `nip`, dan `alamat` bersifat `private` agar tidak bisa diakses langsung.  
> - Pengaksesan dilakukan melalui method getter/setter untuk menjaga integritas data (encapsulation).

---

### 🔹 Inheritance
Class `KaryawanKontrak` dan `KaryawanParuhWaktu` **mewarisi (extends)** class `Karyawan`, sehingga mereka dapat menggunakan atribut dan method dasar yang sama.

**Contoh kode:**
```java
public class KaryawanKontrak extends Karyawan {
    private int gajiPokok;
    private int bonusProyek;

    public KaryawanKontrak(String nama, String nip, String alamat, int gajiPokok, int bonusProyek) {
        super(nama, nip, alamat);
        this.gajiPokok = gajiPokok;
        this.bonusProyek = bonusProyek;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + bonusProyek;
    }
}
```

> ✨ **Penjelasan:**
> - `KaryawanKontrak` dan `KaryawanParuhWaktu` mewarisi class `Karyawan`.  
> - Mereka memiliki atribut tambahan dan implementasi `hitungGaji()` yang berbeda.

---

### 🔹 Polymorphism
Method `hitungGaji()` didefinisikan sebagai **abstract** di class `Karyawan`, kemudian **dioverride** oleh masing-masing subclass dengan rumus yang berbeda.

**Contoh kode:**
```java
@Override
public double hitungGaji() {
    return gajiPokok + bonusProyek;  // Untuk karyawan kontrak
}
```

Pemanggilan method polymorphic:
```java
for (Karyawan k : daftarKaryawan) {
    System.out.println("Nama : " + k.getNama());
    System.out.println("Gaji : Rp " + k.hitungGaji());
}
```

> ✨ **Penjelasan:**
> - Meskipun objek disimpan dalam list bertipe `Karyawan`, Java otomatis memanggil `hitungGaji()` yang sesuai dengan tipe objeknya (Kontrak atau Paruh Waktu).  
> - Inilah bentuk nyata **Polymorphism**.

---

## 🧩 Struktur Class

```
Karyawan (abstract)
│
├── KaryawanKontrak
│   └── gajiPokok, bonusProyek
│
├── KaryawanParuhWaktu
│   └── jamKerja, tarifPerJam
│
└── ManajemenGaji
    └── daftarKaryawan (ArrayList<Karyawan>)
```

---

## 💻 Contoh Output Program

```
=== Daftar Gaji Karyawan Toko Selalu Teh ===
Nama          : Rani
Tipe Karyawan : Karyawan Kontrak
Gaji Diterima : Rp4500000.0
--------------------------------------------
Nama          : Budi
Tipe Karyawan : Karyawan Paruh Waktu
Gaji Diterima : Rp2000000.0
--------------------------------------------
```

---

## 🧾 Penjelasan Hasil
- Program menampilkan daftar gaji dari dua tipe karyawan.  
- Setiap objek (`KaryawanKontrak` atau `KaryawanParuhWaktu`) memanggil versi `hitungGaji()` yang berbeda sesuai tipe — membuktikan **Polymorphism**.  
- Data pribadi karyawan diakses melalui **getter/setter** (penerapan **Encapsulation**).  
- Struktur class menunjukkan hubungan **Inheritance** dari class `Karyawan` sebagai induk.

---

## 🏁 Kesimpulan
Program ini berhasil menerapkan tiga konsep utama OOP:
1. **Encapsulation** – melindungi data dari akses langsung.  
2. **Inheritance** – memudahkan pewarisan struktur antar class.  
3. **Polymorphism** – memungkinkan satu method berperilaku berbeda berdasarkan tipe objek.

Sistem ini membantu **Toko Selalu Teh Tenggarong** dalam mengelola gaji karyawan dengan cara yang lebih efisien, aman, dan mudah dikembangkan.

---

## 📸 Screenshot Output
<img width="778" height="348" alt="image" src="https://github.com/user-attachments/assets/fdc2e885-ecb5-42f0-9f4a-99d3bad410de" />


---
