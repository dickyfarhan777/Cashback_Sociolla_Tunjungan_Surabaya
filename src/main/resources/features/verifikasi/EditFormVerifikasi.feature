Feature: Edit form verifikasi
  #negatif
  Scenario: Mengubah nama lengkap nasabah dengan angka dan karakter spesial
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Mengubah nama dengan beberapa karakter spesial dan angka di bagian field nama lengkap nasabah
    And Klik tombol simpan
    And Muncul popup alert "sukses mengubah data!"
    Then Verifikator tidak berhasil mengubah nama nasabah dengan karakter spesial dan angka

  #negatif
  Scenario: Nama lengkap nasabah kosong atau dihapus
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Menghapus isi di bagian field nama lengkap nasabah
    And Klik tombol simpan
    And Muncul alert "The Customer Name field is required."
    Then Verifikator tidak berhasil mengosongkan field nama lengkap nasabah

  #positif
  Scenario: Nominal transaksi ditambahkan 0 satu
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Menambah 0 satu di field nominal transaksi
    And Klik tombol simpan
    And Muncul popup alert "sukses mengubah data!"
    Then Verifikator berhasil mengubah nominal transaksi milik nasabah

  #positif
  Scenario: Nominal cashback berubah sesuai dengan perubahan nominal transaksi
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Mengubah nominal transaksi diatas 300.000
    And Nominal cashback berubah sesuai perubahan nominal transaksi
    And Klik tombol simpan
    And Muncul popup alert "sukses mengubah data!"
    Then Nominal cashback tidak sama dengan 0

  #Negatif
  Scenario: Nominal transaksi kosong/dihapus
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Menghapus isi field nominal transaksi
    And Muncul alert "Nominal belanja minimal Rp. 250.000"
    Then field nominal transaksi tidak bisa kosong

  #Positif
  Scenario: Tanggal transaksi berubah menjadi tanggal sebelum hari ini
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Klik field tanggal transaksi
    And Pilih tanggal sebelum tanggal hari ini
    And Klik tombol simpan
    And Muncul popup alert "sukses mengubah data!"
    Then Verifikator berhasil mengubah tanggal transaksi menjadi tanggal sebelum hari ini

  #negatif
  Scenario: Tanggal transaksi berubah menjadi tanggal setelah hari ini
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Klik field tanggal transaksi
    And Pilih tanggal sesudah tanggal hari ini
    And Klik tombol simpan
    And Muncul popup alert "sukses mengubah data!"
    Then Verifikator tidak berhasil mengubah tanggal transaksi menjadi tanggal setelah hari ini

  #positif
  Scenario: Merubah opsi lain pembayaran QRIS
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Klik dropdown menu pembayaran QRIS
    And Memilih opsi selain pilihan sebelumnya
    And Klik tombol simpan
    And Muncul popup alert "sukses mengubah data!"
    Then Verifikator berhasil mengubah pembayaran QRIS

  #negatif
  Scenario: Memilih opsi pembayaran QRIS "--Pilih--"
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Klik dropdown menu pembayaran QRIS
    And Memilih opsi "--Pilih--"
    And Klik tombol simpan
    And Muncul error "The Qris field is required."
    Then Verifikator tidak berhasil mengosongkan pembayaran QRIS

  #negatif
  Scenario: Memilih opsi nama merchant "--Pilih--"
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol edit
    And Klik dropdown menu pembayaran QRIS
    And Memilih opsi "--Pilih--"
    And Klik tombol simpan
    And Muncul error Required
    Then Muncul error message required








