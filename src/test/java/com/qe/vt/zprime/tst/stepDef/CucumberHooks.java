package com.qe.vt.zprime.tst.stepDef;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qe.vt.zprime.constants.LoggerTest;
import com.qe.vt.zprime.driver.DriverManager;
import com.qe.vt.zprime.utilities.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks extends DriverManager {

	private static final Logger logger = LogManager.getLogger(LoggerTest.class);

	@Before
	public void setup(Scenario scenario) {
		logger.atDebug().log("Before Scenario Name.................." + scenario.getName());
		logger.atDebug().log("Before Scenario LineNumber.................." + scenario.getLine());
		logger.atDebug().log("Before Scenario URI.................." + scenario.getUri());
	}

	@After
	public void teardown(Scenario scenario) {
		logger.atDebug().log("After scenario.isFailed.................." + scenario.isFailed());
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		takeSnapShot();
	}

	public void takeSnapShot() {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		try {
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots/Screenshot-" + Utilities.getDateandTime() + ".png");
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			logger.atError().log("Exception inside takeSnapShot()......" + e.getMessage());
			e.printStackTrace();
		}

	}
}