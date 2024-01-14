package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifikasiPage {
    private WebDriver driver;
    public  VerifikasiPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "")
    private WebElement username;
    @FindBy(xpath = "")
    private WebElement username1;
    @FindBy(xpath = "")
    private WebElement username2;
    @FindBy(xpath = "")
    private WebElement username3;

    public void clickMenuRegister(){
//        clickMenuRegister.click();
    }

    public String getTxtRegister(){
//        return txtRegister.getText();
    }


}

