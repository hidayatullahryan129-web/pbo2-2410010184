[p04_pbo2.txt](https://github.com/user-attachments/files/33602483/p04_pbo2.txt)Foto Sketsa:
<img width="1600" height="1201" alt="Sketsa_pbo2" src="https://github.com/user-attachments/assets/75929a93-7794-4167-9538-488d1267bcbe" />
Tabel Rancangan:
<img width="453" height="236" alt="image" src="https://github.com/user-attachments/assets/4536228b-a4ef-4682-9969-58e609791719" />
Ukuran Awal :
<img width="347" height="415" alt="image" src="https://github.com/user-attachments/assets/3d62d3ae-1ad5-442d-8afc-5b693d4e68c2" />
Ukuran Lebar :
<img width="581" height="405" alt="image" src="https://github.com/user-attachments/assets/98e3fb69-4a7c-431f-aa09-e61f37547dd8" />
Navigator :
<img width="289" height="387" alt="image" src="https://github.com/user-attachments/assets/2bf13576-623c-400c-bf67-b630de49f6a2" />
<img width="263" height="95" alt="image" src="https://github.com/user-attachments/assets/07dee20c-45ba-4ff3-8ffa-2bc6863a0aff" />
<img width="419" height="316" alt="image" src="https://github.com/user-attachments/assets/b7d68b1f-3e86-4bdd-9563-7518148abc61" />



[Ekperimen_p04 dan P02.md](https://github.com/user-attachments/files/33602305/Ekperimen_p04.dan.P02.md)
[p04_pbo2.txt](https://github.com/user-attachments/files/33602550/p04_pbo2.txt)
1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?

Karena di layout ini kita harus mengatur sendiri letak dan ukuran setiap komponen dalam piksel, tanpa bantuan layout manager. Tampilannya cuma rapi di satu ukuran jendela. Begitu jendela dibesarkan atau dikecilkan, komponennya diam di tempat, jadi bisa terpotong atau menyisakan ruang kosong. Di komputer lain tampilannya juga bisa berantakan karena ukuran layar dan font-nya beda. Kalau mau menambah atau menggeser satu komponen, kita harus menghitung ulang posisi komponen lainnya, jadi repot kalau mau diubah.

2. Perbedaan FlowLayout dan GridLayout saat jendela dilebarkan

Di FlowLayout, ukuran komponen tidak berubah. Kalau jendela dilebarkan, komponennya cuma bergeser posisi, dan kalau tempatnya sempit, komponen pindah ke baris bawah. Di GridLayout, area dibagi jadi kotak-kotak yang ukurannya sama, dan tiap komponen mengisi penuh kotaknya. Jadi kalau jendela dilebarkan, semua komponen ikut melebar bersama, sedangkan jumlah baris dan kolomnya tetap.

3. Fungsi Weight X dan Fill pada GridBagLayout

Weight X mengatur siapa yang dapat jatah tambahan ruang saat jendela dilebarkan. Kolom dengan nilai Weight X lebih besar dapat jatah lebih banyak, dan kalau nilainya 0, kolom itu tidak ikut melebar. Fill mengatur apakah komponen memenuhi seluruh selnya atau tidak. Pilihannya None (ukuran tetap), Horizontal (penuh ke samping), Vertical (penuh ke bawah), dan Both (penuh ke samping dan bawah). Keduanya dipakai bersama. Di form ini, kolom isian diberi Weight X dan Fill Horizontal, jadi kotak isiannya ikut melebar saat jendela dilebarkan, sedangkan kolom labelnya tetap.

4. Mengapa FormPanel dibungkus IsiPanel dan diletakkan di North?
FormPanel itu panel yang berisi semua label dan isian, dan layout-nya GridBagLayout. Panel ini dimasukkan ke IsiPanel yang memakai BorderLayout, lalu ditaruh di North. Alasannya, bagian Center di BorderLayout selalu mengambil semua sisa ruang. Kalau FormPanel langsung ditaruh di Center, isinya ikut tertarik atau terpusat dan jaraknya jadi renggang waktu jendela ditinggikan. Dengan ditaruh di North, FormPanel menempel di atas dan tingginya secukupnya saja, sedangkan sisa ruang kosong ada di bawah. Jadi form tetap rapat dan rapi walaupun ukuran jendelanya berubah.
5.  Dua prinsip desain di Form Anggota Perpustakaan dan buktinya

Pengelompokan. Isian yang berkaitan dikumpulkan di bawah satu judul bagian, yaitu Data Anggota, Kontak, dan Persetujuan. Jadi pengguna langsung paham mana isian yang satu kelompok. Buktinya ada di screenshot tab Design dan Navigator (DataAnggotaLabel dan PersetujuanLabel), juga di screenshot form saat dijalankan.
Konsisten dan mudah dibaca. Semua label ada di kolom kiri dan sejajar, semua kotak isian ada di kolom kanan dengan lebar yang sama, dan jarak antar baris seragam. Buktinya ada di screenshot form saat dijalankan, baik ukuran awal maupun saat dilebarkan, karena kotak isiannya tetap sejajar.



**Nama :M.Ryan Hidayatullah** 

**Npm : 2410010184**



**Ekperimen P02**

1\. Koleksi x = new Koleksi("X01", "Uji", 2026);

dikerena :Koleksi dideklarasikan public abstract class, dan di dalamnya ada method abstrak keterangan(). Koleksi juga belum mengisi batasHariPinjam() dan hitungDenda() dari interface BisaDipinjam. Kelas abstrak hanya berfungsi sebagai kerangka, jadi objeknya tidak boleh dibuat langsung. Yang boleh dibuat adalah turunan yang sudah melengkapi semua method, yaitu Buku, Majalah, atau Skripsi.



2\. Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi

@Override ada, dan jika dihapus?

Dikarenakan : Java membedakan huruf besar dan kecil, jadi hitungdenda dianggap method baru, bukan pengganti hitungDenda. hitungDenda adalah kewajiban dari interface BisaDipinjam, dan Buku kelas biasa (bukan abstrak), jadi Buku wajib mengisinya. Kalau namanya salah, kewajiban itu belum terpenuhi dan program tidak bisa dikompilasi.



@Override hanya mengubah pesannya. Dengan @Override, kompiler menunjuk langsung ke penyebabnya, yaitu method itu tidak mengganti apa pun di kelas induk. Tanpa @Override, kamu hanya diberi tahu bahwa ada method yang belum diisi, tanpa petunjuk bahwa penyebabnya salah ketik. Jadi @Override membantu menemukan salah ketik nama method lebih cepat.



3\. Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan?

Dikarenakan : konstruktor Koleksi memeriksa judul.isBlank() dan melempar IllegalArgumentException dengan pesan “Judul tidak boleh kosong”. Karena tidak ada try-catch, program langsung berhenti di baris itu. Dalam percobaan ini daftar koleksi bahkan belum tercetak, karena barisnya berada sebelum tampilkanDaftar. Objek Buku B009 tidak pernah jadi, sehingga data tidak valid tidak bisa masuk ke perpustakaan. Nomor baris di stack trace-mu bisa berbeda, tergantung posisi baris di main.



4\. Ubah private StatusKoleksi status menjadi public, lalu ubah status B002 langsung dari main

menjadi TERSEDIA saat masih dipinjam. Aturan apa yang dilanggar?

Atribut seharusnya private dan hanya berubah lewat method milik kelas (pinjam() dan kembalikan()). Method itu menjaga aturan “koleksi yang sedang dipinjam tidak bisa dipinjam lagi” dan memastikan status koleksi selalu sejalan dengan catatan peminjam di Perpustakaan. Kalau status diubah langsung dari main, pemeriksaan itu terlewati. Perpustakaan.kembalikan() melihat status TERSEDIA, mengira buku itu tidak sedang dipinjam, lalu langsung mengembalikan 0 tanpa menghitung denda dan tanpa menghapus Siti dari catatan peminjam. Dari kodenya, Budi juga akan bisa meminjam B002 karena pinjam() sekarang menganggapnya tersedia, dan catatan Siti akan tertimpa. Bagian terakhir ini saya simpulkan dari kode dan belum saya jalankan.



**Ekperimen p04**

1.Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?

di Navigator, klik node FlowLayout di bawah FlowLayOut, lalu ubah Alignment dari Left ke Center. Jalankan dengan Shift+F6, buka tab FlowLayOut, dan kecilkan jendela.



Yang berubah: tombol-tombol yang tadinya rata kiri sekarang berkumpul di tengah. Saat jendela dikecilkan, tombol yang tidak muat pindah ke baris bawah, dan setiap barisnya tetap berada di tengah, bukan menempel ke kiri. Ukuran tombolnya sendiri tidak berubah.



2.Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa

perbedaannya?

klik node GridLayout di bawah GridLayOut, lalu ubah Rows jadi 0 dan Columns jadi 2.



Hasilnya: 5 baris. Kalau Rows diisi 0, GridLayout menghitung jumlah baris sendiri dari jumlah komponen dan kolom. Ada 9 tombol dan 2 kolom, jadi 9 ÷ 2 = 4,5, dibulatkan ke atas menjadi 5 baris. Empat baris pertama berisi dua tombol, sedangkan baris kelima hanya berisi tombol 9 di kolom kiri, dan sel kanannya kosong.



Barisnya berubah dari new java.awt.GridLayout(3, 3, 8, 8) menjadi new java.awt.GridLayout(0, 2, 8, 8).



3\. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian

mana yang rusak lebih dulu?

klik satu tombol di BoxLayOut (DashboardButton), lalu di Properties isi maximumSize dengan lebar 32767 dan tinggi sesuai tinggi tombol. Lihat tingginya dari properti preferredSize tombol itu. Ulangi untuk DataMahasiswaButton, DataMataKuliahButton, dan LaporanButton.



Lebar tombol: sebelumnya lebar tiap tombol hanya sebesar teksnya, jadi lebarnya beda-beda dan semuanya rata kiri. Setelah maximumSize lebar diisi 32767, BoxLayout boleh merentangkan tombol sampai selebar panel. Hasilnya keempat tombol sama lebar, memenuhi lebar panel, dan ikut melebar saat jendela dilebarkan. Tingginya tetap karena tinggi maximumSize disamakan dengan tinggi tombol.

[Upl1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?

Karena di layout ini kita harus mengatur sendiri letak dan ukuran setiap komponen dalam piksel, tanpa bantuan layout manager. Tampilannya cuma rapi di satu ukuran jendela. Begitu jendela dibesarkan atau dikecilkan, komponennya diam di tempat, jadi bisa terpotong atau menyisakan ruang kosong. Di komputer lain tampilannya juga bisa berantakan karena ukuran layar dan font-nya beda. Kalau mau menambah atau menggeser satu komponen, kita harus menghitung ulang posisi komponen lainnya, jadi repot kalau mau diubah.
2. Perbedaan FlowLayout dan GridLayout saat jendela dilebarkan

Di FlowLayout, ukuran komponen tidak berubah. Kalau jendela dilebarkan, komponennya cuma bergeser posisi, dan kalau tempatnya sempit, komponen pindah ke baris bawah. Di GridLayout, area dibagi jadi kotak-kotak yang ukurannya sama, dan tiap komponen mengisi penuh kotaknya. Jadi kalau jendela dilebarkan, semua komponen ikut melebar bersama, sedangkan jumlah baris dan kolomnya tetap.
3. Fungsi Weight X dan Fill pada GridBagLayout

Weight X mengatur siapa yang dapat jatah tambahan ruang saat jendela dilebarkan. Kolom dengan nilai Weight X lebih besar dapat jatah lebih banyak, dan kalau nilainya 0, kolom itu tidak ikut melebar. Fill mengatur apakah komponen memenuhi seluruh selnya atau tidak. Pilihannya None (ukuran tetap), Horizontal (penuh ke samping), Vertical (penuh ke bawah), dan Both (penuh ke samping dan bawah). Keduanya dipakai bersama. Di form ini, kolom isian diberi Weight X dan Fill Horizontal, jadi kotak isiannya ikut melebar saat jendela dilebarkan, sedangkan kolom labelnya tetap.
4. Mengapa FormPanel dibungkus IsiPanel dan diletakkan di North?

FormPanel itu panel yang berisi semua label dan isian, dan layout-nya GridBagLayout. Panel ini dimasukkan ke IsiPanel yang memakai BorderLayout, lalu ditaruh di North. Alasannya, bagian Center di BorderLayout selalu mengambil semua sisa ruang. Kalau FormPanel langsung ditaruh di Center, isinya ikut tertarik atau terpusat dan jaraknya jadi renggang waktu jendela ditinggikan. Dengan ditaruh di North, FormPanel menempel di atas dan tingginya secukupnya saja, sedangkan sisa ruang kosong ada di bawah. Jadi form tetap rapat dan rapi walaupun ukuran jendelanya berubah.
5. Dua prinsip desain di Form Anggota Perpustakaan dan buktinya

Pengelompokan. Isian yang berkaitan dikumpulkan di bawah satu judul bagian, yaitu Data Anggota, Kontak, dan Persetujuan. Jadi pengguna langsung paham mana isian yang satu kelompok. Buktinya ada di screenshot tab Design dan Navigator (DataAnggotaLabel dan PersetujuanLabel), juga di screenshot form saat dijalankan.
Konsisten dan mudah dibaca. Semua label ada di kolom kiri dan sejajar, semua kotak isian ada di kolom kanan dengan lebar yang sama, dan jarak antar baris seragam. Buktinya ada di screenshot form saat dijalankan, baik ukuran awal maupun saat dilebarkan, karena kotak isiannya tetap sejajar.





Vertical Strut: dari Palette, buka kategori Swing Fillers, seret Vertical Strut ke antara dua tombol di BoxLayOut (lewat Navigator lebih mudah), lalu atur tingginya (misalnya 8). Strut ini adalah jarak tetap yang tidak ikut berubah saat jendela diubah ukurannya, jadi tombol tidak lagi menempel satu sama lain.






# pbo2-2410010184
