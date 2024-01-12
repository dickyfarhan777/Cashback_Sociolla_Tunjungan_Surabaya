package com.juaracoding.utils;

public enum TestCase {

    T1("Admin Login Valid"),

    T2("Click menu admin privilage"),
    T3("Admin input data register valid");

    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
