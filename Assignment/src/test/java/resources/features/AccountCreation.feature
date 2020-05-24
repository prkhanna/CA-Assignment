 Feature: Account creation page
 
 Scenario: Create an account
  Given click on sigin
   Then Enter the email
  Then Click on createAccount
  Then Click on title
  And Enter the first name
  And Enter the last name
  And Enter the password
  And Enter the address
  And Enter the city
  And Enter the state
  And Enter the zipcode
  And Enter the country
  And Enter the mobileno
  And click on register
  Then click on signout
 
 
 Scenario: check login functionality of the application
    Given click on sigin 
    Then user enters username and password
    And user clicks on login button
    Then click on signout