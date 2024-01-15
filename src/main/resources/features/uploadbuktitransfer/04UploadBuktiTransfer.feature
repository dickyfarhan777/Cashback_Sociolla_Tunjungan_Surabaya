Feature: Upload bukti transfer
#positif
Scenario: meng-upload file berformat png
Given Verifikator menuju ke menu Upload Bukti Transfer
When Klik tombol mata di kolom aksi
And Klik 'Choose File'
And Klik tombol 'Upload Bukti File'
And Muncul popup "Bukti Transfer Berhasil diupload"
Then Verifikator berhasil upload bukti transfer berformat png

  #negatif
Scenario: tidak meng-upload file
Given Verifikator menuju ke menu Upload Bukti Transfer
When Klik tombol mata di kolom aksi
And Klik tombol 'Upload Bukti File'
And Muncul warning error "You did not select a file to upload."
Then Verifikator tidak berhasil meng-upload bukti transfer kosong

  #positif
Scenario: meng-upload file berformat jpg
Given Verifikator menuju ke menu Upload Bukti Transfer
When Klik tombol mata di kolom aksi
And Klik 'Choose File'
And Klik tombol 'Upload Bukti File'
And Muncul popup "Bukti Transfer Berhasil diupload"
Then Verifikator berhasil upload bukti transfer berformat jpg

  #positif
Scenario: meng-upload file berformat pdf
Given Verifikator menuju ke menu Upload Bukti Transfer
When Klik tombol mata di kolom aksi
And Klik 'Choose File'
And Klik tombol 'Upload Bukti File'
And Muncul popup "Bukti Transfer Berhasil diupload"
Then Verifikator berhasil upload bukti transfer berformat pdf