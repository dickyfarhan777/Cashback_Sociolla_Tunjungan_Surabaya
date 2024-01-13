package com.juaracoding;

import com.juaracoding.pages.DashboardPage;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class DashboardTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static DashboardPage dashboardPage = new DashboardPage();

    public DashboardTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
}
