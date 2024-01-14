Feature: Pagination Page
  #positif
  Scenario: melihat isi tabel di page 3
    Given Verifikator menuju ke menu Verifikasi
    When Klik tombol nomor 3 di bagian pagination page
    And Tabel menampilkan data dari page 3
    Then Verifikator dapat melihat isi tabel yang sesuai di page 3

  #positif
  Scenario: Melihat isi tabel pada page sebelumnya
    Given Verifikator menuju ke menu Verifikasi
    When Klik tombol Previous di bagian pagination page
    And Tabel menampilkan data dari page sebelumnya
    Then Verifikator dapat melihat isi tabel yang sesuai dengan page sebelumnya

  #positif
  Scenario: Melihat isi tabel pada page selanjutnya
    Given Verifikator menuju ke menu Verifikasi
    When Klik tombol Next di bagian pagination page
    And Tabel menampilkan data dari page selanjutnya
    Then Verifikator dapat melihat isi tabel yang sesuai dengan page selanjutnya