package com.juaracoding;

import com.juaracoding.pages.FinancePage;
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

import static com.juaracoding.drivers.DriverSingleton.delay;
import static com.juaracoding.utils.TestCase.scrollByPixels;

public class FinanceTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();
    public static FinancePage   financePage = new FinancePage();

    public FinanceTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User akses web cashback sociolla")
    public void User_akses_web_cashback_sociolla() {
        driver.get(Constant.URL);
        extentTest.log(LogStatus.PASS,"User akses web cashback sociolla");
    }

    @When("User finance login")
    public void User_finance_login() {
        financePage.loginAdmin("feriansyah", "a");
        extentTest.log(LogStatus.PASS,"User finance login");
    }

//    @And("Klik button login")
//    public void Klik_button_login(){
//        financePage.loginAdmin();
//    }

    @And("Klik button menu Finance")
    public void Klik_button_menu_Finance() {
        financePage.setBtnFinance();
        extentTest.log(LogStatus.PASS,"Klik button menu Finance");
    }

    @Then("Tampilan list data yang sudah di verifikasi")
    public void Tampilan_list_data_yang_sudah_di_verifikasi() {
        financePage.getTxtDataVerifikasi();
        extentTest.log(LogStatus.PASS,"Tampilan list data yang sudah di verifikasi");
    }


    @And("Klik table control show entries")
    public void Klik_table_control_show_entries() {
        financePage.setControlList();
    }

    @And("Pilih 25 list yang akan ditampilkan")
    public void Pilih_25_list_yang_akan_ditampilkan() {
    }

    @Then("Menampilkan 25 Data Customer")
    public void Menampilkan_25_Data_Customer() {
        financePage.getTxtShowingEntries();
        Assert.assertEquals(financePage.getTxtShowingEntries(),"Showing 1 to 25 of 57 entries");
        extentTest.log(LogStatus.PASS,"Menampilkan 25 Data Customer");
    }

    @When("Tampilan halaman List Data Verifikasi")
    public void Tampilan_halaman_List_Data_Verifikasi() {
        financePage.getTxtDataVerifikasi();
        Assert.assertEquals(financePage.getTxtDataVerifikasi(),"List Data Yang Sudah DiVerifikasi");
        extentTest.log(LogStatus.PASS,"Tampilan halaman List Data Verifikasi");
    }

    @And("Klik field Dashboard pada pojok kanan atas")
    public void Klik_field_Dashboard_pada_pojok_kanan_atas(){
        financePage.setClickDashboard();
    }

    @Then("Tampilan kembali ke menu Dashboard")
    public void Tampilan_kembali_ke_menu_Dashboard() {
        financePage.getTxtDashboard();
    }

    @And("Klik icon action edit pada salah satu data customer")
    public void Klik_icon_action_edit_pada_salah_satu_data_customer() {
        financePage.setBtnAction();
    }

    @And("User Finance pindah ke halaman tab baru Edit Data")
    public void User_Finance_pindah_ke_halaman_tab_baru_Edit_Data() {
    }

    @Then("Tampilan halaman Edit Data menampilkan Form Input Data Cashback")
    public void Tampilan_halaman_Edit_Data_menampilkan_Form_Input_Data_Cashback() {
    }

    @When("Tampilan halaman List Data verifikasi")
    public void Tampilan_halaman_List_Data_verifikasi(){
    }

    @And("Scroll down")
    public void Scroll_down() {
    }

    @And("Klik table control Next")
    public void Klik_table_control_Next() {
        delay(3);
        scrollByPixels(driver,0,900);
        financePage.setBtnNext();
        extentTest.log(LogStatus.PASS,"Klik table control Next");
    }

    @Then("Menampilkan List Data Verifikasi di halaman selanjutnya")
    public void Menampilkan_List_Data_Verifikasi_di_halaman_selanjutnya() {
        financePage.getTxtShow11();
        Assert.assertEquals(financePage.getTxtShow11(),"Showing 11 to 20 of 57 entries");
        extentTest.log(LogStatus.PASS,"Menampilkan List Data Verifikasi di halaman selanjutnya");
    }

    @And("Klik table control Previous")
    public void Klik_table_control_Previous() {
        financePage.setBtnPrevious();
        extentTest.log(LogStatus.PASS,"Klik table control Previous");
    }

    @Then("Menampilkan List Data Verifikasi di halaman sebelumnya")
    public void Menampilkan_List_Data_Verifikasi_di_halaman_sebelumnya() {
        financePage.getTxtDataPagePrevious();
        Assert.assertEquals(financePage.getTxtDataPagePrevious(),"Showing 1 to 10 of 57 entries");
        extentTest.log(LogStatus.PASS,"Menampilkan List Data Verifikasi di halaman sebelumnya");
    }

    @And("Klik table control page 3")
    public void Klik_table_control_page_3() {
        financePage.setBtnPage3();
        extentTest.log(LogStatus.PASS,"Klik table control page 3");
    }

    @Then("Menampilkan List Data Verifikasi di halaman 3")
    public void Menampilkan_List_Data_Verifikasi_di_halaman_3(){
        financePage.getTxtDataPage3();
        Assert.assertEquals(financePage.getTxtDataPage3(),"Showing 21 to 30 of 57 entries");
        extentTest.log(LogStatus.PASS,"Menampilkan List Data Verifikasi di halaman 3");
    }

    @And("Input first name pada kolom field Search")
    public void Input_first_name_pada_kolom_field_Search(){
    }

    @And("Tekan enter")
    public void Tekan_enter(){
    }

    @Then("Menampilkan Data Customer sesuai dengan first name yang di input")
    public void Menampilkan_Data_Customer_sesuai_dengan_first_name_yang_di_input(){
    }

    @And("Input last name pada kolom field Search")
    public void Input_last_name_pada_kolom_field_Search(){
    }

    @Then("Menampilkan Data Customer sesuai dengan last name yang di input")
    public void Menampilkan_Data_Customer_sesuai_dengan_last_name_yang_di_input(){
    }

    @And("Input RRN pada kolom field Search")
    public void Input_RRN_pada_kolom_field_Search(){
    }

    @Then("Menampilkan Data Customer sesuai dengan RRN yang di input")
    public void Menampilkan_Data_Customer_sesuai_dengan_RRN_yang_di_input(){
    }

    @And("Input Ref ID pada kolom field Search")
    public void Input_Ref_ID_pada_kolom_field_Search(){
    }

    @Then("Menampilkan Data Customer sesuai dengan Ref ID yang di input")
    public void Menampilkan_Data_Customer_sesuai_dengan_Ref_ID_yang_di_input(){
    }

    @And("Check list Data Customer pada check box yang ingin di Verifikasi ulang")
    public void Check_list_Data_Customer_pada_check_box_yang_ingin_di_Verifikasi_ulang(){
    }

    @And("Klik button Kembalikan ke Verifikator")
    public void Klik_button_Kembalikan_ke_Verifikator(){
    }

    @And("Tampil pop up confirmation Apakah anda yakin")
    public void Tampil_pop_up_confirmation_Apakah_anda_yakin(){
    }

    @And("Klik button Save")
    public void Klik_button_Save(){
    }

    @Then("Menampilkan message Sukses Berhasil diupdate")
    public void Menampilkan_message_Sukses_Berhasil_diupdate(){
    }

    @And("Check list Data Customer pada check box yang akan di update")
    public void Check_list_Data_Customer_pada_check_box_yang_akan_di_update(){
    }

    @And("Klik Update Sudah Transfer")
    public void Klik_Update_Sudah_Transfer(){
        financePage.setUpdateTrf();
    }

    @And("Klik field Check Box bagian atas")
    public void Klik_field_Check_Box_bagian_atas(){
    }

    @Then("Semua Data Customer pada page yang diakses ter Check List")
    public void Semua_Data_Customer_pada_page_yang_diakses_ter_Check_List(){
    }

    @And("Klik button Update Sudah Transfer")
    public void Klik_button_Update_Sudah_Transfer(){
    }

    @Then("Menampilkan message Silahkan Ceklis Data")
    public void Menampilkan_message_Silahkan_Ceklis_Data(){
    }

    @And("Check list 10 Data Customer pada check box yang akan di update")
    public void Check_list_10_Data_Customer_pada_check_box_yang_akan_di_update(){
    }

    @And("Klik button list pada pojok kiri atas")
    public void Klik_button_list_pada_pojok_kiri_atas(){
    }

    @Then("Sidebar tersembunyi")
    public void Sidebar_tersembunyi(){
    }


}

