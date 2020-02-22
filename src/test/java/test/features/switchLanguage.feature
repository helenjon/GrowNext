# new feature
# Tags: optional

Feature: Regional Settings

  Scenario: Checking setup Language
    Given I am on Home Page
    When I click to Change button
    And Select Language "Svenska" and Save
    Then Header contains Language "Svenska"
    And Home Page is translated


  Scenario: Checking setup Country
    Given I am on Home Page
    When I click to Change button
    And Select Country "Taiwan" and Save o
    Then Header contains Country  "Suomi"
    And Home Page is translated
