Feature: Login Tests

  Scenario: Login Success
    Given I open login page
    When I enter email "dmytro.kravchuk@testpro.io"
    And I enter password "Fr440003"
    And I submit
    Then I am logged in