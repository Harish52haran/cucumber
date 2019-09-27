Feature: Search product
Scenario: Search for successful search
Given User Should be Logged in
When user enter minimum of four char in testbox "head"
Then user should be in cart page
Scenario: Search for Un-Sucessful1 search
Given User Should be Logged in
When user enter minimum of four char in testbox "govindha"
Then user should be in cart page
Scenario: Search for Un-Sucessful2 search
Given User Should be Logged in
When user enter minimum of four char in testbox "had"
Then user should be in cart page
