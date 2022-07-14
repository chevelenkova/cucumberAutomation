@wip
Feature: Verify user can access all car info

	#Given I am a truck driver on Vytrack Home page 
	#
	#When i navigate to Vehicle page
	#
	#Then i should see all vehicle information
	@B26G18-183 @B26G18-3
	Scenario Outline: US1AC1 user able to see all vehicle info
		Given user with "<userName>" and "<password>" is on Home page
		When user clicks on Vehicle under Fleet module
		Then user should see all vehicle information
		Examples:
			|userName|password|
			|user150 |UserUser123|
			|user151 |UserUser123|
			|user152 |UserUser123|