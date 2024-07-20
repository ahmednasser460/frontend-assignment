Feature: Creating the Automation Script for the frontend task
  #Created by Ahmed Nasser
  #Created on 19 July 2024


  @TC1 @FrontendTask
  Scenario: Validate the Subscription Packages for All countries
    Given I have opened the correct subscribe website
    When  Select the KSA country and Validate the Type, Price and Currency
    And   Select the Bahrain country and Validate the Type, Price and Currency
    And   Select the Kuwait country and Validate the Type, Price and Currency
    Then  they should be matched