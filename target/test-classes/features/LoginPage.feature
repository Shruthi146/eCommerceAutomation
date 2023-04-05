Feature: Login Page Functionality

#@Test2
#Scenario: Login User with correct email and password
#Given Launch browser
#When Navigate to url 'http://automationexercise.com'
#Then Verify that home page is visible successfully
#And Click on Signup Or Login button
#Then Verify Login to your account is visible
#And Enter correct email address "shruthi@gmail.com" and password "Welcome123"
#And Click login button
#Then Verify that Logged in as username is visible
#And Click Delete Account button
#Then Verify that ACCOUNT DELETED! is visible

#@Test3
#Scenario: Login User with incorrect email and password
#Given Launch browser
#When Navigate to url 'http://automationexercise.com'
#Then Verify that home page is visible successfully
#And Click on Signup Or Login button
#Then Verify Login to your account is visible
#And Enter incorrect email address "shruthi@gmail.com" and password "Welcome123"
#And Click login button
#Then Verify error Your email or password is incorrect! is visible

@Test4
Scenario: Logout User
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify Login to your account is visible
And Enter correct email address "shruthi@gmail.com" and password "Welcome123"
And Click login button
Then Verify that Logged in as username is visible
And Click Logout button
Then Verify that user is navigated to login page

@Test5
Scenario: Register User with existing email
Given Launch browser
When Navigate to url 'http://automationexercise.com'
Then Verify that home page is visible successfully
And Click on Signup Or Login button
Then Verify New User Signup! is visible
And Enter name "shruthi" and already registered email address "shruthi@gmail.com"
And Click Signup button
Then Verify error Email Address already exist! is visible
