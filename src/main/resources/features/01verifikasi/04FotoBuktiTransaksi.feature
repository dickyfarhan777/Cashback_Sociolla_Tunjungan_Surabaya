Feature: Foto bukti transaksi
  #positif
  Scenario: mengganti foto bukti transaksi 1 dengan foto format png
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik foto pada foto bukti transaksi 1
    And klik choose file untuk mengganti foto 1 berformat png
    And klik tombol ganti foto 1
    And muncul popup Sukses!
    Then verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png

  #Positif
  Scenario: mengganti foto bukti transaksi 2 dengan foto format jpeg
    Given Scroll ke bawah 1
    When klik foto pada foto bukti transaksi 2
    And klik choose file untuk mengganti foto berformat jpeg
    And klik tombol ganti foto 2
    And muncul popup Sukses!
    Then verifikator berhasil mengganti foto bukti transaksi dengan foto berformat jpeg

  #Positif
  Scenario: mengganti foto bukti transaksi 3 dengan foto format png
    Given Scroll ke bawah 2
    When klik foto pada foto bukti transaksi 3
    And klik choose file untuk mengganti foto 3 berformat png
    And klik tombol ganti foto 3
    And muncul popup Sukses!
    Then verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png

  #Negatif -alert
  Scenario: tidak mengganti foto apapun
    Given Scroll ke bawah 2
    When klik foto pada foto bukti transaksi 3
    And klik tombol ganti foto 3
    And muncul warning error
    Then verifikator tidak berhasil mengganti foto bukti transaksi


