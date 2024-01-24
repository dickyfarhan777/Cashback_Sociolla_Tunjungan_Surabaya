Feature: Note
  #positif
  Scenario: Sukses menambahkan catatan
    Given verifikator mengisi field box note
    When klik tombol save note
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi note
    Then Verifikator berhasil menambahkan catatan

  #positif
  Scenario: Sukses menghapus catatan
    Given verifikator menghapus field box note
    When klik tombol save note
    And klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi note
    Then verifikator berhasil menghapus catatan

  #Negatif
  Scenario: Menyimpan catatan kosong
    Given klik tombol save note
    When klik ok pada popup konfirmasi 1
    And klik ok pada popup konfirmasi note
    Then verifikator berhasil menyimpan catatan kosong
