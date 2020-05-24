 Feature: Account creation page
 
  Background: Login into application
 	Given click on sigin 
    Then user enters username and password
    And  user clicks on login button
 	
 Scenario: Adding apparels
    Given click on women section
    Then click on clothes
    Then switch the driver
    Then select the quantity
    Then click on submit button
    Then click on checkout button
    Then click on again_checkout button
    Then click on address button
    Then click on terms and condition
    Then click on summary checkout button
    Then payment of paywire
    Then click on order confirm
    Then check the confirmation text
    
    
    Scenario: checking order history
    Given click on userAccount
    Then click on order history
    Then check the total price
    