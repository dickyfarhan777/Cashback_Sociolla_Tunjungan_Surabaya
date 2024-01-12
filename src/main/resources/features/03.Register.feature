Feature: Register
  Scenario: Admin input data register valid
    Given Klik menu Register
    When Klik add new data
    And Input Soco Id dengan benar
    And Input Nama Lengkap Nasabah Dengan Benar
    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
    And Input Nomor Rekening Bca Dengan Benar
    And Pilih Pembayaran Qris
    And Input Nominal Transaksi Dengan Benar
    And Input Tanggal Transaksi Dengan Benar
    And Pilih Nama Merchant
    And Input Rrn Dengan Benar
    And Upload Foto Bukti Transaksi 1
    And Upload Foto Bukti Transaksi 2
    And Upload Foto Bukti Transaksi 3
    And Klik submit data
    Then Menampilkan alert sukses