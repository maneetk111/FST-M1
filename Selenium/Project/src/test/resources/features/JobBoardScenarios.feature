@JOB
Feature: JOb Board Project scenarios
	@test1
	Scenario: Verify the website title
	  Given User open the broswer 
	  When Navigate to "https://alchemy.hguy.co/jobs"
	  Then Get the title of the website
	  And Make sure it matches "Alchemy Jobs – Job Board Application" exactly
	  Then Close the browser

 @test2
  Scenario: Verify the website heading
    Given User open the broswer 
    When Navigate to "https://alchemy.hguy.co/jobs"
    Then Get the heading of the webpage
    And Make sure it matches "Welcome to Alchemy Jobs" exactly
    Then Close the browser

 @test3
  Scenario: Get the url of the header image
    Given User open the broswer 
    When Navigate to "https://alchemy.hguy.co/jobs"
    Then Get the url of the header image and print to console
    Then Close the browser
  
  @test4  
  Scenario: Verify the website’s second heading
    Given User open the broswer 
    When Navigate to "https://alchemy.hguy.co/jobs"
    Then Get the second heading on the page
    And Make sure it matches "Quia quis non" exactly
    Then Close the browser
  
  @test5    
  Scenario: Navigate to another page
    Given User open the broswer 
    When Navigate to "https://alchemy.hguy.co/jobs"
    Then Select the menu item that says Jobs and click it
    And Read the page title and verify that you are on the correct page
    Then Close the browser

  @test6
  Scenario: Apply for a job
    Given User open the broswer 
    When Navigate to "https://alchemy.hguy.co/jobs"
    Then Select the menu item that says Jobs and click it
    And Search for "Test Engineer" job and wait for listings to show
    Then Click and open any one of the jobs listed
    And Click the apply button and print the email to the console
    Then Close the browser

  @test7
  Scenario: Get the url of the header image
    Given User open the broswer 
    When Navigate to "https://alchemy.hguy.co/jobs"
    Then Click the menu item that says "Post a Job"
    And Fill in the necessary details and click the button that says Preview
    Then Click on the button that says Submit Listing
    Then Select the menu item that says Jobs and click it
		And Verify that the job listing was posted 
    Then Close the browser

  @test8    
  Scenario Outline: Login into the website’s backend
	    Given User open the broswer 
	    When Navigate to "https://alchemy.hguy.co/jobs/wp-admin"
	    Then Find the username field of the login form and enter the "<username>" into that field
	    Then Find the password field of the login form and enter the "<password>" into that field
	    And Find the login button and click it
	    Then Verify that you have logged in
	    Then Close the browser
  Examples: 
  			| username | password |
  			| root | pa$$w0rd |
  					
  @test9   
  Scenario Outline: Create a job listing using the backend
	    Given User open the broswer 
	    When Navigate to "https://alchemy.hguy.co/jobs/wp-admin"
	    Then Find the username field of the login form and enter the "<username>" into that field
	    Then Find the password field of the login form and enter the "<password>" into that field
	    And Find the login button and click it
	    Then Click on Job Listings from left hand menu
	    Then Locate the Add New button and click it
	    Then Fill in the necessary details
	    And Click the Publish button
			And Verify that the job listing was created
	    Then Close the browser
  Examples: 
  			|username|password|
  			|root|pa$$w0rd|