package com.test.support;

import com.test.stepdefs.InitialIT;
import com.test.stepdefs.PageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import com.google.inject.Singleton;
import io.cucumber.guice.ScenarioScoped;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;

// Scenario scoped it is used to show Guice
// what will be the shared classes/variables and instantiate them only in here
@ScenarioScoped
//@Singleton
      public class Global {
      public RemoteWebDriver driver;
       public WebDriverWait wait;
       public Helpers help;
       public PageObjects po;
       public JavascriptExecutor jsExecutor;
       
      public Global() throws MalformedURLException, IOException {
            driver = new DriverFactory().getManager();
             jsExecutor = (JavascriptExecutor) driver;
            wait = new WebDriverWait(driver, 3000);
            PageFactory.initElements(driver, PageObjects.class );
              help = new Helpers();
      }

}
