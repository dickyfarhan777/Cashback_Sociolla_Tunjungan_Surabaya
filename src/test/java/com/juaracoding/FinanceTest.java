package com.juaracoding;

import com.juaracoding.pages.FinancePage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
        String url = "https://staging.ptkta.com/xcashback_sociolla/login\n";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("User Finance telah berhasil login web cashback")
    public void User_Finance_telah_berhasil_login_web_cashback() {
    }

    @And("Klik button menu Finance")
    public void Klik_button_menu_Finance() {
        financePage.setBtnFinance();
    }

    @Then("Tampilan list data yang sudah di verifikasi")
    public void Tampilan_list_data_yang_sudah_di_verifikasi() {
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
    }

    @When("Tampilan halaman List Data Verifikasi")
    public void Tampilan_halaman_List_Data_Verifikasi() {
        financePage.getTxtDataVerifikasi();
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
        financePage.setBtnNext();
    }

    @Then("Menampilkan List Data Verifikasi di halaman selanjutnya")
    public void Menampilkan_List_Data_Verifikasi_di_halaman_selanjutnya() {
    }

    @And("Klik table control Previous")
    public void Klik_table_control_Previous() {
        financePage.setBtnPrevious();
    }

    @Then("Menampilkan List Data Verifikasi di halaman sebelumnya")
    public void Menampilkan_List_Data_Verifikasi_di_halaman_sebelumnya() {
        financePage.getTxtDataPagePrevious();
    }

    @And("Klik table control page 3")
    public void Klik_table_control_page_3() {
        financePage.setBtnPage3();
    }

    @Then("Menampilkan List Data Verifikasi di halaman 3")
    public void Menampilkan_List_Data_Verifikasi_di_halaman_3(){
        financePage.getTxtDataPage3();
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

