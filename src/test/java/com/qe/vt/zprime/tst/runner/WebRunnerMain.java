package com.qe.vt.zprime.tst.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json"
		},
		features = "src/test/resources/features",
		glue={"com.qe.vt.zprime.tst.stepDef"},
		tags="@Circularity-Sustainability",
		monochrome = true 

		)
public class WebRunnerMain {
	
}
