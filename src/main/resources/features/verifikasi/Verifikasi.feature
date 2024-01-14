Feature Verifikasi

  #test case positif
  Scenario: verifikasi valid penukaran voucher
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol Verifikasi
    And Klik Ok pada popup konfirmasi 1
    And Klik Ok pada popup konfirmasi 2
    Then Verifikator berhasil verifikasi penukaran voucher

  #negatif
  Scenario: field form tidak bisa diklik
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tiap field form
    Then field form tidak bisa diklik/disabled success

