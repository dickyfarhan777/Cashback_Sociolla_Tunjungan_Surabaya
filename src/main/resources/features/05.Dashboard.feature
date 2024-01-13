Feature: Dashboard Admin

  Scenario:
    Given Klik menu dashboard
    And Klik periode tanggal pada filter data
    And Pilih tanggal sebelum hari ini
    And Klik sd tanggal pada filter data
    And pilih tanggal sesudah hari ini
    And Klik button filter
    Then Akan menampilkan data yang difilter
