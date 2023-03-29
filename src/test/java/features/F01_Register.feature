@smoke
  Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enters first name "automation"
    And user enters last name "tester"
    And user enters date of birth
    And user enters email "adhamagdyoussef@gmail.com"
    And user enters password "P@ssw0rd"
    And user confirms password "P@ssw0rd"
    And user clicks on register button
    Then success message is displayed