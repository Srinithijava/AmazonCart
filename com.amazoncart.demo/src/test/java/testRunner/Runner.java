package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import DataSetup.ConfigFileReader;
import DataSetup.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features"
,glue= {"com.amazoncart.stepDefinitions"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target\\cucumber-reports\\report.html"},
tags = {"@Amazon"},
monochrome = true
)

public class Runner {
	@AfterClass
	 public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getxmlpath()));
	 }
	
}
