package com.juaracoding;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class AdminPrivilageTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static AdminPrivilageTest adminPrivilageTest = new AdminPrivilageTest();

    public void AdminPrivilageTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

}
