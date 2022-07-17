@awesomeapptest
@issue=2
Feature: Landing page navigation

  Scenario Outline: Landing page tabs
    When I click the "<tab>" tab
    Then I see the "<tab>" page
    Examples:
      | tab |
      | dashboard |
      | settings  |
