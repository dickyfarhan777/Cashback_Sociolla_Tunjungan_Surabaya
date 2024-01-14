Feature: Search
  #positif
  Scenario: mencari nama depan customer
    Given verifikator menuju ke menu verifikasi
    When menginput nama depan customer ke dalam field search
    And klik enter
    And data muncul sesuai dengan inputan
    Then isi tabel muncul sesuai dengan nama customer yang diinputkan

  #positif
  Scenario: mencari berdasarkan nama sales
    Given verifikator menuju ke menu verifikasi
    When menginput nama sales ke dalam field search
    And klik enter
    And data muncul sesuai dengan inputan
    Then isi tabel muncul sesuai dengan nama sales yang diinputkan

  #negatif
  Scenario: mencari tanpa menginputkan apapun
    Given verifikator menuju ke menu verifikasi
    When menginput nama depan customer ke dalam field search
    And klik enter
    And klik Silang atau hapus input search tersebut
    And klik enter untuk mencari search tanpa inputan
    Then isi tabel kembali seperti semula


