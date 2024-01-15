package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ReportDataPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ReportDataTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ReportDataPage reportDataPage= new ReportDataPage();
    private static LoginPage loginPage = new LoginPage();

    public ReportDataTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin login web sociolla cashback")
    public void admin_login_web_sociolla_cashback() {
        loginPage.loginAdmin("admintiara2", "a");
        extentTest.log(LogStatus.PASS,"");
    }


    @Given("Klik menu report data")
    public void klik_menu_report_data(){
        reportDataPage.clickMenuReportData();
        extentTest.log(LogStatus.PASS,"Klik menu report data");
    }
    @When("Klik Combo box status")
    public void klik_combo_box_status(){
        reportDataPage.clickStatusData();
        extentTest.log(LogStatus.PASS,"lik Combo box status");
    }
    @And("Pilih all")
    public void pilih_all(){
        reportDataPage.sendStatusData("all");
        extentTest.log(LogStatus.PASS,"ilih all");
    }
    @And("Pilih new data")
    public void pilih_new_data(){
        reportDataPage.sendStatusData("new data");
        extentTest.log(LogStatus.PASS,"Pilih new data");

    }
    @And("Pilih validated")
    public void pilih_validated(){
        reportDataPage.sendStatusData("validated");
        extentTest.log(LogStatus.PASS,"Pilih validated");

    }
    @And("Pilih transfered")
    public void pilih_transfered(){
        reportDataPage.sendStatusData("transfered");
        extentTest.log(LogStatus.PASS,"Pilih transfered");

    }
    @And("Pilih uploaded")
    public void pilih_uploaded(){
        reportDataPage.sendStatusData("uploaded");
        extentTest.log(LogStatus.PASS,"Pilih uploaded");

    }

    @And("Klik button filter")
    public void klik_button_filter(){
        reportDataPage.clickBtnFilter();
        extentTest.log(LogStatus.PASS,"Klik button filter");
    }
    @Then("Akan menampilkan semua data status")
    public void akan_menampilkan_semua_data_status(){


    }
    @And("Klik combo box show")
    public void klik_combo_box_show(){
        reportDataPage.clickShowData();
        extentTest.log(LogStatus.PASS,"Klik combo box show");
    }
    @And("Pilih 10")
    public void pilih_10(){
        reportDataPage.sendShowData("10");
        extentTest.log(LogStatus.PASS,"Pilih 10");

    }
    @And("Pilih 25")
    public void pilih_25(){
        reportDataPage.sendShowData("25");
        extentTest.log(LogStatus.PASS,"Pilih 25");

    }
    @And("Pilih 50")
    public void pilih_50(){
        reportDataPage.sendShowData("50");
        extentTest.log(LogStatus.PASS,"Pilih 50");

    }
    @And("Pilih 100")
    public void pilih_100(){
        reportDataPage.sendShowData("100");
        extentTest.log(LogStatus.PASS,"Pilih 100");

    }
    @And("Klik field search dan Ketik data yang sudah terdaftar")
    public void klik_field_search(){
        reportDataPage.clickSearch("diky");
        extentTest.log(LogStatus.PASS,"Klik field search dan Ketik data yang sudah terdaftar");
    }
    @And("Klik button aksi bericon mata")
    public void Klik_button_aksi_bericon_mata(){
        reportDataPage.clickBtnAksi();
        extentTest.log(LogStatus.PASS,"Klik button aksi bericon mata");
    }
    @And("Klik icon search")
    public void klik_icon_search(){
        reportDataPage.clickBtnSeach();
        extentTest.log(LogStatus.PASS,"Klik icon search");
    }
    @And("Ketik data yang tidak terdaftar")

    @Then("Akan menampilkan semua data berstatus new data")
    public void akan_menampilkan_semua_data_berstatus_new_data(){

    }
    @Then("Akan menampilkan semua data berstatus validated")
    public void akan_menampilkan_semua_data_berstatus_validated(){

    }
    @Then("Akan menampilkan semua data berstatus transfered")
    public void akan_menampilkan_semua_data_berstatus_transfered(){

    }
    @Then("Akan menampilkan semua data berstatus uploaded")
    public void akan_menampilkan_semua_data_berstatus_uploaded(){

    }
    @Then("Akan menampilkan data yang terdaftar")
    public void akan_menampilkan_data_yang_terdaftar(){

    }

    @Then("Tidak menampilkan data")
    public void tidak_menampilkan_data(){

    }

    @Then("Akan tampil detail data report customer")
    public void tampil_detail_data_report_customer(){
        reportDataPage.getHalamanAksi();
        extentTest.log(LogStatus.PASS,"Akan tampil detail data report customer");
    }

    @Then("Akan menampilkan maximal 10 data perhamalam")
    public void menampilkan_maximal_10_data_perhamalam(){

    }

    @Then("Akan menampilkan maximal 25 data perhamalam")
    public void menampilkan_maximal_25_data_perhamalam(){

    }

    @Then("Akan menampilkan maximal 50 data perhamalam")
    public void menampilkan_maximal_50_data_perhamalam(){

    }

    @Then("Akan menampilkan maximal 100 data perhamalam")
    public void menampilkan_maximal_100_data_perhamalam(){

    }





}
