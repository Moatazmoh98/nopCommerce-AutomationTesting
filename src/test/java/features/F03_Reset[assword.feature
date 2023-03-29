@smoke
  Feature: F03_ResetPassword | User could reset his/her password successfully



    Scenario: User could reset his/her password successfully
      Given user go to logging page
      When user clicks on forget password
      And user enter valid email "adhamagdyoussef@gmail.com"
      And user click reset button
      Then "Email with instructions has been sent to you." message is displayed

