package com.test.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeManager extends DriverManager {

     protected WebDriver driver;

//to use chrome by opening grid through pom , add below to pom.xml
// <argument>-Dwebdriver.gecko.driver=${project.basedir}/src/test/resources/geckodriver</argument> 
//also uncomment // return (RemoteWebDriver) (driver = new RemoteWebDriver(new URL(hubURL), capabilities));
    
       //  @Override
         protected RemoteWebDriver createDriver() throws MalformedURLException {
       
        String hubURL = "http://192.168.1.3:"+System.getProperty("hub.port")+"/wd/hub";
             ChromeOptions options = new ChromeOptions();
            //options.addArguments("--start-maximized");
             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
             capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            return (RemoteWebDriver) (driver = new RemoteWebDriver(new URL("http://localhost:65299/wd/hub"), capabilities));
            // return (RemoteWebDriver) (driver = new RemoteWebDriver(new URL(hubURL), capabilities));
             //  return driver = new ChromeDriver(ChromeDriverService.createDefaultService());
        }

        @Override
         public RemoteWebDriver getDriver() throws MalformedURLException {
                 if (driver == null) {
                             this.createDriver();
                }
                return (RemoteWebDriver) driver;
        }

}
