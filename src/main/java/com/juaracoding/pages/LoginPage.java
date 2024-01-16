package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public  LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement inputUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement btnLogin;

    public void loginAdmin(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }


}
