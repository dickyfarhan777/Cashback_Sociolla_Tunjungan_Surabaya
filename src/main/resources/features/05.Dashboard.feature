Feature: Dashboard Admin
  #51
  Scenario: Admin memfilter tanggal periode yang sama dengan tanggal sampe dengan untuk cashback
    Given Klik menu dashboard
    And Klik periode tanggal pada filter data dan pilih tanggal sama
    And Klik sd tanggal pada filter data dan pilih tanggal yang sama
    Then Akan menampilkan data valid yang difilter1
#52
  Scenario: Admin memfilter data tgl sebelum hari ini dan sesudah hari ini untuk cashback
    Given Klik menu dashboard
    And Klik periode tanggal pada filter data dan pilih tanggal sebelum hari
    And Klik sd tanggal pada filter data pilih tanggal sesudah hari ini
    And Klik button filter dashboard
    Then Akan menampilkan data valid yang difilter2
#53
    Scenario: Admin memfilter data tgl hari ini dan sebelum hari ini untuk cashback
      Given Klik menu dashboard
      And Klik periode tanggal pada filter data dan pilih tanggal hari ini
      And Klik sd tanggal pada filter data dan pilih tanggal sebelum hari ini
      And Klik button filter dashboard
      Then Tidak akan menampilkan data invalid yang difilter1
#54
      Scenario: Admin memfilter data tgl sesudah hari ini dan sesudah hari ini
        Given Klik menu dashboard
        And Klik periode tanggal pada filter data and tanggal sesudah hari ini
        And Klik sd tanggal pada filter data and pilih tanggal sesudah hari ini
        And Klik button filter dashboard
        Then Tidak akan menampilkan data invalid yang difilter2
#55
        Scenario: Admin mendownload data dashboard nominal cashback berbentuk excel
          Given Klik menu dashboard
          And Klik periode tanggal pada filter data and pilih tanggal sblm
          And Klik sd tanggal pada filter data and tanggal sesudah hari ini
          And Klik button filter dashboard
          Then Klik export excel di table dashboard nominal cashback
#56
          Scenario: Admin mendownload data dashboard spg berbentuk excel
            Given Klik menu dashboard
            And Klik periode tanggal pada filter data and Pilih tanggal sblm
            And Klik sd tanggal pada filter data and pilih tanggal sesudah
            And Klik button filter dashboard
            Then Klik export excel di table dashboard spg
#57
            Scenario: Admin memfilter data untuk mencari data spg
              Given Klik menu dashboard
              And Klik periode tanggal pada filter data and Pilih tanggal sblm
              And Klik sd tanggal pada filter data and pilih tanggal sesudah
              And Klik button filter dashboard
              Then Akan menampilkan data valid yang difilter3




