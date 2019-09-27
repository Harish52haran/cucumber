Feature: Check for Login
Scenario Outline: Passing Values for login from datatable

Given Check for login
When User enter "<username>" and "<password>"
Then User Land in Homepage 

Examples:

|username||password|
|lalitha||password123|
|tutorial||tutorial|