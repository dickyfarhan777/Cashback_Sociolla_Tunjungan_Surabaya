Feature: Verifikasi
  #test case positif
  Scenario: verifikasi valid penukaran voucher
    Given klik menu verifikasi
    And klik tombol mata di bagian kolom aksi
    And klik tombol verifikasi
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi 2
    Then verifikator berhasil verifikasi penukaran voucher

  #negatif
  Scenario: field form tidak bisa diklik
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tiap field form
    Then field form tidak bisa diklik

