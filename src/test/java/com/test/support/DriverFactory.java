package com.test.support;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;

// Need to implement the other browsers and create a switch
public class DriverFactory {
        public RemoteWebDriver getManager() throws MalformedURLException , IOException {

            return new ChromeManager().getDriver();
          //  return new FirefoxManager().getDriver();
        }
}
