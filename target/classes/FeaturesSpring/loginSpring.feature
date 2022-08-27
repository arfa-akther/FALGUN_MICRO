Feature: This feature is to validate Spring signin functionality

@login
Scenario: Verify spring user signin successfully

Given Launch spring "<URL>" application 
Then Click spring signin button
Then Enter spring email address and password and click signin button
Then Verify spring user signin has been successful