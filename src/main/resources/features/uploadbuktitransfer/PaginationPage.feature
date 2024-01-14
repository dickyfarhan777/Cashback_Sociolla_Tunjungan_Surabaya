Feature: Pagination page
#positif
Scenario: Melihat isi tabel di page 2
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Klik tombol nomor 2 di bagian pagination page
  Then Tabel menampilkan data dari page 2

  #positif
Scenario: Melihat isi tabel pada page sebelumnya
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Klik tombol Previous di bagian pagination page
  Then Tabel menampilkan data dari page sebelumnya

#positif
Scenario: Melihat isi tabel pada page setelahnya
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Klik tombol Next di bagian pagination page
  Then Tabel menampilkan data dari page sebelumnya