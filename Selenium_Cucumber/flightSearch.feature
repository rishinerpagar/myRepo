Feature: Flight search for AirAsia

@flight
Scenario: User searches for one way flights	
	Given User successfully accessed "https://www.airasia.com/en/home.page" home page
	And Page title is "Book Cheap Flights Online To Over 130 Destinations! | AirAsia"
	#Then User clicks on Flights icon*/ 
	
	And Enters Origin as "Bengaluru" 
	And Enter Destination as "Pune" 
	And Selects depart date as "15/12/2018"  
	And Selects Return date as "One Way" 
	When User Clicks on Search Button  
	Then User is navigated successfully to search flight page 
	
@login	
Scenario: Login to air asia site
	Given User navigates to the airasia site "https://www.airasia.com/en/home.page"
	And The page title is "Book Cheap Flights Online To Over 130 Destinations! | AirAsia"
	And User clicks on login button 
	And enter username as "a@gmail.comEnter" 
	And enter password as "India1234" 
	When user clicks on Sign In Button
	Then Verify that error message is displayed on screen in red and contains the text "Your log in attempt has been unsuccessful."
	
	
	
	

	
	
	
	
