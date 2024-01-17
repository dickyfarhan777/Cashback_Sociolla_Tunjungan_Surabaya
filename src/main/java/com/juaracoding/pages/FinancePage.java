package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancePage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, Feri Nugraha']")
    private WebElement txtHome;

    @FindBy(xpath = "//p[normalize-space()='Dashboard']")
    private WebElement btnDashboard;

    @FindBy(xpath = "//p[normalize-space()='Finance']")
    private WebElement btnFinance;

    @FindBy(xpath = "//a[normalize-space()='']")
    private WebElement btnCekRrn;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]") // field text untuk kembali ke menu Dashboard
    private WebElement clickDashboard;

    @FindBy(xpath = "//h3[@class='card-title']") // menampilkan data yang sudah di verifikasi
    private WebElement txtDataVerifikasi;

    @FindBy(xpath = "//select[@name='table_length']") // memilih show entries list
    private WebElement controlList;

    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement txtShowingEntries;

    @FindBy(xpath = "//tbody/tr[1]/td[12]/a[1]/i[1]") // aksi untuk menampilkan data transaksi customer
    private WebElement btnAction;

    @FindBy(xpath = "//a[normalize-space()='Next']") // klik next
    private WebElement btnNext;

    @FindBy(xpath = "//div[@id='table_info']") // menampilkan halaman selanjutnya
    private WebElement txtShow11;

    @FindBy(xpath = "//a[normalize-space()='2']") // menampilkan halaman selanjutnya di control page Number 2
    private WebElement btnPage2;

    @FindBy(xpath = "//a[contains(text(),'3')]") // klik page 3
    private WebElement btnPage3;

    @FindBy(xpath = "//div[@id='table_info']") // tampilan page 3
    private WebElement txtDataPage3;

    @FindBy(xpath = "//li[@id='table_previous']") // klik previous
    private WebElement btnPrevious;

    @FindBy(xpath = "//div[@id='table_info']") // menampilkan halaman sebelumnya di control page Previous
    private WebElement txtDataPagePrevious;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']") // kolom search mencari data customer dgn Nama, RRN, RefID
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']") // kolom search mencari data customer dgn Nama, RRN, RefID
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']") // kolom search mencari data customer dgn Nama, RRN, RefID
    private WebElement inpuMidleName;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']") // kolom search mencari data customer dgn Nama, RRN, RefID
    private WebElement inputRrn;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']") // kolom search mencari data customer dgn Nama, RRN, RefID
    private WebElement inputRefId;

    @FindBy(xpath = "//button[normalize-space()='Kembalikan ke VERIFIKATOR']") // button pilihan kembalikan ke Verifikator
    private WebElement backVerifikator;

    @FindBy(xpath = "//button[normalize-space()='Update Sudah Transfer']") // button update sudah transfer
    private WebElement updateTrf;

    @FindBy(xpath = "//input[@onclick='toggle(this);']") // all check box
    private WebElement checkBox;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]") // check box row 1
    private WebElement checkBox1;

    @FindBy(xpath = "//i[@class='fas fa-bars']")
    private WebElement btnHide;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement txtDashboard;


    // step action
    public void setBtnFinance(){
        btnFinance.click();
    }

    public void setClickDashboard(){
        clickDashboard.click();
    }

    public void setControlList(){
        controlList.click();
    }

    public void setBtnAction(){
        btnAction.click();
    }



    public  String getTxtHome(){
        return txtHome.getText();
    }
    public String getTxtShowingEntries(){
        return txtShowingEntries.getText();
    }

    public String getTxtDataVerifikasi(){
        return txtDataVerifikasi.getText();
    }

    public void setBtnNext(){
        btnNext.click();
    }

    public void setBtnPage2(){
        btnPage2.click();
    }

    public void setBtnPage3(){
        btnPage3.click();
    }

    public String getTxtDataPage3(){
        return txtDataPage3.getText();
    }

    public void setBtnPrevious(){
        btnPrevious.click();
    }

    public String getTxtDataPagePrevious(){
        return txtDataPagePrevious.getText();
    }

    public void setInputFirstName(String firstName){
        this.inputFirstName.sendKeys(firstName);
    }

    public void setInputLastName(String lastName){
        this.inputLastName.sendKeys(lastName);
    }

    public void setInputMidleName(String midleName){
        this.inpuMidleName.sendKeys(midleName);
    }

    public void setInputRrn(String Rrn){
        this.inputRrn.sendKeys(Rrn);
    }

    public void setInputRefId(String RefId){
        this.inputRefId.sendKeys(RefId);
    }

    public void setCheckBox1(){
        checkBox1.click();
    }

    public void setBackVerifikator(){
        backVerifikator.click();
    }

    public void setUpdateTrf(){
        updateTrf.click();
    }

    public void setCheckBox(){
        checkBox.click();
    }

    public void setBtnHide(){
        btnHide.click();
    }

    public String getTxtDashboard(){
       return txtDashboard.getText();
    }

    public String getTxtShow11(){
        return txtShow11.getText();
    }


}

