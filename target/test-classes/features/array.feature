Feature: feature to test navigation for Array
Background: validate login
    Given The user is in homepage
    When the user gives proper loginid, password
    Then the user is logged in
    
Scenario: Validate getting started is working
    When user clicks on Get Started button
    Then user be directed to Array Data Structure page  

Scenario: Validate arrays in python page is working 
    When The user clicks Arrays in Python button 
    Then The user should be redirected to Arrays in Python page