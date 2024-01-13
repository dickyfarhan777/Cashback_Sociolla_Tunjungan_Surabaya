package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ReportDataPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class ReportDataTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ReportDataPage registerPage= new ReportDataPage();
    private static LoginPage loginPage = new LoginPage();

    public ReportDataTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin login web sociolla cashback")
    public void admin_login_web_sociolla_cashback() {
        loginPage.loginAdmin("admintiara2", "a");
    }



}
