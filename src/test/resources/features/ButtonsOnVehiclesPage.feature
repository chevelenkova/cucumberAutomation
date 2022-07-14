@WIP
Feature: Vehicles page buttons verification
  US:As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons


  @B26G18-100 @B26G18-3
  Scenario Outline: TCAC001 Vetify user is able to click Export Grid dropdown
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then user should be able to click Export Grid dropdown
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|

  @B26G18-101 @B26G18-3
  Scenario Outline: TCAC002Verify Export dropdown in the left of the page
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then Export Grid dropdown should be in the left of the page
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|

    #User Should be able to click on refresh button
  @B26G18-102 @B26G18-3
  Scenario Outline: TCAC003
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then user should be able to click on Refresh button
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|

    #User should be able to click on Reset button
  @B26G18-103 @B26G18-3
  Scenario Outline: TCAC004
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then user should be able to click on Reset button
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|

    #User can click on Grid Setting Button
  @B26G18-104 @B26G18-3
  Scenario Outline: TCAC005
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then user should be able to click on Grid Settings Button
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|

  @B26G18-108 @B26G18-3
  Scenario Outline: TCAC006Verify location of Reset button
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then user should see Refresh Button on the left of ResetButton and Grid Settings should be on the right side
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|

    #Verify Grid Settings button in the left of the page
  @B26G18-109 @B26G18-3
  Scenario Outline: TCAC007
    Given user with "<userName>" and "<password>" is on Home page
    When user clicks on Vehicle under Fleet module
    Then Grid Settings button should be in the right of the page
    Examples:
      |userName|password|
      |user150 |UserUser123|
      |user151 |UserUser123|
      |user152 |UserUser123|


