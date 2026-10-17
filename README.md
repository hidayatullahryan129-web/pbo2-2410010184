1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?

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
[p04_pbo2.txt](https://github.com/user-attachments/files/33599013/p04_pbo2.txt)
# pbo2-2410010184
