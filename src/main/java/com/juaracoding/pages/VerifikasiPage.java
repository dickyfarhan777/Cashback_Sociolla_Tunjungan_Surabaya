package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = "//p[normalize-space()='Verifikasi']")
    private WebElement menuVerifikasi;
    @FindBy(xpath = "//tbody/tr[1]/td[11]/a[1]/i[1]")
    private WebElement btnAksi;
    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    public WebElement btnVerifikasi;
    @FindBy(xpath = "//button[@class='confirmButton btn btn-primary btn-sm']")
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
    @FindBy(xpath = "//input[@id='imgInp_edc']")
    private WebElement btnChooseFile1;
    @FindBy(xpath = "//button[@id='btnupload']")
    private WebElement btnGantiFoto1;
    @FindBy(xpath = "")
    private WebElement alertSukses1;
    @FindBy(xpath = "//form[@id='rotate_form1']//img")
    private WebElement fotoBuktiTransaksi2;
    @FindBy(xpath = "//input[@id='imgInp']")
    private WebElement btnChooseFile2;
    @FindBy(xpath = "//button[@id='btnupload2']")
    private WebElement btnGantiFoto2;
    @FindBy(xpath = "")
    private WebElement alertSukses2;
    @FindBy(xpath = "//form[@id='rotate_form2']//img")
    private WebElement fotoBuktiTransaksi3;
    @FindBy(xpath = "//input[@id='imgInp3']")
    private WebElement btnChooseFile3;
    @FindBy(xpath = "//button[@id='btnupload3']")
    private WebElement btnGantiFoto3;
    @FindBy(xpath = "")
    private WebElement txtTidakValidMenggantiFoto;
    @FindBy(xpath = "//select[@name='table_length']")
    public WebElement dropdownShowEntries;
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
    public void clickOkConfirm1(){
        okModalKonfirmasiVerifikasi.click();
    }
//    public void clickOkAlertConfirm(){
//
//    }
    public String setTxtValidVerifikasi(){
        return txtValidVerifikasi.getText();
    }
    public void disabledForm(){
        disabledNamaLengkapNasabah.click();
        disabledNoHp.click();
        disabledNoRekBCA.click();
        disabledPembayaranQRIS.click();
        disabledNominalTransaksi.click();
        disabledNominalCashback.click();
        disabledNamaMerchant.click();
        disabledRRN.click();
    }
    public void clickFotoBukti1(){
        fotoBuktiTransaksi1.click();
    }
    public void clickChooseFile1(){
        btnChooseFile1.click();
    }
    public void choosePhoto1Png(){
        btnChooseFile1.sendKeys("C:\\MyTools\\logo.png");
    }
    public void clickGantiFoto1(){
        btnGantiFoto1.click();
    }
    public void clickFotoBukti2(){
        fotoBuktiTransaksi2.click();
    }
    public void clickChooseFile2(){
        btnChooseFile2.click();
    }
    public void choosePhotoJpeg(){
        btnChooseFile2.sendKeys("C:\\MyTools\\screenshot.jpeg");
    }
    public void clickFotoBukti3(){
        fotoBuktiTransaksi3.click();
    }
    public void clickChooseFile3(){
        btnChooseFile3.click();
        btnChooseFile3.sendKeys("C:\\MyTools\\logo.png");
    }
    public void choosePhoto3Png(){
        btnChooseFile3.sendKeys("C:\\MyTools\\logo.png");
    }
    public String txtErrorFoto(){
        return txtTidakValidMenggantiFoto.getText();
    }
    public void clickShowEntries(){
        dropdownShowEntries.click();
    }
    public void opsi25(){

    }
    public String setTxtTabelMaks25(){
        return txtTabelMaks25.getText();
    }
    public void inputFieldNote(){
        fieldNote.sendKeys("isi note disini");
    }
    public void clickSaveNote(){
        btnSaveNote.click();
    }
    public void deleteIsiNote(){

    }
    public void clickRotate90Bukti1(){
        btn90Rotate1.click();
    }
    public void clickRotate180Bukti(){
        btn180Rotate2.click();
    }
    public String errorRotate(){
        return alertErrorRotate2.getText();
    }
    public void clickEdit(){
        btnEditFormVerifikasi.click();
    }
    public void changeNamaCust(){
        inputNamaLengkapNasabah.sendKeys("salma123@#$");
    }
    public void clickSimpan(){
        btnSimpanEditForm.click();
    }
    public void suksesMengubahData(){

    }
    public void deleteNamaCust(){
        inputNamaLengkapNasabah.sendKeys();
    }
    public String errorFieldNama(){
        return errorNameRequired.getText();
    }
    public void changeNominalTransaksi(){
        inputNominalTransaksi.sendKeys("00000");
    }
    public void suksesUpdateTransaksi(){

    }
    public void changeTransaksi300Up(){
        inputNominalTransaksi.sendKeys("300001");
    }
    public String setTxtNominalCashback(){
        return txtNominalCashback.getText();
    }
    public String txtValidCashback(){
        return txtNominalCashback.getText();
    }
    public void deleteNominalTransaksi(){
        inputNominalTransaksi.sendKeys("");
    }
    public String setErrorNominalTransaksiRequired(){
        return errorNominalTransaksiRequired.getText();
    }
    public void clickTanggalTransaksi(){
        inputTanggalTransaksi.click();
    }
    public void pilihTanggalTransaksi(){

    }
    public void clickPembayaranQRIS(){
        dropdownPembayaranQRIS.click();
    }
    public String setErrorPembayaranQRISRequired(){
        return errorPembayaranQRISRequired.getText();
    }
    public void clickNamaMerchant(){
        dropdownNamaMerchant.click();
    }
    public void inputFieldSearch(){
        fieldSearch.sendKeys("Septia");
    }
    public void clickEnter(){
    fieldSearch.sendKeys(Keys.ENTER);
    }
    public String setTxtNamaCust(){
        return txtSeptia.getText();
    }
    public void inputNamaSales(){
        fieldSearch.sendKeys("rinzana");
    }
    public String txtNamaSales(){
        return txtRinzana.getText();
    }
    public void deleteFieldSearch(){
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);
        fieldSearch.sendKeys(Keys.BACK_SPACE);

    }
    public String setTxtIsiTabel(){
        return txtIsiTabel.getText();
    }
    public void clickPage3(){
        paginationPage3.click();
    }
    public String setTxtPage3(){
        return txtPage3.getText();
    }
    public void clickPrevious(){
        btnPrevious.click();
    }
    public String setTxtPrevious(){
        return txtPrevious.getText();
    }
    public void clickNext(){
        btnNext.click();
    }
    public String setTxtNext(){
        return txtNext.getText();
    }








}

