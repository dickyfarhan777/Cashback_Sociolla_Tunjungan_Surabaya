Feature: Show entries
  #positif
  Scenario: Tabel menampilkan maksimal 25 entries
    Given verifikator menuju ke menu verifikasi
    When klik tombol opsi Show Entries
    And pilih opsi 25
    And scroll y max
    Then data tertampil di tabel maksimal 25 data
