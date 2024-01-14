Feature: Note
  #positif
  Scenario: Sukses menambahkan catatan
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And verifikator mengisi field box note
    And klik tombol save note
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi 2
    Then Verifikator berhasil menambahkan catatan

  #positif
  Scenario: Sukses menghapus catatan
    Given verifikator menuju ke menu verifikasi
    When pilih data customer yang ingin dihilangkan
    And klik tombol mata di bagian kolom aksi
    And verifikator menghapus field box note
    And klik tombol save note
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi 2
    Then verifikator berhasil menghapus catatan

  #Negatif
  Scenario: Menyimpan catatan kosong
    Given verifikator menuju ke menu verifikasi
    When pilih data customer
    And klik tombol mata di bagian kolom aksi
    And klik tombol save note
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi 2
    Then verifikator berhasil menyimpan catatan kosong
