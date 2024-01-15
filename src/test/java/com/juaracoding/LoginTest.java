package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();


    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User access the link cashback sociolla")
    public void User_access_the_link_cashback_sociolla (){
        String url = "https://staging.ptkta.com/xcashback_sociolla/login\n";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @When("Display the login page")
    public void display_the_login_page(){
    }

    @And("Enter username admintiara2")
    public void Enter_username_admintiara2_and_password_a(){
        loginPage.username("admintiara2");
    }

    @And("Enter password a")
    public void Enter_password_a(){
        loginPage.password("a");
    }

    @And("Click the login button")
    public void Click_the_login_button(){
        loginPage.buttonLogin();
    }

    @Then("Home page display")
    public void Home_page_display(){
        Assert.assertEquals(loginPage.getTxtWelcome(),"Selamat datang, admintiara2");
    }

    @And("Input unvalidated username and valid password")
    public void Input_unvalidated_username_and_valid_password(){
    }

    @And("Enter username Admintiara2")
    public void Enter_username_Admintiara2(){
    }

    @And("Enter username ADMINTIARA2")
    public void Enter_username_ADMINTIARA2(){
    }

    @Then("Displays the message or alert Incorrect Username or Password")
    public void Displays_the_message_or_alert_Incorrect_Username_or_Password(){
    }

    @Then("Displays the alert icon or Enter Username Enter Password")
    public void Displays_the_alert_icon_or_Enter_Username_Enter_Password(){
    }


}
