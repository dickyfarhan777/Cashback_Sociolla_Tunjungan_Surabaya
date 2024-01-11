package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;
    public RegisterPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//i[@class='nav-icon fas fa-check-square']")
    private WebElement clickMenuRegister;
    @FindBy(xpath ="//h1[normalize-space()='List Data Register By User']")
    private WebElement txtRegister;
    @FindBy(xpath ="//a[contains(@class, 'btn btn-primary btn-block']")
    private WebElement addNewData;
    @FindBy(xpath ="//h3[contains(@class, 'card-title')]")
    private WebElement txtFormInputRegister;
    @FindBy(xpath ="//input[@id='SOCO']")
    private WebElement inputSocoId;
    @FindBy(xpath ="//label[@for='SOCO']")
    private WebElement txtSocoId;
    @FindBy(xpath ="//input[@id='Customer_Name']")
    private WebElement inputCustomerName;
    @FindBy(xpath ="//label[@for='Customer_Name']")
    private WebElement txtCustomerName;
    @FindBy(xpath ="//input[@placeholder='Masukan nomor handphone']")
    private WebElement inputNoHandphone;
    @FindBy(xpath ="label[for='Phone Number']")
    private WebElement txtPhoneNumber;
    @FindBy(xpath ="//input[@placeholder='Masukan nomor rekening BCA']")
    private WebElement inputNoRekening;
    @FindBy(xpath ="//div[5]//label[1]")
    private WebElement txtNoRekening;
    @FindBy(xpath ="//select[@id='Qris_Pay']")
    private WebElement pembayaranQris;
    @FindBy(xpath ="//label[@for='Qris_Pay']")
    private WebElement txtPembayaranQris;
    @FindBy(xpath ="//input[@placeholder='Masukan Amount'")
    private WebElement inputNominalTransaksi;
    @FindBy(xpath ="//label[@for='Amount']")
    private WebElement txtNominalTransaksi;
    @FindBy(xpath ="//input[@id='Amount_cashback']")
    private WebElement txtNominalCashback;
    @FindBy(xpath ="//input[@placeholder='Masukan Tanggal Transaksi']")
    private WebElement inputTanggalTransaksi;
    @FindBy(xpath ="//label[@for='Transaction_Date']")
    private WebElement txtTanggalTransaksi;
    @FindBy(xpath ="//select[@name='Merchant_Name']")
    private WebElement inputNamaMerchant;
    @FindBy(xpath ="//label[@for='Merchant_Name']")
    private WebElement txtNamaMerchant;
    @FindBy(xpath ="//input[@placeholder='Masukan RRN']")
    private WebElement inputAngkaRRN;
    @FindBy(xpath ="label[@for='RRN']" )
    private WebElement txtAngkaRRN;
    @FindBy(xpath ="//input[@id='Foto_Struk_EDC']")
    private WebElement inputFotoBuktiTransaksi1;
    @FindBy(xpath = "//label[@for='Foto_Struk_EDC']")
    private WebElement txtFotoBuktiTransaksi1;
    @FindBy(xpath ="//input[@id='Foto_Struk']")
    private WebElement inputFotoBuktiTransaksi2;
    @FindBy(xpath = "//label[@for='Foto_Struk']")
    private WebElement txtFotoBuktiTransaksi2;
    @FindBy(xpath ="//input[@id='Foto_Transaksi_3']")
    private WebElement inputFotoBuktiTransaksi3;
    @FindBy(xpath = "//label[@for='Foto_Transaksi_3']")
    private WebElement txtFotoBuktiTransaksi3;
    @FindBy(xpath ="//input[type='submit']")
    private WebElement btnSubmitRegister;



    public void clickMenuRegister(){
        clickMenuRegister.click();
    }
    public void clickAddNewData(){
        addNewData.click();
    }
    public void setInputSocoId(String socoid){
        this.inputSocoId.sendKeys(socoid);
    }
    public void setInputCustomerName(String customerName){
        this.inputCustomerName.sendKeys(customerName);
    }
    public void setInputNoHandphone(String noHandphone){
        this.inputNoHandphone.sendKeys(noHandphone);
    }
    public void setInputNoRekening(String noRekening){
        this.inputNoRekening.sendKeys(noRekening);
    }
    public void setPembayaranQris(){

    }
    public void setNominalTransaksi(String nominalTransaksi){
        this.inputNominalTransaksi.sendKeys(nominalTransaksi);
    }
    public void setTanggalTransaksi(String tanggalTransaksi){
        this.inputTanggalTransaksi.sendKeys(tanggalTransaksi);
    }
    public void setNamaMerchant(String namaMerchant){
        this.inputNamaMerchant.sendKeys(namaMerchant);
    }
    public void setAngkaRRN(String angkaRRN){
this.inputAngkaRRN.sendKeys(angkaRRN);
    }
    public void setFotoBuktiTransaksi1(){

    }
    public void setFotoBuktiTransaksi2(){

    }
    public void setFotoBuktiTransaksi3(){

    }
    public void clickBtnSubmitRegister(){
        btnSubmitRegister.click();
    }



    public String getTxtRegister(){
        return txtRegister.getText();
    }
    public String getTxtFormInputRegister(){
        return txtFormInputRegister.getText();
    }
    public String getTxtNominalCashback(){
        return txtNominalCashback.getText();
    }
    public String getTxtSocoId(){
        return txtSocoId.getText();
    }
    public String getTxtCustomerName(){
        return txtCustomerName.getText();
    }
    public String getTxtNomorHandphone(){
        return txtPhoneNumber.getText();
    }
    public String getTxtNoRekening(){
        return txtNoRekening.getText();
    }
    public String getTxtPembayaranQris(){
        return txtPembayaranQris.getText();
    }
    public String getTxtNominalTransaksi(){
        return txtNominalTransaksi.getText();
    }
    public String getTxtTanggalTransaksi(){
        return txtTanggalTransaksi.getText();
    }
    public String getTxtNamaMerchant(){
        return txtNamaMerchant.getText();
    }
    public String getTxtRRN(){
        return txtAngkaRRN.getText();
    }

}
