package com.juaracoding.utils;

public enum TestCase {

    T1("User (Admin) input username dan password"),
    T2("User (Admin) input unvalidated username dan valid password"),
    T3("User (Admin) login tanpa input username dan password"),
    T4("User (Admin) menginput valid username dengan huruf awal kapital dan valid password"),
    T5("User (Admin) menginput valid username dengan uppercase dan valid password"),
    T6("User (Verifikator) menginput username dan password yang valid"),
    T7("User (Verifikator) menginput valid username dengan huruf awal kapital dan valid password"),
    T8("User (Verifikator) menginput valid username dengan uppercase dan valid password"),
    T9("User (Finance) menginput username dan password yang valid"),
    T10("User (Finance) menginput unvalidated username dan password"),
    T11("User (Finance) menginput valid username dengan huruf awal kapital dan valid password"),
    T12("User (Finance) menginput valid username dengan uppercase dan valid password");


    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
