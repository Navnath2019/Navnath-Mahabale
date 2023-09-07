Feature: New Deal Creation


Scenario: Create create a new deal scenario

Given User is on login page 
Then Validate login page Tital 
When User enter user name and password
| username | password |
| Navnath | Navnath@123 |
Then User click on login button
And  User is now Home page and Validate page Tital 
Then user move to new deal page 
Then User enter new deal details
| tital 				 | amount  | probability | commission | 
| test_deal1 | 1000 		| 50                   | 10                 |
| test_deal2 | 2000       | 60                   | 20                 |
| test_deal3 | 3000       | 70                   | 30                 |
Then Close the browser 	 



	
