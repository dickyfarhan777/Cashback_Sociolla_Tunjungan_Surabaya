package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RegisterPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static RegisterPage registerPage = new RegisterPage();

    public RegisterTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin login web sociolla cashback")
    public void admin_login_web_sociolla_cashback(){
        loginPage.loginAdmin("admintiara2","a");
    }
    @When("Klik menu Register")
    public void klik_menu_register(){
        registerPage.clickMenuRegister();
        Assert.assertTrue(registerPage.getTxtRegister().contains("List Data Register By User"));
        extentTest.log(LogStatus.PASS,"Klik menu Register");
    }
    @And("Klik add new data")
    public void klik_add_new_data(){
        registerPage.clickAddNewData();
        Assert.assertTrue(registerPage.getTxtFormInputRegister().contains("Form Input Data Cashback"));
        extentTest.log(LogStatus.PASS,"Klik add new data");
    }
    @And("Input Soco Id dengan benar")
    public void input_soco_id(){
        registerPage.setInputSocoId("515510021");
        Assert.assertEquals(registerPage.getTxtSocoId(),"SOCO ID *");
        extentTest.log(LogStatus.PASS,"Input Soco Id dengan benar");
    }
    @And("Input Nama Lengkap Nasabah Dengan Benar")
    public void input_nama_lengkap_nasabah_dengan_benar(){
        registerPage.setInputCustomerName("diky");
Assert.assertEquals(registerPage.getTxtCustomerName(),"Nama Lengkap Nasabah *");
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah Dengan Benar");
    }
    @And("Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar")
    public void input_nomor_hp_yang_terdaftar_di_bca_dengan_benar(){
registerPage.setInputNoHandphone("085155511114");
Assert.assertEquals(registerPage.getTxtNomorHandphone(),"Nomor Handphone yang terdaftar di BCA *");
        extentTest.log(LogStatus.PASS,"Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar");
    }
    @And("Input Nomor Rekening Bca Dengan Benar")
    public void input_nomor_rekening_bca_dengan_benar(){
registerPage.setInputNoRekening("5123123123");
Assert.assertEquals(registerPage.getTxtNoRekening(),"Nomor Rekening BCA *");
        extentTest.log(LogStatus.PASS,"Input Nomor Rekening Bca Dengan Benar");
    }
    @And("Pilih Pembayaran Qris")
    public void pilih_pembayaran_qris(){
registerPage.setPembayaranQris();
Assert.assertEquals(registerPage.getTxtPembayaranQris(),"Pembayaran QRIS *");
        extentTest.log(LogStatus.PASS,"Pilih Pembayaran Qris");
    }
    @And("Input Nominal Transaksi Dengan Benar")
    public void input_nominal_transaksi_dengan_benar(){
registerPage.setNominalTransaksi("300000");
Assert.assertEquals(registerPage.getTxtNominalTransaksi(),"Nominal Transaksi *");
        extentTest.log(LogStatus.PASS,"Input Nominal Transaksi Dengan Benar");
    }
    @And("Input Tanggal Transaksi Dengan Benar")
    public void input_tanggal_transaksi_dengan_benar(){
registerPage.setTanggalTransaksi("01/12/2024");
Assert.assertEquals(registerPage.getTxtTanggalTransaksi(),"Tanggal Transaksi *");
        extentTest.log(LogStatus.PASS,"Input Tanggal Transaksi Dengan Benar");
    }
    @And("Pilih Nama Merchant")
    public void pilih_nama_merchant(){
        registerPage.setNamaMerchant("SOCIOLLA");
        Assert.assertEquals(registerPage.getTxtNamaMerchant(),"Nama Merchant *");
        extentTest.log(LogStatus.PASS,"Pilih Nama Merchant");
    }
    @And("Input Rrn Dengan Benar")
    public void input_rrn_dengan_benar(){
registerPage.setAngkaRRN("33451213");
Assert.assertEquals(registerPage.getTxtRRN(),"RRN *");
        extentTest.log(LogStatus.PASS,"Input Rrn Dengan Benar");
    }
    @And("Upload Foto Bukti Transaksi 1")
    public void upload_foto_bukti_transaksi1(){
registerPage.setFotoBuktiTransaksi1();
Assert.assertEquals(registerPage.getTxtFotoTransaksi1(),"Foto Bukti Transaksi 1*");
        extentTest.log(LogStatus.PASS,"Upload Foto Bukti Transaksi 1");
    }
    @And("Upload Foto Bukti Transaksi 2")
    public void upload_foto_bukti_transaksi2(){
registerPage.setFotoBuktiTransaksi2();
Assert.assertEquals(registerPage.getTxtFotoTransaksi2(),"Foto Bukti Transaksi 2");
        extentTest.log(LogStatus.PASS,"Upload Foto Bukti Transaksi 2");
    }
    @And("Upload Foto Bukti Transaksi 3")
    public void upload_foto_bukti_transaksi3(){
        registerPage.setFotoBuktiTransaksi3();
        Assert.assertEquals(registerPage.getTxtFotoTransaksi3(),"Foto Bukti Transaksi 3");
        extentTest.log(LogStatus.PASS,"Upload Foto Bukti Transaksi 3");
    }
    @And("Klik submit data")
    public void klik_submit_data(){
       // Assert.assertEquals(registerPage.getValueBtnSubmit(),"Submit Data");
registerPage.clickBtnSubmitRegister();
        extentTest.log(LogStatus.PASS,"Klik submit data");
    }
    @Then("Menampilkan alert sukses")
    public void menampilkan_alert_sukses(){
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"Menampilkan alert sukses");
    }
}
