Feature: Form sudah Ditransfer
  #positif
Scenario: field form tidak bisa diklik
  Given Verifikator login web sociolla cashback
  When Verifikator klik menu Upload Bukti Transfer
  And Klik tombol mata di bagian kolom Aksi
  And Klik tiap field form dan gambar
  Then field form dan gambar tidak bisa diklik