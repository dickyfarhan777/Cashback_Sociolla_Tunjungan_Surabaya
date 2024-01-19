package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static DashboardPage dashboardPage = new DashboardPage();
    private static LoginPage loginPage = new LoginPage();

    public DashboardTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Klik menu dashboard")
    public void klik_menu_dashboard() {
        dashboardPage.setClickMenuDashboard();
        extentTest.log(LogStatus.PASS,"Klik menu dashboard");
    }

    @And("Klik periode tanggal pada filter data dan pilih tanggal sama")
    public void klik_periode_tanggal() {
        dashboardPage.setStartPeriode("08/01/2024");
        extentTest.log(LogStatus.PASS,"Klik periode tanggal pada filter data dan pilih tanggal sama");
    }

    @And("Klik sd tanggal pada filter data dan pilih tanggal yang sama")
    public void klik_sd_tanggal() {
        dashboardPage.setStartPeriode("08/01/2024");
        extentTest.log(LogStatus.PASS,"Klik sd tanggal pada filter data dan pilih tanggal yang sama");
    }

    @And("Klik button filter dashboard")
    public void klik_button_filter_dashboard() {
        dashboardPage.clickButtonFilter();
        extentTest.log(LogStatus.PASS, "Klik button filter dashboard");
    }

    @And("Klik periode tanggal pada filter data and tanggal sesudah hari ini")
    public void tanggal_hari_ini() {
        dashboardPage.setStartPeriode("20/01/2024");
        extentTest.log(LogStatus.PASS, "Klik periode tanggal pada filter data and tanggal sesudah hari ini");
    }

    @And("Klik sd tanggal pada filter data and pilih tanggal sesudah hari ini")
    public void tanggal_sesudah_hari_ni() {
        dashboardPage.setEndSampeDengan("20/01/2024");
        extentTest.log(LogStatus.PASS, "Klik sd tanggal pada filter data and pilih tanggal sesudah hari ini");
    }

    @And("Klik periode tanggal pada filter data dan pilih tanggal sebelum hari")
    public void pilih_tanggal_sebelum_hari_ini() {
        dashboardPage.setStartPeriode("08/01/2024");
        extentTest.log(LogStatus.PASS, "Klik periode tanggal pada filter data dan pilih tanggal sebelum hari");
    }

    @And("Klik sd tanggal pada filter data pilih tanggal sesudah hari ini")
    public void pilih_tanggal_sesudah_hari_ini() {
        dashboardPage.setEndSampeDengan("09/01/2024");
        extentTest.log(LogStatus.PASS, "Klik sd tanggal pada filter data pilih tanggal sesudah hari ini");
    }

    @And("Klik periode tanggal pada filter data dan pilih tanggal hari ini")
    public void periode_tanggal_pilih_hari_ini() {
        dashboardPage.setStartPeriode("09/01/2024");
        extentTest.log(LogStatus.PASS, "Klik periode tanggal pada filter data dan pilih tanggal hari ini");
    }

    @And("Klik sd tanggal pada filter data dan pilih tanggal sebelum hari ini")
    public void sd_tanggal_sebelum_hari_ini() {
        dashboardPage.setEndSampeDengan("07/01/2024");
        extentTest.log(LogStatus.PASS, "Klik sd tanggal pada filter data dan pilih tanggal sebelum hari ini");
    }

    @And("Klik periode tanggal pada filter data and pilih tanggal sblm")
    public void tanggal_sblm() {
        dashboardPage.setStartPeriode("04/01/2024");
        extentTest.log(LogStatus.PASS, "Klik periode tanggal pada filter data and pilih tanggal sblm");
    }

    @And("Klik sd tanggal pada filter data and tanggal sesudah hari ini")
    public void tanggal_sesudah() {
        dashboardPage.setStartPeriode("05/01/2024");
        extentTest.log(LogStatus.PASS, "Klik sd tanggal pada filter data and tanggal sesudah hari ini");
    }
    @And("Klik periode tanggal pada filter data and Pilih tanggal sblm")
    public void spgStart(){
        dashboardPage.setStartPeriode("04/01/2024");
        extentTest.log(LogStatus.PASS,"Klik periode tanggal pada filter data and Pilih tanggal sblm");
    }
    @And("Klik sd tanggal pada filter data and pilih tanggal sesudah")
    public void spgEnd(){
        dashboardPage.setEndSampeDengan("04/01/2024");
        extentTest.log(LogStatus.PASS,"Klik sd tanggal pada filter data and pilih tanggal sesudah");
    }

    @Then("Akan menampilkan data valid yang difilter1")
    public void tampil_data_yg_difilter() {
        DriverSingleton.delay(5);
        Assert.assertEquals(dashboardPage.getTxtTableCashback(),"Rp. 0");
        extentTest.log(LogStatus.PASS, "Akan menampilkan data valid yang difilter1");
    }

    @Then("Akan menampilkan data valid yang difilter2")
    public void tampil_data_yg_difilter2() {
        DriverSingleton.delay(5);
        Assert.assertEquals(dashboardPage.getTxtTableCashback(),"Rp. 3,822,312");
        extentTest.log(LogStatus.PASS, "Akan menampilkan data valid yang difilter2");
    }

    @Then("Tidak akan menampilkan data invalid yang difilter1")
    public void tidak_tampil_data_yg_difilter1() {
        DriverSingleton.delay(5);
        Assert.assertEquals(dashboardPage.getTxtTableCashback(),"Rp. 0");
        extentTest.log(LogStatus.PASS, "Tidak akan menampilkan data invalid yang difilter1");
    }

    @Then("Tidak akan menampilkan data invalid yang difilter2")
    public void tidak_tampil_data_yg_difilter2() {
        DriverSingleton.delay(5);
        Assert.assertEquals(dashboardPage.getTxtTableCashback(),"Rp. 0");
        extentTest.log(LogStatus.PASS, "Tidak akan menampilkan data invalid yang difilter2");
    }

    @Then("Klik export excel di table dashboard nominal cashback")
    public void downlaod_excel_dashboard_nom_cashback() {
        dashboardPage.downExcelDashboard();
        extentTest.log(LogStatus.PASS, "Klik export excel di table dashboard nominal cashback");
    }

    @Then("Klik export excel di table dashboard spg")
    public void download_excel_dashboard_spg() {
        dashboardPage.downExcelSpg();
        extentTest.log(LogStatus.PASS, "Klik export excel di table dashboard spg");
    }
    @Then("Akan menampilkan data valid yang difilter3")
    public void menampilkan_data_spg(){
        DriverSingleton.delay(5);
        Assert.assertEquals(dashboardPage.getTxtTableSpg(),"vivi");
        extentTest.log(LogStatus.PASS,"Akan menampilkan data valid yang difilter3");
    }


}
