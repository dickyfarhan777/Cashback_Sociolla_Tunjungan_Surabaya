Feature: Note
  #positif
  Scenario: Sukses menambahkan catatan
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Verifikator mengisi field box note
    And Klik tombol Save Note
    And Klik Ok pada popup konfirmasi 1
    And Klik Ok pada popup konfirmasi 2
    Then Verifikator berhasil menambahkan catatan

  #positif
  Scenario: Sukses menghapus catatan
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Verifikator menghapus field box note
    And Klik tombol Save Note
    And Klik Ok pada popup konfirmasi 1
    And Klik Ok pada popup konfirmasi 2
    Then Verifikator berhasil menghapus catatan

  #Negatif
  Scenario: Menyimpan catatan kosong
    Given Verifikator menuju ke menu Verifikasi
    When Pilih data customer
    And Klik tombol mata di bagian kolom Aksi
    And Klik tombol Save Note
    And Klik Ok pada popup konfirmasi 1
    And Klik Ok pada popup konfirmasi 2
    Then Verifikator berhasil menyimpan catatan kosong
