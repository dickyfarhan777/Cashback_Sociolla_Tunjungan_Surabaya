Feature: Verifikasi
  #negatif
  Scenario: field form tidak bisa diklik
    Given scroll ke atas max
    When klik tombol mata di bagian kolom aksi
    And klik tiap field form 1
    And scroll ke bawah sedikit
    And klik tiap field form 2
    Then field form tidak bisa diklik

  #test case positif
  Scenario: verifikasi valid penukaran voucher
    Given scroll y max
    And klik tombol verifikasi
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi 2
    Then verifikator berhasil verifikasi penukaran voucher



