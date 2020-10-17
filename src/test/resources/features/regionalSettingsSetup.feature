<<<<<<< HEAD
# new feature
# Tags: optional

#@RegionalSettingsSetup
=======
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa
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
<<<<<<< HEAD
    And I select "Taiwan"
    And click Save
    Then Header contains Country "Taiwan"
=======
    And I select "Ukraine"
    And click Save
    Then Header contains Country "Ukraine"
>>>>>>> 7aa6e2f16c03343fce8dc9095840fd25286d45aa

