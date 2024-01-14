Feature: Pagination Page
  #positif
Scenario: field form tidak bisa diklik
  Given Verifikator menuju ke menu Upload Bukti Transfer
  When Pilih data customer
  And Klik tombol mata di bagian kolom Aksi
  And Klik tiap field form dan gambar
  Then field form dan gambar tidak bisa diklik(disabled success)