package com.juaracoding;

import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class DashboardTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static DashboardPage dashboardPage = new DashboardPage();
    private static LoginPage loginPage =new LoginPage();

    public DashboardTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin akses link web cashback")
    public void admin_login_web_sociolla_cashback() {
        loginPage.loginAdmin("admintiara2", "a");
    }

}
