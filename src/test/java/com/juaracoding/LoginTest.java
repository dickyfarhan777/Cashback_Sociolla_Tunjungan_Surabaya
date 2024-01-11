package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();


    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin akses link web cashback")
    public void admin_enter_link_web_cashback(){
        driver.get(Constant.URL);
        extentTest.log(LogStatus.PASS,"Admin akses link web cashback");
    }
    @When("Tampilan halaman login")
    public void tampilan_halaman_login(){
        loginPage.getTxtLogin();
        Assert.assertTrue(loginPage.getTxtLogin().contains("SOCIOLLA TUNJUNGAN SURABAYA"));
        extentTest.log(LogStatus.PASS,"Tampilan halaman login");
    }
    @And("Input username admintiara2")
    public void input_username_admintiara2(){
        loginPage.setUsername("admintiara2");
        extentTest.log(LogStatus.PASS,"Input username admintiara2");
    }
    @And("Input password a")
    public void input_password_a(){
        loginPage.setPassword("a");
        extentTest.log(LogStatus.PASS,"Input password a");
    }
    @And("Klik button login")
    public void klik_button_login(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Klik button login");
    }
    @Then("Tampilan halaman home")
    public void tampilan_halaman_home(){
        loginPage.getTxtHome();
        Assert.assertEquals(loginPage.getTxtLogin(),"Selamat datang, admintiara2");
        extentTest.log(LogStatus.PASS,"Tampilan halaman home");
    }

}