@smoke
  Feature: F02_LoginValid | users could use login functionality to use their accounts

  Background: user go to login page

  #Valid login
    Scenario: user could login with valid email and password
      When user login with valid email "adhamagdyoussef@gmail.com"
      And user login with valid password "P@ssw0rd"
      And user clicks on login button
      Then user login to the system successfully and return to home page



  #Invalid login
    Scenario: user could not login with invalid email and password
      When user login with invalid email "adhamagdy@gmail.com"
      And user login with invalid password "P@ssw0rdWrong"
      And user clicks on login button
      Then user could not login to the system