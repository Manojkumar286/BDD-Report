Feature: Facebook Login Function-Testcase Automation

@FB_Login
Scenario: Fb Login With Valid Details
Given User Launch "Chrome" Browser
And User Navigate Url "https://www.facebook.com/"
And User Verify Page Land On Login Page
And User Enter Valid Username "Manoj"
And User Enter Valid Password "Kumar"
And User Clicl Login Button
Then User Verify Logedin Successfull


