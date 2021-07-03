package com.test.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeManager extends DriverManager {

     protected WebDriver driver;


       //  @Override
         protected RemoteWebDriver createDriver() throws MalformedURLException {
        /*
                     String driverPath = "src/test/resources/drivers/chromedriver";
                     if (System.getProperty("os.name").contains("Windows")) {
                         driverPath += ".exe";
                    }
                    */
          //  System.setProperty("webdriver.chrome.driver", "/Users/amit/Desktop/amit/projects/misc/chromedriver");
             ChromeOptions options = new ChromeOptions();
            //options.addArguments("--start-maximized");
             
             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
             capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            return (RemoteWebDriver) (driver = new RemoteWebDriver(new URL("http://localhost:65299/wd/hub"), capabilities));
           
             //       return driver = new ChromeDriver(ChromeDriverService.createDefaultService());
        }

        @Override
         public RemoteWebDriver getDriver() throws MalformedURLException {
                 if (driver == null) {
                             this.createDriver();
                }
                return (RemoteWebDriver) driver;
        }

}
