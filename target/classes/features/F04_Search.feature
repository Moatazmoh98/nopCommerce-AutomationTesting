@smoke
  Feature: F04_Search | users could search for products by name or by sku

  #Product name
    Scenario Outline 1: user could search for products by name
      Given user enters product name "<name>" in the test search field
      When user clicks on search button
      Then search results appears with products related to the search name "<name>" in the search text field
      Examples:
        | name   |
        | book   |
        | laptop |
        | nike   |


  #Product sku
    Scenario Outline 2: user could search for products by sku
      Given user enters product sku "<sku>" in the test search field
      When user clicks on search button
      Then search results appears with products related to the search sku "<sku>" in the search text field
      Examples:
        | sku       |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |