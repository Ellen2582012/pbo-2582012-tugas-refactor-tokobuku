LAPORAN REFACTORING PROGRAM TOKO BUKU MENGGUNAKAN SOLID

 1. Pendahuluan

Pada tugas ini, saya melakukan refactoring pada program Toko Buku yang sebelumnya masih memiliki struktur kode yang kurang terorganisir. Pada kode awal, beberapa fungsi dan tanggung jawab masih digabungkan ke dalam satu class, sehingga kode menjadi kurang fleksibel ketika ingin menambahkan fitur baru atau melakukan perubahan.

Oleh karena itu, saya melakukan refactoring dengan menerapkan prinsip SOLID pada bahasa pemrograman Java. Tujuan dari refactoring ini adalah untuk membuat struktur program menjadi lebih rapi, mudah dipahami, serta memudahkan proses pengembangan dan pemeliharaan program tanpa mengubah fungsi utama yang sudah ada.

 2. Tujuan Refactoring

Tujuan dari refactoring program Toko Buku ini adalah:

1. Memisahkan tanggung jawab setiap class agar memiliki fungsi yang lebih jelas.
2. Membuat program lebih mudah dikembangkan ketika terdapat penambahan fitur.
3. Mengurangi ketergantungan antarclass.
4. Menerapkan prinsip SOLID dalam pemrograman berorientasi objek.
5. Mempertahankan hasil output program agar tetap sama dengan program awal.

 3. Analisis Program Sebelum Refactoring

Pada program awal, beberapa fungsi masih digabungkan ke dalam class `Toko`, seperti pengelolaan keranjang, perhitungan harga, ongkir, pembayaran, pencetakan struk, penyimpanan riwayat, dan pengiriman email.

Hal tersebut membuat class `Toko` memiliki terlalu banyak tanggung jawab. Jika ingin mengubah salah satu fungsi, maka bagian kode yang lain berpotensi ikut terpengaruh.

Selain itu, class `Buku` juga digunakan untuk berbagai jenis buku, yaitu buku cetak, buku digital, dan buku audio, meskipun setiap jenis buku memiliki karakteristik dan fungsi yang berbeda.

Oleh karena itu, program perlu diperbaiki dengan memisahkan tanggung jawab ke beberapa class agar lebih mudah dipahami dan dikembangkan.

 4. Penerapan Prinsip SOLID

 4.1 Single Responsibility Principle (SRP)

SRP diterapkan dengan memisahkan tanggung jawab program ke dalam beberapa class. Setiap class memiliki tugas yang lebih spesifik sesuai fungsinya.

Contohnya, `Keranjang` digunakan untuk mengelola daftar buku, `EmailSender` digunakan untuk mengirim email, dan `FileRiwayat` digunakan untuk menyimpan riwayat transaksi.

Dengan pemisahan ini, setiap class tidak perlu menangani terlalu banyak pekerjaan sekaligus.

 4.2 Open/Closed Principle (OCP)

OCP diterapkan dengan membuat struktur program yang lebih mudah dikembangkan ketika ingin menambahkan fitur baru tanpa harus mengubah terlalu banyak kode yang sudah ada.

Contohnya, jenis buku dipisahkan menjadi `BukuCetak`, `BukuDigital`, dan `BukuAudio`. Dengan struktur tersebut, penambahan jenis buku baru dapat dilakukan dengan lebih terorganisir.

 4.3 Liskov Substitution Principle (LSP)

LSP diterapkan dengan memastikan class yang menggunakan abstraksi dapat bekerja sesuai dengan fungsi yang telah ditentukan.

Dalam program ini, jenis buku memiliki kemampuan yang berbeda-beda. Buku cetak memiliki kemampuan untuk mengetahui berat buku, sedangkan buku digital dan audio memiliki kemampuan untuk menyediakan link unduhan.

Dengan pemisahan kemampuan tersebut, class dapat digunakan sesuai fungsinya masing-masing.

 4.4 Interface Segregation Principle (ISP)

ISP diterapkan dengan memisahkan interface berdasarkan kebutuhan fungsi tertentu.

Contohnya, interface `BisaDikirim` digunakan untuk buku yang memiliki proses pengiriman, sedangkan `BisaDiunduh` digunakan untuk buku yang memiliki link unduhan.

Dengan cara ini, setiap class tidak perlu mengimplementasikan fungsi yang sebenarnya tidak dibutuhkan.

 4.5 Dependency Inversion Principle (DIP)

DIP diterapkan dengan mengurangi ketergantungan langsung antara class tingkat tinggi dengan class implementasi tertentu.

Contohnya, `CheckoutService` menggunakan interface seperti `MetodeBayar`, `StrukPrinter`, `RiwayatPenyimpan`, dan `NotifikasiPengirim`.

Dengan menggunakan interface, program menjadi lebih fleksibel karena implementasi yang digunakan dapat diganti tanpa harus mengubah seluruh proses checkout.

 5. Proses Refactoring

Refactoring dilakukan secara bertahap menggunakan Git agar perubahan program dapat dilihat dan dibedakan berdasarkan setiap proses pengerjaan.

- Commit 1: Menyimpan kode awal `TokoBukuKotor.java` sebelum dilakukan refactoring.
- Commit 2: Memisahkan tanggung jawab class dan mengembangkan struktur program untuk penerapan SRP dan OCP.
- Commit 3: Memperbaiki struktur interface dan implementasi untuk penerapan LSP dan ISP.
- Commit 4: Mengintegrasikan program menggunakan `CheckoutService.java` dan `Main.java`, serta menerapkan DIP.
- Commit 5: Menambahkan laporan hasil refactoring ke dalam file `LAPORAN.md`.

 6. Pengujian Program

Pengujian dilakukan dengan menjalankan program sebelum dan sesudah refactoring untuk mengetahui apakah program masih dapat berjalan sesuai fungsi awal.

Beberapa hal yang diperiksa dalam pengujian adalah:

1. Data buku dapat ditampilkan dengan benar.
2. Harga dan ongkir buku cetak dihitung sesuai ketentuan.
3. Diskon buku digital dan buku audio tetap berjalan.
4. Metode pembayaran E-Wallet dapat digunakan.
5. Total belanja dan total pembayaran sesuai perhitungan.
6. Berat kiriman dihitung sesuai jumlah buku cetak.
7. Link unduhan buku digital dan audio ditampilkan.
8. Riwayat transaksi dan notifikasi email tetap ditampilkan.

Hasil pengujian akan dibandingkan dengan output program awal untuk memastikan bahwa perubahan struktur kode tidak mengubah fungsi program.

 7. Kesimpulan

Dari tugas refactoring ini, saya memahami bahwa penerapan prinsip SOLID dapat membantu membuat program menjadi lebih terstruktur dan mudah dikembangkan. Setiap class memiliki tanggung jawab yang lebih jelas, penggunaan interface membantu mengurangi ketergantungan, dan penambahan fitur dapat dilakukan dengan lebih terorganisir.

Melalui tugas ini, saya belajar bahwa refactoring tidak hanya bertujuan untuk membuat kode terlihat lebih rapi, tetapi juga memperbaiki struktur dan kualitas kode agar lebih mudah dipahami, dikembangkan, dan dipelihara tanpa mengubah fungsi utama program.