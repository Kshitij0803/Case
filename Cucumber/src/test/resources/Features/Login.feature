Feature: feature to check login functionality

  Scenario: Check login is successful with vaild credeentials
    Given user is on register page
    When click on reg button
    And user have to reg with details
    Then user is logged in
