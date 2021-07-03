package com.test.support;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;

public abstract class DriverManager {

                // Abstract class to be implemented for each
               // browser according to each one's settings
                protected abstract RemoteWebDriver createDriver() throws MalformedURLException, IOException;

                public abstract RemoteWebDriver getDriver() throws MalformedURLException, IOException;
}
