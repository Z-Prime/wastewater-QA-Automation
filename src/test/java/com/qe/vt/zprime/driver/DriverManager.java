package com.qe.vt.zprime.driver;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qe.vt.zprime.constants.Config;
import com.qe.vt.zprime.constants.LoggerTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static final Logger logger=LogManager.getLogger(LoggerTest.class);

	public static WebDriver driver;

	public void initializeWebDriver(String browserType) {
		switch(browserType) {
		case "chrome":
			logger.atDebug().log("starts launching browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.atDebug().log("Sucessfully launched chrome browser");
			break;
		case "fireFox":
			logger.atDebug().log("Starts launching Firefox driver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.atDebug().log("Sucessfully launched Firefox driver");
			break;  
		case "edge":
			logger.atDebug().log("Starts launching Edge driver");
			WebDriverManager.edgedriver().setup();
			driver =  new EdgeDriver();
			logger.atDebug().log("Sucessfully launched Edge driver");
			break;
		default:
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Config.IMPLICIT_WAIT_MAX_TIME));
		driver.manage().window().maximize();
	}
}

