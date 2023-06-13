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
      | url                                | name       | address              | city          | state | zipCode | cardType         | cardNumber | month    | year | nameOnCard | message                            |
      | https://blazedemo.com/purchase.php | Lakha      | 123 drive            | Brooklyn      | NY    |   11229 | Visa             |  123456789 | May      | 1980 | Virdi      | Thank you for your purchase today! |
      | https://blazedemo.com/purchase.php | Sandeep    | 123 Street           | Queens        | NY    |   11370 | American Express |  123456789 | December | 1990 | Virdi      | Thank you for your purchase today! |
      | https://blazedemo.com/purchase.php | Amir       | 2323 Street          | Sheeshead bay | NY    |   11224 | Diner's Club     |  234567878 | April    | 1970 | Virdi      | Thank you for your purchase today! |
      | https://blazedemo.com/purchase.php | Dylan      | 4300 atlantic Street | flushing bay  | NY    |   11224 | Visa             |  234567878 |        8 | 2020 | Virdi      | Thank you for your purchase today! |
      | https://blazedemo.com/purchase.php | Lakhwinder | 2452 77 Street       | East Elmhurst | NY    |   11370 | American Express | 8782738733 | July     | 1983 | Virdi      | Thank you for your purchase today! |
