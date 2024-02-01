@regression
Feature: Login functionality
  As a user I should be able to Signup Successfully


    @author_shraddha
Scenario: Verify that user can login successfully
    When I open the URL
    And I accept cookies
    And I click on Sign Up button
    And I enter the FirstName "Shraddha"
    Then I enter lastname "Dhaduk"
    And I click on continue button