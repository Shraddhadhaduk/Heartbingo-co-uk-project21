package uk.co.heartbingo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "uk/co/heartbingo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags =  "@regression"
)

public class RunCukeTest extends AbstractTestNGCucumberTests {


}
