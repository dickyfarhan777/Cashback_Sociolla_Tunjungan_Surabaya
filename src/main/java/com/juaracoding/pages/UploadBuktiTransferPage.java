package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadBuktiTransferPage {
    private WebDriver driver;
    public  UploadBuktiTransferPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//p[normalize-space()='Upload Bukti Transfer']")
    private WebElement menuUploadBuktiTransfer;
    @FindBy(xpath = "//tbody/tr[1]/td[12]/a[1]/i[1]")
    private WebElement btnAksi;
    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement disabledNamaCust;
    @FindBy(xpath = "//input[@id='Phone_Number']")
    private WebElement disabledNoHpCust;
    @FindBy(xpath = "//input[@id='No_Rek_bca']")
    private WebElement disabledNoRekBCA;
    @FindBy(xpath = "//select[@id='Qris_Pay']")
    private WebElement disabledPembayaranQRIS;
    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement disabledNominalTransaksi;
    @FindBy(xpath = "//input[@id='Amount_cashback']")
    private WebElement disabledNominalCashback;
    @FindBy(xpath = "//input[@id='Merchant_Name']")
    private WebElement disabledNamaMerchant;
    @FindBy(xpath = "//input[@id='RRN']")
    private WebElement disabledNamaRRN;
    @FindBy(xpath = "//img[@alt='foto struk edc']")
    private WebElement disabledFotoBukti1;
    @FindBy(xpath = "//img[@alt='foto struk']")
    private WebElement disabledFotoBukti2;
    @FindBy(xpath = "//div[@id='div-Foto_Struk_3']//img")
    private WebElement disabledFotoBukti3;
    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement btnShowEntries;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtTabelMaks25;
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement fieldSearch;
    @FindBy(xpath = "//td[normalize-space()='karina']")
    private WebElement txtNamaCustKarina;
    @FindBy(xpath = "//tbody/tr[1]/td[10]")
    private WebElement txtNamaVerifFeri;
    @FindBy(xpath = "//td[normalize-space()='1']")
    private WebElement txtDataSemula;
    @FindBy(xpath = "//input[@id='Foto_Transfer']")
    private WebElement btnChooseFile;
    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement btnUploadBuktiTransfer;
    @FindBy(xpath = "")
    private WebElement txtAlertBerhasilUpload;
    @FindBy(xpath = "//p[normalize-space()='You did not select a file to upload.']")
    private WebElement txtErrorDidntSelectFile;
    @FindBy(xpath = "//a[normalize-space()='2']")
    private WebElement btnPaginationPage2;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtPage2;
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    private WebElement btnPrevious;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtPrevious;
    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElement btnNext;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtNext;




}

