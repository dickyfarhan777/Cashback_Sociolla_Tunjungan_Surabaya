Feature: Admin Login
  Scenario:Admin login valid

    Given Admin akses link web cashback
    When Tampilan halaman login
    And Input username admintiara2
    And Input password a
    And Klik button login
    Then Tampilan halaman home