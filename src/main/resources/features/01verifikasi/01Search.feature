Feature: Search
  #positif
  Scenario: mencari nama depan customer
    Given Verifikator login web sociolla cashback
    When klik menu verifikasi
    And menginput nama Septia ke dalam field search
    And klik enter
    And menginput nama Septia ke dalam field search
    And klik enter
    And data muncul sesuai dengan inputan Septia
    Then isi tabel muncul sesuai dengan nama customer yang diinputkan

  #positif
  Scenario: mencari berdasarkan nama sales
    Given verifikator menuju ke menu verifikasi
    When menginput nama Rinzana ke dalam field search
    And klik enter
    And data muncul sesuai dengan inputan Rinzana
    Then isi tabel muncul sesuai dengan nama sales yang diinputkan

  #negatif
  Scenario: mencari tanpa menginputkan apapun
    Given verifikator menuju ke menu verifikasi
    When menginput nama Rinzana ke dalam field search
    And klik enter
    And hapus input search tersebut
    And klik enter untuk mencari search tanpa inputan
    Then isi tabel kembali seperti semula



