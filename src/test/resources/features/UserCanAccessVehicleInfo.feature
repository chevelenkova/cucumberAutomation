Feature: Default

	#Given I am a truck driver on Vytrack Home page 
	#
	#When i navigate to Vehicle page
	#
	#Then i should see all vehicle information
	@B26G18-183 @B26G18-3
	Scenario: US1AC1 user able to see all vehicle info
		Given I am a truck driver on Vytrack Home page 
		When i navigate to Vehicle page
		Then i should see all vehicle information