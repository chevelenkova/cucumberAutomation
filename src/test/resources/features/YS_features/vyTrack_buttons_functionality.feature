Feature: VyTrack buttons functionality
  User story: As a user when I am on VyTrack -> Fleet -> Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons

  @B26G18-112
  Scenario Outline: B26G18 - YS: A6 TC001 Store Manager
    Given User enter valid "<username>" and valid "<password>"
    When User can click Vehicles button under the Fleet Module
    When Export Grid dropdown is on the left of the page
    When User should be able to click refresh button
    When User should be able click reset button
    When User should be able to click Grid Settings button
    Then "Refresh" button should be on the left side of "Reset" button
    Then "Grid Settings" should be on the right side of the "Reset" button
    Then Grid Setting button is on the right of the page

    Examples:
      | username       | password    |
      | storemanager85 | UserUser123 |
#      | salesmanager251| UserUser123 |
