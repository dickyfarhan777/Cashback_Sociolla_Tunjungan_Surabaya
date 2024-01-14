Feature: Register Admin
  #2
  Scenario:
   Given Admin akses link web cashback
   When Klik menu Register
   And Klik add new data
   And Klik submit data
   Then Menampilkan alert please fill out this field
#3
  Scenario: Admin input data register valid
    Given Klik menu Register
    When Klik add new data
    And Input Soco Id dengan benar
    And Input Nama Lengkap Nasabah Dengan Benar
    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
    And Input Nomor Rekening Bca Dengan Benar
    And Pilih Pembayaran Qris
    And Input Nominal Transaksi Dengan Benar
    And Input Tanggal Transaksi Dengan Benar
    And Pilih Nama Merchant
    And Input Rrn Dengan Benar
    And Upload Foto Bukti Transaksi 1
    And Upload Foto Bukti Transaksi 2
    And Upload Foto Bukti Transaksi 3
    And Klik submit data
    Then Menampilkan alert sukses
#4
    Scenario:
      Given Klik menu Register
      When Klik add new data
      And Input Soco Id yang sudah terdaftar sebelumnya
      And Input Nama Lengkap Nasabah Dengan Benar
      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
      And Input Nomor Rekening Bca Dengan Benar rekening random
      And Pilih Pembayaran Qris
      And Input Nominal Transaksi Dengan Benar
      And Input Tanggal Transaksi Dengan Benar
      And Pilih Nama Merchant
      And Input Rrn Dengan Benar random rrn number
      And Upload Foto Bukti Transaksi 1
      And Upload Foto Bukti Transaksi 2
      And Upload Foto Bukti Transaksi 3
      And Klik submit data
      Then Menampilkan Alert Data Sudah digunakan Hari Ini
#5
      Scenario:
        Given Klik menu Register
        When Klik add new data
        And Input Soco Id dengan benar random
        And Input Nama Lengkap Nasabah Dengan Benar
        And Input nomor hp yang sudah terdaftar di sebelumnya
        And Input Nomor Rekening Bca Dengan Benar rekening random
        And Pilih Pembayaran Qris
        And Input Nominal Transaksi Dengan Benar
        And Input Tanggal Transaksi Dengan Benar
        And Pilih Nama Merchant
        And Input Rrn Dengan Benar random rrn number
        And Upload Foto Bukti Transaksi 1
        And Upload Foto Bukti Transaksi 2
        And Upload Foto Bukti Transaksi 3
        And Klik submit data
        Then Menampilkan alert transaksi sudah ada untuk hari ini
#6
        Scenario:
          Given Klik menu Register
          When Klik add new data
          And Soco Id menggunakan campuran huruf dan angka
          And Input Nama Lengkap Nasabah Dengan Benar
          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
          And Input Nomor Rekening Bca Dengan Benar rekening random
          And Pilih Pembayaran Qris
          And Input Nominal Transaksi Dengan Benar
          And Input Tanggal Transaksi Dengan Benar
          And Pilih Nama Merchant
          And Input Rrn Dengan Benar random rrn number
          And Upload Foto Bukti Transaksi 1
          And Upload Foto Bukti Transaksi 2
          And Upload Foto Bukti Transaksi 3
          And Klik submit data
          Then Menampilkan alert Karakter huruf tidak diizinkan
#7
          Scenario:
            Given Klik menu Register
            When Klik add new data
            And Input Soco Id dengan menggunakan Karakter @
            And Input Nama Lengkap Nasabah Dengan Benar
            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
            And Input Nomor Rekening Bca Dengan Benar rekening random
            And Pilih Pembayaran Qris
            And Input Nominal Transaksi Dengan Benar
            And Input Tanggal Transaksi Dengan Benar
            And Pilih Nama Merchant
            And Input Rrn Dengan Benar random rrn number
            And Upload Foto Bukti Transaksi 1
            And Upload Foto Bukti Transaksi 2
            And Upload Foto Bukti Transaksi 3
            And Klik submit data
            Then Menampilkan alert sukses
#8
            Scenario:
              Given Klik menu Register
              When Klik add new data
              And Input Soco Id dengan menggunakan Karakter >
              And Input Nama Lengkap Nasabah Dengan Benar
              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
              And Input Nomor Rekening Bca Dengan Benar rekening random
              And Pilih Pembayaran Qris
              And Input Nominal Transaksi Dengan Benar
              And Input Tanggal Transaksi Dengan Benar
              And Pilih Nama Merchant
              And Input Rrn Dengan Benar random rrn number
              And Upload Foto Bukti Transaksi 1
              And Upload Foto Bukti Transaksi 2
              And Upload Foto Bukti Transaksi 3
              And Klik submit data
              Then Menampilkan alert sukses
#9
              Scenario:
                Given Klik menu Register
                When Klik add new data
                And Input Soco Id dengan menggunakan Karakter <
                And Input Nama Lengkap Nasabah Dengan Benar
                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                And Input Nomor Rekening Bca Dengan Benar rekening random
                And Pilih Pembayaran Qris
                And Input Nominal Transaksi Dengan Benar
                And Input Tanggal Transaksi Dengan Benar
                And Pilih Nama Merchant
                And Input Rrn Dengan Benar random rrn number
                And Upload Foto Bukti Transaksi 1
                And Upload Foto Bukti Transaksi 2
                And Upload Foto Bukti Transaksi 3
                And Klik submit data
                Then Menampilkan alert sukses
#10
                Scenario:
                  Given Klik menu Register
                  When Klik add new data
                  And Input Soco Id dengan menggunakan Karakter kutip satu
                  And Input Nama Lengkap Nasabah Dengan Benar
                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                  And Input Nomor Rekening Bca Dengan Benar rekening random
                  And Pilih Pembayaran Qris
                  And Input Nominal Transaksi Dengan Benar
                  And Input Tanggal Transaksi Dengan Benar
                  And Pilih Nama Merchant
                  And Input Rrn Dengan Benar random rrn number
                  And Upload Foto Bukti Transaksi 1
                  And Upload Foto Bukti Transaksi 2
                  And Upload Foto Bukti Transaksi 3
                  And Klik submit data
                  Then Menampilkan alert sukses
#11
                  Scenario:
                    Given Klik menu Register
                    When Klik add new data
                    And Input Soco Id dengan menggunakan Karakter kutip dua
                    And Input Nama Lengkap Nasabah Dengan Benar
                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                    And Input Nomor Rekening Bca Dengan Benar rekening random
                    And Pilih Pembayaran Qris
                    And Input Nominal Transaksi Dengan Benar
                    And Input Tanggal Transaksi Dengan Benar
                    And Pilih Nama Merchant
                    And Input Rrn Dengan Benar random rrn number
                    And Upload Foto Bukti Transaksi 1
                    And Upload Foto Bukti Transaksi 2
                    And Upload Foto Bukti Transaksi 3
                    And Klik submit data
                    Then Menampilkan alert sukses
#12
                    Scenario:
                      Given Klik menu Register
                      When Klik add new data
                      And Input Soco Id dengan benar random
                      And Input Nama Lengkap Nasabah menggunakan full angka
                      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                      And Input Nomor Rekening Bca Dengan Benar rekening random
                      And Pilih Pembayaran Qris
                      And Input Nominal Transaksi Dengan Benar
                      And Input Tanggal Transaksi Dengan Benar
                      And Pilih Nama Merchant
                      And Input Rrn Dengan Benar random rrn number
                      And Upload Foto Bukti Transaksi 1
                      And Upload Foto Bukti Transaksi 2
                      And Upload Foto Bukti Transaksi 3
                      And Klik submit data
                      Then Menampilkan alert sukses
#13
                      Scenario:
                        Given Klik menu Register
                        When Klik add new data
                        And Input Soco Id dengan benar random
                        And Input Nama Lengkap Nasabah menggunakan Karakter <
                        And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                        And Input Nomor Rekening Bca Dengan Benar rekening random
                        And Pilih Pembayaran Qris
                        And Input Nominal Transaksi Dengan Benar
                        And Input Tanggal Transaksi Dengan Benar
                        And Pilih Nama Merchant
                        And Input Rrn Dengan Benar random rrn number
                        And Upload Foto Bukti Transaksi 1
                        And Upload Foto Bukti Transaksi 2
                        And Upload Foto Bukti Transaksi 3
                        And Klik submit data
                        Then Menampilkan alert sukses
#14
                        Scenario:
                          Given Klik menu Register
                          When Klik add new data
                          And Input Soco Id dengan benar random
                          And Input Nama Lengkap Nasabah menggunakan Karakter kutip dua
                          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                          And Input Nomor Rekening Bca Dengan Benar rekening random
                          And Pilih Pembayaran Qris
                          And Input Nominal Transaksi Dengan Benar
                          And Input Tanggal Transaksi Dengan Benar
                          And Pilih Nama Merchant
                          And Input Rrn Dengan Benar random rrn number
                          And Upload Foto Bukti Transaksi 1
                          And Upload Foto Bukti Transaksi 2
                          And Upload Foto Bukti Transaksi 3
                          And Klik submit data
                          Then Menampilkan alert sukses
#15
                          Scenario:
                            Given Klik menu Register
                            When Klik add new data
                            And Input Soco Id dengan benar random
                            And Input Nama Lengkap Nasabah menggunakan Karakter >
                            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                            And Input Nomor Rekening Bca Dengan Benar rekening random
                            And Pilih Pembayaran Qris
                            And Input Nominal Transaksi Dengan Benar
                            And Input Tanggal Transaksi Dengan Benar
                            And Pilih Nama Merchant
                            And Input Rrn Dengan Benar random rrn number
                            And Upload Foto Bukti Transaksi 1
                            And Upload Foto Bukti Transaksi 2
                            And Upload Foto Bukti Transaksi 3
                            And Klik submit data
                            Then Menampilkan alert sukses
#16
                            Scenario:
                              Given Klik menu Register
                              When Klik add new data
                              And Input Soco Id dengan benar random
                              And Input Nama Lengkap Nasabah menggunakan Karakter kutip satu
                              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                              And Input Nomor Rekening Bca Dengan Benar rekening random
                              And Pilih Pembayaran Qris
                              And Input Nominal Transaksi Dengan Benar
                              And Input Tanggal Transaksi Dengan Benar
                              And Pilih Nama Merchant
                              And Input Rrn Dengan Benar random rrn number
                              And Upload Foto Bukti Transaksi 1
                              And Upload Foto Bukti Transaksi 2
                              And Upload Foto Bukti Transaksi 3
                              And Klik submit data
                              Then Menampilkan alert sukses
#17
                              Scenario:
                                Given Klik menu Register
                                When Klik add new data
                                And Input Soco Id dengan benar random
                                And Input Nama Lengkap Nasabah menggunakan Karakter dash
                                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                And Input Nomor Rekening Bca Dengan Benar rekening random
                                And Pilih Pembayaran Qris
                                And Input Nominal Transaksi Dengan Benar
                                And Input Tanggal Transaksi Dengan Benar
                                And Pilih Nama Merchant
                                And Input Rrn Dengan Benar random rrn number
                                And Upload Foto Bukti Transaksi 1
                                And Upload Foto Bukti Transaksi 2
                                And Upload Foto Bukti Transaksi 3
                                And Klik submit data
                                Then Menampilkan alert sukses
#18
                                Scenario:
                                  Given Klik menu Register
                                  When Klik add new data
                                  And Input Soco Id dengan benar random
                                  And Input Nama Lengkap Nasabah menggunakan Karakter at
                                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                  And Input Nomor Rekening Bca Dengan Benar rekening random
                                  And Pilih Pembayaran Qris
                                  And Input Nominal Transaksi Dengan Benar
                                  And Input Tanggal Transaksi Dengan Benar
                                  And Pilih Nama Merchant
                                  And Input Rrn Dengan Benar random rrn number
                                  And Upload Foto Bukti Transaksi 1
                                  And Upload Foto Bukti Transaksi 2
                                  And Upload Foto Bukti Transaksi 3
                                  And Klik submit data
                                  Then Menampilkan alert sukses
#19
                                  Scenario:
                                    Given Klik menu Register
                                    When Klik add new data
                                    And Input Soco Id dengan benar random
                                    And Input Nama Lengkap Nasabah Dengan huruf dan angka
                                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                    And Input Nomor Rekening Bca Dengan Benar rekening random
                                    And Pilih Pembayaran Qris
                                    And Input Nominal Transaksi Dengan Benar
                                    And Input Tanggal Transaksi Dengan Benar
                                    And Pilih Nama Merchant
                                    And Input Rrn Dengan Benar random rrn number
                                    And Upload Foto Bukti Transaksi 1
                                    And Upload Foto Bukti Transaksi 2
                                    And Upload Foto Bukti Transaksi 3
                                    And Klik submit data
                                    Then Menampilkan alert sukses
#20
                                    Scenario:
                                      Given Klik menu Register
                                      When Klik add new data
                                      And Input Soco Id dengan benar random
                                      And Input Nama Lengkap Nasabah Dengan menambahkan !
                                      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                      And Input Nomor Rekening Bca Dengan Benar rekening random
                                      And Pilih Pembayaran Qris
                                      And Input Nominal Transaksi Dengan Benar
                                      And Input Tanggal Transaksi Dengan Benar
                                      And Pilih Nama Merchant
                                      And Input Rrn Dengan Benar random rrn number
                                      And Upload Foto Bukti Transaksi 1
                                      And Upload Foto Bukti Transaksi 2
                                      And Upload Foto Bukti Transaksi 3
                                      And Klik submit data
                                      Then Menampilkan alert sukses
#21
                                      Scenario:
                                        Given Klik menu Register
                                        When Klik add new data
                                        And Input Soco Id dengan benar random
                                        And Input Nama Lengkap Nasabah menambahkan < > kutip satu kutip dua
                                        And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                        And Input Nomor Rekening Bca Dengan Benar rekening random
                                        And Pilih Pembayaran Qris
                                        And Input Nominal Transaksi Dengan Benar
                                        And Input Tanggal Transaksi Dengan Benar
                                        And Pilih Nama Merchant
                                        And Input Rrn Dengan Benar random rrn number
                                        And Upload Foto Bukti Transaksi 1
                                        And Upload Foto Bukti Transaksi 2
                                        And Upload Foto Bukti Transaksi 3
                                        And Klik submit data
                                        Then Menampilkan alert sukses
#22
                                        Scenario:
                                          Given Klik menu Register
                                          When Klik add new data
                                          And Input Soco Id dengan benar random
                                          And Input Nama Lengkap Nasabah karakter #
                                          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                          And Input Nomor Rekening Bca Dengan Benar rekening random
                                          And Pilih Pembayaran Qris
                                          And Input Nominal Transaksi Dengan Benar
                                          And Input Tanggal Transaksi Dengan Benar
                                          And Pilih Nama Merchant
                                          And Input Rrn Dengan Benar random rrn number
                                          And Upload Foto Bukti Transaksi 1
                                          And Upload Foto Bukti Transaksi 2
                                          And Upload Foto Bukti Transaksi 3
                                          And Klik submit data
                                          Then Menampilkan alert sukses
#23
                                          Scenario:
                                            Given Klik menu Register
                                            When Klik add new data
                                            And Input Soco Id dengan benar random
                                            And Input Nama Lengkap Nasabah Dengan karakter -
                                            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                            And Input Nomor Rekening Bca Dengan Benar rekening random
                                            And Pilih Pembayaran Qris
                                            And Input Nominal Transaksi Dengan Benar
                                            And Input Tanggal Transaksi Dengan Benar
                                            And Pilih Nama Merchant
                                            And Input Rrn Dengan Benar random rrn number
                                            And Upload Foto Bukti Transaksi 1
                                            And Upload Foto Bukti Transaksi 2
                                            And Upload Foto Bukti Transaksi 3
                                            And Klik submit data
                                            Then Menampilkan alert sukses
#24
                                            Scenario:
                                              Given Klik menu Register
                                              When Klik add new data
                                              And Input Soco Id dengan benar random
                                              And Input Nama Lengkap Nasabah Dengan Benar
                                              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                              And Input Nomor Rekening Bca Dengan Benar rekening random
                                              And Pilih Pembayaran Qris
                                              And Input Nominal Transaksi Dengan Benar
                                              And Input Tanggal Transaksi Dengan Benar
                                              And Pilih Nama Merchant
                                              And Input Rrn dengan RRN yang sudah terdaftar
                                              And Upload Foto Bukti Transaksi 1
                                              And Upload Foto Bukti Transaksi 2
                                              And Upload Foto Bukti Transaksi 3
                                              And Klik submit data
                                              Then Menampilkan alert RRN sudah ada
#25
                                              Scenario:
                                                Given Klik menu Register
                                                When Klik add new data
                                                And Input Soco Id dengan benar random
                                                And Input Nama Lengkap Nasabah Dengan Benar
                                                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                                And Input Nomor Rekening Bca Dengan Benar rekening random
                                                And Pilih Pembayaran Qris
                                                And Input Nominal Transaksi Dengan Benar
                                                And Input tanggal transaksi melebihi tanggal hari ini
                                                And Pilih Nama Merchant
                                                And Input Rrn Dengan Benar random rrn number
                                                And Upload Foto Bukti Transaksi 1
                                                And Upload Foto Bukti Transaksi 2
                                                And Upload Foto Bukti Transaksi 3
                                                And Klik submit data
                                                Then Menampilkan alert "Tanggal melebihi hari ini"
#26
                                                Scenario:
                                                  Given Klik menu Register
                                                  When Klik add new data
                                                  And Input Soco ID menggunakan full huruf
                                                  And Input Nama Lengkap Nasabah Dengan Benar
                                                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                                  And Input Nomor Rekening Bca Dengan Benar rekening random
                                                  And Pilih Pembayaran Qris
                                                  And Input Nominal Transaksi Dengan Benar
                                                  And Input Tanggal Transaksi Dengan Benar
                                                  And Pilih Nama Merchant
                                                  And Input Rrn Dengan Benar random rrn number
                                                  And Upload Foto Bukti Transaksi 1
                                                  And Upload Foto Bukti Transaksi 2
                                                  And Upload Foto Bukti Transaksi 3
                                                  And Klik submit data
                                                  Then Menampilkan alert sukses
#27
                                                  Scenario:
                                                    Given Klik menu Register
                                                    When Klik add new data
                                                    And Input Soco Id dengan benar random
                                                    And Input Nama Lengkap Nasabah Dengan Benar
                                                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random
                                                    And Input nomor rekening bca yang sudah terdaftar sebelumnya
                                                    And Pilih Pembayaran Qris
                                                    And Input Nominal Transaksi Dengan Benar
                                                    And Input Tanggal Transaksi Dengan Benar
                                                    And Pilih Nama Merchant
                                                    And Input Rrn Dengan Benar random rrn number
                                                    And Upload Foto Bukti Transaksi 1
                                                    And Upload Foto Bukti Transaksi 2
                                                    And Upload Foto Bukti Transaksi 3
                                                    And Klik submit data
                                                    Then Menampilkan alert sukses

                                                    Scenario:
                                                      Given Klik menu Register
                                                      When Klik add new data
                                                      And Input Soco Id dengan benar
                                                      And Input Nama Lengkap Nasabah Dengan Benar
                                                      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                      And Input Nomor Rekening Bca Dengan Benar
                                                      And Pilih Pembayaran Qris
                                                      And Input Nominal Transaksi Dengan Benar
                                                      And Input Tanggal Transaksi Dengan Benar
                                                      And Pilih Nama Merchant
                                                      And Input Rrn Dengan Benar
                                                      And Upload Foto Bukti Transaksi 1
                                                      And Upload Foto Bukti Transaksi 2
                                                      And Upload Foto Bukti Transaksi 3
                                                      And Klik submit data
                                                      Then Menampilkan alert sukses

                                                      Scenario:
                                                        Given Klik menu Register
                                                        When Klik add new data
                                                        And Input Soco Id dengan benar
                                                        And Input Nama Lengkap Nasabah Dengan Benar
                                                        And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                        And Input Nomor Rekening Bca Dengan Benar
                                                        And Pilih Pembayaran Qris
                                                        And Input Nominal Transaksi Dengan Benar
                                                        And Input Tanggal Transaksi Dengan Benar
                                                        And Pilih Nama Merchant
                                                        And Input Rrn Dengan Benar
                                                        And Upload Foto Bukti Transaksi 1
                                                        And Upload Foto Bukti Transaksi 2
                                                        And Upload Foto Bukti Transaksi 3
                                                        And Klik submit data
                                                        Then Menampilkan alert sukses

                                                        Scenario:
                                                          Given Klik menu Register
                                                          When Klik add new data
                                                          And Input Soco Id dengan benar
                                                          And Input Nama Lengkap Nasabah Dengan Benar
                                                          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                          And Input Nomor Rekening Bca Dengan Benar
                                                          And Pilih Pembayaran Qris
                                                          And Input Nominal Transaksi Dengan Benar
                                                          And Input Tanggal Transaksi Dengan Benar
                                                          And Pilih Nama Merchant
                                                          And Input Rrn Dengan Benar
                                                          And Upload Foto Bukti Transaksi 1
                                                          And Upload Foto Bukti Transaksi 2
                                                          And Upload Foto Bukti Transaksi 3
                                                          And Klik submit data
                                                          Then Menampilkan alert sukses

                                                          Scenario:
                                                            Given Klik menu Register
                                                            When Klik add new data
                                                            And Input Soco Id dengan benar
                                                            And Input Nama Lengkap Nasabah Dengan Benar
                                                            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                            And Input Nomor Rekening Bca Dengan Benar
                                                            And Pilih Pembayaran Qris
                                                            And Input Nominal Transaksi Dengan Benar
                                                            And Input Tanggal Transaksi Dengan Benar
                                                            And Pilih Nama Merchant
                                                            And Input Rrn Dengan Benar
                                                            And Upload Foto Bukti Transaksi 1
                                                            And Upload Foto Bukti Transaksi 2
                                                            And Upload Foto Bukti Transaksi 3
                                                            And Klik submit data
                                                            Then Menampilkan alert sukses

                                                            Scenario:
                                                              Given Klik menu Register
                                                              When Klik add new data
                                                              And Input Soco Id dengan benar
                                                              And Input Nama Lengkap Nasabah Dengan Benar
                                                              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                              And Input Nomor Rekening Bca Dengan Benar
                                                              And Pilih Pembayaran Qris
                                                              And Input Nominal Transaksi Dengan Benar
                                                              And Input Tanggal Transaksi Dengan Benar
                                                              And Pilih Nama Merchant
                                                              And Input Rrn Dengan Benar
                                                              And Upload Foto Bukti Transaksi 1
                                                              And Upload Foto Bukti Transaksi 2
                                                              And Upload Foto Bukti Transaksi 3
                                                              And Klik submit data
                                                              Then Menampilkan alert sukses

                                                              Scenario:
                                                                Given Klik menu Register
                                                                When Klik add new data
                                                                And Input Soco Id dengan benar
                                                                And Input Nama Lengkap Nasabah Dengan Benar
                                                                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                                And Input Nomor Rekening Bca Dengan Benar
                                                                And Pilih Pembayaran Qris
                                                                And Input Nominal Transaksi Dengan Benar
                                                                And Input Tanggal Transaksi Dengan Benar
                                                                And Pilih Nama Merchant
                                                                And Input Rrn Dengan Benar
                                                                And Upload Foto Bukti Transaksi 1
                                                                And Upload Foto Bukti Transaksi 2
                                                                And Upload Foto Bukti Transaksi 3
                                                                And Klik submit data
                                                                Then Menampilkan alert sukses

                                                                Scenario:
                                                                  Given Klik menu Register
                                                                  When Klik add new data
                                                                  And Input Soco Id dengan benar
                                                                  And Input Nama Lengkap Nasabah Dengan Benar
                                                                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                                  And Input Nomor Rekening Bca Dengan Benar
                                                                  And Pilih Pembayaran Qris
                                                                  And Input Nominal Transaksi Dengan Benar
                                                                  And Input Tanggal Transaksi Dengan Benar
                                                                  And Pilih Nama Merchant
                                                                  And Input Rrn Dengan Benar
                                                                  And Upload Foto Bukti Transaksi 1
                                                                  And Upload Foto Bukti Transaksi 2
                                                                  And Upload Foto Bukti Transaksi 3
                                                                  And Klik submit data
                                                                  Then Menampilkan alert sukses

                                                                  Scenario:
                                                                    Given Klik menu Register
                                                                    When Klik add new data
                                                                    And Input Soco Id dengan benar
                                                                    And Input Nama Lengkap Nasabah Dengan Benar
                                                                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                                    And Input Nomor Rekening Bca Dengan Benar
                                                                    And Pilih Pembayaran Qris
                                                                    And Input Nominal Transaksi Dengan Benar
                                                                    And Input Tanggal Transaksi Dengan Benar
                                                                    And Pilih Nama Merchant
                                                                    And Input Rrn Dengan Benar
                                                                    And Upload Foto Bukti Transaksi 1
                                                                    And Upload Foto Bukti Transaksi 2
                                                                    And Upload Foto Bukti Transaksi 3
                                                                    And Klik submit data
                                                                    Then Menampilkan alert sukses

                                                                    Scenario:
                                                                      Given Klik menu Register
                                                                      When Klik add new data
                                                                      And Input Soco Id dengan benar
                                                                      And Input Nama Lengkap Nasabah Dengan Benar
                                                                      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                                      And Input Nomor Rekening Bca Dengan Benar
                                                                      And Pilih Pembayaran Qris
                                                                      And Input Nominal Transaksi Dengan Benar
                                                                      And Input Tanggal Transaksi Dengan Benar
                                                                      And Pilih Nama Merchant
                                                                      And Input Rrn Dengan Benar
                                                                      And Upload Foto Bukti Transaksi 1
                                                                      And Upload Foto Bukti Transaksi 2
                                                                      And Upload Foto Bukti Transaksi 3
                                                                      And Klik submit data
                                                                      Then Menampilkan alert sukses

                                                                      Scenario:
                                                                        Given Klik menu Register
                                                                        When Klik add new data
                                                                        And Input Soco Id dengan benar
                                                                        And Input Nama Lengkap Nasabah Dengan Benar
                                                                        And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar
                                                                        And Input Nomor Rekening Bca Dengan Benar
                                                                        And Pilih Pembayaran Qris
                                                                        And Input Nominal Transaksi Dengan Benar
                                                                        And Input Tanggal Transaksi Dengan Benar
                                                                        And Pilih Nama Merchant
                                                                        And Input Rrn Dengan Benar
                                                                        And Upload Foto Bukti Transaksi 1
                                                                        And Upload Foto Bukti Transaksi 2
                                                                        And Upload Foto Bukti Transaksi 3
                                                                        And Klik submit data
                                                                        Then Menampilkan alert sukses
