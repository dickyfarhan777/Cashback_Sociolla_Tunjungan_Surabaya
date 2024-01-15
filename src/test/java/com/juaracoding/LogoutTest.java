package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.security.PublicKey;

public class LogoutTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();


    public LogoutTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User access the link cashback sociolla")
    public void User_access_the_link_cashback_sociolla (){
        String url = "https://staging.ptkta.com/xcashback_sociolla/login\n";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @When("User admin has successfully logged in")
    public void User_admin_has_successfully_logged_in(){
    }

    @And("Dashboard display")
    public void Dashboard_display(){
    }

    @And("Click the logout menu button")
    public void Click_the_logout_menu_button(){
    }

    @Then("Display the initial login page")
    public void Display_the_initial_login_page(){
    }

    @When("User verifier has successfully logged in")
    public void User_verifier_has_successfully_logged_in(){
    }

    @When("User finance has successfully logged in")
    public void User_finance_has_successfully_logged_in(){
    }

    @And("Disconnect the device from the internet network")
    public void Disconnect_the_device_from_the_internet_network(){
    }

    @Then("Displays a notification the device is not connected to internet network no internet")
    public void Displays_a_notification_the_device_is_not_connected_to_internet_network_no_internet(){
    }

}

