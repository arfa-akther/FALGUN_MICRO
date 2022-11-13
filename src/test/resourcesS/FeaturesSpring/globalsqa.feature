Feature: This is to validate tab functionalty 


Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then click on Tabs button
Then switch to iframe and click on section1
Then Click on Re-Size Accordion


Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then  Click on draganddrop
Then perform drag drop
Then click trash

@globaltab
Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then click on windows
Then in openNewTab click on clickHere option

	 
