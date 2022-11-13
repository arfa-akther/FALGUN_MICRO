Feature: This is to validate herokuapp functionalty 


Scenario: Verify the ContextMenu functionality 
Given Launch spring "<URL>" application
Then click on context Menu
Then right click on the given box and accept OK popup alert


Scenario: Verify the digest or basic Authentication functionality
 Given Launch spring "<URL>" application
 Then click on digest Authentication
 Then enter username pass to perfrom the action
 

Scenario: Verify the file upload functionality
 Given Launch spring "<URL>" application
 Then click on file upload
 Then click on choose file to select file
 Then click upload
 

Scenario: Verify the Dropdown functionality
Given Launch spring "<URL>" application
Then click on dropdown
Then Select dropdown 


Scenario: Verify the Frames functionality
Given Launch spring "<URL>" application
Then click on frames
Then click on Nested frames
Then Work on frames


Scenario: Verify the checkboxes functionality
Given Launch spring "<URL>" application
Then click on checkboxes option
Then verify checkbox displayed then select checkbox
Then verify checkbox is pre selected
Then verify checkbox enabled OR not Pre Selected then select checkbox


Scenario: Verify the checkboxes functionality
Given Launch spring "<URL>" application
Then get current link and all links including the total
Then get page resources and page title


Scenario: Verify the checkboxes functionality
Given Launch spring "<URL>" application
Then click on Form Authentication
Then click enter username and passowrd  and click login and print value username


Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then click on hovers
Then mouseover on images

@herokuapp
Scenario: Verify the tab functionality 
Given Launch spring "<URL>" application
Then  Click on drag and drop
Then perform drag 




