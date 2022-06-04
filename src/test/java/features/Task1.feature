Feature: Adding new address to an existing MyStore account
  Scenario Outline: Add new address
    Given The user is on MyStore page
    When User click SignIn
    And Logs into account
    And Clicks on Addresses tab
    And Clicks on Create new address
    And Fills in the form using "<alias>", "<address>", "<city>", "<zip>", "<country>" and "<phone>"
    Then Checks the data
    Examples:
      | alias | address       | city     | zip    | country        | phone     |
      | ksala | Balear Street | New York | 00-700 | United Kingdom | 000111222 |

