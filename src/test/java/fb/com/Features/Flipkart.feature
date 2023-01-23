
Feature: Order MI Mobile Test-Case Automation

@Flipkart
Scenario: Mobile Order With Valid Details
Given User Launch "Chrome" Browser
And User Navigate Url "https://www.flipkart.com/"
And User Close The Login Model Screen
And User Click The Mobile Option
And User Touch The Electronics
And User Click The MI Option
And User Verify Land On MI Mobile Page
And User Fix The Max Price
And User Search For MI Mobile Products
And User Click The First Product On That Page
And Product Open On New Tab Page
And Check The Product is Greater Than Or Equal To Zero
And User Enter The Pincode
And User Click The View Details
And User Close The View Details Page
And User Click The Add TO Cart Button


 