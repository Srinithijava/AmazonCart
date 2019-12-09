Feature: Amazon order Purchase
  Verify if user is able to order specific item from the site
@Amazon
  Scenario: Purchase an particular product from amazon website
 
    Given user is on homepage
    When user navigates to bestseller page
    And user selects camera and photo page
    And user selects digital camera page followed by "5" th product
    And user selects product quantity "8"
    Then cart displays selected product and sub-total