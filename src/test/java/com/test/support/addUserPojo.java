package com.test.support;

public class addUserPojo {
    
    private String FirstName;
  private  String LastName;
   private String username;
  private  String password;
  private  String Email;
  private  String CellPhone;
  
    public addUserPojo(String fname, String lname, String uname, String pwd , String email, String cellphone){
        this.FirstName = fname+"k";
         this.LastName=lname;
         this.username = uname;
         this.password = pwd;
         this.Email = email;
         this.CellPhone = cellphone;
        
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
         return LastName;
    }
    public String getusername() {
        return username;
    }
    public  String getpassword() {
        return password;
    }
    public String getEmail() {
        return Email;
    }
    public  String getCellPhone() {
        return CellPhone;
    }
}
