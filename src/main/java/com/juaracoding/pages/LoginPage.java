package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, admintiara2']")
    private WebElement txtWelcome;


    // step action
    public void username(String username) {
        this.username.sendKeys(username);
    }

    public void password(String password){
        this.password.sendKeys(password);
    }

    public void buttonLogin() {
        buttonLogin.click();
    }

    // validation

    public String getTxtWelcome(){
        return txtWelcome.getText();
    }

}
