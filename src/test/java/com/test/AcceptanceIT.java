package com.test;


//import io.cucumber.junit.Cucumber;
import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.testng.TestNGCourgette;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
/*
@CucumberOptions
  (
       plugin = {
                "pretty",
                "json:target/AcceptanceTestResults.json",
                 "rerun:target/rerun.txt"
        },
        features = "src/test/resources/com/test/",
        
       //When not explicitly stated in the @CucumberOptions annotation, the glue path is implicitly specified
        // as the package of the class with the @CucumberOptions annotation.
        //https://github.com/cucumber/cucumber-jvm/issues/1127
        //because stepdefs and feature are in different package , we need to specify glue
         glue = {"com.test.stepdefs"},
      //  stepNotifications = true
        // tags = "@post or @get",
          publish = true
)
public class AcceptanceIT extends AbstractTestNGCucumberTests { 
        
        @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
*/

@Test
@CourgetteOptions(
        threads = 10,
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = true,
        rerunAttempts = 1,
        showTestOutput = true,
        reportTitle = "Courgette-JVM Example",
        reportTargetDir = "build",
        environmentInfo = "browser=chrome; git_branch=master",
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/com/test/",
                glue = "com.test.stepdefs",
                //tags = {"@post or @get"},
                publish = true,
                plugin = {
                        "pretty",
                        "json:target/cucumber-report/cucumber.json",
                        "html:target/cucumber-report/cucumber.html"}
        ))
class AcceptanceIT extends TestNGCourgette {
}

