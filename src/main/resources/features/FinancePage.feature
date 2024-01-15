Feature: Module Finance
  Scenario:Displays data that has been verified
    When User admin has successfully logged in
    And Click the finance menu button
    Then Display a list of data that has been verified

  Scenario:Select the 25 Data Customer list displayed
    When User admin has successfully logged in
    And Click the finance menu button
    And Display a list of data that has been verified
    And Click table control show entries
    And Select 25 lists to be displayed
    Then Displays 25 data customer

  Scenario: Return to the dashboard menu
    When Display the verification data list page
    And Click the dashboard field in the top right corner
    Then The display returns to the dashboard menu

  Scenario: Displays transaction data customer
    Given User admin has successfully logged in
    When Click the finance menu button
    And Display the verification data list page
    And Click the edit action icon on one of the data customer
    And Moves to the new edit data page or tab
    Then The edit data page displays

  Scenario: Displays Verification Data List on the next page
     When Display the verification data list page
     And Scroll down
     And Click the table control next
     Then Display the data verification list on the next page

  Scenario: Displays the Verification Data List of the previous page
     When Display the verification data list page
     And Scroll down
     And Click the table control next
     And Click the previous table control
     Then Displays the verification data list on the previous page

  Scenario: Displays Verification Data List page 3
    When Display the verification data list page
    And Scroll down
    And Click table control page 3
    Then Displays the verification data list on page 3

  Scenario: Search for Customer Name - First Name
    When User admin has successfully logged in
    And Click the finance menu button
    And Display the verification data list page
    And Enter first name in the search field
    And Press enter
    Then Displays customer data according to the first name entered

  Scenario: Search for Customer Name - Last Name
    When User admin has successfully logged in
    And Click the finance menu button
    And Display the verification data list page
    And Enter last name in the search field
    And Press enter
    Then Displays customer data according to the last name entered

  Scenario: Looking for RRN Customer
    When User admin has successfully logged in
    And Click the finance menu button
    And Display the verification data list page
    And Input rrn in the search field column
    And Press enter
    Then Displays customer data according to the ref id entered

  Scenario: Return customer data to the verifier
    Given User admin has successfully logged in
    When Click the finance menu button
    And Check list or select customer data in the check box
    And Scroll down
    And Click the return to verifier button
    And A confirmation pop up appears
    And Click the save button
    Then Displays a message success updated successfully

  Scenario: Update to cashback verifier has been transferred
    Given User admin has successfully logged in
    When Click the finance menu button
    And Check list or select customer data in the check box
    And Scroll down
    And Click update transferred
    And A confirmation pop up appears
    And Click the save button
    Then Displays a message success updated successfully

  Scenario: Check List of all Customer Data
    When User admin has successfully logged in
    And Click the finance menu button
    And Click the top check box field
    Then All customer data on the page accessed is checked in the list

  Scenario: Update without data check list
    Given User admin has successfully logged in
    When Click the finance menu button
    And Scroll down
    And Click update transferred
    And A confirmation pop up appears
    And Click the save button
    Then Displays a message please check data

  Scenario: Re-verify without data check list
    Given User admin has successfully logged in
    When Click the finance menu button
    And Scroll down
    And Click the return to verifier button
    And A confirmation pop up appears
    And Click the save button
    Then Displays a message please check data

  Scenario: re-verify 10 Customer Data
    Given User admin has successfully logged in
    When Click the finance menu button
    And Check list of 10 customer data
    And Scroll down
    And Click the return to verifier button
    And A confirmation pop up appears
    And Click the save button
    Then Displays a message success updated successfully







