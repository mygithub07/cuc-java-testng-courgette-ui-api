
package com.test.stepdefs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PageObjects {
         private static final Logger logger = LoggerFactory.getLogger(PageObjects.class);
         String hubUrl = System.getProperty("hub.url");
         String sutUrl = System.getProperty("sut.url");
         List<WebElement> result;
       
        
     @FindBy(xpath = "//html[(@class='ng-scope')]")
     public static WebElement allDom;
     
         @FindBy(xpath = "(//input[@placeholder='Search'])")
     public static WebElement search;
        
      @FindBy(xpath = "(//button[@class='btn btn-link pull-right'])")
      public static WebElement AddUser;
      
      @FindBy(xpath = "//input[@name='FirstName']")
      public static WebElement fName;
      
      @FindBy(xpath = "//input[@name='LastName']")
      public static WebElement lName;
      
      @FindBy(xpath = "//input[@name='UserName']")
      public static WebElement uName;
      
      @FindBy(xpath = "//input[@name='Password']")
      public static WebElement pWord;
      
      @FindBy(xpath = "//input[@name='optionsRadios']")
      public static List<WebElement> customer;
      
      @FindBy(xpath = "//select[@name='RoleId']")
      public static List<WebElement> role;
      
      @FindBy(xpath = "//option[text()='Sales Team']")
      public static WebElement sales;
      
      @FindBy(xpath = "//input[@name='Email']")
      public static WebElement email;
      
       @FindBy(xpath = "//input[@name='Mobilephone']")
      public static WebElement mphone;
       
       @FindBy(xpath = "//button[text()='Save']")
      public static WebElement save;
        
       
}
