Feature: Feature to Register the user on PhpTravels

  Scenario: Register into PhpTravels
    Given Open PhpTravels site
    When Click on Login
    Then it will switch to second window
    When user click on creat new account
    Then user have to fill personal details
    And hits Register button
    When User is sussfuly register and logged it Take Screenshort
