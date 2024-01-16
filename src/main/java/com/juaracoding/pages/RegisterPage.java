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
    @FindBy(xpath = "//i[@class='nav-icon fas fa-registered']")
    private WebElement clickMenuRegister;
    @FindBy(xpath ="//h1[normalize-space()='List Data Register By User']")
    private WebElement txtRegister;
    @FindBy(xpath ="//a[@class='btn btn-primary btn-block']")
    private WebElement addNewData;
    @FindBy(xpath ="//h3[contains(@class, 'card-title')]")
    private WebElement txtFormInputRegister;
    @FindBy(xpath ="//input[@id='SOCO']")
    private WebElement inputSocoId;
    @FindBy(xpath ="//div[@id='SOCO_error']")
    private WebElement inputSocoIdError;
    @FindBy(xpath ="//label[@for='SOCO']")
    private WebElement txtSocoId;
    @FindBy(xpath ="//input[@id='Customer_Name']")
    private WebElement inputCustomerName;
    @FindBy(xpath ="//label[@for='Customer_Name']")
    private WebElement txtCustomerName;
    @FindBy(xpath ="//input[@placeholder='Masukan nomor handphone']")
    private WebElement inputNoHandphone;
    @FindBy(xpath ="//label[(text() = 'Nomor Handphone yang terdaftar di BCA *' or . = 'Nomor Handphone yang terdaftar di BCA *')]")
    private WebElement txtPhoneNumber;
    @FindBy(xpath ="//input[@placeholder='Masukan nomor rekening bca']")
    private WebElement inputNoRekening;
    @FindBy(xpath ="//label[(text() = 'Nomor Rekening BCA *' or . = 'Nomor Rekening BCA *')]")
    private WebElement txtNoRekening;
    @FindBy(xpath ="//select[@id='Qris_Pay']")
    private WebElement pembayaranQris;
    @FindBy(xpath ="//label[@for='Qris_Pay']")
    private WebElement txtPembayaranQris;
    @FindBy(xpath ="//input[@placeholder='Masukan Amount']")
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
    @FindBy(xpath ="//input[@placeholder='Masukan RRN']")
    private WebElement inputAngkaRRN;
    @FindBy(xpath ="//label[@for='RRN']" )
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
    @FindBy(xpath ="//input[@id='btnsubmit']")
    private WebElement btnSubmitRegister;
    @FindBy(xpath = "//div[@id='SOCO_error']")
    private WebElement txtSocoIdError;
    @FindBy(xpath = "//div[@id='Customer_Name_error']")
    private WebElement txtCustomerNameError;
    @FindBy(xpath = "//div[@id='Phone_Number_error']")
    private WebElement txtNoHandphoneError;
    @FindBy(xpath = "//div[@id='No_Rek_bca_error']")
    private WebElement txtNoRekeningError;
    @FindBy(xpath = "//div[@id='RRN_error']")
    private WebElement txtRrnError;
    @FindBy(xpath = "//div[@id='Qris_Pay_error']")
    private WebElement txtQrisPayError;
    @FindBy(xpath ="//div[@id='Merchant_Name_error']")
    private WebElement txtNamaMerchantError;



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
    public void setQrisPilih(String qris){
        this.pembayaranQris.sendKeys(qris);

    }
    public void setPembayaranQris(String pembayaran){
        this.pembayaranQris.sendKeys(pembayaran);
    }
    public void setNominalTransaksi(String nominalTransaksi){
        this.inputNominalTransaksi.sendKeys(nominalTransaksi);
    }
    public void setTanggalTransaksi(String tanggalTransaksi){
        this.inputTanggalTransaksi.sendKeys(tanggalTransaksi);
    }
    public void setNamaMerchant(String namaMerchant){
        this.inputNamaMerchant.sendKeys(namaMerchant);
    }public void setMerchantPilih(String pilih){
        this.inputNamaMerchant.sendKeys(pilih);
    }
    public void setAngkaRRN(String angkaRRN){
this.inputAngkaRRN.sendKeys(angkaRRN);
    }
    public void setFotoBuktiTransaksi1(){
        inputFotoBuktiTransaksi1.sendKeys("C:\\MyTools\\Bukti TF 1.jpg");
    }
    public void setFotoBuktiTransaksi2(){
inputFotoBuktiTransaksi2.sendKeys("C:\\MyTools\\Bukti TF 2.jpg");
    }
    public void setFotoBuktiTransaksi3(){
inputFotoBuktiTransaksi3.sendKeys("C:\\MyTools\\Bukti TF 3.jpg");
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

    public String getTxtFotoTransaksi1(){
        return txtFotoBuktiTransaksi1.getText();
    }
    public String getTxtFotoTransaksi2(){
        return txtFotoBuktiTransaksi2.getText();
    }
    public String getTxtFotoTransaksi3(){
        return txtFotoBuktiTransaksi3.getText();
    }
//    public String getValueBtnSubmit(){
        //return btnSubmitRegister.getAttribute();
//    }
    public String getTxtErrorRrn(){
        return txtRrnError.getText();
    }
    public String getTxtErrorNoHandphone(){
        return txtNoHandphoneError.getText();
    }
    public String getTxtNoRekening(){
        return txtNoRekeningError.getText();
    }
    public String getTxtSocoIdError(){
        return txtSocoIdError.getText();
    }
    public String getTxtCustomerName(){
        return txtCustomerNameError.getText();
    }
    public String getTxtQrisPay(){
        return txtQrisPayError.getText();
    }
    public String getTxtNamaMerchant(){
        return txtNamaMerchantError.getText();
    }
    public String getTxtNamaMerchantReq(){
        return txtNamaMerchantError.getAttribute("required");
    }

    public String getTxtRequiredSocoId(){
        return txtSocoId.getAttribute("required");
    }
    public String getTxtRequiredNamaMerchant(){
        return inputNamaMerchant.getAttribute("required");
    }
    public String getTxtRequiredPembayaranQris(){
        return pembayaranQris.getAttribute("required");
    }
}
