@smoke
  Feature: F09_ShoppingCart | User could add different products to Shopping cart


    Scenario: user add products to shopping cart
      Given User navigate to Books category page
      When User click on Add To Cart button for a book
      And success message appears which confirm adding the product to shopping cart
      And User navigate to Shopping Cart page
      Then Shopping cart will contain all selected products






