Feature:  MyTask

  Background:
    Given The user is on the login page

  @example
  Scenario: Navigate to Forms menu
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to see text
    And The user navigates to Forms Input menu menu
    And The user navigate to Text menu
    Then The user able to see General Form Elements - Input  text

  Scenario: Navigate to Components menu
    When The user enters valid credentials that belongs to Mike
    Then The user should be able to see text
    And The user navigates to Forms Input menu menu
    And The user navigate to Text menu
    Then The user able to see General Form Elements - Input  text


