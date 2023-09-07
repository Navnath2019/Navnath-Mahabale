Feature: New Deal Creation


Scenario: Create create a new deal scenario

Given User is on login page 
Then Validate login page Tital 
When User enter user name and password
| Navnath | Navnath@123 |
Then User click on login button
And  User is now Home page and Validate page Tital 
Then user move to new deal page 
Then User enter new deal details
| test_deal | 1000 | 50 | 10 |
Then Close the browser 	 



	
