# ⚡ Vehicle Management System (OOP Java)

Proyek ini adalah implementasi sistem manajemen kendaraan sederhana yang dirancang untuk mendemonstrasikan pemahaman mendalam tentang **4 Pilar Pemrograman Berorientasi Objek (OOP)** menggunakan bahasa Java.

---

## 🏗️ 4 Pilar OOP yang Diimplementasikan

### 1. Abstraction (Abstraksi)
Abstraksi digunakan untuk menyembunyikan detail kompleks dan hanya menampilkan fungsi penting kepada pengguna.
- **Implementasi:** Menggunakan `abstract class kendaraan`. Kelas ini bertindak sebagai kerangka (*blueprint*) umum. Ia memiliki *abstract method* `gas()` yang tidak memiliki isi di kelas induk, karena setiap jenis kendaraan (mobil/kapal) memiliki cara melaju yang berbeda.

### 2. Encapsulation (Enkapsulasi)
Enkapsulasi adalah teknik untuk membungkus data (variabel) dan metode dalam satu unit (kelas) serta membatasi akses dari luar menggunakan *access modifiers*.
- **Implementasi:** Atribut `merek`, `warna`, dan `kecepatan` diatur sebagai `private`. Akses untuk membaca dan mengubah nilai dilakukan melalui metode **Getter** (`getMerek()`, dll) dan **Setter** (`setKecepatan()`, dll).
- **Validasi:** Di dalam `setKecepatan()`, terdapat pengecekan logika: jika kecepatan $\le 0$, maka sistem akan mencetak "Kendaraan Mogok".

### 3. Inheritance (Pewarisan)
Pewarisan memungkinkan sebuah kelas (*subclass*) untuk mewarisi sifat dan perilaku dari kelas lain (*superclass*).
- **Implementasi:** Kelas `mobil` dan `kapal` menggunakan kata kunci `extends` untuk mewarisi atribut dan metode dari kelas `kendaraan`. Ini membantu dalam penggunaan ulang kode (*code reuse*).

### 4. Polymorphism (Polimorfisme)
Polimorfisme berarti "banyak bentuk". Ini memungkinkan satu metode memiliki perilaku yang berbeda-beda tergantung pada objek yang memanggilnya.
- **Implementasi:** Menggunakan **Method Overriding** pada `gas()`. 
    - Ketika `m1.gas()` dipanggil, outputnya adalah "Mobil melaju".
    - Ketika `k1.gas()` dipanggil, outputnya adalah "Kapal melaju".

---

## 🛠️ Cuplikan Kode Utama



```java
// Contoh Polimorfisme dan Enkapsulasi dalam Main
public class Main {
    public static void main(String[] args) {
        mobil m1 = new mobil("lambo", "merah", 200);
        kapal k1 = new kapal("speedboat", "coklat", 50);

        // Menampilkan data (Hasil Enkapsulasi)
        m1.displayInfo(); 
        
        // Memanggil metode yang sama dengan hasil berbeda (Polimorfisme)
        m1.gas(); // Output: Mobil melaju
        k1.gas(); // Output: Kapal melaju
    }
}# Tugas-Strukdat-OOP
