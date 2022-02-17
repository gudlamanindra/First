Feature: creating login page

  Background: 
    Given user launches the browser

  @Step
  Scenario: Sample Scenario
    When user enter the url

  # And user enter the password
  # Then user logs in into the application
  @St
  Scenario Outline: Sample Scenario
    When user enter the "<google>" url
    And user enter the  password
    Then user logs in into the application

    Examples: 
      | google                    |
      | https://www.google.com    |
      | https://www.amazon.com    |
      | https://www.facebook.com  |
      | https://www.instagram.com |
      | https://www.twitter.com   |
