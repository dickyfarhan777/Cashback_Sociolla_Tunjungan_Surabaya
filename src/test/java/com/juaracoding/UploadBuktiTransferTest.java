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
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
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
    @Given("Verifikator menuju ke menu Upload Bukti Transfer")
    public void verifikator_menuju_ke_menu_upload_bukti_transfer(){
    uploadBuktiTransferPage.clickMenuUploadBuktiTransfer();
    }
    @When("Pilih data customer")
    public void pilih_data_customer(){

    }
    @And("Klik tombol mata di bagian kolom Aksi")
    public void klik_tombol_mata_di_bagian_kolom_aksi(){
    uploadBuktiTransferPage.clickBtnAksi();
    }
    @And("Klik tiap field form dan gambar")
    public void klik_tiap_field_form_dan_gambar(){
    uploadBuktiTransferPage.disabledFormGambar();
    }
    @Then("field form dan gambar tidak bisa diklik")
    public void field_form_dan_gambar_tidak_bisa_diklik(){
    uploadBuktiTransferPage.disabledFormGambar();
    }

    //Show Entries ==================================
    // Tabel menampilkan maksimal 25 entries : positif
    @When("Klik tombol opsi Show Entries")
    public void klik_tombol_opsi_show_entries(){
    uploadBuktiTransferPage.clickShowEntries();
    }
    @And("Pilih opsi \"25\"")
    public void pilih_opsi_25(){

    }
    @Then("Data tertampil di tabel maksimal 25 data")
    public void data_tertampil_di_tabel_maks_25_data(){
    uploadBuktiTransferPage.setTxtTabelMaks25();
    }

    //search ======================================
    //Mencari nama customer : positif
    @When("Input nama karina pada field search")
    public void input_nama_pada_field_search(){
    uploadBuktiTransferPage.inputFieldSearch();
    }
    @And("Klik enter")
    public void klik_enter(){

    }
    @And("Tabel muncul berdasarkan hasil search")
    public void tabel_muncul_berdasarkan_hasil_search(){
    uploadBuktiTransferPage.setTxtNamaCustKarina();
    }
    @Then("Verifikator berhasil mencari data berdasarkan nama customer")
    public void verifikator_berhasil_mencari_data_berdasarkan_nama_customer(){
    uploadBuktiTransferPage.setTxtNamaCustKarina();
    }

    //Mencari nama verifikator : positif
    @When("Input nama verifikator pada field search")
    public void input_nama_verifikator_pada_field_search(){
    uploadBuktiTransferPage.inputSearchVerifikator();
    }
    @Then("Verifikator berhasil mencari data berdasarkan nama verifikator")
    public void verifikator_berhasil_mencari_data_berdasarkan_nama_verifikator(){
    uploadBuktiTransferPage.setTxtNamaVerifFeri();
    }

    //Mencari tanpa input apapun : negatif
    @And("Hapus inputan pada field search")
    public void hapus_inputan_pada_field_search(){

    }
    @And("Tabel berisi data semula")
    public void tabel_berisi_data_semula(){
    uploadBuktiTransferPage.setTxtDataSemula();
    }
    @Then("isi tabel menampilkan seluruh isi tabel")
    public void isi_tabel_menampilkan_seluruh_isi_tabel(){
    uploadBuktiTransferPage.setTxtDataSemula();
    }

    //upload bukti transfer =================================
    //meng-upload file berformat png : positif
    @And("Klik 'Choose File'")
    public void klik_choose_file(){
    uploadBuktiTransferPage.clickBtnChooseFile();
    }
    @And("Klik tombol 'Upload Bukti Transfer'")
    public void klik_tombol_upload_bukti_transfer(){
    uploadBuktiTransferPage.clickUploadBuktiTransfer();
    }
    @And("Muncul popup \"Bukti Transfer Berhasil diupload\"")
    public void muncul_popup_bukti_transfer_berhasil_diupload(){

    }
    @Then("Verifikator berhasil upload bukti transfer berformat png")
    public void verifikator_berhasil_upload_bukti_transfer_berformat_png(){

    }

    //tidak meng-upload file : negatif
    @And("Muncul warning error \"You did not select a file to upload.\"")
    public void muncul_warning_error_pada_field(){
    uploadBuktiTransferPage.setTxtErrorDidntSelectFile();
    }
    @Then("Verifikator tidak berhasil meng-upload bukti transfer kosong")
    public void verifikator_tidak_berhasil_mengupload_bukti_transfer(){
    uploadBuktiTransferPage.setTxtErrorDidntSelectFile();
    }

    //meng-upload file berformat jpg : positif
    @Then("Verifikator berhasil upload bukti transfer berformat jpg")
    public void verifikator_berhasil_upload_bukti_transfer_berformat_jpg(){

    }

    //meng-upload file berformat pdf
    @Then("Verifikator berhasil upload bukti transfer berformat pdf")
    public void verifikator_berhasil_upload_bukti_transfer_berformat_pdf(){

    }

    //pagination page
    //Melihat isi tabel di page 2 : positif
    @When("Klik tombol nomor 2 di bagian pagination page")
    public void klik_tombol_nomor_2(){
    uploadBuktiTransferPage.clickPage2();
    }
    @Then("Tabel menampilkan data dari page 2")
    public void tabel_menampilkan_data_dari_page_2(){
    uploadBuktiTransferPage.setTxtPage2();
    }

    //Melihat isi tabel pada page sebelumnya : positif
    @When("Klik tombol Previous")
    public void klik_tombol_previous(){
    uploadBuktiTransferPage.clickPrevious();
    }
    @Then("Tabel menampilkan data dari page sebelumnya")
    public void tabel_menampilkan_data_dari_page_sebelumnya(){
    uploadBuktiTransferPage.setTxtPrevious();
    }

    //Melihat isi tabel pada page setelahnya : positif
    @When("Klik tombol Next")
    public void klik_tombol_next(){
    uploadBuktiTransferPage.clickNext();
    }
    @Then("Tabel menampilkan data dari page setelahnya")
    public void tabel_menampilkan_data_dari_page_setelahnya(){
    uploadBuktiTransferPage.setTxtNext();
    }


}