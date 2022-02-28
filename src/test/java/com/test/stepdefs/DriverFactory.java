package com.test.stepdefs;

import com.test.support.ChromeManager;
import com.test.support.FirefoxManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Need to implement the other browsers and create a switch
public class DriverFactory {
    
    public static String sc;
    public static Collection tagList;
    @Before
        public void getScenarioTags(Scenario scenario) {
            tagList =  scenario.getSourceTagNames();
          for(String tag : scenario.getSourceTagNames()){
            System.out.print("from driver factory class Tag: " + tag);
            sc = tag;
            if (tag.equals("@uitests")){
               System.out.println("*****from driver factory class: Tag uitests triggered*****");
                }
             }
         }
         
    
        public RemoteWebDriver getManager() throws MalformedURLException , IOException {
        /*
          if (DriverFactory.sc.equals("@firefox")){
               return new FirefoxManager().getDriver();
                }
          else if (DriverFactory.sc.equals("@chrome")){
              return new ChromeManager().getDriver();
             }
            else{
                return null;
              }
        } 
        */
        if (tagList.contains("@firefox")){
               return new FirefoxManager().getDriver();
                }
          else if (tagList.contains("@chrome")){
              return new ChromeManager().getDriver();
             }
            else{
                return null;
              }
        } 
        
        
        
}
