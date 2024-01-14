Feature: Edit form verifikasi
  #negatif
  Scenario: mengubah nama lengkap nasabah dengan angka dan karakter spesial
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And mengubah nama dengan beberapa karakter spesial dan angka di bagian field nama lengkap nasabah
    And klik tombol simpan
    And muncul popup alert "sukses mengubah data!"
    Then verifikator tidak berhasil mengubah nama nasabah dengan karakter spesial dan angka

  #negatif
  Scenario: Nama lengkap nasabah kosong atau dihapus
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And menghapus isi di bagian field nama lengkap nasabah
    And klik tombol simpan
    And Muncul alert "The Customer Name field is required."
    Then verifikator tidak berhasil mengosongkan field nama lengkap nasabah

  #positif
  Scenario: Nominal transaksi ditambahkan 0 satu
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And menambah 0 satu di field nominal transaksi
    And klik tombol simpan
    And muncul popup alert "sukses mengubah data!"
    Then verifikator berhasil mengubah nominal transaksi milik nasabah

  #positif
  Scenario: Nominal cashback berubah sesuai dengan perubahan nominal transaksi
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And mengubah nominal transaksi diatas 300.000
    And nominal cashback berubah sesuai perubahan nominal transaksi
    And klik tombol simpan
    And muncul popup alert "sukses mengubah data!"
    Then Nominal cashback tidak sama dengan 0

  #Negatif
  Scenario: Nominal transaksi kosong/dihapus
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And menghapus isi field nominal transaksi
    And muncul alert "Nominal belanja minimal Rp. 250.000"
    Then field nominal transaksi tidak bisa kosong

  #Positif
  Scenario: Tanggal transaksi berubah menjadi tanggal sebelum hari ini
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And klik field tanggal transaksi
    And pilih tanggal sebelum tanggal hari ini
    And klik tombol simpan
    And muncul popup alert "sukses mengubah data!"
    Then verifikator berhasil mengubah tanggal transaksi menjadi tanggal sebelum hari ini

  #negatif
  Scenario: Tanggal transaksi berubah menjadi tanggal setelah hari ini
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And klik field tanggal transaksi
    And pilih tanggal sesudah tanggal hari ini
    And klik tombol simpan
    And muncul popup alert "sukses mengubah data!"
    Then verifikator tidak berhasil mengubah tanggal transaksi menjadi tanggal setelah hari ini

  #positif
  Scenario: Merubah opsi lain pembayaran QRIS
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And klik dropdown menu pembayaran QRIS
    And memilih opsi selain pilihan sebelumnya
    And klik tombol simpan
    And muncul popup alert "sukses mengubah data!"
    Then verifikator berhasil mengubah pembayaran QRIS

  #negatif
  Scenario: Memilih opsi pembayaran QRIS "--Pilih--"
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And klik dropdown menu pembayaran QRIS
    And memilih opsi "--Pilih--"
    And klik tombol simpan
    And muncul error "The Qris field is required."
    Then verifikator tidak berhasil mengosongkan pembayaran QRIS

  #negatif
  Scenario: Memilih opsi nama merchant "--Pilih--"
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol edit
    And klik dropdown nama merchant
    And memilih opsi "--Pilih--"
    And klik tombol simpan
    And muncul error Required
    Then muncul error message required








