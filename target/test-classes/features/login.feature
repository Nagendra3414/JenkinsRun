Feature: Login Feature

Background:
Given Launching the browser


@Sanity
Scenario Outline: Validating the username and password fields
Then Enter the username "<username>"
Then Add the password "<password>"
And click on login button
When close the browser

Examples:
|username|password|scenario|
|UserName_ABC|Password_ABC|validData|
|UserName_XYZ|Password_XYZ|InvalidData|
