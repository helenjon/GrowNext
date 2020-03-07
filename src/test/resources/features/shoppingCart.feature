# new feature
# Tags: optional

Feature: Shopping Cart Functionality

  Scenario: Add one item to cart
    Given I am on My Main Page
    And Shopping Cart is empty
    And I click to first popular product
    When click "Add to Cart" button
    Then selected item was added to Shopping Cart

  Scenario: Add and Remove one item from cart
    Given I am on My Main Page
    When I click to first popular product
    And click "Add to Cart" button
    And open Shopping Card page
    And click Remove button
    Then Shopping Cart became empty
