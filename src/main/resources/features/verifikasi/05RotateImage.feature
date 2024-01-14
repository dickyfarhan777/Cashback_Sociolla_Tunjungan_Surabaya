Feature: Rotate image
  #positif
  Scenario: foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol 90 di bawah foto bukti transaksi 1
    Then verifikator berhasil merotasi foto bukti transaksi 1

  #negatif
  Scenario: foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol 180 di bawah foto bukti transaksi
    And muncul popup alert Error "Error rotate file"
    Then verifikator tidak berhasil merotasi foto bukti transaksi yang kosong
