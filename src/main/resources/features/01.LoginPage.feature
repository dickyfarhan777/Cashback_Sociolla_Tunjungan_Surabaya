Feature: User (Admin) Login
  Scenario: User (Admin) input username dan password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username admintiara2
    And  Input password a
    And Klik button login
    Then Tampilan halaman home

  Scenario: User (Admin) input unvalidated username dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input unvalidated username
    And  Input password a
    And Klik button login
    Then Menampilkan alert username atau password salah

  Scenario: User (Admin) login tanpa input username dan password
    Given User akses link web cashback
    When Tampilan halaman login
    And Klik button login
    Then Menampilkan icon alert

  Scenario: User (Admin) menginput valid username dengan huruf awal kapital dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username Admintiara2
    And Input password a
    And Klik button login
    Then Menampilkan alert username atau password salah

  Scenario: User (Admin) menginput valid username dengan uppercase dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username ADMINTIARA2
    And Input password a
    And Klik button login
    Then Menampilkan alert username atau password salah

    // VERIFIKATOR //

  Scenario: User (Verifikator) menginput username dan password yang valid
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username feriansyah2
    And  Input password aa
    And Klik button login
    Then Tampilan halaman home

  Scenario: User (Verifikator) menginput valid username dengan huruf awal kapital dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username Feriansyah2
    And Input password aa
    And Klik button login
    Then Menampilkan alert username atau password salah

  Scenario: User (Verifikator) menginput valid username dengan uppercase dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username FERIANSYAH2
    And Input password aa
    And Klik button login
    Then Menampilkan alert username atau password salah

    // FINANCE //
  Scenario: User (Finance) menginput username dan password yang valid
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username feriansyah
    And  Input password a
    And Klik button login
    Then Tampilan halaman home

  Scenario: User (Finance) menginput unvalidated username dan password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username tidak terdaftar
    And  Input password tidak terdaftar
    And Klik button login
    Then Tampilan halaman home

  Scenario: User (Finance) menginput valid username dengan huruf awal kapital dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username Feriansyah
    And Input password a
    And Klik button login
    Then Menampilkan alert username atau password salah

  Scenario: User (Finance) menginput valid username dengan uppercase dan valid password
    Given User akses link web cashback
    When Tampilan halaman login
    And Input username FERIANSYAH
    And Input password aa
    And Klik button login
    Then Menampilkan alert username atau password salah


