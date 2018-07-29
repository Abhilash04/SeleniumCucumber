#Author: abhilash.sharma@sonetel.com
Feature: Demo Web App Login
  This feature deals with the login functionality and basic element checks

  @sanity
  Scenario: Verify Main Screen Elements
    Given Launch the demo site
    Then Verify all main screen elements

  @sanity
  Scenario Outline: Verify Valid User Input
    Given Launch the demo site
    And Verify Valid User Input "<Text_Message>"

  Examples:
    | Text_Message  |
    | Welcome Selenium Learner |


  @sanity
  Scenario Outline: Verify Valid Addition
    Given Launch the demo site
    And Verify Valid Addition with numA "<Number_A>" numB "<Number_B>" and expected result "<Expected>"


  Examples:
    | Number_A  | Number_B | Expected |
    | 5 | 10 | 15 |
    | 4 | 7 | 12 |
