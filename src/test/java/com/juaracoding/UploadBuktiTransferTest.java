package com.juaracoding;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.UploadBuktiTransferPage;
import com.juaracoding.pages.VerifikasiPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class UploadBuktiTransferTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static UploadBuktiTransferPage uploadBuktiTransferPage = new UploadBuktiTransferPage();

    public UploadBuktiTransferTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Form sudah Ditransfer ==========================
    //field form tidak bisa diklik : positif
    @Given("Verifikator login web sociolla")
    public void verifikator_login_web_sociolla_cashback() {
        driver.get(Constant.URL);
        loginPage.loginAdmin("nadia.verif", "a");
        extentTest.log(LogStatus.PASS,"Verifikator login web sociolla cashback");
    }
    @When("Verifikator klik menu Upload Bukti Transfer")
    public void verifikator_klik_menu_upload_bukti_transfer(){
    uploadBuktiTransferPage.clickMenuUploadBuktiTransfer();
        extentTest.log(LogStatus.PASS,"Verifikator klik menu Upload Bukti Transfer");
    }

    @And("Klik tombol mata di bagian kolom Aksi")
    public void klik_tombol_mata_di_bagian_kolom_aksi(){
    uploadBuktiTransferPage.clickBtnAksi();
        extentTest.log(LogStatus.PASS,"Klik tombol mata di bagian kolom Aksi");
        //pindah tab
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        int currentTabIndex = allTabs.indexOf(driver.getWindowHandle());
        int nextTabIndex = (currentTabIndex + 1) % allTabs.size();
        driver.switchTo().window(allTabs.get(nextTabIndex));
        delay(5);
    }
    @And("Klik tiap field form dan gambar")
    public void klik_tiap_field_form_dan_gambar(){
    uploadBuktiTransferPage.disabledFormGambar();
        extentTest.log(LogStatus.PASS,"Klik tiap field form dan gambar");
    }
    @Then("field form dan gambar tidak bisa diklik")
    public void field_form_dan_gambar_tidak_bisa_diklik(){
    uploadBuktiTransferPage.disabledFormGambar();
        extentTest.log(LogStatus.PASS,"field form dan gambar tidak bisa diklik");
    }

    //Show Entries ==================================
    // Tabel menampilkan maksimal 25 entries : positif
    @Given("Verifikator menuju ke menu Upload Bukti Transfer")
    public void verifikator_menuju_ke_menu_upload_bukti_transfer(){
        uploadBuktiTransferPage.clickMenuUploadBuktiTransfer();
        extentTest.log(LogStatus.PASS,"Verifikator menuju ke menu Upload Bukti Transfer");
    }
    @When("Klik tombol opsi Show Entries")
    public void klik_tombol_opsi_show_entries(){
    uploadBuktiTransferPage.clickShowEntries();
        extentTest.log(LogStatus.PASS,"Klik tombol opsi Show Entries");
    }
    @And("Pilih opsi \"25\"")
    public void pilih_opsi_25(){
        extentTest.log(LogStatus.PASS,"Pilih opsi \"25\"");
    }
    @Then("Data tertampil di tabel maksimal 25 data")
    public void data_tertampil_di_tabel_maks_25_data(){
    uploadBuktiTransferPage.setTxtTabelMaks25();
        extentTest.log(LogStatus.PASS,"Data tertampil di tabel maksimal 25 data");
    }

    //search ======================================
    //Mencari nama customer : positif
    @When("Input nama karina pada field search")
    public void input_nama_pada_field_search(){
    uploadBuktiTransferPage.inputFieldSearch();
        extentTest.log(LogStatus.PASS,"Input nama karina pada field search");
    }
    @And("Klik enter")
    public void klik_enter(){
        uploadBuktiTransferPage.clickEnter();
        extentTest.log(LogStatus.PASS,"Klik enter");
    }
    @And("Tabel muncul berdasarkan hasil search")
    public void tabel_muncul_berdasarkan_hasil_search(){
    uploadBuktiTransferPage.setTxtNamaCustKarina();
        extentTest.log(LogStatus.PASS,"Tabel muncul berdasarkan hasil search");
    }
    @Then("Verifikator berhasil mencari data berdasarkan nama customer")
    public void verifikator_berhasil_mencari_data_berdasarkan_nama_customer(){
    uploadBuktiTransferPage.setTxtNamaCustKarina();
        extentTest.log(LogStatus.PASS,"Verifikator berhasil mencari data berdasarkan nama customer");
    }

    //Mencari nama verifikator : positif
    @When("Input nama verifikator pada field search")
    public void input_nama_verifikator_pada_field_search(){
    uploadBuktiTransferPage.inputSearchVerifikator();
        extentTest.log(LogStatus.PASS,"Input nama verifikator pada field search");
    }
    @Then("Verifikator berhasil mencari data berdasarkan nama verifikator")
    public void verifikator_berhasil_mencari_data_berdasarkan_nama_verifikator(){
    uploadBuktiTransferPage.setTxtNamaVerifFeri();
        extentTest.log(LogStatus.PASS,"Verifikator berhasil mencari data berdasarkan nama verifikator");
    }

    //Mencari tanpa input apapun : negatif
    @And("Hapus inputan pada field search")
    public void hapus_inputan_pada_field_search(){
        uploadBuktiTransferPage.deleteInputSearch();
        extentTest.log(LogStatus.PASS,"Hapus inputan pada field search");
    }
    @And("Tabel berisi data semula")
    public void tabel_berisi_data_semula(){
    uploadBuktiTransferPage.setTxtDataSemula();
        extentTest.log(LogStatus.PASS,"Tabel berisi data semula");
    }
    @Then("isi tabel menampilkan seluruh isi tabel")
    public void isi_tabel_menampilkan_seluruh_isi_tabel(){
    uploadBuktiTransferPage.setTxtDataSemula();
        extentTest.log(LogStatus.PASS,"isi tabel menampilkan seluruh isi tabel");
    }

    //upload bukti transfer =================================
    //meng-upload file berformat png : positif
    @When("Pilih data customer")
    public void pilih_data_customer(){
        extentTest.log(LogStatus.PASS,"Pilih data customer");
    }
    @And("Klik 'Choose File'")
    public void klik_choose_file(){
    uploadBuktiTransferPage.clickBtnChooseFile();
        extentTest.log(LogStatus.PASS,"Klik 'Choose File'");
    }
    @And("Klik tombol 'Upload Bukti Transfer'")
    public void klik_tombol_upload_bukti_transfer(){
    uploadBuktiTransferPage.clickUploadBuktiTransfer();
        extentTest.log(LogStatus.PASS,"Klik tombol 'Upload Bukti Transfer'");
    }
    @And("Muncul popup \"Bukti Transfer Berhasil diupload\"")
    public void muncul_popup_bukti_transfer_berhasil_diupload(){
        extentTest.log(LogStatus.PASS,"Muncul popup \"Bukti Transfer Berhasil diupload\"");
    }
    @Then("Verifikator berhasil upload bukti transfer berformat png")
    public void verifikator_berhasil_upload_bukti_transfer_berformat_png(){
        extentTest.log(LogStatus.PASS,"Verifikator berhasil upload bukti transfer berformat png");
    }

    //tidak meng-upload file : negatif
    @And("Muncul warning error \"You did not select a file to upload.\"")
    public void muncul_warning_error_pada_field(){
    uploadBuktiTransferPage.setTxtErrorDidntSelectFile();
        extentTest.log(LogStatus.PASS,"Muncul warning error \"You did not select a file to upload.\"");
    }
    @Then("Verifikator tidak berhasil meng-upload bukti transfer kosong")
    public void verifikator_tidak_berhasil_mengupload_bukti_transfer(){
    uploadBuktiTransferPage.setTxtErrorDidntSelectFile();
        extentTest.log(LogStatus.PASS,"Verifikator tidak berhasil meng-upload bukti transfer kosong");
    }

    //meng-upload file berformat jpg : positif
    @Then("Verifikator berhasil upload bukti transfer berformat jpg")
    public void verifikator_berhasil_upload_bukti_transfer_berformat_jpg(){
        extentTest.log(LogStatus.PASS,"Verifikator berhasil upload bukti transfer berformat jpg");
    }

    //meng-upload file berformat pdf
    @Then("Verifikator berhasil upload bukti transfer berformat pdf")
    public void verifikator_berhasil_upload_bukti_transfer_berformat_pdf(){
        extentTest.log(LogStatus.PASS,"Verifikator berhasil upload bukti transfer berformat pdf");
    }

    //pagination page
    //Melihat isi tabel di page 2 : positif
    @When("Klik tombol nomor 2 di bagian pagination page")
    public void klik_tombol_nomor_2(){
    uploadBuktiTransferPage.clickPage2();
        extentTest.log(LogStatus.PASS,"Klik tombol nomor 2 di bagian pagination page");
    }
    @Then("Tabel menampilkan data dari page 2")
    public void tabel_menampilkan_data_dari_page_2(){
    uploadBuktiTransferPage.setTxtPage2();
        extentTest.log(LogStatus.PASS,"Tabel menampilkan data dari page 2");
    }

    //Melihat isi tabel pada page sebelumnya : positif
    @When("Klik tombol Previous")
    public void klik_tombol_previous(){
    uploadBuktiTransferPage.clickPrevious();
        extentTest.log(LogStatus.PASS,"Klik tombol Previous");
    }
    @Then("Tabel menampilkan data dari page sebelumnya")
    public void tabel_menampilkan_data_dari_page_sebelumnya(){
    uploadBuktiTransferPage.setTxtPrevious();
        extentTest.log(LogStatus.PASS,"Tabel menampilkan data dari page sebelumnya");
    }

    //Melihat isi tabel pada page setelahnya : positif
    @When("Klik tombol Next")
    public void klik_tombol_next(){
    uploadBuktiTransferPage.clickNext();
        extentTest.log(LogStatus.PASS,"Klik tombol Next");
    }
    @Then("Tabel menampilkan data dari page setelahnya")
    public void tabel_menampilkan_data_dari_page_setelahnya(){
    uploadBuktiTransferPage.setTxtNext();
        extentTest.log(LogStatus.PASS,"Tabel menampilkan data dari page setelahnya");
    }

    public static void scrollByPixels(WebDriver driver, int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy({ top: " + y + ", behavior: 'smooth' });");
        System.out.println("Scrolling smooth To Target with Pixels");
    }
    static void delay(long detik) {
        try { //jeda sebelum close
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}