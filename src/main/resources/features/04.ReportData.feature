Feature: Report Data Admin
  #39
  Scenario: Admin menampilkan semua status
    Given Klik menu report data
    When Klik Combo box status
    And Pilih all
    And Klik button filter
    Then Akan menampilkan semua data status
#40
    Scenario: Admin menampilkan data berstatus new data
      Given Klik menu report data
      When Klik Combo box status
      And Pilih new data
      And Klik button filter
      Then Akan menampilkan semua data berstatus new data
#41
      Scenario: Admin menampilkan data berstatus validated
        Given Klik menu report data
        When Klik Combo box status
        And Pilih validated
        And Klik button filter
        Then Akan menampilkan semua data berstatus validated
#42
        Scenario: Admin menampilkan data berstatus transfered
          Given Klik menu report data
          When Klik Combo box status
          And Pilih transfered
          And Klik button filter
          Then Akan menampilkan semua data berstatus transfered
#43
          Scenario: Admin menampilkan data berstatus uploaded
            Given Klik menu report data
            When Klik Combo box status
            And Pilih uploaded
            And Klik button filter
            Then Akan menampilkan semua data berstatus uploaded
#44
            Scenario: Admin melakukan pencarian menggunakan search yang terdata
              Given Klik menu report data
              When Klik field search dan Ketik data yang sudah terdaftar
              And Klik icon search
              Then Akan menampilkan data yang terdaftar
#45
              Scenario: Admin melakukan pencarian menggunakan search yang tidak terdata
                Given Klik menu report data
                When Klik field search dan Ketik data yang sudah terdaftar
                And Klik field search dan Ketik data yang tidak terdaftar
                And Klik icon search
                Then Tidak menampilkan data
#46
                Scenario: Admin melakukan klik icon aksi
                  Given Klik menu report data
                  When Klik button aksi bericon mata
                  Then Akan tampil detail data report customer
#47
                Scenario: Admin menampilkan maximal 10 data perhamalam
                  Given Klik menu report data
                  When Klik combo box show
                  And Pilih 10
                  And Klik button filter
                  Then Akan menampilkan maximal 10 data perhamalam
#48
                  Scenario: Admin menampilkan maximal 25 data perhamalam
                    Given Klik menu report data
                    When Klik combo box show
                    And Pilih 25
                    And Klik button filter
                    Then Akan menampilkan maximal 25 data perhamalam
#49
                    Scenario: Admin menampilkan maximal 50 data perhamalam
                      Given Klik menu report data
                      When Klik combo box show
                      And Pilih 50
                      And Klik button filter
                      Then Akan menampilkan maximal 50 data perhamalam
#50
                      Scenario: Admin menampilkan maximal 100 data perhamalam
                        Given Klik menu report data
                        When Klik combo box show
                        And Pilih 100
                        And Klik button filter
                        Then Akan menampilkan maximal 100 data perhamalam

