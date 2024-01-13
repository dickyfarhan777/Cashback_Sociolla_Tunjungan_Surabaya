Feature: Report Data Admin
  Scenario:
    Given Klik Menu Report Data
    And Klik Combo box status
    And Pilih all
    And Klik button filter
    Then Akan menampilkan semua data status

    Scenario:
      Given Klik Menu Report Data
      And Klik Combo box status
      And Pilih all
      And Klik button filter
      Then Akan menampilkan semua data berstatus new data

      Scenario:
        Given Klik Menu Report Data
        And Klik Combo box status
        And Pilih all
        And Klik button filter
        Then Akan menampilkan semua data berstatus validated

        Scenario:
          Given Klik Menu Report Data
          And Klik Combo box status
          And Pilih all
          And Klik button filter
          Then Akan menampilkan semua data berstatus transfered

          Scenario:
            Given Klik Menu Report Data
            And Klik Combo box status
            And Pilih all
            And Klik button filter
            Then Akan menampilkan semua data berstatus uploaded

            Scenario:
              Given Klik menu report data
              And Klik field search
              And Ketik data yang sudah terdaftar
              And Klik icon search
              Then Akan menampilkan data yang terdaftar

              Scenario:
                Given Klik menu report data
                And Klik field search
                And Ketik data yang tidak terdaftar
                And Klik icon search
                Then Tidak menampilkan data

                Scenario:
                  Given Klik menu report data
                  And Klik button aksi bericon mata
                  Then Akan tampil detail data report customer

                Scenario:
                  Given Klik menu report data
                  And Klik combo box show
                  And pilih 10
                  Then Akan menampilkan maximal 10 data perhamalam

                  Scenario:
                    Given Klik menu report data
                    And Klik combo box show
                    And pilih 25
                    Then Akan menampilkan maximal 25 data perhamalam

                    Scenario:
                      Given Klik menu report data
                      And Klik combo box show
                      And pilih 50
                      Then Akan menampilkan maximal 50 data perhamalam

                      Scenario:
                        Given Klik menu report data
                        And Klik combo box show
                        And pilih 100
                        Then Akan menampilkan maximal 100 data perhamalam

                        Scenario:
                          Given Klik menu report data
                          And Scroll kebawah
                          And Klik Button next
                          Then Akan menampilkan halaman selanjutnya

                          Scenario:
                            Given Klik menu report data
                            And Scroll kebawah
                            And Klik langsung halaman terakhir
                            Then Akan menampilkan halaman terakhir

                            Scenario:
                              Given Klik menu report data
                              And Scroll kebawah
                              And Klik langsung halaman terakhir
                              And Klik halaman paling awal atau halaman pertama
                              Then Akan menampilkan halaman pertama

                              Scenario:
                                Given Klik menu report data
                                And Scroll kebawah
                                And Klik halaman ke 3
                                Then Akan menampilkan halaman ke 3
