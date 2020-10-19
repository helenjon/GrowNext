Feature: Regional Settings Setup

  Scenario: Checking setup Language
    Given I am on Home Page
    When I click to Change button
    And I click on "Language" dropdown
    And I select "Svenska"
    And click Save
    Then Header contains Language "Svenska"
    And Home Page has url "Svenska"

  Scenario: Checking setup Country
    Given I am on Home Page
    When I click to Change button
    And I click on "Country" dropdown
    And I select "Ukraine"
    And click Save
    Then Header contains Country "Ukraine"


