# new feature
# Tags: optional

Feature: Verification switching between pages

  Scenario: Verification switching between pages - bottom links
    Given I am on Home Page
    When I click 'Customer Service'
    Then Redirect to 'Customer Service'
    When I click 'Regional Settings'
    Then Redirect to 'Regional Settings'
    When I click 'Create Account'
    Then Redirect to 'Create Account'
    When I click 'Login'
    Then Redirect to 'Login'
    When I click 'About Us'
    Then Redirect to 'About Us'
    When I click 'Delivery Information'
    Then Redirect to 'Delivery Information'
    When I click 'Privacy Policy'
    Then Redirect to 'Privacy Policy'
    When I click 'Terms & Conditions'
    Then Redirect to 'Terms & Conditions'
