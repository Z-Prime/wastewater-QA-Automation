package com.qe.vt.zprime.tst.stepDef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.qe.vt.zprime.constants.Locators;
import com.qe.vt.zprime.constants.Config;
import com.qe.vt.zprime.constants.LocatorTypes;
import com.qe.vt.zprime.constants.LoggerTest;
import com.qe.vt.zprime.element.Element;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Element {

	private static final Logger logger = LogManager.getLogger(LoggerTest.class);
// URL launching

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		initializeWebDriver(Config.BROWSER_TYPE);
		driver.get(Config.BASE_URL);
		driver.manage().window().maximize();
	}

	@Then("User be able to see the home page with Zprime logo")
	public void user_be_able_to_see_the_home_page_with_zprime_logo() {
		logger.atDebug().log("User be able to see the logo image");
		getWebElementWithFluentwait(Locators.ZPRIME_MAINLOGO_XPATH, LocatorTypes.XPATH).isDisplayed();
		logger.atDebug().log("User successfully see the logo image");
	}
//	Leftmenu

	@When("User clicks on left menu bar")
	public void user_clicks_on_left_menu_bar() {
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see zprime logo, back arrow, select your page text and entry pionts for dashboards")
	public void user_be_able_to_see_zprime_logo_back_arrow_select_your_page_text_and_entry_pionts_for_parameters() {
		getWebElementWithFluentwait(Locators.ZPRIME_LOGO_XPATH, LocatorTypes.XPATH).isDisplayed();
		WebElement ele = getWebElementWithFluentwait(Locators.SELECT_PAGE_TEXT_XPATH, LocatorTypes.XPATH);
		System.out.println(ele.getText());
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_BACKARROW_XPATH, LocatorTypes.XPATH).isDisplayed();
	}

	@When("User clicks on back arrow")
	public void user_clicks_on_back_arrow() {
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_BACKARROW_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {

	}

//	Compliance
	@When("User clicks on compliance")
	public void user_clicks_on_compliance() {
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_COMPLIANCE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the compliance dashboard")
	public void user_be_able_to_navigate_to_the_compliance_dashboard() {

	}

	@When("User clicks on date icon to select date")
	public void user_clicks_on_date_icon_to_select_date() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_DATERANGE_PICKER_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User selects start date and end date")
	public void user_selects_start_date_and_end_date() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_STARTDATE_XPATH, LocatorTypes.XPATH).sendKeys(Keys.CONTROL+ "a");
		getWebElementWithFluentwait(Locators.COMPLIANCE_STARTDATE_XPATH, LocatorTypes.XPATH).sendKeys(Keys.DELETE);
		getWebElementWithFluentwait(Locators.COMPLIANCE_STARTDATE_XPATH, LocatorTypes.XPATH).sendKeys("2024-09-08");
		getWebElementWithFluentwait(Locators.COMPLIANCE_ENDDATE_XPATH, LocatorTypes.XPATH).sendKeys(Keys.CONTROL+ "a");
		getWebElementWithFluentwait(Locators.COMPLIANCE_ENDDATE_XPATH, LocatorTypes.XPATH).sendKeys(Keys.DELETE);
		getWebElementWithFluentwait(Locators.COMPLIANCE_ENDDATE_XPATH, LocatorTypes.XPATH).sendKeys("2024-09-23");
	}

	@Then("User be able to see dashboard with the dates")
	public void user_be_able_to_see_dashboard_with_the_dates() {

	}

	@When("User clicks on User01 dropdown")
	public void user_clicks_on_user01_dropdown() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_USER_DROPDOWN_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to see profile, setting, logout options")
	public void user_able_to_see_profile_setting_logout_options() {

	}

	@When("User clicks on profile option")
	public void user_clicks_on_profile_option() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_USER_PROFILE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to navigate to the user profile page")
	public void user_able_to_navigate_to_the_user_profile_page() {

	}

	@When("User clicks on settings option")
	public void user_clicks_on_settings_option() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_USER_DROPDOWN_XPATH, LocatorTypes.XPATH).click();
		WebElement ele1 = getWebElementWithFluentwait(Locators.COMPLIANCE_USER_SETTINGS_XPATH, LocatorTypes.XPATH);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele1);
	}

	@Then("User able to navigate to the setting page")
	public void user_able_to_navigate_to_the_setting_page() {

	}

	@When("User clicks on logout option")
	public void user_clicks_on_logout_option() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_USER_DROPDOWN_XPATH, LocatorTypes.XPATH).click();
		WebElement ele2 = getWebElementWithFluentwait(Locators.COMPLIANCE_USER_LOGOUT_XPATH, LocatorTypes.XPATH);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele2);
	}

	@Then("User able to logout")
	public void user_able_to_logout() {

	}

	@When("User clciks on logo image button")
	public void user_clciks_on_logo_image_button() {
		getWebElementWithFluentwait(Locators.ZPRIME_LOGO_IMAGE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to navigate to the main dashboard")
	public void user_able_to_navigate_to_the_main_dashboard() {

	}

	@When("User clicks on search bar and pass some text")
	public void user_clicks_on_search_bar_and_pass_some_text() {
		getWebElementWithFluentwait(Locators.COMPLIANCE_SEARCH_BAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.COMPLIANCE_SEARCH_BAR_XPATH, LocatorTypes.XPATH).sendKeys("Productivity");
	}

	@Then("User be able to navigate to particular dashboard")
	public void user_be_able_to_navigate_to_particular_dashboard() {

	}

//	Performance droplist

	@Then("User be able to see entrypoins for dashboards")
	public void user_be_able_to_see_entrypoins_for_dashboards() {

	}

	@When("User clicks on performance drop down")
	public void user_clicks_on_performance_drop_down() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_DROP_LIST_CSS, LocatorTypes.CSSSELECTOR).click();
	}

	@Then("User be able to see reactor1 reactor2")
	public void user_be_able_to_see_reactor1_reactor2() {

	}

	@When("User clicks on Reactor1 button")
	public void user_clicks_on_Reactor1_button() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_DROPLIST_REACTOR1_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_PERFORMANCE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.PERFORMANCE_DROP_LIST_CSS, LocatorTypes.CSSSELECTOR).click();
	}

	@Then("User be able to see Reactor1 page")
	public void user_be_able_to_see_Reactor1_page() {
	}

	@When("User clciks on Reactor2 button")
	public void user_clciks_on_reactor2_button() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_DROPLIST_REACTOR2_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see Reactor2 page")
	public void user_be_able_to_see_reactor2_page() {

	}

	@When("User clicks on overall\\/summary button")
	public void user_clicks_on_overall_summary_button() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_OVERALL_SUMMARY_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see overall\\/summary page")
	public void user_be_able_to_see_overall_summary_page() {

	}
//	Performance page

	@When("User clicks on performance")
	public void user_clicks_on_performance() {
		getWebElementWithFluentwait(Locators.LEFT_ENTRYPOINT_PERFORMANCE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the performance dashboard")
	public void user_be_able_to_navigate_to_the_performance_dashboard() {

	}

	@When("User clicks on reactor1 button")
	public void user_clicks_on_reactor1_button() {
		getWebElementWithFluentwait(Locators.REACTOR1_BUTTON_XPATH, LocatorTypes.XPATH).click();

	}

	@Then("User be able to see the reactor1 page")
	public void user_be_able_to_see_the_reactor1_page() {

	}

	@When("User clicks on reactor2 button")
	public void user_clicks_on_reactor2_button() {
		getWebElementWithFluentwait(Locators.REACTOR2_BUTTON_XPATH, LocatorTypes.XPATH).click();

	}

	@Then("User be able to see the reactor2 page")
	public void user_be_able_to_see_the_reactor2_page() {

	}

	@When("User clciks on overall\\/summary button")
	public void user_clciks_on_overall_summary_button() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_OVERALL_SUMMARY_XPATH, LocatorTypes.XPATH).click();
	}
//	 Productivity page

	@When("User clicks on productivity")
	public void user_clicks_on_productivity() {
		getWebElementWithFluentwait(Locators.PRODUCTIVITY_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the productivity dashboard")
	public void user_be_able_to_navigate_to_the_productivity_dashboard() {

	}
	@When("User select start date and end dates")
	public void user_select_start_date_and_end_dates() {
//		driver.navigate().refresh();
//		getWebElementWithFluentwait(Locators.PRODUCTIVITY_STARTDATE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.PRODUCTIVITY_STARTDATE_XPATH, LocatorTypes.XPATH).sendKeys("2024-09-15");
		getWebElementWithFluentwait(Locators.PRODUCTIVITY_ENDDATE_XPATH, LocatorTypes.XPATH).sendKeys("2024-09-25");
	}
	@Then("User able to see dashboard with selected dates")
	public void user_able_to_see_dashboard_with_selected_dates() {
	    
	}

	@When("User clicks on search bar of productivity dashboardand passes text")
	public void user_clicks_on_search_bar_of_productivity_dashboardand_passes_text() {
		getWebElementWithFluentwait(Locators.PRODUCTIVITY_SEARCH_BAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.PRODUCTIVITY_SEARCH_BAR_XPATH, LocatorTypes.XPATH).sendKeys("forecasting");
	}

	@Then("User able to navigate to particular tab")
	public void user_able_to_navigate_to_particular_tab() {

	}

//	Operational insights

	@When("User clicks on operational insights")
	public void user_clicks_on_operational_insights() {
		getWebElementWithFluentwait(Locators.OPERATIONAL_INSIGHTS_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the operational insights dashboard")
	public void user_be_able_to_navigate_to_the_operational_insights_dashboard() {

	}

	@When("User clicks on Flow meter vs feeding pump x-axis option1 drop down")
	public void user_clicks_on_flow_meter_vs_feeding_pump_x_axis_option1_drop_down() {
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@When("User selects option2 and clicks on y-axis option1 drop down and selects option2")
	public void user_selects_option2_and_clicks_on_y_axis_option1_drop_down_and_selects_option2() {
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_X_AXIS_OPTION2_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_Y_AXIS_OPTION2_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User be able to see option2 graph")
	public void user_be_able_to_see_option2_graph() {

	}

	@When("User selects option3 on x and y-axis")
	public void user_selects_option3_on_x_and_y_axis() {
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_X_AXIS_OPTION3_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_Y_AXIS_OPTION3_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User be bale to see option3 graph")
	public void user_be_bale_to_see_option3_graph() {

	}

	@When("User selets option1 on x and y-axis")
	public void user_selets_option1_on_x_and_y_axis() {
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_X_AXIS_OPTION1_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_VS_FEEDING_PUMP_Y_AXIS_OPTION1_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User be able to see option1 graph")
	public void user_be_able_to_see_option1_graph() {

	}

	@When("User clicks on Flow-meter and Feeding pump is running vs time X and y-axis dropdown and selects option1, option2, option3 on x and y-axis")
	public void user_clicks_on_flow_meter_and_feeding_pump_is_running_vs_time_x_and_y_axis_dropdown_and_selects_option1_option2_option3_on_x_and_y_axis() {
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_X_AXIS_OPTION1_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_Y_AXIS_OPTION1_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_X_AXIS_OPTION2_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_Y_AXIS_OPTION2_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_X_AXIS_OPTION3_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.FLOW_METER_AND_FEEDING_PUMP_Y_AXIS_OPTION3_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User be able to see graphs")
	public void user_be_able_to_see_graphs() {

	}

	@When("User clicks on pH and Temperature vs time x and y-axis dropdown and selects option1, option2, option3 on x and y-axis")
	public void user_clicks_on_p_h_and_temperature_vs_time_x_and_y_axis_dropdown_and_selects_option1_option2_option3_on_x_and_y_axis() {
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_X_AXIS_OPTION1_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_Y_AXIS_OPTION1_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_X_AXIS_OPTION2_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_Y_AXIS_OPTION2_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_X_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_X_AXIS_OPTION3_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_Y_AXIS_DROPDOWN_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.PH_AND_TEMPERATURE_VS_TIME_Y_AXIS_OPTION3_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User be able to see all graphs")
	public void user_be_able_to_see_all_graphs() {

	}

	@When("User clicks on date icon of operational insights dashboards and selects start, end dates")
	public void user_clicks_on_date_icon_of_operational_insights_dashboards_and_selects_start_end_dates() {
		driver.navigate().refresh();
		getWebElementWithFluentwait(Locators.OPERATIONAL_INSIGHTS_DATERANGE_PICKER_XPATH, LocatorTypes.XPATH).click();
//		getWebElementWithFluentwait(Locators.DATE_PREVIOUS_BUTTON_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.OPERATIONAL_INSIGHTS_SATRTDATE_XPATH, LocatorTypes.XPATH).sendKeys("2024-08-15");
		getWebElementWithFluentwait(Locators.OPERATIONAL_INSIGHTS_ENDDATE_XPATH, LocatorTypes.XPATH).sendKeys("2024-09-24");
	}

	@Then("User able to see dashboard with seleted dates")
	public void user_able_to_see_dashboard_with_seleted_dates() {

	}

	@When("User clicks on search bar of operational insights and passes text")
	public void user_clicks_on_search_bar_of_operational_insights_and_passes_text() {
		getWebElementWithFluentwait(Locators.OPERATIONAL_INSIGHTS_SEARCHBAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.OPERATIONAL_INSIGHTS_SEARCHBAR_XPATH, LocatorTypes.XPATH)
				.sendKeys("performance");
	}

//	Circularity and Sustainability

	@When("User clicks on circularity and sustainability")
	public void user_clicks_on_circularity_and_sustainability() {
		getWebElementWithFluentwait(Locators.CIRCULARITY_SUSTAINABILITY_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the circulatory sustainability dashboard")
	public void user_be_able_to_navigate_to_the_circulatory_sustainability_dashboard() {

	}

	@When("User clicks on indicators in compliance with iso59000")
	public void user_clicks_on_indicators_in_compliance_with_iso59000() {
		getWebElementWithFluentwait(Locators.INDICATORS_ISO_59000_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see iso59000 page")
	public void user_be_able_to_see_iso59000_page() {

	}

	@When("User clicks on action indicators")
	public void user_clicks_on_action_indicators() {
		getWebElementWithFluentwait(Locators.ACTION_INDICATORS_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see action indicator page")
	public void user_be_able_to_see_action_indicator_page() {

	}

	@When("User clicks on indicators in compliance with iso14000")
	public void user_clicks_on_indicators_in_compliance_with_iso14000() {
		getWebElementWithFluentwait(Locators.INDICATORS_ISO_14000_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see iso14000 page")
	public void user_be_able_to_see_iso14000_page() {

	}

	@When("User clicks on date icon of Circularity-Sustainability dashboard and selects start date and end date")
	public void user_clicks_on_date_icon_of_circularity_sustainability_dashboard_and_selects_start_date_and_end_date() {
		getWebElementWithFluentwait(Locators.CIRCULARITY_SUSTAINABILITY_DATERANGE_PICKER_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.CIRCULARITY_SUSTAINABILITY_STARTDATE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.CIRCULARITY_SUSTAINABILITY_ENDDATE_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clciks on Circularity-Sustainability search bar and passes text")
	public void user_clciks_on_circularity_sustainability_search_bar_and_passes_text() {
		getWebElementWithFluentwait(Locators.CIRCULARITY_SUSTAINABILITY_SEARCHBAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.CIRCULARITY_SUSTAINABILITY_SEARCHBAR_XPATH, LocatorTypes.XPATH)
				.sendKeys("compliance");
	}

//	Sustainable-strategic-planning

	@When("User clicks on suatainable strategic planning")
	public void user_clicks_on_suatainable_strategic_planning() {
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_NO_DATA_CLOSE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the strategic planning dashboard")
	public void user_be_able_to_navigate_to_the_strategic_planning_dashboard() {

	}

	@When("User clicks on date icon to select date range")
	public void user_clicks_on_date_icon_to_select_date_range() {
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_DATERANGE_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User selects start date")
	public void user_selects_start_date() {
		getWebElementWithFluentwait(Locators.DATE_PREVIOUS_BUTTON_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_SELECT_STARTDATE_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User selects end date")
	public void user_selects_end_date() {
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_SELECT_ENDDATE_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clicks on drop down to select modify srt")
	public void user_clicks_on_drop_down_to_select_modify_srt() {
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_DROPDOWN_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User click on modify srt and clicks on run simulation")
	public void user_click_on_modify_srt_and_clicks_on_run_simulation() {
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_SELECT_MODIFYSRT_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_RUNSIMULATION_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see data in widgets")
	public void user_be_able_to_see_data_in_widgets() {

	}

	@When("User clicks on modify inflow volume and clicks on run simulation")
	public void user_clicks_on_modify_inflow_volume_and_clicks_on_run_simulation() {
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_NO_DATA_CLOSE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_DROPDOWN_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_SELECT_MODIFYINFLOW__XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_RUNSIMULATION_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clicks on Sustainable-strategic-planning search bar and passes text")
	public void user_clicks_on_sustainable_strategic_planning_search_bar_and_passes_text() {
		driver.navigate().refresh();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_NO_DATA_CLOSE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_SEARCHBAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SUSTAINABLE_PLANNING_SEARCHBAR_XPATH, LocatorTypes.XPATH)
				.sendKeys("circulatory and sustainability");
	}

//Forecasting

	@When("User clicks on forecasting")
	public void user_clicks_on_forecasting() {
		getWebElementWithFluentwait(Locators.FORECASTING_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to forecasting dashboard")
	public void user_be_able_to_navigate_to_forecasting_dashboard() {

	}

	@When("User clicks and select date")
	public void user_clicks_and_select_date() {
		getWebElementWithFluentwait(Locators.FORECASTING_DATE_PICKER_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.DATE_PREVIOUS_BUTTON_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_SELECT_DATE_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clicks and select hours, minutes")
	public void user_clicks_and_select_hours_minutes() {
		getWebElementWithFluentwait(Locators.FORECASTING_HOUR_PICKER_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_SELECT_HOUR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_HOUR_OK_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_MINUTE_PICKER_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_SELECT_MINUTE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_MINUTE_OK_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clicks on reactor2 radio button")
	public void user_clicks_on_reactor2_radio_button() {
		getWebElementWithFluentwait(Locators.FORECASTING_SELECT_REACTOR2_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clicks on minutes checkbox")
	public void user_clicks_on_minutes_checkbox() {
		getWebElementWithFluentwait(Locators.FORECASTING_CHECKBOX_60_MIN_XPATH, LocatorTypes.XPATH).click();
	}

	@When("User clicks on start forecast")
	public void user_clicks_on_start_forecast() {
		getWebElementWithFluentwait(Locators.FORECASTING_START_FORECAST_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see validation messages triggered")
	public void user_be_able_to_see_validation_messages_triggered() {

	}

	@When("User clicks on forecasting search bar and passes text")
	public void user_clicks_on_forecasting_search_bar_and_passes_text() {
		getWebElementWithFluentwait(Locators.FORECASTING_SEARCHBAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.FORECASTING_SEARCHBAR_XPATH, LocatorTypes.XPATH).sendKeys("compliance");
	}
//	Sensor/Equipment-alarms

	@When("User clicks on sensor alarms")
	public void user_clicks_on_sensor_alarms() {
		getWebElementWithFluentwait(Locators.SENSOR_EQUIPMENT_ALARMS_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to sensor alarms dashboard")
	public void user_be_able_to_navigate_to_sensor_alarms_dashboard() {

	}

	@When("User clicks on date icon of sensor equipment and selects start and end dates")
	public void user_clicks_on_date_icon_of_sensor_equipment_and_selects_start_and_end_dates() {
		driver.navigate().refresh();
		getWebElementWithFluentwait(Locators.SENSOR_EQUIPMENT_ALARMS_DATERANGE_PICKER_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.DATE_PREVIOUS_BUTTON_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SENSOR_EQUIPMENT_ALARMS_STARTDATE_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SENSOR_EQUIPMENT_ALARMS_ENDDATE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to see dashboard with the selected dates")
	public void user_able_to_see_dashboard_with_the_selected_dates() {

	}

	@When("User clicks on  Sensor\\/Equipment-alarms search bar and passes text")
	public void user_clicks_on_sensor_equipment_alarms_search_bar_and_passes_text() {
		getWebElementWithFluentwait(Locators.SENSOR_EQUIPMENT_ALARMS_SEARCHBAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.SENSOR_EQUIPMENT_ALARMS_SEARCHBAR_XPATH, LocatorTypes.XPATH)
				.sendKeys("forecasting");
	}
//	 Meteorological-conditions

	@When("User clicks on meteorological conditions")
	public void user_clicks_on_meteorological_conditions() {
		WebElement ele3 = getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_XPATH, LocatorTypes.XPATH);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele3);
	}

	@Then("User be able to navigate to meteorological conditions dashboard")
	public void user_be_able_to_navigate_to_meteorological_conditions_dashboard() {

	}

	@When("User selects precipitation, radiation checkboxes")
	public void user_selects_precipitation_radiation_checkboxes() {
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_PRECIPITATION_CHECKBOX_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_RADIATION_CHECKBOX_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@When("User clicks on daily forecast resolution and 3days forecast period")
	public void user_clicks_on_daily_forecast_resolution_and_3days_forecast_period() {
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_FORECAST_RESOLUTION_DAILY_RADIO_XPATH,
				LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_FORECAST_PERIOD_3DAY_RADIO_XPATH,
				LocatorTypes.XPATH).click();
	}

	@When("User clicks on start forecast button")
	public void user_clicks_on_start_forecast_button() {
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_START_FORECAST_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User be able to see forecast page")
	public void user_be_able_to_see_forecast_page() {

	}

	@When("User clicks on Meteorological-conditions search bar and passes text")
	public void user_clicks_on_meteorological_conditions_search_bar_and_passes_text() {
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_SEARCHBAR_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.METEOROLOGICAL_CONDITIONS_SEARCHBAR_XPATH, LocatorTypes.XPATH)
				.sendKeys("Sensor/Equipment-alarms");
	}
}
