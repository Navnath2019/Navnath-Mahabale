Feature: Free CRM Login Feature


#Ex.-1 
#Scenario: Varify Login Successfully
#
#Given User is on login page 
#Then Validate login page Tital 
#When User enter user name "Navnath" and password "Navnath@123"
#Then User click on login button
#And  Validate page Tital 
#Then Close the browser

#Ex.-2
Scenario Outline: Varify Login Successfully

Given User is on login page 
Then Validate login page Tital 
When User enter user name "<username>" and password "<password>"
Then User click on login button
And  User is now Home page and Validate page Tital 
Then Close the browser	 

Examples: # here 3 testing parameter 

| username | password |
| Navnath | navnath@123 |
| Tom | Test@123 |
| Hary | Hari$123 |






