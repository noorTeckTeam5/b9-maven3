Feature: Blaze Demo Purchase Functionality

  Scenario Outline: User able purchase flight
    Given user navigates to Blaze Demo Purchase "<url>"
    When user enters first and last name "<name>"
    And User enters address "<address>"
    And User enters city "<city>"
    And user enters state "<state>"
    And User enters zipCode "<zipCode>"
    And User selects card type "<cardType>"
    And User eneters card number "<cardNumber>"
    And User enters month "<month>"
    And User enters year "<year>"
    And User enters name on the card "<nameOnCard>"
    And User clicks on the Remeber me check box
    And User clicks on the purchase flight button
    Then User validate meesage "<message>"

    Examples: 
      | url                                | name  | address   | city     | state | zipCode | cardType | cardNumber | month | year | nameOnCard | message                            |
      | https://blazedemo.com/purchase.php | Lakha | 123 drive | Brooklyn | NY    |   11229 | Visa     |  123456789 | May   | 1980 | Virdi      | Thank you for your purchase today! |
