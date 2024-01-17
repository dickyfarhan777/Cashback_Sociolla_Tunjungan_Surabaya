package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogoutPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();
    public static LogoutPage logoutPage = new LogoutPage();


    public LogoutTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User akses link web cashbackk")
    public void user_akses_link_web_cashbackk(){
        driver.get(Constant.URL);
        extentTest.log(LogStatus.PASS,"User akses link web cashbackk");
    }

    @When("User Admin berhasil login ke web cashback")
    public void User_Admin_berhasil_login_ke_web_cashback(){
    }

    @And("Tampilan Home")
    public void Tampilan_Home(){
        logoutPage.getTxtHomeAdmin();
        Assert.assertTrue(logoutPage.getTxtHomeAdmin().contains("Selamat datang, admintiara2"));
        extentTest.log(LogStatus.PASS,"Tampilan Home");
    }

    @And("Klik button menu logout")
    public void Klik_button_menu_logout(){
        logoutPage.setBtnLogout();
    }

    @Then("Tampilan halaman awal login")
    public void Tampilan_halaman_awal_login(){
        logoutPage.getTxtPageLogin();
        Assert.assertTrue(logoutPage.getTxtPageLogin().contains("SOCIOLLA TUNJUNGAN SURABAYA"));
        extentTest.log(LogStatus.PASS,"Tampilan halaman awal login");
    }

    @And("Putuskan device dengan jaringan internet")
    public void Putuskan_device_dengan_jaringan_internet(){
    }

    @Then("Menampilkan pesan No internet")
    public void Menampilkan_pesan_No_internet(){
        logoutPage.getTxtNoInternet();
        Assert.assertEquals(logoutPage.getTxtNoInternet(),"No Intenet");
        extentTest.log(LogStatus.PASS,"Putuskan device dengan jaringan internet");
    }

    @When("User Verifikator berhasil login ke web cashback")
    public void User_Verifikator_berhasil_login_ke_web_cashback(){
        logoutPage.getTxtHomeVerif();
        Assert.assertEquals(logoutPage.getTxtHomeVerif(),"Selamat datang, Feri Nugraha 2");
        extentTest.log(LogStatus.PASS,"User Verifikator berhasil login ke web cashback");
    }

    @When("User Finance berhasil login ke web cashback")
    public void User_Finance_berhasil_login_ke_web_cashback(){
        logoutPage.getTxtHomeFinance();
        Assert.assertEquals(logoutPage.getTxtHomeFinance(),"Selamat datang, Feri Nugraha");
        extentTest.log(LogStatus.PASS,"User Finance berhasil login ke web cashback");
    }


}

