Feature: Foto bukti transaksi
  #positif
  Scenario: mengganti foto bukti transaksi 1 dengan foto format png
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik foto pada foto bukti transaksi 1
    And Klik choose file untuk mengganti foto berformat png
    And Klik tombol ganti foto
    And Muncul popup "Sukses!"
    Then Verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png

  #Positif
  Scenario: mengganti foto bukti transaksi 2 dengan foto format jpeg
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik foto pada foto bukti transaksi 2
    And Klik choose file untuk mengganti foto berformat jpeg
    And Klik tombol ganti foto
    And Muncul popup "Sukses!"
    Then Verifikator berhasil mengganti foto bukti transaksi dengan foto berformat jpeg

  #Positif
  Scenario: mengganti foto bukti transaksi 3 dengan foto format png
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik foto pada foto bukti transaksi 3
    And Klik choose file untuk mengganti foto berformat png
    And Klik tombol ganti foto
    And Muncul popup "Sukses!"
    Then Verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png

  #Negatif
  Scenario: Tidak mengganti foto apapun
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik foto pada foto bukti transaksi 1
    And Klik tombol ganti foto
    And Muncul warning error
    Then Verifikator tidak berhasil mengganti foto bukti transaksi


