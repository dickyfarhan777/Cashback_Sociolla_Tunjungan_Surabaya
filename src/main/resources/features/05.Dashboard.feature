Feature: Dashboard Admin

  Scenario: Admin memfilter data tgl sebelum hari ini dan sesudah hari ini
    Given Klik menu dashboard
    And Klik periode tanggal pada filter data
    And Pilih tanggal sebelum hari ini
    And Klik sd tanggal pada filter data
    And pilih tanggal sesudah hari ini
    And Klik button filter
    Then Akan menampilkan data yang difilter

    Scenario: Admin memfilter data tgl sebelum hari ini dan sebelum hari ini
      Given Klik menu dashboard
      And Klik periode tanggal pada filter data
      And Pilih tanggal hari ini
      And Klik sd tanggal pada filter data
      And pilih tanggal sebelum hari ini
      And Klik button filter
      Then Tidak akan menampilkan data yang difilter

      Scenario: Admin memfilter data tgl sesudah hari ini dan sesudah hari ini
        Given Klik menu dashboard
        And Klik periode tanggal pada filter data
        And tanggal sesudah hari ini
        And Klik sd tanggal pada filter data
        And pilih tanggal sd sesudah hari ini
        And Klik button filter
        Then Tidak akan menampilkan data yang difilter

        Scenario: Admin mendownload data dashboard nominal cashback berbentuk excel
          Given Klik menu dashboard
          And Klik periode tanggal pada filter data
          And Pilih tanggal sblm
          And Klik sd tanggal pada filter data
          And pilih tanggal sesudah
          And Klik button filter
          And Klik export excel di table dashboard nominal cashback
          Then Akan mendownload data excel

          Scenario: Admin mendownload data dashboard spg berbentuk excel
            Given Klik menu dashboard
            And Klik periode tanggal pada filter data
            And Pilih tanggal sblm
            And Klik sd tanggal pada filter data
            And pilih tanggal sesudah
            And Klik button filter
            And Klik export excel di table dashboard spg
            Then Akan mendownload data excel


