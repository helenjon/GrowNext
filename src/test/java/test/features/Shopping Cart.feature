# new feature
# Tags: optional

Feature: ShoppingCartFunctionality

  Scenario: Add one item to cart
    Given I am on Main Page
    And Shopping Cart is empty
    And I click to first popular product
    When I click "Add to Cart"
    And go to Shopping Cart page
    Then selected item was added to Shopping Cart