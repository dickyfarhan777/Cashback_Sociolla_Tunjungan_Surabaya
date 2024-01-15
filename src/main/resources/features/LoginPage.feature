Feature: Login User (Admin)
  Scenario: User (Admin) input a valid username and password
    Given User access the link cashback sociolla
    When Display the login page
    And Enter username admintiara2
    And  Enter password a
    And Click the login button
    Then Home page display

  Scenario: User (Admin) input unvalidated username and valid password
    Given User access the link cashback sociolla
    When Display the login page
    And Input unvalidated username and valid password
    And Click the login button
    Then Displays the message or alert Incorrect Username or Password

  Scenario: User (Admin) login without input username and password / blank
    Given User access the link cashback sociolla
    When Display the login page
    And Click the login button
    Then Displays the alert icon or Enter Username Enter Password

  Scenario: User (Admin) input a valid username with capital letters and a valid password
    Given User access the link cashback sociolla
    When Display the login page
    And Enter username Admintiara2
    And Enter password a
    And Click the login button
    Then Displays the message or alert Incorrect Username or Password

  Scenario: User (Admin) input valid username with uppercase and valid password
    Given User access the link cashback sociolla
    When Display the login page
    And Enter username ADMINTIARA2
    And Enter password a
    And Click the login button
    Then Displays the message or alert Incorrect Username or Password



