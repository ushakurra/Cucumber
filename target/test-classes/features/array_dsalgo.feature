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
    
Scenario: Validate "tryEditor with a Run button to test"  is working 
    When The user is in the Arrays in Python page after logged in
    And The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an tryEditor with a Run button on arrays to test
    
    
Scenario: Validate "Arrays using List"  is working 
    Wehn The user clicks "Arrays using List" button
    Then The user should be redirected to "Arrays using List" page
    
Scenario: Validate "Arrays using List try Editor"  is working 
    When The user is in the Arrays using List page after logged in
    And The user clicks "Try Here" button in Arrays using List page
    Then The user should be redirected to a arrays page having an tryEditor with a Run button to test
   
Scenario: Validate "Basic Operations in List" page  is working 
    When The user clicks "Basic Operations in List" button
    Then The user should be redirected to "Basic Operations in List" page
    
Scenario: Validate "Basic Operations in List Try Here"  is working 
    When The user clicks "Try Here" button in Arrays using List page
    Then The user should be redirected to a Basic operations page having an tryEditor with a Run button to test

    
Scenario: Validate "Applications of Array" page is working 
    When The user clicks "Applications of Array" button
    Then The user should be redirected to "Applications of Array" page
    
Scenario: Validate "tryEditor in Applications of Arrays page"  is working 
    When The user clicks "Try Here" button in Applications of Arrays page
    Then The user should be redirected to a applications arrays page having an tryEditor with a Run button to test