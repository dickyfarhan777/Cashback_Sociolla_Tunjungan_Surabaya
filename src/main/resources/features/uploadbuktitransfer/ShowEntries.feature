Feature: Show Entries
#positif
Scenario: Tabel menampilkan maksimal 25 entries
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Klik tombol opsi Show Entries
  And Pilih opsi "25"
  Then Data tertampil di tabel maksimal 25 data