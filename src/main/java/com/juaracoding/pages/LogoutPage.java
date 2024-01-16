package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LogoutPage {
    private WebDriver driver;

    public LogoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Logout']")
    private WebElement btnLogout;

    @FindBy(xpath = "//span[@class='login100-form-title p-b-41']") // halaman awal login
    private WebElement txtPageLogin;

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, admintiara2']") // tampilan home admin
    private WebElement txtHomeAdmin;

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, Feri Nugraha 2']") // tampilan home verifikator
    private WebElement txtHomeVerif;

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, Feri Nugraha']") // tampilan home finance
    private WebElement txtHomeFinance;

    @FindBy(xpath = "//*[@id=\"main-message\"]/h1/span") // no internet
    private WebElement txtNoInternet;


    // step action
    public void setBtnLogout(){
        btnLogout.click();
    }

    // validation
    public String getTxtPageLogin(){
        return txtPageLogin.getText();
    }

    public String getTxtHomeAdmin(){
        return txtHomeAdmin.getText();
    }

    public String getTxtNoInternet(){
        return txtNoInternet.getText();
    }

    public String getTxtHomeVerif(){
        return txtHomeVerif.getText();
    }

    public String getTxtHomeFinance(){
        return txtHomeFinance.getText();
    }
}
