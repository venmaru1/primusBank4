Feature: Login Feature

 Background: User is successfully logged in
 When user opens the "Chrome" browser and exe "C:\\RohanHomePractice\\primusBank4\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
 When user enters the url "http://www.primusbank.qedgetech.com/"
@SmokeTest
 Scenario: Login functionality for valid username and password
 When user enters "Admin" as username
 When user enters "Admin" as password
 When user click on Login button
 Then user is on the "Admin" main page and ge message as welcome to Admin

