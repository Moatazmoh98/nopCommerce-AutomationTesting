@smoke
  Feature: F05_Search | users could search for products by name or by sku

  #Product name
    Scenario Outline: user could search for products by name
      Given user enters product name "<name>" in the test search field at home page
      When user clicks on search button
      Then search results appears with products related to the search name "<name>" in the search text field
      Examples:
        |name|
        |book|
        |laptop|
        |nike|


  #Product sku
    Scenario Outline: user could search for products by sku
      Given user enters product sku "<sku>" in the test search field at home page
      When user clicks on search button
      And user click on product detail page
      Then search results appears with products related to the search sku "<sku>" in the search text field
      Examples:
        |sku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|