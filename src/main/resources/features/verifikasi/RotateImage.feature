Feature: Rotate image
  #positif
  Scenario: Foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol 90/180/270 di bawah foto bukti transaksi 1
    Then Verifikator berhasil merotasi foto bukti transaksi 1

  #negatif
  Scenario: Foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol 90/180/270 di bawah foto bukti transaksi
    And Muncul popup alert Error "Error rotate file"
    Then Verifikator tidak berhasil merotasi foto bukti transaksi yang kosong dan mendapat alert error
