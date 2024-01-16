Feature: Modul Finance
  Scenario:Menampilkan data yang sudah di Verifikasi
    Given User akses web cashback sociolla
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    Then Tampilan list data yang sudah di verifikasi

  Scenario:Menampilkan 25 Data Customer menggunakan pilihan field Show Entries
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Tampilan list data yang sudah di verifikasi
    And Klik table control show entries
    And Pilih 25 list yang akan ditampilkan
    Then Menampilkan 25 Data Customer

  Scenario: Memastikan User (Finance) kembali ke menu dashboard saat berada di menu Finance
    When Tampilan halaman List Data Verifikasi
    And Klik field Dashboard pada pojok kanan atas
    Then Tampilan kembali ke menu Dashboard

  Scenario: User (Finance) ingin menampilkan data nama customer yang sudah melakukan transaksi
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Tampilan halaman List Data Verifikasi
    And Klik icon action edit pada salah satu data customer
    And User Finance pindah ke halaman tab baru Edit Data
    Then Tampilan halaman Edit Data menampilkan Form Input Data Cashback

  Scenario: Menampilkan List Data Verifikasi page selanjutnya
     When Tampilan halaman List Data verifikasi
     And Scroll down
     And Klik table control Next
     Then Menampilkan List Data Verifikasi di halaman selanjutnya

  Scenario: Menampilkan List Data Verifikasi page sebelumnya
     When Tampilan halaman List Data verifikasi
     And Scroll down
     And Klik table control Next
     And Klik table control Previous
     Then Menampilkan List Data Verifikasi di halaman sebelumnya

  Scenario: Menampilkan List Data Verifikasi halaman 3
    When Tampilan halaman List Data verifikasi
    And Scroll down
    And Klik table control page 3
    Then Menampilkan List Data Verifikasi di halaman 3

  Scenario: Mencari Nama Customer - First Name
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Tampilan halaman List Data Verifikasi
    And Input first name pada kolom field Search
    And Tekan enter
    Then Menampilkan Data Customer sesuai dengan first name yang di input

  Scenario: Search for Customer Name - Last Name
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Tampilan halaman List Data Verifikasi
    And Input last name pada kolom field Search
    And Tekan enter
    Then Menampilkan Data Customer sesuai dengan last name yang di input

  Scenario: Mencari RRN Customer
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Tampilan halaman List Data Verifikasi
    And Input RRN pada kolom field Search
    And Tekan enter
    Then Menampilkan Data Customer sesuai dengan RRN yang di input

  Scenario: Mencari Ref ID Customer
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Tampilan halaman List Data Verifikasi
    And Input Ref ID pada kolom field Search
    And Tekan enter
    Then Menampilkan Data Customer sesuai dengan Ref ID yang di input

  Scenario: User (Finance) mengembalikan data customer ke Verifikator
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Check list Data Customer pada check box yang ingin di Verifikasi ulang
    And Scroll down
    And Klik button Kembalikan ke Verifikator
    And Tampil pop up confirmation Apakah anda yakin
    And Klik button Save
    Then Menampilkan message Sukses Berhasil diupdate

  Scenario: Update ke Verifikator cashback sudah di transfer
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Check list Data Customer pada check box yang akan di update
    And Scroll down
    And Klik Update Sudah Transfer
    And Tampil pop up confirmation Apakah anda yakin
    And Klik button Save
    Then Menampilkan message Sukses Berhasil diupdate

  Scenario: Check List semua Data Customer
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Klik field Check Box bagian atas
    Then Semua Data Customer pada page yang diakses ter Check List

  Scenario: Update tanpa check list Data
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Scroll down
    And Klik button Update Sudah Transfer
    And Tampil pop up confirmation Apakah anda yakin
    And Klik button Save
    Then Menampilkan message Silahkan Ceklis Data

  Scenario: Verifikasi ulang tanpa check list Data
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Scroll down
    And Klik button Kembalikan ke Verifikator
    And Tampil pop up confirmation Apakah anda yakin
    And Klik button Save
    Then Menampilkan message Silahkan Ceklis Data

  Scenario: User (Finance) melakukan verifikasi ulang untuk 10 Data Customer
    When User Finance telah berhasil login web cashback
    And Klik button menu Finance
    And Check list 10 Data Customer pada check box yang akan di update
    And Scroll down
    And Klik button Kembalikan ke Verifikator
    And Tampil pop up confirmation Apakah anda yakin
    And Klik button Save
    Then Menampilkan message Sukses Berhasil diupdate

  Scenario: Hide Sidebar
    When User Finance telah berhasil login web cashback
    And Klik button list pada pojok kiri atas
    Then Sidebar tersembunyi







