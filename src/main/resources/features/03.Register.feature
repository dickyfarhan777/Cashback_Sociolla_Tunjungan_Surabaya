Feature: Register Admin
  #2
  Scenario: Admin submit data without input data
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
    Scenario: Admin input soco id yang sudah terdaftar sebelumnya
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
      Scenario: Admin input nomor hp yang sudah terdaftar sebelumnya
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
        Scenario: Admin input soco id menggunakan campuran huruf dan angka
          Given Klik menu Register
          When Klik add new data
          And Input soco id menggunakan campuran huruf dan angka
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
          Scenario: Admin input Soco Id dengan menggunakan Karakter @
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
            Then Menampilkan alert ok
#8
            Scenario: Admin input soco id dengan menggunakan Karakter >
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
              Then Menampilkan soco id alert karakter < > ' kutip dua tidak diizinkan
#9
              Scenario: Admin input soco id dengan menggunakan Karakter <
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
                Then Menampilkan soco id alert karakter < > ' kutip dua tidak diizinkan
#10
                Scenario: Admin input soco id dengan menggunakan Karakter '
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
                  Then Menampilkan soco id alert karakter < > ' kutip dua tidak diizinkan
#11
                  Scenario: Admin input soco id dengan menggunakan Karakter "
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
                    Then Menampilkan soco id alert karakter < > ' kutip dua tidak diizinkan
#12
                    Scenario: Admin input nama lengkap dengan full angka
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
                      Then Menampilkan alert ok
#13
                      Scenario: Admin input nama lengkap dengan menggunakan Karakter <
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
                        Then Menampilkan customer name alert karakter < > ' kutip dua tidak diizinkan
#14
                        Scenario: Admin input nama lengkap dengan menggunakan Karakter "
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
                          Then Menampilkan customer name alert karakter < > ' kutip dua tidak diizinkan
#15
                          Scenario: Admin input nama lengkap dengan menggunakan Karakter >
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
                            Then Menampilkan customer name alert karakter < > ' kutip dua tidak diizinkan
#16
                            Scenario: Admin input nama lengkap dengan menggunakan Karakter '
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
                              Then Menampilkan customer name alert karakter < > ' kutip dua tidak diizinkan
#17
                              Scenario: Admin input nama lengkap dengan menggunakan Karakter _
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
                                Then Menampilkan alert ok
#18
                                Scenario: Admin input nama lengkap dengan menggunakan Karakter @
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
                                  Then Menampilkan alert ok
#19
                                  Scenario: Admin input nama lengkap dengan menggunakan huruf dan angka
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
                                    Then Menampilkan alert ok
#20
                                    Scenario: Admin input nama lengkap dengan menggunakan karakter !
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
                                      Then Menampilkan alert ok
#21
                                      Scenario: Admin input nama lengkap dengan menggunakan < > kutip satu kutip dua
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
                                        Then Menampilkan customer name alert karakter < > ' kutip dua tidak diizinkan
#22
                                        Scenario: Admin input nama lengkap dengan menggunakan karakter #
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
                                          Then Menampilkan alert ok
#23
                                          Scenario: Admin input nama lengkap dengan menggunakan karakter -
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
                                            Then Menampilkan alert ok
#24
                                            Scenario: Admin input rrn dengan rrn yang sudah terdaftar
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
                                              Scenario: Admin input tanggal transaksi melebihi tanggal hari ini
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
                                                Then Menampilkan alert ok
#26
                                                Scenario: Admin input soco id menggunakan full huruf
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
                                                  Then Menampilkan alert ok
#27
                                                  Scenario: Admin input no rekening bca yang sudah terdaftar sebelumnya
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
