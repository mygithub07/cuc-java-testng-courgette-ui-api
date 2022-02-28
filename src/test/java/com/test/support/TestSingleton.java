package com.test.support;

public class TestSingleton {

    private static TestSingleton singletonInstance = new TestSingleton();
    public  static String testVar;
    private TestSingleton() {
    }

    public static TestSingleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new TestSingleton();
        }

        return singletonInstance;
    }

    public void ClearTestData() {
        singletonInstance = new TestSingleton();
    }
    
     public  void SetTestVar(String s){
            testVar = s;
         }
     public  String GetTestVar(){
          return testVar;
         }
}
