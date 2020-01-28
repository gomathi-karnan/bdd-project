Feature: automate swagger ui 

Background:

Given launch browser
When user in right page
Then validate the user landed page

@regtest
Scenario Outline: go to swagger api page 
	Given user must launch browser 
	When user in the swagger ui 
	#Then user must be enter <username> and <password> verify 
    And cards are displayed "true" 
    | false |
    
	Examples: 
		|username | password |
		|gomathiusernmae |vymopassword |
		|maniusernmae |password |    

@smoktest
	Scenario: go to swagger api page 
	Given user must launch browser 
 	When user in the swagger ui

