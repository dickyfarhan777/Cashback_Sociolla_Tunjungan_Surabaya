package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPrivilagePage {
    private WebDriver driver;

    public AdminPrivilagePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkMenuDashboard;
    @FindBy(xpath = "//h3[normalize-space()='Dashboard Nominal Cashback']")
    private WebElement txtMenuDashboard1;
    @FindBy(xpath = "//h3[normalize-space()='Dashboard SPG']")
    private WebElement txtMenuDashboard2;
    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement txtMenuDashboard3;
    @FindBy(xpath = "//i[@class='nav-icon fas fa-home']")
    private WebElement clickMenuHome;
    @FindBy(xpath = "//i[@class='nav-icon fas fa-registered']")
    private WebElement clickMenuRegister;
    @FindBy(xpath = "//i[@class='nav-icon fas fa-tachometer-alt']")
    private WebElement clickMenuDashboard;
    @FindBy(xpath = "//i[@class='nav-icon fas fa-users']")
    private WebElement clickMenuReportData;
    @FindBy(xpath = "//h1[normalize-space()='List Data Register By User']")
    private WebElement txtMenuRegister1;
    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement txtMenuReportData1;
    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement txtMenuReportData2;
    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement txtMenuRegister2;
    @FindBy(xpath = "//center[(text() = ' Selamat datang, admintiara2            ' or . = ' Selamat datang, admintiara2            ')]")
    private WebElement txtMenuHome;
    @FindBy(xpath = "//span[contains(@class, 'login100-form-title p-b-41')]")
    private WebElement txtLogout;
    @FindBy(xpath = "//i[@class='nav-icon fas fa-sign-out-alt']")
    private WebElement clickLogout;

    public void setClickMenuHome(){
        clickMenuHome.click();
    }
    public void setClickMenuDashboard(){
        clickMenuDashboard.click();
    }
    public void setClickMenuRegister(){
        clickMenuRegister.click();
    }
    public void setClickMenuReportData(){
        clickMenuReportData.click();
    }
    public void setClickLogout(){
        clickLogout.click();
    }


    public String getTxtLogout (){
        return txtLogout.getText();
    }

}
