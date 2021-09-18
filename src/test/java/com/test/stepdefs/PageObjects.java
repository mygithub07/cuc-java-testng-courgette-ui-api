
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
       
        //login registration objects
       @FindBy(xpath = "//div[(@class='ng-scope')]")
       public static WebElement loginscope;
       
        @FindBy(xpath = "//input[(@id='username')]")
       public static WebElement usrname;
        
        @FindBy(xpath = "//input[(@id='password')]")
       public static WebElement passwd;
        
        @FindBy(xpath = "//input[@id='formly_1_input_username_0']")
        public static WebElement unamedesc;
        
         @FindBy(xpath = "//button[@class='btn btn-danger']")
        public static WebElement loginbutton;
         
          @FindBy(xpath = "//p[@class='ng-scope' and contains(., '!')]")
        public static WebElement loginconfirmmessage;
         
      //webtable objects
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
      
       //for dummy registration form
       @FindBy(xpath = "//h3[text()='Dummy Registration Form']")
      public static WebElement regform;
          
       @FindBy(xpath = "//input[@name='name']")
      public static WebElement Name;
       
        @FindBy(xpath = "//input[@name='phone']")
      public static WebElement tel;
        
        @FindBy(xpath = "//input[@name='email']")
      public static WebElement eml;
        
        @FindBy(xpath = "//select[@name='country']")
      public static WebElement country;
       
        @FindBy(xpath = "//option[text()='United States']")
      public static WebElement us;
        
         @FindBy(xpath = "//input[@name='city']")
      public static WebElement city;
         
        // @FindBy(xpath = "//input[@name='username']")
         @FindBy(css="input[name='username']")
        public static WebElement uname;
         
         @FindBy(xpath = "//input[@name='password']")
      public static WebElement pwd;
         
          @FindBy(xpath = "//input[@type='submit']")
      public static WebElement submit;
          
          @FindBy(xpath = "//p[text()='This is just a dummy form, you just clicked SUBMIT BUTTON']")
      public static WebElement submitText;   
}
