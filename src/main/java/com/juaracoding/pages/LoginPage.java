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

    //@FindBy(xpath = "//div.wrap-input100.validate-inputalert-validate") // alert enter username
    @FindBy(xpath = "/html/body/div[1]/div/div/form/div[1]")
    private WebElement txtAlertUsername;

    @FindBy(xpath = "//div[@data-validate='Enter password']") // alert enter password
    private WebElement txtAlertPassword;

    @FindBy(xpath = "//center[(text() = ' Selamat datang, admintiara2            ' or . = ' Selamat datang, admintiara2            ')]")
    private WebElement txtHomeAdmin;

//    @FindBy(xpath = "//center[(text() = ' Selamat datang, Feri Nugraha 2            ' or . = ' Selamat datang, Feri Nugraha 2            ')]")
//    private WebElement txtHomeVerif;
    @FindBy(xpath = "/html/body/div/aside[1]/div/div/div[2]/a") // home verifikator
    private WebElement txtHomeVerif;
    //html/body/div/aside[1]/div/div/div[2]/a
    //html/body/div/div[1]/section/div/div/div
    //p[normalize-space()='Home']
    //html/body/div/aside[1]/a/span/b
    //b[normalize-space()='SOCIOLLA 2023']
    //html/body/div/div[1]/section/div/div/div/center/text()

    @FindBy(xpath = "/html/body/div/aside[1]/div/div/div[2]/a") // home finance
    private WebElement txtHomeFinance;
    //i[@class='fa fa-bell fa-fw']
    //html/body/div/div[1]/comment()[1]
    //html/body/div/div[1]/section/div/div/div/center

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

//    public String getHomeVerif(){
//        return txtHomeVerif.getAttribute("data-validate");
//    }
    //html/body/div/div[1]/section/div/div/div/center/text()

    public String getAlertUsername(){
        return txtAlertUsername.getAttribute("data-validate");
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
