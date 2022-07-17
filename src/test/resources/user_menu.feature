@awesomeapptest
@issue=3
Feature: User Menu

  Scenario: Answer to the question

  As a user I should be able to see the answer from which all meaning can be derived

    When I navigate to the "user menu"
    And I click "Get the ultimate answer"
    Then I see the answer 42