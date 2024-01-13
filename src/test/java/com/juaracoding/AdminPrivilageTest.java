package com.juaracoding;

import com.juaracoding.pages.AdminPrivilagePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AdminPrivilageTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static AdminPrivilagePage adminPrivilagePage = new AdminPrivilagePage();
    public void AdminPrivilageTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Click menu dashboard")
    public void click_menu_dashboard(){
        adminPrivilagePage.setClickMenuDashboard();
        extentTest.log(LogStatus.PASS,"Click menu dashboard");
    }
    @When("Click menu home")
    public void Click_menu_home(){
        adminPrivilagePage.setClickMenuHome();
        extentTest.log(LogStatus.PASS,"Click menu home");
    }

    @And("Click menu register")
    public void click_menu_register(){
        adminPrivilagePage.setClickMenuRegister();
        extentTest.log(LogStatus.PASS,"Click menu register");
    }
    @And("Click menu report data")
    public void click_menu_report_data(){
        adminPrivilagePage.setClickMenuReportData();
        extentTest.log(LogStatus.PASS,"Click menu report data");
    }
    @Then("Click menu logout")
    public void click_menu_logout(){
        adminPrivilagePage.setClickLogout();
        Assert.assertTrue(adminPrivilagePage.getTxtLogout().contains("SOCIOLLA TUNJUNGAN SURABAYA"));
        extentTest.log(LogStatus.PASS,"Click menu logout");
    }

}
