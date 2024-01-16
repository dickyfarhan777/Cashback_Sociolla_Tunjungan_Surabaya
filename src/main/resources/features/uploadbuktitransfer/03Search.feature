Feature: Search
  #positif
Scenario: Mencari nama customer
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Input nama karina pada field search
  And Klik enter
  And Tabel muncul berdasarkan hasil search
  Then Verifikator berhasil mencari data berdasarkan nama customer

  #positif
Scenario: Mencari nama verifikator
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Input nama verifikator pada field search
  And Klik enter
  And Tabel muncul berdasarkan hasil search
  Then Verifikator berhasil mencari data berdasarkan nama verifikator

  #negatif
Scenario: Mencari tanpa input apapun
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Input nama karina pada field search
  And Klik enter
  And Tabel muncul berdasarkan hasil search
  And Hapus inputan pada field search
  And Klik enter
  And Tabel berisi data semula
  Then isi tabel menampilkan seluruh isi tabel

