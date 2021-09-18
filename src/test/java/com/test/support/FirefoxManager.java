package com.test.support;
import org.openqa.selenium.Platform;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


public class FirefoxManager extends DriverManager{
    
   // protected FirefoxDriver driver;

    private final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    
         @Override
         protected RemoteWebDriver createDriver() throws MalformedURLException , IOException {
                   
                 Properties properties = new Properties();
                ClassLoader loader = Thread.currentThread().getContextClassLoader();
                  System.out.println("hubport from sys prop var.."+System.getProperty("hub.port"));
                 String hubURL = "http://192.168.1.3:"+System.getProperty("hub.port")+"/wd/hub";
               
                //String hubURL = "http://localhost:65299/wd/hub";  //docker hub running on 65299
                  System.setProperty("webdriver.gecko.driver", "/Users/amit/Desktop/amit/projects/misc/geckodriver");
                 
                    FirefoxProfile profile = new FirefoxProfile();
                  //  profile.setPreference("network.proxy.no_proxies_on", "localhost");
                   // profile.setPreference("javascript.enabled", true);
                   
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability(FirefoxDriver.PROFILE, profile);
                    capabilities.setPlatform(Platform.ANY);
                   // capabilities.acceptInsecureCerts();
                    
                    FirefoxOptions options = new FirefoxOptions();
                    options.merge(capabilities);
                 
                   driver.set(new RemoteWebDriver(new URL(hubURL),options));
                   return driver.get();
        }

        @Override
         public RemoteWebDriver getDriver() throws MalformedURLException , IOException{
            //return  driver.get();
            return createDriver();
        }
}
