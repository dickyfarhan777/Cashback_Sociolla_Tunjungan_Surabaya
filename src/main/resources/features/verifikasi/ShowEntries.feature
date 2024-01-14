Feature: Show entries
  #positif
  Scenario: Tabel menampilkan maksimal 25 entries
    Given Verifikator menuju ke menu Verifikasi
    When Klik tombol opsi Show Entries
    And Pilih opsi "25"
    Then Data tertampil di tabel maksimal 25 data
