package com.juaracoding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LogoutPage {
    @FindBy(xpath = "//p[normalize-space()='Logout']")
    private WebElement btnLogout;

    @FindBy(xpath = "//span[@class='login100-form-title p-b-41']")
    private WebElement txtSociolla;


    // step action
    public void btnLogout(){
        btnLogout.click();
    }

    // validation
    public String getTxtSociolla(){
        return txtSociolla.getText();
    }

}
