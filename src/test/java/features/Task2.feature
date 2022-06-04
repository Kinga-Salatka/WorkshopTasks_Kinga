Feature: Buying a sweatshirt on MyStore using an existing account
  Scenario: Buy a sweatshirt
    Given The user is on MyStore
    And The user logs in
    And Picks the sweater
    And Chooses size, amount, and adds it to the shopping cart
    And Proceeds to checkout
    And Confirms the address
    And Chooses the shipping, payment, and clicks Order with an obligation to pay
    Then Makes the screenshot of the order