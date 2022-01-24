Feature: Feature too search google functinility

  Scenario: Valide google sraeching working
    Given Browser is open
    And user is on google search page
    When user enter a text in search box
    And hits Enter
    Then User is navigated to search results
