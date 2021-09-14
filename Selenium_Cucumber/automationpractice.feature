Feature: Register user on Newtours

@automationpractice
Scenario Outline: User registers on Newtours site	
	Given User successfully accessed http://automationpractice.com/index.php home page  
	Then User clicks on Sign In button 
	And Enters valid "<email>" under create an account 
	And clicks on Create an Account button
	And Page title is Login - My Store  
	Then user Select the title radiobox
	And Enters First name as "<fname>" 
	And Enters Last name as "<lname>"   
	And Enters password as "<pswd>" 
	And user selects date as "<date>"
	And user selects month as "<month>" 
	And user selects year of birth as "<year>"
	And user enters address as "<address>" 
	And user enters city as "<city>" 
	And user selects country as "<country>" 
	And user selects state as "<state>" 
	And user enters postal code as "<code>" 
	And user enters Mobile Phone as "<phone>" 
	When User Clicks on Register Button  
	Then User is successfully Registered and sees confirmation message
	Examples:
	
	| email      | fname  | lname  | pswd  | date | month | year | address  | city  | country         | state   | code   | phone      |
	| 11@xyz.com | fname1 | lname1 | pswd1 | 10   | 10    | 1988 | address1 | City1 | United States   | Alabama | 411010 | 9970149665 |
	| 22@xyz.com | fname2 | lname2 | pswd2 | 10   | 10    | 1988 | address2 | City2 | United States   | Alabama | 411010 | 9970149665 |
	| 33@xyz.com | fname3 | lname3 | pswd3 | 10   | 10    | 1988 | address2 | City3 | United States   | Alabama | 411010 | 9970149665 |