Feature: Register user on Newtours

@travel
Scenario Outline: User registers on Newtours site	
	Given User accessed "http://newtours.demoaut.com/mercurywelcome.phpd" home page
	And Title of the page is "Welcome: Mercury Tours"
	Then User clicks on register link  
	And Enters first name as "<fname>" 
	And Enters last name as "<lname>"   
	And Enters phone number as "<phone>" 
	And Enters email ID as "<email>" 
	And Enters address as "<address>" 
	And Enters city as "<city>"
	And Enters state as "<state>"
	And Enters pincode as "<pcode>"
	And Selects country as "<country>" 
	And Enters username "<usernm>" of choice
	And Enters password "<pswd>" of choice 
	And Enters same "<pswd>" in confirm password field
	When User Clicks on Submit Button  
	Then User is successfully Registered and sees confirmation message
	
	Examples:
	|   fname   |   lname   |   phone       |   email      |   address   |   city   |   state   |   pcode   |   country   |   usernm   |   pswd    |
	|   fname1  |   lname1  |   1111111111  |   1@xyz.com  |  address1   |   city1  |   Goa     | 111111    |   India     | testusr1   | testpswd1 |
	|   fname2  |   lname2  |   1111111112  |   2@xyz.com  |  address2   |   city2  |   Goa     | 111112    |   India     | testusr2   | testpswd2 |
	|   fname3  |   lname3  |   1111111113  |   3@xyz.com  |  address3   |   city3  |   Goa     | 111113    |   India     | testusr3   | testpswd3 |
	|   fname4  |   lname4  |   1111111114  |   4@xyz.com  |  address4   |   city4  |   Goa     | 111114    |   India     | testusr4   | testpswd4 |
	|   fname5  |   lname5  |   1111111115  |   5@xyz.com  |  address5   |   city5  |   Goa     | 111115    |   India     | testusr5   | testpswd5 |
	|   fname6  |   lname6  |   1111111116  |   6@xyz.com  |  address6   |   city6  |   Goa     | 111116    |   India     | testusr6   | testpswd6 |
	|   fname7  |   lname7  |   1111111117  |   7@xyz.com  |  address7   |   city7  |   Goa     | 111117    |   India     | testusr7   | testpswd7 |
	|   fname8  |   lname8  |   1111111118  |   8@xyz.com  |  address8   |   city8  |   Goa     | 111118    |   India     | testusr8   | testpswd8 |
	|   fname9  |   lname9  |   1111111119  |   9@xyz.com  |  address9   |   city9  |   Goa     | 111119    |   India     | testusr9   | testpswd9 |
	|   fname10  |   lname10  |   1111111120  |   10@xyz.com  |  address10   |   city10  |   Goa     | 111120    |   India     | testusr10   | testpswd10 |
	
	