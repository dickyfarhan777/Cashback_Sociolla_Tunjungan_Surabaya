Feature: Search
  #positif
  Scenario: mencari nama depan customer
    Given Verifikator menuju ke menu Verifikasi
    When mennginput nama depan customer ke dalam field search
    And Klik enter
    And Data muncul sesuai dengan inputan
    Then Isi tabel muncul sesuai dengan nama customer yang diinputkan

  #positif
  Scenario: mencari berdasarkan nama sales
    Given Verifikator menuju ke menu Verifikasi
    When mennginput nama sales ke dalam field search
    And Klik enter
    And Data muncul sesuai dengan inputan
    Then Isi tabel muncul sesuai dengan nama sales yang diinputkan

  #negatif
  Scenario: mencari tanpa menginputkan apapun
    Given Verifikator menuju ke menu Verifikasi
    When mennginput nama depan customer ke dalam field search
    And Klik enter
    And Klik Silang atau hapus input search tersebut
    And Klik enter untuk mencari search tanpa inputan
    Then isi tabel kembali seperti semula



