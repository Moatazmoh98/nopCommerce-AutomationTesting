@smoke
  Feature: F04_Currencies Check | Logged user can select Euro currency from dropdown list in home page and Euro symbol (€) is shown


    Scenario: user could select products in euro
     Given User log in with email "adhamagdyoussef@gmailcom" and password "P@ssw0rd"
     When user select Euro currency from currency dropdown list
     Then products price is shown in Euro


