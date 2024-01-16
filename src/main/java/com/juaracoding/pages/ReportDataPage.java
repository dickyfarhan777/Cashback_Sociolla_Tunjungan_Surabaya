package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportDataPage {
    private WebDriver driver;

    public ReportDataPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@class='nav-icon fas fa-users']")
    private WebElement clickMenuReportData;
    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement txtMenuReportData1;
    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement txtMenuReportData2;
    @FindBy(xpath = "//select[@name='status']")
    private WebElement selectStatus;
    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectShow;
    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement clickPrevious;
    @FindBy(xpath = "//a[@class='page-link'][normalize-space()='1']")
    private WebElement clickHalOne;
    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement clickNext;
    @FindBy(xpath = "//a[@class='page-link'][normalize-space()='13']")
    private WebElement clickHalThirteen;
    @FindBy(xpath = "//a[@class='page-link'][normalize-space()='3']")
    private WebElement clickHalThree;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtShowing;
    @FindBy(xpath = "//input[type='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//span[@id='btnSearch']")
    private WebElement btnSearch;
    @FindBy(xpath = "//button[@type='button']")
    private WebElement btnFilter;
    @FindBy(xpath = "//i[@class='fa fa-eye']")
    private WebElement btnAksi;
    @FindBy(xpath = "////h3[normalize-space()='Form Verifikasi Penukaran Voucher']")
    private WebElement txtHalamanAksi;
    @FindBy(xpath = "//tbody/tr[1]/td[12]")
    private WebElement txtStatus;
    @FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'Validated')]")
    private WebElement txtStatusValidated;
    @FindBy(xpath = "")
    private WebElement txtStatusNewData;
    @FindBy(xpath = "")
    private WebElement txtStatusTransfered;
    @FindBy(xpath = "")
    private WebElement txtStatusUploaded;

    public void clickMenuReportData(){
    clickMenuReportData.click();
    }
    public void clickStatusData(){
        this.selectStatus.click();
    }
    public void sendStatusData(String status){
        this.selectStatus.sendKeys(status);
    }
    public void clickShowData(){
        this.selectShow.click();
    }
    public void sendShowData(String angka){
        this.selectShow.sendKeys(angka);
    }
    public void clickPreviousHal(){
        clickPrevious.click();
    }
    public void clickNextHal(){
        clickNext.click();
    }
    public void clickSearch(String search){
        inputSearch.sendKeys(search);
    }
    public void clickBtnSeach(){
        btnSearch.click();
    }
    public void clickBtnFilter(){
        btnFilter.click();
    }
    public void clickBtnAksi(){
        btnAksi.click();
    }



    public String getHalamanAksi(){
        txtHalamanAksi.getText();
    }

    public String getTxtMenuReportData(){
        return txtMenuReportData1.getText();
    }
    public String getTxtStatus(){
        return txtStatus.getText();
    }
    public String getTxtHalaman(){
        return txtShowing.getText();
    }
    public static void scrollByPixels(WebDriver driver, int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy({ top: " + y + ", behavior: 'smooth' });");
        System.out.println("Scrolling smooth To Target with Pixels");
    }

}
