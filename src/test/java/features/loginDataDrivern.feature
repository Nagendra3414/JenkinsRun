Feature: Login2 Feature

@Regression
Scenario Outline: Validating the username and password fields
Then Enter the username "<username>"
Then Add the password "<password>"
And click on login button
When close the browser

Examples:
|username|password|
|UserName_ABC|Password_ABC|


