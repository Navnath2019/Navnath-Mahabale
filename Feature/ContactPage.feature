Feature: Create Contact


Scenario Outline: Create Contact in CRM 

Given User is on login page 
Then Validate login page Tital 
When User enter user name "<username>" and password "<password>"
Then User click on login button
And  User is now Home page and Validate page Tital 
Then user move to new contact page 
Then User Enter "<FirstName>" and "<LastName>" and "<Position>"
Then Close the browser	 

Examples:

| username | password | FirstName | LastName | Position |
| Navnath | Navnath@123 | Navnath | Mahabale | IT_Admin |
| Navnath | Navnath@123 | NKM        | ComputerCare | IT      |



