
package com.test.support;

public class convertToBoolean {
    
    // private String maj;
     private  String value;
  
   public convertToBoolean(String v){
         // this.maj = m;
          this.value=v;
    }
  /*  
    public String getMaj() {
        return maj;
    }
    */
   
    public Boolean getValue() {
       
         if (value.equals("true")){
	 	    	return Boolean.TRUE;
			}
	 	    else if(value.equals("false")){
	 	    	return Boolean.FALSE;
		 }
	 	   else if(value.equals("null")){
	 	    	return null;
		 }  
            else {
             return null;
         }
    }
}
