@Flights
Feature: User selects a flight

As a registered customer on http://newtours.demoaut.com
I wannt to select a flight
So that I can reserve my flight based on my needs

Scenario: Round trip flight

Given I am on newtours homepage
When I enter "<user name>" "<password>" and click submit
And I select flight type, no of passengers, origin, flight date, flight month, destinnation, return date, return month, service class, Airline
And I click on continue
Then I see select flight page
