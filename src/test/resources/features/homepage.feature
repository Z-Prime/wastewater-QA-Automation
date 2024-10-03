@all
Feature: Home page functionalities

  Background: Home page
    Given User is on the homepage
    Then User be able to see the home page with Zprime logo

  @Leftmenu
  Scenario: Validates the left menu
    When User clicks on left menu bar
    Then User be able to see zprime logo, back arrow, select your page text and entry pionts for dashboards
    When User clicks on back arrow
    Then User navigate to the home page

  @Compliance
  Scenario: Validates the compliance dashboard
    When User clicks on left menu bar
    And User clicks on compliance
    Then User be able to navigate to the compliance dashboard
    When User clicks on date icon to select date
    And User selects start date and end date
    Then User be able to see dashboard with the dates
    When User clicks on User01 dropdown
    Then User able to see profile, setting, logout options
    When User clicks on profile option
    Then User able to navigate to the user profile page
    When User clicks on settings option
    Then User able to navigate to the setting page
    When User clicks on logout option
    Then User able to logout
    When User clciks on logo image button
    Then User able to navigate to the main dashboard
    When User clicks on search bar and pass some text
    Then User be able to navigate to particular dashboard

  @Performance-Droplist
  Scenario: Validates the drop list
    When User clicks on left menu bar
    Then User be able to see entrypoins for dashboards
    When User clicks on performance drop down
    Then User be able to see reactor1 reactor2
    When User clicks on Reactor1 button
    Then User be able to see Reactor1 page
    When User clciks on Reactor2 button
    Then User be able to see Reactor2 page
    When User clicks on overall/summary button
    Then User be able to see overall/summary page

  @Performance
  Scenario: Click and navigate to the performance dashboard
    When User clicks on left menu bar
    And User clicks on performance
    Then User be able to navigate to the performance dashboard
    When User clicks on reactor1 button
    Then User be able to see the reactor1 page
    When User clicks on reactor2 button
    Then User be able to see the reactor2 page
    When User clciks on overall/summary button
    Then User be able to see overall/summary page

  @Productivity
  Scenario: Click and navigate to the productivity dashboard
    When User clicks on left menu bar
    And User clicks on productivity
    Then User be able to navigate to the productivity dashboard
    When User select start date and end dates
    Then User able to see dashboard with selected dates
    When User clicks on search bar of productivity dashboardand passes text
    Then User able to navigate to particular tab

  @OperationalInsights
  Scenario: Click and navigate to the operational insights dashboard
    When User clicks on left menu bar
    And User clicks on operational insights
    Then User be able to navigate to the operational insights dashboard
    When User clicks on Flow meter vs feeding pump x-axis option1 drop down
    And User selects option2 and clicks on y-axis option1 drop down and selects option2
    Then User be able to see option2 graph
    When User selects option3 on x and y-axis
    Then User be bale to see option3 graph
    When User selets option1 on x and y-axis
    Then User be able to see option1 graph
    When User clicks on Flow-meter and Feeding pump is running vs time X and y-axis dropdown and selects option1, option2, option3 on x and y-axis
    Then User be able to see graphs
    When User clicks on pH and Temperature vs time x and y-axis dropdown and selects option1, option2, option3 on x and y-axis
    Then User be able to see all graphs
    When User clicks on date icon of operational insights dashboards and selects start, end dates
    Then User able to see dashboard with seleted dates
    When User clicks on search bar of operational insights and passes text

  @Circularity-Sustainability
  Scenario: Click and navigate to the circulatory sustainability dashboard
    When User clicks on left menu bar
    And User clicks on circularity and sustainability
    Then User be able to navigate to the circulatory sustainability dashboard
    When User clicks on indicators in compliance with iso59000
    Then User be able to see iso59000 page
    When User clicks on action indicators
    Then User be able to see action indicator page
    When User clicks on indicators in compliance with iso14000
    Then User be able to see iso14000 page
    When User clicks on date icon of Circularity-Sustainability dashboard and selects start date and end date
    Then User able to see dashboard with selected dates
    When User clciks on Circularity-Sustainability search bar and passes text

  @Sustainable-strategic-planning
  Scenario: Click and navigate to the sustainable strategic planning dashboard
    When User clicks on left menu bar
    And User clicks on suatainable strategic planning
    Then User be able to navigate to the strategic planning dashboard
    When User clicks on date icon to select date range
    And User selects start date
    And User selects end date
    When User clicks on drop down to select modify srt
    And User click on modify srt and clicks on run simulation
    Then User be able to see data in widgets
    When User clicks on modify inflow volume and clicks on run simulation
    Then User be able to see data in widgets
    When User clicks on Sustainable-strategic-planning search bar and passes text

  @Forecasting
  Scenario: Click and navigate, validating forecasting dashboard
    When User clicks on left menu bar
    And User clicks on forecasting
    Then User be able to navigate to forecasting dashboard
    When User clicks and select date
    And User clicks and select hours, minutes
    And User clicks on reactor2 radio button
    And User clicks on minutes checkbox
    And User clicks on start forecast
    Then User be able to see validation messages triggered
    When User clicks on forecasting search bar and passes text

  @Sensor/Equipment-alarms
  Scenario: Click and navigate, validating sensor/equipment alarms dashboard
    When User clicks on left menu bar
    And User clicks on sensor alarms
    Then User be able to navigate to sensor alarms dashboard
    When User clicks on date icon of sensor equipment and selects start and end dates
    Then User able to see dashboard with the selected dates
    When User clicks on  Sensor/Equipment-alarms search bar and passes text

  @Meteorological-conditions
  Scenario: Click and navigate, validating meteorological conditions dashboard
    When User clicks on left menu bar
    And User clicks on meteorological conditions
    Then User be able to navigate to meteorological conditions dashboard
    When User selects precipitation, radiation checkboxes
    And User clicks on daily forecast resolution and 3days forecast period
    And User clicks on start forecast button
    Then User be able to see forecast page
    When User clicks on Meteorological-conditions search bar and passes text
