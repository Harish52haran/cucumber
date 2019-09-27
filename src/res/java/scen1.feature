Feature: CaseStudy one
Scenario: Registration
Given User Should be in Registration Page
When User enters user name "Harish51"
And User Enters First name "Hari"
And User Enters Lastname "haran"
And User Enters Password "boomshaha"
And User Re-Enters Password "boomshaha"
And User Selects Gender "Male"
And User Enter Email "harisiva474@gmail.com"
And User Enter mobilenum "9876543219"
And User Enter dob "02/05/1998"
And User Enter Address "Chennavvvvvvvvvvvvvvvvvvvi"
And User Selects Security Question "What is your Birth Place?"
And User enters Answer "Chennai"
Then User land on login page