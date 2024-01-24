Feature: Rotate image
  #positif
  Scenario: foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol
    Given scroll ke atas max
    When klik tombol 90 di bawah foto bukti transaksi 1
    Then verifikator berhasil merotasi foto bukti transaksi 1

  #negatif
  Scenario: foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol
    Given scroll ke atas max
    When klik menu verifikasi
    And klik tombol mata
    And scroll ke bawah sedikit
    And klik tombol 180 di bawah foto bukti transaksi yang kosong
    And muncul popup alert Error "Error rotate file"
    Then verifikator tidak berhasil merotasi foto bukti transaksi yang kosong
