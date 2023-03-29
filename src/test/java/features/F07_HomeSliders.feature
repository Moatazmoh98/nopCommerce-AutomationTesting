@smoke
  Feature: F07_HomeSliders | users can select between options in home slider

    Background: user at homepage
      Given user at homepage

  #First Slider (Nokia)
    Scenario: First slider is clickable on home page
       When user click on first slider with nokia image
       Then user navigate to nokia product details page


  #Second Slider (iphone)
    Scenario: Second slider is clickable on home page
      When user click on second slider with iphone image
      Then user navigate to iphone product details page


