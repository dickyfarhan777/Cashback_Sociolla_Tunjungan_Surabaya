package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();


    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User akses link web cashback")
    public void user_akses_link_web_cashback(){
        driver.get(Constant.URL);
        extentTest.log(LogStatus.PASS,"User akses link web cashback");
    }
    @When("Tampilan halaman login")
    public void tampilan_halaman_login(){
        loginPage.getTxtLogin();
        Assert.assertTrue(loginPage.getTxtLogin().contains("SOCIOLLA TUNJUNGAN SURABAYA"));
        extentTest.log(LogStatus.PASS,"Tampilan halaman login");
    }

    @And("Input username admintiara2")
    public void input_username_admintiara2(){
        loginPage.setUsername("admintiara2");
        extentTest.log(LogStatus.PASS,"Input username admintiara2");
    }
    @And("Input password a")
    public void input_password_a(){
        loginPage.setPassword("a");
        extentTest.log(LogStatus.PASS,"Input password a");
    }
    @And("Klik button login")
    public void klik_button_login(){
        loginPage.setButtonLogin();
        extentTest.log(LogStatus.PASS,"Klik button login");
    }
    @Then("Tampilan halaman home")
    public void tampilan_halaman_home(){
        loginPage.getTxtHome();
        Assert.assertEquals(loginPage.getTxtHome(),"Selamat datang, admintiara2");
        extentTest.log(LogStatus.PASS,"Tampilan halaman home");
    }

    @And("Input unvalidated username")
    public void Input_unvalidated_username(){
        loginPage.setLogout();
        loginPage.setUsername("admintiara123");
        extentTest.log(LogStatus.PASS,"Input unvalidated username");
    }

    @Then("Menampilkan alert username atau password salah")
    public void Menampilkan_alert_username_atau_password_salah(){
        loginPage.getTxtFailLogin();
        Assert.assertEquals(loginPage.getTxtFailLogin(),"Username atau Password Salah!");
        extentTest.log(LogStatus.PASS,"Menampilkan alert username atau password salah");
    }

    @Then("Menampilkan icon alert")
    public void Menampilkan_icon_alert(){
        loginPage.getTxtAlertUsername();
        Assert.assertEquals(loginPage.getTxtAlertUsername(),"Enter Username");
        extentTest.log(LogStatus.PASS,"Menampilkan icon alert");
    }

    @And("Input username Admintiara2")
    public void Input_username_Admintiara2(){
        loginPage.setUsername("Admintiara2");
        extentTest.log(LogStatus.PASS,"Input username Admintiara2");
    }

    @And("Input username ADMINTIARA2")
    public void Input_username_ADMINTIARA2(){
        loginPage.setUsername("ADMINTIARA2");
        extentTest.log(LogStatus.PASS,"Input username ADMINTIARA2");
    }


    // LOGIN VERIFIKATOR //
    @And("Input username feriansyah2")
    public void Input_username_feriansyah2(){
        loginPage.setLogout();
        loginPage.setUsername("feriansyah2");
        extentTest.log(LogStatus.PASS,"Input username feriansyah2");
    }

    @And("Input password aa")
    public void Input_password_aa(){
        loginPage.setPassword("aa");
        extentTest.log(LogStatus.PASS,"Input password aa");
    }

    @And("Input username Feriansyah2")
    public void Input_username_Feriansyah2(){
        loginPage.setLogout();
        loginPage.setUsername("Feriansyah2");
        extentTest.log(LogStatus.PASS,"Input username Feriansyah2");
    }

    @And("Input username FERIANSYAH2")
    public void Input_username_FERIANSYAH2(){
        loginPage.setUsername("FERIANSYAH2");
        extentTest.log(LogStatus.PASS,"Input username FERIANSYAH2");
    }


    // LOGIN FINANCE //
    @And("Input username feriansyah")
    public void Input_username_feriansyah(){
        loginPage.setUsername("feriansyah");
        extentTest.log(LogStatus.PASS,"Input username feriansyah");
    }

    @And("Input username tidak terdaftar")
    public void Input_username_tidak_terdaftar(){
        loginPage.setLogout();
        loginPage.setUsername("trisna");
        extentTest.log(LogStatus.PASS,"Input username tidak terdaftar");
    }

    @And("Input password tidak terdaftar")
    public void Input_password_tidak_terdaftar(){
        loginPage.setPassword("123");
        extentTest.log(LogStatus.PASS,"Input password tidak terdaftar");
    }

    @And("Input username Feriansyah")
    public void Input_username_Feriansyah(){
        loginPage.setLogout();
        loginPage.setUsername("Feriansyah");
        extentTest.log(LogStatus.PASS,"Input username Feriansyah");
    }

    @And("Input username FERIANSYAH")
    public void Input_username_FERIANSYAH(){
        loginPage.setUsername("FERIANSYAH");
        extentTest.log(LogStatus.PASS,"Input username FERIANSYAH");
    }

}
