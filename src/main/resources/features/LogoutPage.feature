Feature: Logout User (Admin)
  Scenario: User (Admin) log out of the Sociolla cashback web
    When User admin has successfully logged in
    And Dashboard display
    And Click the logout menu button
    Then Display the initial login page

  Scenario: User (Admin) logout when the device is not connected to internet
    When User admin has successfully logged in
    And Dashboard display
    And  Disconnect the device from the internet network
    Then Displays a notification the device is not connected to internet network no internet

  Scenario: User (Verifikator) logout
    When User verifier has successfully logged in
    And Dashboard display
    And  Click the logout menu button
    Then Display the initial login page

  Scenario: User (Finance) logout
    When User finance has successfully logged in
    And Dashboard display
    And  Click the logout menu button
    Then Display the initial login page

  Scenario: User (Finance) logout when device is not connected to internet
    When User finance has successfully logged in
    And Dashboard display
    And  Disconnect the device from the internet network
    Then Displays a notification the device is not connected to internet network no internet



