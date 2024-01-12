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
    @FindBy(xpath = "//span[contains(@class, 'login100-form-title p-b-41')]")
    private WebElement txtLogin;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class, 'login100-form-btn')]")
    private WebElement btnLogin;

    @FindBy(xpath = "//center[(text() = ' Selamat datang, admintiara2            ' or . = ' Selamat datang, admintiara2            ')]")
    private WebElement txtHome;

    public void loginAdmin(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }


    public void setUsername(String username){
        this.username.sendKeys(username);
    }
    public void setPassword(String password){
        this.password.sendKeys(password);
    }
    public void setBtnLogin(){
        btnLogin.click();
    }


    public String getTxtLogin (){
        return txtLogin.getText();
    }
    public String getTxtHome(){
        return txtHome.getText();
    }


}
