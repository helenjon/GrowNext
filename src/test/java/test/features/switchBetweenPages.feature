# new feature
# Tags: optional

@RegionalSettingsSetup
Feature: Verification switching between pages

  Scenario: Verification switching between pages - bottom links
    Given I am on Main Page
    When I click "Customer Service"
    Then I was redirected to "Customer Service"
    And I am on Main Page
    And I click "Regional Settings"
    Then Redirect to "Regional Settings"
    And I am on Main Page
    And I click "Create Account"
    Then Redirect to "Create Account"
   # And I am on Main Page
   # And I click "Login"
   # Then Redirect to "Login"
    And I am on Main Page
    When I click "About Us"
    Then Redirect to "About Us"
    And I am on Main Page
    When I click "Delivery Information"
    Then Redirect to "Delivery Information"
    And I am on Main Page
    When I click "Privacy Policy"
    Then Redirect to "Privacy Policy"
    And I am on Main Page
    When I click "Terms & Conditions"
    Then Redirect to "Terms & Conditions"



