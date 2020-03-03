# new feature
# Tags: optional

@RegionalSettingsSetup
Feature: Shopping Cart Functionality

  Scenario: Add one item to cart
    Given I am on My Main Page
    And Shopping Cart is empty
    And I click to first popular product
    When click "Add to Cart" button
    Then selected item was added to Shopping Cart