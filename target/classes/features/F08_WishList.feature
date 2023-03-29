@smoke
  Feature: F08_WishList | user can add different products to Wishlist


    Scenario: user add htc phone product to Wishlist
    Given user at home page
    When user click on add to wishlist button of htc phone
    Then success message appears which confirm adding of the product



    Scenario: user add htc phone product to Wishlist and validate its quantity
      Given user at home page
      When user click on add to wishlist button of htc phone
      And user click on Wishlist link
      Then user will navigate to wishlist page which contain htc phone product with its quantity


