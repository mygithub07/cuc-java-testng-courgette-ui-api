package com.test.support;

public class loginDetails {
    
    private String Username;
    private String Password;
    private String UsernameDesc;
    
    public  loginDetails(String uname, String pwd, String udesc){
        this.Username=uname;
        this.Password = pwd;
        this.UsernameDesc = udesc;
    }
    public String getUserName() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
    public String getUsernameDesc() {
        return UsernameDesc;
    }
}
