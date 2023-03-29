@smoke
  Feature: F10_WishList | user could add  products to Wishlist


    Scenario: user add htc phone product to Wishlist
    When user click on add to wishlist button of product at home page
    And success message appears which confirm adding the product
    And user click on Wishlist link
    Then user will navigate to wishlist page which contain the product not equal zero







