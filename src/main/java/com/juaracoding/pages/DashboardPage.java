package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@class='nav-icon fas fa-tachometer-alt']")
    private WebElement clickMenuDashboard;
    @FindBy(xpath = "//h3[normalize-space()='Dashboard Nominal Cashback']")
    private WebElement txtMenuDashboard1;
    @FindBy(xpath = "//h3[normalize-space()='Dashboard SPG']")
    private WebElement txtMenuDashboard2;
    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement txtMenuDashboard3;
    @FindBy(xpath = "//input[@name='start_date']")
    private WebElement startPeriode;
    @FindBy(xpath = "//input[@name='end_date']")
    private WebElement endSampeDengan;
    @FindBy(xpath = "//button[@id='btn-filter']")
    private WebElement btnFilterTanggal;
    @FindBy(xpath = "//div[@id='table_spg_wrapper']//span[contains(text(),'Export Excel')]")
    private WebElement excelTableSpg;
    @FindBy(xpath = "//div[@id='table_transaksi_wrapper']//span[contains(text(),'Export Excel')]")
    private WebElement excelTableCashback;
    @FindBy(xpath = "//*[@id='table_transaksi']/tbody/tr/td[6]/span")
    private WebElement txtTableCashback;
    @FindBy(xpath = "//li[@class='breadcrumb-item']")
    private WebElement linkkMenuDashboard;
    @FindBy(xpath = "//center[(text() = ' Selamat datang, admintiara2            ' or . = ' Selamat datang, admintiara2            ')]")
    private WebElement txtLinkMenuDashboard;
    @FindBy(xpath = "//*[@id='table_spg']/tbody/tr/td[1]")
    private WebElement txtTableSpg;

    public void setClickMenuDashboard(){
        clickMenuDashboard.click();
    }
    public void setLinkMenuDashboard(){
        this.linkkMenuDashboard.click();
    }
//    public void clickStartPeriode(){
//
//    }
//    public void clickEndSampeDengan(){
//        endSampeDengan.click();
//    }
    public void setStartPeriode(String periode){
        startPeriode.click();
        this.startPeriode.sendKeys(periode);
    }
    public void setEndSampeDengan(String sampeDengan){
        endSampeDengan.click();
        this.endSampeDengan.sendKeys(sampeDengan);
    }
    public void clickButtonFilter(){
        btnFilterTanggal.click();
    }
    public void downExcelSpg(){
        excelTableSpg.click();
    }
    public void downExcelDashboard(){
        excelTableCashback.click();
    }

    public String getTxtTableCashback(){
        return txtTableCashback.getText();
    }
    public String getTxtTableSpg(){
        return txtTableSpg.getText();
    }

}
