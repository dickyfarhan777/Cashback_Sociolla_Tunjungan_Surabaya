Feature: Report Data Admin
  Scenario: Admin menampilkan semua status
    Given Klik menu report data
    When Klik Combo box status
    And Pilih all
    And Klik button filter
    Then Akan menampilkan semua data status

    Scenario: Admin menampilkan data berstatus new data
      Given Klik menu report data
      When Klik Combo box status
      And Pilih new data
      And Klik button filter
      Then Akan menampilkan semua data berstatus new data

      Scenario: Admin menampilkan data berstatus validated
        Given Klik menu report data
        When Klik Combo box status
        And Pilih validated
        And Klik button filter
        Then Akan menampilkan semua data berstatus validated

        Scenario: Admin menampilkan data berstatus transfered
          Given Klik menu report data
          When Klik Combo box status
          And Pilih transfered
          And Klik button filter
          Then Akan menampilkan semua data berstatus transfered

          Scenario: Admin menampilkan data berstatus uploaded
            Given Klik menu report data
            When Klik Combo box status
            And Pilih uploaded
            And Klik button filter
            Then Akan menampilkan semua data berstatus uploaded

            Scenario: Admin melakukan pencarian menggunakan search yang terdata
              Given Klik menu report data
              When Klik field search dan Ketik data yang sudah terdaftar
              And Klik icon search
              Then Akan menampilkan data yang terdaftar

              Scenario: Admin melakukan pencarian menggunakan search yang tidak terdata
                Given Klik menu report data
                When Klik field search dan Ketik data yang sudah terdaftar
                And Klik field search dan Ketik data yang tidak terdaftar
                And Klik icon search
                Then Tidak menampilkan data

                Scenario: Admin melakukan klik icon aksi
                  Given Klik menu report data
                  When Klik button aksi bericon mata
                  Then Akan tampil detail data report customer

                Scenario: Admin menampilkan maximal 10 data perhamalam
                  Given Klik menu report data
                  When Klik combo box show
                  And Pilih 10
                  Then Akan menampilkan maximal 10 data perhamalam

                  Scenario: Admin menampilkan maximal 25 data perhamalam
                    Given Klik menu report data
                    When Klik combo box show
                    And Pilih 25
                    Then Akan menampilkan maximal 25 data perhamalam

                    Scenario: Admin menampilkan maximal 50 data perhamalam
                      Given Klik menu report data
                      When Klik combo box show
                      And Pilih 50
                      Then Akan menampilkan maximal 50 data perhamalam

                      Scenario: Admin menampilkan maximal 100 data perhamalam
                        Given Klik menu report data
                        When Klik combo box show
                        And Pilih 100
                        Then Akan menampilkan maximal 100 data perhamalam

                        Scenario: Admin menampilkan halaman selanjutnya
                          Given Klik menu report data
                          When Scroll kebawah
                          And Klik Button next
                          Then Akan menampilkan halaman selanjutnya

                            Scenario: Admin menampilkan halaman previous
                              Given Klik menu report data
                              When Scroll kebawah
                              And Klik Button next
                              And Klik Button Previous
                              Then Akan menampilkan halaman previous
