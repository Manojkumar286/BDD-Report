
Feature: Adactin Login Test Case-Automation

@Adactin_login
Scenario Outline: Adactin login with Invalid Details
Given User Launch "Chrome" browser
And User navigate Url "https://adactinhotelapp.com/"
And Verify Land On Login Page
And Enter User Name <UserName>
And Enter User Password <Password>
And User Click Login Button
Then User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"

Examples: 
|UserName|Password|
|"Invalid UserName"|"Valid Password"|
|"Valid UserName"|"Invalid Password"|
|"Invalid UserName"|"Invalid Password"|