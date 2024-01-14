package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();


    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

}
