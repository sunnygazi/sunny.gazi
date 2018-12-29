@sampleFeature
Feature: User registration to reserve flights

As a Site Visitor
I want to go to registration page, add my personal information, and

@sampleFeatureScenario1
Scenario: Register a user successfully 

Given as a user I am in registration page
When I enter first name, last name, user id, password, and confirm password
And I click on submit button
Then I received a user registration conformation   