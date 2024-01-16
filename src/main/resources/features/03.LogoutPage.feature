Feature: User (Admin) Logout
  Scenario: User (Admin) melakukan logout dari web cashback sociolla
    When User Admin berhasil login ke web cashback
    And Tampilan Home
    And Klik button menu logout
    Then Tampilan halaman awal login

  Scenario: User (Admin) melakukan logout tanpa terhubung ke internet
    When User Admin berhasil login ke web cashback
    And Tampilan Home
    And  Putuskan device dengan jaringan internet
    Then Menampilkan pesan No internet

  Scenario: User (Verifikator) melakukan logout dari web cashback
    When User Verifikator berhasil login ke web cashback
    And Tampilan Home
    And Klik button menu logout
    Then Tampilan halaman awal login

  Scenario: User (Finance) melakukan logout dari web cashback sociolla
    When User Finance berhasil login ke web cashback
    And Tampilan Home
    And Klik button menu logout
    Then Tampilan halaman awal login

  Scenario: User (Finance) melakukan logout tanpa terhubung ke internet
    When User Finance berhasil login ke web cashback
    And Tampilan Home
    And  Putuskan device dengan jaringan internet
    Then Menampilkan pesan No internet


