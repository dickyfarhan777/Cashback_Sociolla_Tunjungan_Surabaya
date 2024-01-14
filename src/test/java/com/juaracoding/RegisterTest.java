package com.juaracoding;

import com.github.javafaker.Faker;
import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RegisterPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Locale;

public class RegisterTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static RegisterPage registerPage = new RegisterPage();
    Faker javaFaker = Faker.instance();
    Faker faker = new Faker();
    Faker fakerTR = Faker.instance(new Locale("en-US"));

    public RegisterTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin akses link web cashback")
    public void admin_login_web_sociolla_cashback() {
        loginPage.loginAdmin("admintiara2", "a");
        extentTest.log(LogStatus.PASS, "Admin akses link web cashback");
    }

    @When("Klik menu Register")
    public void klik_menu_register() {
        registerPage.clickMenuRegister();
        extentTest.log(LogStatus.PASS, "Klik menu Register");
    }

    @And("Klik add new data")
    public void klik_add_new_data() {
        registerPage.clickAddNewData();
        extentTest.log(LogStatus.PASS, "Klik add new data");
    }
//Setting Ulang
    @And("Input Soco Id dengan benar")
    public void input_soco_id() {
        registerPage.setInputSocoId("5155100215");
        extentTest.log(LogStatus.PASS, "Input Soco Id dengan benar");
    }
    //Setting Ulang
    @And("Input Soco Id yang sudah terdaftar sebelumnya")
    public void input_socoid_yang_sudah_terdaftar_sebelumnya() {
        registerPage.setInputSocoId("5155100215");
        extentTest.log(LogStatus.PASS, "Input Soco Id yang sudah terdaftar sebelumnya");
    }

    @And("Input Nama Lengkap Nasabah Dengan Benar")
    public void input_nama_lengkap_nasabah_dengan_benar() {
        registerPage.setInputCustomerName("diky");
        extentTest.log(LogStatus.PASS, "Input Nama Lengkap Nasabah Dengan Benar");
    }
    //Setting Ulang
    @And("Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar")
    public void input_nomor_hp_yang_terdaftar_di_bca_dengan_benar() {
        registerPage.setInputNoHandphone("085155511114");
        extentTest.log(LogStatus.PASS, "Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar");
    }
    //Setting Ulang
    @And("Input nomor hp yang sudah terdaftar di sebelumnya")
    public void input_nomor_hp_yang_sudah_terdaftar_di_sebelumnya() {
        registerPage.setInputNoHandphone("085155511114");
        extentTest.log(LogStatus.PASS, "Input nomor hp yang sudah terdaftar di sebelumnya");
    }
//Setting Ulang
    @And("Input Nomor Rekening Bca Dengan Benar")
    public void input_nomor_rekening_bca_dengan_benar() {
        registerPage.setInputNoRekening("5123123123");
        extentTest.log(LogStatus.PASS, "Input Nomor Rekening Bca Dengan Benar");
    }
    //Setting Ulang
    @And("Input nomor rekening bca yang sudah terdaftar sebelumnya")
    public void input_nomor_rekening_bca_yang_sudah_terdaftar_sebelumnya(){
        registerPage.setInputNoRekening("5123123123");
        extentTest.log(LogStatus.PASS,"Input nomor rekening bca yang sudah terdaftar sebelumnya");
    }

    @And("Pilih Pembayaran Qris")
    public void pilih_pembayaran_qris() {
        registerPage.setPembayaranQris();
        extentTest.log(LogStatus.PASS, "Pilih Pembayaran Qris");
    }

    @And("Input Nominal Transaksi Dengan Benar")
    public void input_nominal_transaksi_dengan_benar() {
        registerPage.setNominalTransaksi("300000");
        extentTest.log(LogStatus.PASS, "Input Nominal Transaksi Dengan Benar");
    }

    @And("Input Tanggal Transaksi Dengan Benar")
    public void input_tanggal_transaksi_dengan_benar() {
        registerPage.setTanggalTransaksi("01/12/2024");
        extentTest.log(LogStatus.PASS, "Input Tanggal Transaksi Dengan Benar");
    }

    @And("Pilih Nama Merchant")
    public void pilih_nama_merchant() {
        registerPage.setNamaMerchant("SOCIOLLA");
        extentTest.log(LogStatus.PASS, "Pilih Nama Merchant");
    }
//Setting Ulang Lagi
    @And("Input Rrn Dengan Benar")
    public void input_rrn_dengan_benar() {
        registerPage.setAngkaRRN("33451213");
        extentTest.log(LogStatus.PASS, "Input Rrn Dengan Benar");
    }
    //Setting Ulang Lagi
    @And("Input Rrn dengan RRN yang sudah terdaftar")
    public void input_rrn_dengan_rrn_yang_sudah_terdaftar(){
        registerPage.setAngkaRRN("33451213");
        extentTest.log(LogStatus.PASS,"Input Rrn dengan RRN yang sudah terdaftar");
    }

    @And("Upload Foto Bukti Transaksi 1")
    public void upload_foto_bukti_transaksi1() {
        registerPage.setFotoBuktiTransaksi1();
        extentTest.log(LogStatus.PASS, "Upload Foto Bukti Transaksi 1");
    }

    @And("Upload Foto Bukti Transaksi 2")
    public void upload_foto_bukti_transaksi2() {
        registerPage.setFotoBuktiTransaksi2();
        extentTest.log(LogStatus.PASS, "Upload Foto Bukti Transaksi 2");
    }

    @And("Upload Foto Bukti Transaksi 3")
    public void upload_foto_bukti_transaksi3() {
        registerPage.setFotoBuktiTransaksi3();
        extentTest.log(LogStatus.PASS, "Upload Foto Bukti Transaksi 3");
    }

    @And("Klik submit data")
    public void klik_submit_data() {
        registerPage.clickBtnSubmitRegister();
        extentTest.log(LogStatus.PASS, "Klik submit data");
    }

    @Then("Menampilkan alert sukses")
    public void menampilkan_alert_sukses() {
        DriverSingleton.delay(2);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "Menampilkan alert sukses");
    }

    @And("Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar rekening random")
    public void input_nomor_hp_yang_terdaftar_di_bca_dengan_fake() {
        registerPage.setInputNoHandphone("08516236121");
        extentTest.log(LogStatus.PASS, "Input Nomor Hp Yang Terdaftar Di Bca Dengan Benar fake random");
    }
    @And("Input Nomor Rekening Bca Dengan Benar rekening random")
    public void input_nomor_rekening_bca_dengan_benar_fake() {
        registerPage.setInputNoRekening(faker.numerify("#########"));
        extentTest.log(LogStatus.PASS, "Input Nomor Rekening Bca Dengan Benar rekening random");
    }
    @And("Input Soco Id dengan benar random")
    public void input_soco_id_dengan_benar_fake() {
        registerPage.setInputSocoId(faker.numerify("#########"));
        extentTest.log(LogStatus.PASS, "Input Soco Id dengan benar random");
    }
    @And("Input Soco ID menggunakan full huruf")
    public void input_soco_id_dengan_full_huruf() {
        registerPage.setInputSocoId(fakerTR.name().firstName());
        extentTest.log(LogStatus.PASS, "Input Soco ID menggunakan full huruf");
    }
    @And("Input Rrn Dengan Benar random rrn number")
    public void input_rrn_dengan_benar_random_rrn_number() {
        registerPage.setAngkaRRN(faker.numerify("#########"));
        extentTest.log(LogStatus.PASS, "Input Rrn Dengan Benar random rrn number");
    }
    @And("Soco Id menggunakan campuran huruf dan angka")
    public void socoid_menggunakan_campuran_huruf_dan_angka(){
        registerPage.setInputSocoId(faker.bothify("Dicky####"));
        extentTest.log(LogStatus.PASS,"Soco Id menggunakan campuran huruf dan angka");
    }
    @And("Input Soco Id dengan menggunakan Karakter @")
    public void socoid_menggunakan_karakter_at(){
        registerPage.setInputSocoId(faker.bothify("????????@"));
        extentTest.log(LogStatus.PASS,"Input Soco Id dengan menggunakan Karakter @");
    }
    @And("Input Soco Id dengan menggunakan Karakter >")
    public void socoid_menggunakan_karakter_lbh_kecil(){
        registerPage.setInputSocoId(faker.bothify("????????>"));
        extentTest.log(LogStatus.PASS,"Input Soco Id dengan menggunakan Karakter >");
    }
    @And("Input Soco Id dengan menggunakan Karakter <")
    public void socoid_menggunakan_karakter_lbh_besar(){
        registerPage.setInputSocoId(faker.bothify("????????<"));
        extentTest.log(LogStatus.PASS,"Input Soco Id dengan menggunakan Karakter <");
    }
    @And("Input Soco Id dengan menggunakan Karakter kutip satu")
    public void socoid_menggunakan_karakter_kutip_satu(){
        registerPage.setInputSocoId(faker.bothify("????????'"));
        extentTest.log(LogStatus.PASS,"Input Soco Id dengan menggunakan Karakter kutip satu");
    }
    @And("Input Soco Id dengan menggunakan Karakter kutip dua")
    public void socoid_menggunakan_karakter_kutip_dua(){
        registerPage.setInputSocoId(faker.bothify("????????\""));
        extentTest.log(LogStatus.PASS,"Input Soco Id dengan menggunakan Karakter kutip dua");
    }
    @And("Input Nama Lengkap Nasabah menggunakan full angka")
    public void input_nama_nasabah_menggunakan_full_angka(){
        registerPage.setInputCustomerName(faker.numerify("#########"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan full angka");
    }
    @And("Input Nama Lengkap Nasabah menggunakan Karakter >")
    public void input_nama_nasabah_menggunakan_karakter_lbh_kecil(){
        registerPage.setInputCustomerName(faker.bothify("??????>"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan Karakter >");
    }
    @And("Input Nama Lengkap Nasabah menggunakan Karakter <")
    public void input_nama_nasabah_menggunakan_karakterlbh_besar(){
        registerPage.setInputCustomerName(faker.bothify("??????<"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan Karakter <");
    }
    @And("Input Nama Lengkap Nasabah menggunakan Karakter kutip satu")
    public void input_nama_nasabah_menggunakan_karakter_kutip_satu(){
        registerPage.setInputCustomerName(faker.bothify("??????'"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan Karakter kutip satu");
    }
    @And("Input Nama Lengkap Nasabah menggunakan Karakter kutip dua")
    public void input_nama_nasabah_menggunakan_karakter_kutip_dua(){
        registerPage.setInputCustomerName(faker.bothify("??????\""));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan Karakter kutip dua");
    }
    @And("Input Nama Lengkap Nasabah menggunakan Karakter dash")
    public void input_nama_nasabah_menggunakan_karakter_dash(){
        registerPage.setInputCustomerName(faker.bothify("??????_"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan Karakter dash");
    }
    @And("Input Nama Lengkap Nasabah Dengan huruf dan angka")
    public void input_nama_nasabah_dengan_huruf_angka(){
        registerPage.setInputCustomerName(faker.bothify("Dicky####"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah Dengan huruf dan angka");
    }

    @And("Input Nama Lengkap Nasabah Dengan menambahkan !")
    public void input_nama_nasabah_dengan_menambahkan_tanda_seru(){
        registerPage.setInputCustomerName(faker.bothify("?????????!"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah Dengan menambahkan !");
    }
    @And("Input Nama Lengkap Nasabah menggunakan Karakter at")
    public void input_nama_nasabah_dengan_menambahkan_at(){
        registerPage.setInputCustomerName(faker.("?????????@"));
        extentTest.log(LogStatus.PASS,"Input Nama Lengkap Nasabah menggunakan Karakter at");
    }

    @Then("Menampilkan alert RRN sudah ada")
    public void menampilkan_alert_rrn_sudah_ada() {

        extentTest.log(LogStatus.PASS,"Menampilkan alert RRN sudah ada");
    }
    @Then("Menampilkan Alert Data Sudah digunakan Hari Ini")
    public void menampilkan_alert_data_sudah_digunakan_hari_ini(){

        extentTest.log(LogStatus.PASS,"Menampilkan Alert Data Sudah digunakan Hari Ini");
    }
    @Then("Menampilkan alert transaksi sudah ada untuk hari ini")
    public void menampilkan_alert_transaksu_sudah_ada_untuk_hari_ini(){

        extentTest.log(LogStatus.PASS,"Menampilkan alert transaksi sudah ada untuk hari ini");
    }

    @Then("Menampilkan alert please fill out this field")
    public void menampilkan_alert_please_fill_out_this_field() {
        Assert.assertEquals(registerPage.);
        extentTest.log(LogStatus.PASS,"Menampilkan alert please fill out this field");
    }
}
