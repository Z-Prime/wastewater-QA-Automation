package com.qe.vt.zprime.element;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.qe.vt.zprime.constants.LocatorTypes;
import com.qe.vt.zprime.constants.LoggerTest;
import com.qe.vt.zprime.driver.DriverManager;

public class Element extends DriverManager{
	private static final Logger logger=LogManager.getLogger(LoggerTest.class);
	private static final long FLUENT_WAIT_MAX_TIME = 45;
	private static final long FLUENT_WAIT_INTERVAL_TIME = 300;
	public WebElement element;

	public WebElement getWebElement(String locatorName,LocatorTypes locatorType ) throws Exception {
		logger.atDebug().log("passing the parameters Locator type and locator name");
		switch(locatorType) {

		case ID:
			logger.atDebug().log("Locator type id we are passing");
			element=driver.findElement(By.id(locatorName));
			logger.atDebug().log("We are performing action on Locator type id");

			break;
		case CLASSNAME:
			logger.atDebug().log("Locator type class we are passing");
			element=driver.findElement(By.className(locatorName));
			logger.atDebug().log("We are performing action on Locator type class");
			break;
		case NAME:
			logger.atDebug().log("Locator type name we are passing");
			element=driver.findElement(By.name(locatorName));
			logger.atDebug().log("We are performing action on Locator type");
			break;
		case LINKTEXT:
			logger.atDebug().log("Locator type link we are passing");
			element=driver.findElement(By.linkText(locatorName));
			logger.atDebug().log("We are performing action on Locator type link text");
			break;	
		case XPATH:
			logger.atDebug().log("Locator type xpath we are passing");
			element=driver.findElement(By.xpath(locatorName));
			logger.atDebug().log("We are performing action on Locator type xpath");
			break;
		case CSSSELECTOR:
			logger.atDebug().log("Locator type css selector we are passing");
			element=driver.findElement(By.cssSelector(locatorName));
			logger.atDebug().log("We are performing action on Locator type css selector");
			break;
		default:
			throw new Exception(locatorType +"is invalid Locator Type");
		}
		return element;
	}

		public WebElement getWebElementWithFluentwait(final String locatorName, LocatorTypes locatorType) {

		logger.atDebug().log("passing the parameters Locator type and locator name");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(FLUENT_WAIT_MAX_TIME))
				.pollingEvery(Duration.ofMillis(FLUENT_WAIT_INTERVAL_TIME))
				.ignoring(NoSuchElementException.class);				 

		switch(locatorType) {
		case ID:
			logger.atDebug().log("Locator type id we are passing");
			element=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.id(locatorName));
				}
			}
					);
			break;
		case CLASSNAME:
			logger.atDebug().log("Locator type class we are passing");
			element=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.className(locatorName));
				}
			}
					);
			break;
		case NAME:
			logger.atDebug().log("Locator type name we are passing");
			element=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.name(locatorName));
				}
			}
					);
			logger.atDebug().log("We are performing action on Locator type");
			break;
		case LINKTEXT:
			logger.atDebug().log("Locator type link we are passing");
			element=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.linkText(locatorName));
				}
			}
					);
			logger.atDebug().log("We are performing action on Locator type link text");
			break;	
		case XPATH:
			logger.atDebug().log("Locator type xpath we are passing");
			element=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.xpath(locatorName));
				}
			}
					);
			logger.atDebug().log("We are performing action on Locator type xpath");
			break;
		case CSSSELECTOR:
			logger.atDebug().log("Locator type css selector we are passing");
			element=wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.cssSelector(locatorName));
				}
			}
					);
			logger.atDebug().log("We are performing action on Locator type css selector");
			break;
		default:
		logger.atDebug().log("invalid locator");
		}

		return element;
		}
		
		public WebElement getListWebElementWithFluentwait(final String locatorName, LocatorTypes locatorType) {

			logger.atDebug().log("passing the parameters Locator type and locator name");
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(FLUENT_WAIT_MAX_TIME))
					.pollingEvery(Duration.ofMillis(FLUENT_WAIT_INTERVAL_TIME))
					.ignoring(NoSuchElementException.class);				 

			switch(locatorType) {
			case ID:
				logger.atDebug().log("Locator type id we are passing");
				element=wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return (WebElement) driver.findElements(By.id(locatorName));
					}
				}
						);
				break;
			case CLASSNAME:
				logger.atDebug().log("Locator type class we are passing");
				element=wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return (WebElement) driver.findElements(By.className(locatorName));
					}
				}
						);
				break;
			case NAME:
				logger.atDebug().log("Locator type name we are passing");
				element=wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return (WebElement) driver.findElements(By.name(locatorName));
					}
				}
						);
				logger.atDebug().log("We are performing action on Locator type");
				break;
			case LINKTEXT:
				logger.atDebug().log("Locator type link we are passing");
				element=wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return (WebElement) driver.findElements(By.linkText(locatorName));
					}
				}
						);
				logger.atDebug().log("We are performing action on Locator type link text");
				break;	
			case XPATH:
				logger.atDebug().log("Locator type xpath we are passing");
				element=wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return (WebElement) driver.findElements(By.xpath(locatorName));
					}
				}
						);
				logger.atDebug().log("We are performing action on Locator type xpath");
				break;
			case CSSSELECTOR:
				logger.atDebug().log("Locator type css selector we are passing");
				element=wait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
						return (WebElement) driver.findElements(By.cssSelector(locatorName));
					}
				}
						);
				logger.atDebug().log("We are performing action on Locator type css selector");
				break;
			default:
			logger.atDebug().log("invalid locator");
			}

			return element;
		}	
	}