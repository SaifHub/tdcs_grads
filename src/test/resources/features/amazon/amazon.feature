
# @author ABDUL SAIF
# @date	  10/11/2016


	Feature: Amazon search
  				 As a customer I want to use Amazon, so that I can search for a product

  Background: Amazon Website
    Given I have visited Amazon website
    And   page has opened

  Scenario: Amazon search and checkout
    When I search for "echo"
    And  I sort by "Relevance"
    Then the first item is "echo"
    Then I select item "echo"
    Then I add "echo" into basket
    Then I decline "add-on"
    Then I checkout the basket
    Then I check sign in