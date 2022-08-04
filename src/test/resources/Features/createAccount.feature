Feature: User registration on Etherscan site.

  #The user should be able to create account in Etherscan site when the username,email adress,confirm email adress,password,confirm password are correct and checkboxes for agreeing with terms and conditions and for security are checked.
  
  	Scenario: Verification of inputs
    Given Open the Chrome and launch the application and accept cookies 
    When Enter the Username
    And Email Address
    And Confirm Email Address
    And Password
    And Confirm Password
    Then Close the browser
    
    Examples: 
        |username|email adress|confirm email address|password|confirm password|Case|
        |Aleksandra|a.aleksic61@gmail.com|a.aleksic61@gmail.com|Bogdan|Bogdan|Valid|
        |123456???|sakdjksa??|c61@gmail.com|spiro|ciro|InValid|
    
    #Expected result is that all inputs are fillable      
    
    Scenario: Verification of checkboxes
    Given Open the Chrome and launch the application and accept cookies
    When Check agree with terms and contions checkbox
    And Check newsletter checkbox
    Then Close the browser
    
    #Expected result is that checkboxes are clicable  
    
    Scenario: Verification of Terms and Condition link
    Given Open the Chrome and launch the application and accept cookies
    When Click on terms and condition link 
    Then Nnew page with explanatio of Term and Conditions will open
    Then Close the browser
    
    #Expected result is that link opens new page with explanation of Term and Conditions
    
    Scenario: Verification of unsubscribe link
    Given Open the Chrome and launch the application and accept cookies
    When Click on unsubscribe link
    Then New page with explanation how to unsubscribe will open
    Then Close the browser
    
    #Expected result is that link opens new page with explanation of Term and Conditions
    
    Scenario: Verification of recaptcha checkbox
    Given Open the Chrome and launch the application and accept cookies
    When Check recaptha checkbox
    Then Close the browser
    
    #Expected result is to check recaptcha checkbox
    
    Scenario: Verification of Click to Sing In 
    Given Open the Chrome and launch the application and accept cookies
    When Click on Click to Sing In and new page for log in will open
    Then Close the browser
    
    #Expected result is to open new page for log in
    
    Scenario: Verification of Create Account button
    Given Open the Chrome and launch the application and accept cookies
    When Enter the Username
    And Email Address
    And Confirm Email Address
    And Password
    And Confirm Password
    And Check agree with terms and contions checkbox
    And Click on create account button
    Then Close the browser
    
    #Expected result is that new account is created
    
    
    
    
    
    

  