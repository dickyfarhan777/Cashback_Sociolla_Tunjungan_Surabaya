package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportDataPage {
    private WebDriver driver;

    public RegisterPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;
    @FindBy(xpath = "")
    private WebElement ;

    public void click_menu_report_data(){

    }

}
