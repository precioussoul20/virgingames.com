Feature: Top Menu Functionality

  As a User I would like to navigate top menu options successfully

  Scenario: Verify that User can navigate all options available in Top menu successfully
    Given I am on Homepage
    And I accept cookies
    When  I click "All Games" link
    Then I navigate to "Online Slots" page


