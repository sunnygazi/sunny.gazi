@UserAccess
Feature: User Access


Scenario Outline: user login successfully

Given I am on newtours homepage
When I enter "<user name>" "<password>" and click submit
Then I login to flights page


