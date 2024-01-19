Feature: Pagination Page
  #positif
  Scenario: melihat isi tabel di page 3
    Given verifikator menuju ke menu verifikasi
    When scroll bawah max
    And klik tombol nomor 3 di bagian pagination page
    And tabel menampilkan data dari page 3
    Then verifikator dapat melihat isi tabel yang sesuai di page 3

  #positif
  Scenario: Melihat isi tabel pada page sebelumnya
    Given klik tombol Previous di bagian pagination page
    When tabel menampilkan data dari page sebelumnya
    Then verifikator dapat melihat isi tabel yang sesuai dengan page sebelumnya

  #positif
  Scenario: Melihat isi tabel pada page selanjutnya
    Given klik tombol Next di bagian pagination page
    When tabel menampilkan data dari page selanjutnya
    Then verifikator dapat melihat isi tabel yang sesuai dengan page selanjutnya