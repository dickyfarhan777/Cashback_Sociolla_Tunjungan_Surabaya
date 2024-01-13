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
      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar1
      And Input Nomor Rekening Bca Dengan Benar1
      And Pilih Pembayaran Qris
      And Input Nominal Transaksi Dengan Benar
      And Input Tanggal Transaksi Dengan Benar
      And Pilih Nama Merchant
      And Input Rrn Dengan Benar1
      And Upload Foto Bukti Transaksi 1
      And Upload Foto Bukti Transaksi 2
      And Upload Foto Bukti Transaksi 3
      And Klik submit data
      Then Menampilkan alert sukses
#5
      Scenario:
        Given Klik menu Register
        When Klik add new data
        And Input Soco Id dengan benar1
        And Input Nama Lengkap Nasabah Dengan Benar
        And Input nomor hp yang sudah terdaftar di sebelumnya
        And Input Nomor Rekening Bca Dengan Benar2
        And Pilih Pembayaran Qris
        And Input Nominal Transaksi Dengan Benar
        And Input Tanggal Transaksi Dengan Benar
        And Pilih Nama Merchant
        And Input Rrn Dengan Benar2
        And Upload Foto Bukti Transaksi 1
        And Upload Foto Bukti Transaksi 2
        And Upload Foto Bukti Transaksi 3
        And Klik submit data
        Then Menampilkan alert sukses
#6
        Scenario:
          Given Klik menu Register
          When Klik add new data
          And Soco Id menggunakan campuran huruf dan angka
          And Input Nama Lengkap Nasabah Dengan Benar
          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar2
          And Input Nomor Rekening Bca Dengan Benar3
          And Pilih Pembayaran Qris
          And Input Nominal Transaksi Dengan Benar
          And Input Tanggal Transaksi Dengan Benar
          And Pilih Nama Merchant
          And Input Rrn Dengan Benar3
          And Upload Foto Bukti Transaksi 1
          And Upload Foto Bukti Transaksi 2
          And Upload Foto Bukti Transaksi 3
          And Klik submit data
          Then Menampilkan alert sukses
#7
          Scenario:
            Given Klik menu Register
            When Klik add new data
            And Input Soco Id dengan menggunakan Karakter @
            And Input Nama Lengkap Nasabah Dengan Benar
            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar3
            And Input Nomor Rekening Bca Dengan Benar4
            And Pilih Pembayaran Qris
            And Input Nominal Transaksi Dengan Benar
            And Input Tanggal Transaksi Dengan Benar
            And Pilih Nama Merchant
            And Input Rrn Dengan Benar4
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
              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar4
              And Input Nomor Rekening Bca Dengan Benar5
              And Pilih Pembayaran Qris
              And Input Nominal Transaksi Dengan Benar
              And Input Tanggal Transaksi Dengan Benar
              And Pilih Nama Merchant
              And Input Rrn Dengan Benar5
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
                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar5
                And Input Nomor Rekening Bca Dengan Benar6
                And Pilih Pembayaran Qris
                And Input Nominal Transaksi Dengan Benar
                And Input Tanggal Transaksi Dengan Benar
                And Pilih Nama Merchant
                And Input Rrn Dengan Benar6
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
                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar6
                  And Input Nomor Rekening Bca Dengan Benar7
                  And Pilih Pembayaran Qris
                  And Input Nominal Transaksi Dengan Benar
                  And Input Tanggal Transaksi Dengan Benar
                  And Pilih Nama Merchant
                  And Input Rrn Dengan Benar7
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
                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar7
                    And Input Nomor Rekening Bca Dengan Benar9
                    And Pilih Pembayaran Qris
                    And Input Nominal Transaksi Dengan Benar
                    And Input Tanggal Transaksi Dengan Benar
                    And Pilih Nama Merchant
                    And Input Rrn Dengan Benar9
                    And Upload Foto Bukti Transaksi 1
                    And Upload Foto Bukti Transaksi 2
                    And Upload Foto Bukti Transaksi 3
                    And Klik submit data
                    Then Menampilkan alert sukses
#12
                    Scenario:
                      Given Klik menu Register
                      When Klik add new data
                      And Input Soco Id dengan benar2
                      And Input Nama Lengkap Nasabah menggunakan full angka
                      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar8
                      And Input Nomor Rekening Bca Dengan Benar10
                      And Pilih Pembayaran Qris
                      And Input Nominal Transaksi Dengan Benar
                      And Input Tanggal Transaksi Dengan Benar
                      And Pilih Nama Merchant
                      And Input Rrn Dengan Benar10
                      And Upload Foto Bukti Transaksi 1
                      And Upload Foto Bukti Transaksi 2
                      And Upload Foto Bukti Transaksi 3
                      And Klik submit data
                      Then Menampilkan alert sukses
#13
                      Scenario:
                        Given Klik menu Register
                        When Klik add new data
                        And Input Soco Id dengan benar3
                        And Input Nama Lengkap Nasabah menggunakan Karakter <
                        And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar9
                        And Input Nomor Rekening Bca Dengan Benar11
                        And Pilih Pembayaran Qris
                        And Input Nominal Transaksi Dengan Benar
                        And Input Tanggal Transaksi Dengan Benar
                        And Pilih Nama Merchant
                        And Input Rrn Dengan Benar11
                        And Upload Foto Bukti Transaksi 1
                        And Upload Foto Bukti Transaksi 2
                        And Upload Foto Bukti Transaksi 3
                        And Klik submit data
                        Then Menampilkan alert sukses
#14
                        Scenario:
                          Given Klik menu Register
                          When Klik add new data
                          And Input Soco Id dengan benar3
                          And Input Nama Lengkap Nasabah menggunakan Karakter kutip dua
                          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar10
                          And Input Nomor Rekening Bca Dengan Benar12
                          And Pilih Pembayaran Qris
                          And Input Nominal Transaksi Dengan Benar
                          And Input Tanggal Transaksi Dengan Benar
                          And Pilih Nama Merchant
                          And Input Rrn Dengan Benar12
                          And Upload Foto Bukti Transaksi 1
                          And Upload Foto Bukti Transaksi 2
                          And Upload Foto Bukti Transaksi 3
                          And Klik submit data
                          Then Menampilkan alert sukses
#15
                          Scenario:
                            Given Klik menu Register
                            When Klik add new data
                            And Input Soco Id dengan benar4
                            And Input Nama Lengkap Nasabah Dengan menggunakan Karakter >
                            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar11
                            And Input Nomor Rekening Bca Dengan Benar13
                            And Pilih Pembayaran Qris
                            And Input Nominal Transaksi Dengan Benar
                            And Input Tanggal Transaksi Dengan Benar
                            And Pilih Nama Merchant
                            And Input Rrn Dengan Benar13
                            And Upload Foto Bukti Transaksi 1
                            And Upload Foto Bukti Transaksi 2
                            And Upload Foto Bukti Transaksi 3
                            And Klik submit data
                            Then Menampilkan alert sukses
#16
                            Scenario:
                              Given Klik menu Register
                              When Klik add new data
                              And Input Soco Id dengan benar5
                              And Input Nama Lengkap Nasabah Dengan menggunakan Karakter kutip satu
                              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar12
                              And Input Nomor Rekening Bca Dengan Benar14
                              And Pilih Pembayaran Qris
                              And Input Nominal Transaksi Dengan Benar
                              And Input Tanggal Transaksi Dengan Benar
                              And Pilih Nama Merchant
                              And Input Rrn Dengan Benar14
                              And Upload Foto Bukti Transaksi 1
                              And Upload Foto Bukti Transaksi 2
                              And Upload Foto Bukti Transaksi 3
                              And Klik submit data
                              Then Menampilkan alert sukses
#17
                              Scenario:
                                Given Klik menu Register
                                When Klik add new data
                                And Input Soco Id dengan benar6
                                And Input Nama Lengkap Nasabah menggunakan Karakter dash
                                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar13
                                And Input Nomor Rekening Bca Dengan Benar15
                                And Pilih Pembayaran Qris
                                And Input Nominal Transaksi Dengan Benar
                                And Input Tanggal Transaksi Dengan Benar
                                And Pilih Nama Merchant
                                And Input Rrn Dengan Benar15
                                And Upload Foto Bukti Transaksi 1
                                And Upload Foto Bukti Transaksi 2
                                And Upload Foto Bukti Transaksi 3
                                And Klik submit data
                                Then Menampilkan alert sukses
#18
                                Scenario:
                                  Given Klik menu Register
                                  When Klik add new data
                                  And Input Soco Id dengan benar7
                                  And Input Nama Lengkap Nasabah menggunakan Karakter at
                                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar14
                                  And Input Nomor Rekening Bca Dengan Benar16
                                  And Pilih Pembayaran Qris
                                  And Input Nominal Transaksi Dengan Benar
                                  And Input Tanggal Transaksi Dengan Benar
                                  And Pilih Nama Merchant
                                  And Input Rrn Dengan Benar16
                                  And Upload Foto Bukti Transaksi 1
                                  And Upload Foto Bukti Transaksi 2
                                  And Upload Foto Bukti Transaksi 3
                                  And Klik submit data
                                  Then Menampilkan alert sukses
#19
                                  Scenario:
                                    Given Klik menu Register
                                    When Klik add new data
                                    And Input Soco Id dengan benar8
                                    And Input Nama Lengkap Nasabah Dengan huruf dan angka
                                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar 15
                                    And Input Nomor Rekening Bca Dengan Benar17
                                    And Pilih Pembayaran Qris
                                    And Input Nominal Transaksi Dengan Benar
                                    And Input Tanggal Transaksi Dengan Benar
                                    And Pilih Nama Merchant
                                    And Input Rrn Dengan Benar17
                                    And Upload Foto Bukti Transaksi 1
                                    And Upload Foto Bukti Transaksi 2
                                    And Upload Foto Bukti Transaksi 3
                                    And Klik submit data
                                    Then Menampilkan alert sukses
#20
                                    Scenario:
                                      Given Klik menu Register
                                      When Klik add new data
                                      And Input Soco Id dengan benar9
                                      And Input Nama Lengkap Nasabah Dengan menambahkan !
                                      And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar16
                                      And Input Nomor Rekening Bca Dengan Benar18
                                      And Pilih Pembayaran Qris
                                      And Input Nominal Transaksi Dengan Benar
                                      And Input Tanggal Transaksi Dengan Benar
                                      And Pilih Nama Merchant
                                      And Input Rrn Dengan Benar18
                                      And Upload Foto Bukti Transaksi 1
                                      And Upload Foto Bukti Transaksi 2
                                      And Upload Foto Bukti Transaksi 3
                                      And Klik submit data
                                      Then Menampilkan alert sukses
#21
                                      Scenario:
                                        Given Klik menu Register
                                        When Klik add new data
                                        And Input Soco Id dengan benar10
                                        And Input Nama Lengkap Nasabah menambahkan < > kutip satu kutip dua
                                        And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar17
                                        And Input Nomor Rekening Bca Dengan Benar19
                                        And Pilih Pembayaran Qris
                                        And Input Nominal Transaksi Dengan Benar
                                        And Input Tanggal Transaksi Dengan Benar
                                        And Pilih Nama Merchant
                                        And Input Rrn Dengan Benar19
                                        And Upload Foto Bukti Transaksi 1
                                        And Upload Foto Bukti Transaksi 2
                                        And Upload Foto Bukti Transaksi 3
                                        And Klik submit data
                                        Then Menampilkan alert sukses
#22
                                        Scenario:
                                          Given Klik menu Register
                                          When Klik add new data
                                          And Input Soco Id dengan benar11
                                          And Input Nama Lengkap Nasabah karakter #
                                          And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar18
                                          And Input Nomor Rekening Bca Dengan Benar20
                                          And Pilih Pembayaran Qris
                                          And Input Nominal Transaksi Dengan Benar
                                          And Input Tanggal Transaksi Dengan Benar
                                          And Pilih Nama Merchant
                                          And Input Rrn Dengan Benar20
                                          And Upload Foto Bukti Transaksi 1
                                          And Upload Foto Bukti Transaksi 2
                                          And Upload Foto Bukti Transaksi 3
                                          And Klik submit data
                                          Then Menampilkan alert sukses
#23
                                          Scenario:
                                            Given Klik menu Register
                                            When Klik add new data
                                            And Input Soco Id dengan benar12
                                            And Input Nama Lengkap Nasabah Dengan karakter -
                                            And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar19
                                            And Input Nomor Rekening Bca Dengan Benar21
                                            And Pilih Pembayaran Qris
                                            And Input Nominal Transaksi Dengan Benar
                                            And Input Tanggal Transaksi Dengan Benar
                                            And Pilih Nama Merchant
                                            And Input Rrn Dengan Benar21
                                            And Upload Foto Bukti Transaksi 1
                                            And Upload Foto Bukti Transaksi 2
                                            And Upload Foto Bukti Transaksi 3
                                            And Klik submit data
                                            Then Menampilkan alert sukses
#24
                                            Scenario:
                                              Given Klik menu Register
                                              When Klik add new data
                                              And Input Soco Id dengan benar13
                                              And Input Nama Lengkap Nasabah Dengan Benar
                                              And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar20
                                              And Input Nomor Rekening Bca Dengan Benar22
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
                                                And Input Soco Id dengan benar14
                                                And Input Nama Lengkap Nasabah Dengan Benar
                                                And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar21
                                                And Input Nomor Rekening Bca Dengan Benar23
                                                And Pilih Pembayaran Qris
                                                And Input Nominal Transaksi Dengan Benar
                                                And Input tanggal transaksi melebihi tanggal hari ini
                                                And Pilih Nama Merchant
                                                And Input Rrn Dengan Benar23
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
                                                  And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar22
                                                  And Input Nomor Rekening Bca Dengan Benar24
                                                  And Pilih Pembayaran Qris
                                                  And Input Nominal Transaksi Dengan Benar
                                                  And Input Tanggal Transaksi Dengan Benar
                                                  And Pilih Nama Merchant
                                                  And Input Rrn Dengan Benar24
                                                  And Upload Foto Bukti Transaksi 1
                                                  And Upload Foto Bukti Transaksi 2
                                                  And Upload Foto Bukti Transaksi 3
                                                  And Klik submit data
                                                  Then Menampilkan alert sukses
#27
                                                  Scenario:
                                                    Given Klik menu Register
                                                    When Klik add new data
                                                    And Input Soco Id dengan benar16
                                                    And Input Nama Lengkap Nasabah Dengan Benar
                                                    And Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar23
                                                    And Input nomor rekening bca yang sudah terdaftar sebelumnya
                                                    And Pilih Pembayaran Qris
                                                    And Input Nominal Transaksi Dengan Benar
                                                    And Input Tanggal Transaksi Dengan Benar
                                                    And Pilih Nama Merchant
                                                    And Input Rrn Dengan Benar25
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
