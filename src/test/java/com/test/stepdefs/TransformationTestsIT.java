
package com.test.stepdefs;
import com.google.inject.Inject;
import com.test.support.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TransformationTestsIT {
    
     //  @Inject
      //Global global;
 
     // public static   String testvar ; 
      public static TestSingleton singleton ;
  /*    
    public TestSingleton TransformationTestsIT(){
        return  singleton =  TestSingleton.getInstance();
       }
   */    
    
    @After
    public static TestSingleton getSingletonInstance() {
        System.out.println("class of singleton from getSingletonInstance...." + singleton);
        return singleton;
     }
     
    @Given("a context is set")   
    public void setContext(){
      //  global.help.SetTestVar(TransformationTestsIT.tv); 
       // global.help.SetTestVar("test");
       singleton =  TestSingleton.getInstance();
        System.out.println("class of singleton...." + singleton);
    }
    
    @Given("{ToString} has its value {ToString}")
	public void nameValue(String nm, String v ){ 
    	System.out.println("name is..."+nm);
	    System.out.println("value is ..."+v);
	    //testvar = nm;
	    //singleton.SetTestVar(nm);
	   // System.out.println("get test var..."+ singleton.GetTestVar());
	}
	
	 @ParameterType(".*?")
          public convertToBoolean defineStringToBoolean(String v) {     	
           return  new convertToBoolean(v);
          }
          
	 @ParameterType(".*?")
          public Boolean ToBoolean(String v) {  
        
         if (v.equals("true")){
	 	    	return Boolean.TRUE;
			}
	 	    else if(v.equals("false")){
	 	    	return Boolean.FALSE;
		 }
	 	    else if(v.equals("null")){
	 	    	return null;
		 }  
            else {
             return null;
         }
    }
    
          @ParameterType(".*?")
          public String ToString(String m) {     	
            return String.valueOf(m);
          }
          
        @And("{ToString} has a value {ToBoolean}")
	public void ismajorBoolean(String s, Boolean b){
    System.out.println("major..."+ s);
	System.out.println("value..."+ b);
	assertThat(b).isEqualTo(null); 
	}
	
	
    @DataTableType
        public loginDetails logindetails(Map<String, String> entry) {
        return new loginDetails(entry.get("Username"),entry.get("Password"),entry.get("UsernameDesc"));
        } 
     
        @When ("^I submit login details$")
     public void submitLoginDetails(DataTable dataTable ){
        List<loginDetails> list = dataTable.transpose().asList(loginDetails.class);
        list.stream().forEach(System.out::println);
        for (loginDetails l : list) {
            System.out.println("username::"+l.getUserName());
            System.out.println("pwd::"+l.getPassword());
            System.out.println("usernamedesc::"+l.getUsernameDesc());
        }
    }
 /*    
	 @Given("{ToString} has a value {ToBoolean}")
	public void ismajorBoolean(String s , Boolean b){
    System.out.println("major..."+ s);
	System.out.println("value..."+ b);
	}
	*/

/*	 @Given("{ToString} has a value {ToBoolean}")
	public void ismajorBoolean(Boolean b){
	System.out.println("value..."+ b);
	}
	
 */
	/*
	@And("^(.+) has a value (.+)$")
	public void ismajorString(String ID){
	System.out.println("value..."+ID);
	}
*/
}
