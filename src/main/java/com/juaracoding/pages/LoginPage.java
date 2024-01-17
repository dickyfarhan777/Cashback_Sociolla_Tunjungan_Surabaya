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


    @FindBy(xpath = "//span[@class='login100-form-title p-b-41']") // tampilan halaman login
    private WebElement txtLogin;
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//b[normalize-space()='Username atau Password Salah!']")
    private WebElement txtFailLogin;

    @FindBy(xpath = "//div[@data-validate='Enter username']") // alert enter username
    private WebElement txtAlertUsername;

    @FindBy(xpath = "//div[@data-validate='Enter password']") // alert enter password
    private WebElement txtAlertPassword;

    @FindBy(xpath = "//center[(text() = ' Selamat datang, admintiara2            ' or . = ' Selamat datang, admintiara2            ')]")
    private WebElement txtHomeAdmin;

    @FindBy(xpath = "//b[normalize-space()='SOCIOLLA 2023']") // home verifikator
    private WebElement txtHomeVerif;
    //b[normalize-space()='SOCIOLLA 2023']
    //a[@class='d-block']

    @FindBy(xpath = "//a[@class='d-block']") // home finance
    private WebElement txtHomeFinance;

    @FindBy(xpath = "//p[normalize-space()='Logout']")
    private WebElement logout;



    // step action

    public void setUsername(String username) {
        this.username.sendKeys(username);
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void setButtonLogin() {
        buttonLogin.click();
    }

    public void setLogout(){
        logout.click();
    }


    // validation

    public String getTxtLogin(){
        return txtLogin.getText();
    }

    public String getTxtFailLogin(){
        return txtFailLogin.getText();
    }

    public String getTxtAlertUsername(){
        return txtAlertUsername.getText();
    }
    public String getTxtHomeAdmin(){
        return txtHomeAdmin.getText();
    }

    public String getTxtHomeVerif(){
        return txtHomeVerif.getText();
    }

    public String getTxtHomeFinance(){
        return txtHomeFinance.getText();
    }



}
