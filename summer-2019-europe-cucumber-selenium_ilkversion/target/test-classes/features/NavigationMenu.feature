
  @navigate  #that run all scenarios inside the feature file
Feature: Navigation
  #like a test case below


  Scenario: Sales manager-Fleet-->Vehicle navigation
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates to Fleet/Vehicles page
    Then the url should be expected Fleet url


  Scenario: Sales manager-Marketing-->Campaigns navigation
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates to Marketing/Campaigns page
    Then the url should be expected Campaign url


  Scenario:Activities-->Calendar Events
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates to Activities/Calendar events page
    Then the url should be expected Calendar event url
