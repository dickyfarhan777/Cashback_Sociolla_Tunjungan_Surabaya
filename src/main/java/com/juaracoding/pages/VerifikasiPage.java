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
    @FindBy(xpath = "//a[@class='nav-link active']")
    private WebElement menuVerifikasi;
    @FindBy(xpath = "//tbody/tr[1]/td[11]/a[1]/i[1]")
    private WebElement btnAksi;
    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement btnVerifikasi;
    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement okModalKonfirmasiVerifikasi;
    @FindBy(xpath = "")
    private WebElement alertKonfirmasi;
    @FindBy(xpath = "//h1[normalize-space()='List Data Register']")
    private WebElement txtValidVerifikasi;
    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement disabledNamaLengkapNasabah;
    @FindBy(xpath = "//input[@id='Phone_Number']")
    private WebElement disabledNoHp;
    @FindBy(xpath = "//input[@id='No_Rek_bca']")
    private WebElement disabledNoRekBCA;
    @FindBy(xpath = "//select[@id='Qris_Pay']")
    private WebElement disabledPembayaranQRIS;
    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement disabledNominalTransaksi;
    @FindBy(xpath = "//input[@id='Amount_cashback']")
    private WebElement disabledNominalCashback;
    @FindBy(xpath = "//input[@id='Transaction_Date']")
    private WebElement disabledTanggalTransaksi;
    @FindBy(xpath = "//select[@id='Merchant_Name']")
    private WebElement disabledNamaMerchant;
    @FindBy(xpath = "//input[@id='RRN']")
    private WebElement disabledRRN;
    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//img")
    private WebElement fotoBuktiTransaksi1;
    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//img")
    private WebElement btnChooseFile1;
    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//img")
    private WebElement btnGantiFoto1;
    @FindBy(xpath = "")
    private WebElement alertSukses1;
    @FindBy(xpath = "//form[@id='rotate_form1']//img")
    private WebElement fotoBuktiTransaksi2;
    @FindBy(xpath = "//form[@id='rotate_form1']//img")
    private WebElement btnChooseFile2;
    @FindBy(xpath = "//form[@id='rotate_form1']//img")
    private WebElement btnGantiFoto2;
    @FindBy(xpath = "")
    private WebElement alertSukses2;
    @FindBy(xpath = "//form[@id='rotate_form2']//img")
    private WebElement fotoBuktiTransaksi3;
    @FindBy(xpath = "//form[@id='rotate_form2']//img")
    private WebElement btnChooseFile3;
    @FindBy(xpath = "//form[@id='rotate_form2']//img")
    private WebElement btnGantiFoto3;
    @FindBy(xpath = "")
    private WebElement txtTidakValidMenggantiFoto;
    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement dropdownShowEntries;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtTabelMaks25;
    @FindBy(xpath = "//textarea[@id='Note']")
    private WebElement fieldNote;
    @FindBy(xpath = "//button[@id='btnNote']")
    private WebElement btnSaveNote;
    @FindBy(xpath = "//button[@id='btnNote']")
    private WebElement okModalKonfirmasiNote;
    @FindBy(xpath = "")
    private WebElement alertSuksesUpdateNote;
    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//a[1]")
    private WebElement btn90Rotate1;
    @FindBy(xpath = "//form[@id='rotate_form1']//img")
    private WebElement fotoKosong2;
    @FindBy(xpath = "//form[@id='rotate_form1']//a[2]")
    private WebElement btn180Rotate2;
    @FindBy(xpath = "")
    private WebElement alertErrorRotate2;
    @FindBy(xpath = "//button[@id='btnEdit']")
    private WebElement btnEditFormVerifikasi;
    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement inputNamaLengkapNasabah;
    @FindBy(xpath = "//button[@id='btnUpdate']")
    private WebElement btnSimpanEditForm;
    @FindBy(xpath = "")
    private WebElement alertSuksesUpdateData;
    @FindBy(xpath = "//div[@id='Customer_Name_error']")
    private WebElement errorNameRequired;
    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement inputNominalTransaksi;
    @FindBy(xpath = "//input[@id='Amount_cashback']")
    private WebElement txtNominalCashback;
    @FindBy(xpath = "//div[@id='Amount_error']")
    private WebElement errorNominalTransaksiRequired;
    @FindBy(xpath = "//input[@id='Transaction_Date']")
    private WebElement inputTanggalTransaksi;
    @FindBy(xpath = "//select[@id='Qris_Pay']")
    private WebElement dropdownPembayaranQRIS;
    @FindBy(xpath = "//div[@id='Qris_Pay_error']")
    private WebElement errorPembayaranQRISRequired;
    @FindBy(xpath = "//select[@id='Merchant_Name']")
    private WebElement dropdownNamaMerchant;
    @FindBy(xpath = "")
    private WebElement errorNamaMerchantRequired;
    @FindBy(xpath = "//td[normalize-space()='Septia ghina sahar']")
    private WebElement txtSeptia;
    @FindBy(xpath = "//td[normalize-space()='rinzana']")
    private WebElement txtRinzana;
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement fieldSearch;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtIsiTabel;
    @FindBy(xpath = "//a[contains(text(),'3')]")
    private WebElement paginationPage3;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtPage3;
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    private WebElement btnPrevious;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtPrevious;
    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElement btnNext;
    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtNext;

    public void clickMenuVerifikasi(){
        menuVerifikasi.click();
    }
    public void clickBtnAksi(){
        btnAksi.click();
    }
    public void clickBtnVerifikasi(){
        btnVerifikasi.click();
    }


}

