package com.juaracoding;
import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.VerifikasiPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_au.ButattheendofthedayIreckon;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class VerifikasiTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static VerifikasiPage verifikasiPage = new VerifikasiPage();
    public VerifikasiTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //verifikasi =============================================
    //verifikasi valid penukaran voucher : positif
    @Given("Verifikator login web sociolla cashback")
    public void verifikator_login_web_sociolla_cashback() {
        loginPage.loginAdmin("nadia.verif", "a");
        extentTest.log(LogStatus.PASS,"sukses login");
    }
    @When("klik menu verifikasi")
    public void klik_menu_verifikasi(){
        verifikasiPage.clickMenuVerifikasi();
        extentTest.log(LogStatus.PASS, "sukses klik menu verif");
    }
    @And("klik tombol mata di bagian kolom aksi")
    public void klik_tombol_mata_di_bagian_kolom_aksi(){
        verifikasiPage.clickBtnAksi();
    }
    @And("klik tombol verifikasi")
    public void klik_tombol_verifikasi(){
        verifikasiPage.clickBtnVerifikasi();
    }
    @And("klik ok pada popup konfirmasi 1")
    public void klik_ok_pada_popup_konfirmasi_1(){
    verifikasiPage.clickOkConfirm1();
    }
    @And("klik ok pada popup konfirmasi 2")
    public void klik_ok_pada_popup_konfirmasi_2(){
//    verifikasiPage.clickOkAlertConfirm();
        DriverSingleton.delay(2);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "Sukses verifikasi data!");
    }
    @Then("verifikator berhasil verifikasi penukaran voucher")
    public void verifikator_berhasil_verifikasi_penukaran_voucher(){
//    verifikasiPage.setTxtValidVerifikasi();
    Assert.assertEquals(verifikasiPage.setTxtValidVerifikasi(), "List Data Register");
    }

    //field form tidak bisa diklik : negatif
    @Given("verifikator menuju ke menu verifikasi")
    public void verifikator_menuju_ke_menu_verifikasi(){
        verifikasiPage.clickMenuVerifikasi();
    }
    @And("klik tiap field form")
    public void klik_tiap_field_form(){
    verifikasiPage.disabledForm();
    }
    @Then("field form tidak bisa diklik")
    public void field_form_tidak_bisa_diklik(){

    }

    //foto bukti transaksi ====================================
    //mengganti foto bukti transaksi 1 dengan foto format png : positif
    @And("klik foto pada foto bukti transaksi 1")
    public void klik_foto_pada_foto_bukti_transaksi_1(){
    verifikasiPage.clickFotoBukti1();
    }
    @And("klik choose file untuk mengganti foto berformat png")
    public void klik_choose_file_untuk_mengganti_foto_berformat_png(){
    verifikasiPage.clickChooseFile1();
    }
    @And("klik tombol ganti foto")
    public void klik_tombol_ganti_foto(){
    verifikasiPage.clickGantiFoto1();
    }
    @And("muncul popup Sukses!")
    public void muncul_popup_sukses(){

    }
    @Then("verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png")
    public void verifikator_berhasil_mengganti_foto_bukti_transaksi_dengan_foto_berformat_png(){

    }

    //mengganti foto bukti transaksi 2 dengan foto format jpeg : positif
    @And("klik foto pada foto bukti transaksi 2")
    public void klik_foto_pada_foto_bukti_transaksi_2 (){
    verifikasiPage.clickFotoBukti2();
    }
    @And("klik choose file untuk mengganti foto berformat jpeg")
    public void klik_choose_file_untuk_mengganti_foto_berformat_jpeg(){
    verifikasiPage.clickChooseFile2();
    }
    @Then("verifikator berhasil mengganti foto bukti transaksi dengan foto berformat jpeg")
    public void verifikator_berhasil_mengganti_foto_bukti_transaksi_dengan_foto_berformat_jpeg(){

    }

    //mengganti foto bukti transaksi 3 dengan foto format png : positif
    @And("klik foto pada foto bukti transaksi 3")
    public void klik_foto_pada_foto_bukti_transaksi_3(){
    verifikasiPage.clickFotoBukti3();
    }

    //tidak mengganti foto apapun : negatif
    @And("muncul warning error")
    public void muncul_warning_error(){
    verifikasiPage.txtErrorFoto();
    }
    @Then("verifikator tidak berhasil mengganti foto bukti transaksi")
    public void verifikator_tidak_berhasil_mengganti_foto_bukti_transaksi(){
    verifikasiPage.txtErrorFoto();
    }

    //show entries ==========================
    //Tabel menampilkan maksimal 25 entries : positif
    @When("klik tombol opsi Show Entries")
    public void klik_tombol_opsi_show_entries(){
    verifikasiPage.clickShowEntries();
    }
    @And("pilih opsi 25")
    public void pilih_opsi_25(){

    }
    @Then("data tertampil di tabel maksimal 25 data")
    public void data_tertampil_di_tabel_maksimal_25_data(){
    verifikasiPage.setTxtTabelMaks25();
    }

    //note ==================================
    //Sukses menambahkan catatan : positif
    @And("verifikator mengisi field box note")
    public void verifikator_mengisi_field_box_note(){
    verifikasiPage.inputFieldNote();
    }
    @And("klik tombol save note")
    public void klik_tombol_save_note(){
    verifikasiPage.inputFieldNote();
    }
    @Then("Verifikator berhasil menambahkan catatan")
    public void Verifikator_berhasil_menambahkan_catatan(){

    }

    //Sukses menghapus catatan : positif
    @When("pilih data customer yang ingin dihilangkan")
    public void pilih_data_customer_yang_ingin_dihilangkan(){

    }
    @And("verifikator menghapus field box note")
    public void verifikator_menghapus_field_box_note(){

    }
    @Then("verifikator berhasil menghapus catatan")
    public void verifikator_berhasil_menghapus_catatan(){

    }

    //Menyimpan catatan kosong : negatif
    @Then("verifikator berhasil menyimpan catatan kosong")
    public void verifikator_berhasil_menyimpan_catatan_kosong(){

    }

    //rotate image ==============================
    //foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol : positif
    @And("klik tombol 90 di bawah foto bukti transaksi 1")
    public void klik_tombol_90_di_bawah_foto_bukti_transaksi_1(){
        verifikasiPage.clickRotate90Bukti1();
    }
    @Then("verifikator berhasil merotasi foto bukti transaksi 1")
    public void verifikator_berhasil_merotasi_foto_bukti_transaksi_1(){

    }

    //foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol : negatif
    @And("klik tombol 180 di bawah foto bukti transaksi yang kosong")
    public void klik_tombol_180_di_bawah_foto_bukti_transaksi (){
    verifikasiPage.clickRotate180Bukti();
    }
    @And("muncul popup alert Error \"Error rotate file\"")
    public void muncul_popup_alert_error_rotate_file(){
    verifikasiPage.errorRotate();
    }
    @Then("verifikator tidak berhasil merotasi foto bukti transaksi yang kosong")
    public void verifikator_tidak_berhasil_merotasi_foto_bukti_transaksi_yang_kosong(){

    }

    //edit form verifikasi =========================
    //mengubah nama lengkap nasabah dengan angka dan karakter spesial : negatif
    @And("klik tombol edit")
    public void klik_tombol_edit(){
    verifikasiPage.clickEdit();
    }
    @And("mengubah nama dengan beberapa karakter spesial dan angka di bagian field nama lengkap nasabah")
    public void mengubah_nama_dengan_beberapa_karakter_spesial_dan_angka(){
    verifikasiPage.changeNamaCust();
    }
    @And("klik tombol simpan")
    public void klik_tombol_simpan (){
    verifikasiPage.clickSimpan();
    }
    @And("muncul popup alert \"sukses mengubah data!\"")
    public void muncul_popup_alert_sukses_mengubah_data(){

    }
    @Then("verifikator tidak berhasil mengubah nama nasabah dengan karakter spesial dan angka")
    public void verifikator_tidak_berhasil_mengubah_nama_nasabah(){

    }

    //Nama lengkap nasabah kosong atau dihapus : negatif
    @And("menghapus isi di bagian field nama lengkap nasabah")
    public void menghapus_isi_di_bagian_field_nama_lengkap_nasabah(){
    verifikasiPage.deleteNamaCust();
    }
    @And("Muncul error \"The Customer Name field is required.\"")
    public void muncul_error_the_cust_name_field_is_required (){
    verifikasiPage.errorFieldNama();
    }
    @Then("verifikator tidak berhasil mengosongkan field nama lengkap nasabah")
    public void verifikator_tidak_berhasil_mengosongkan_field_nama_lengkap(){
    verifikasiPage.errorFieldNama();
    }

    //Nominal transaksi ditambahkan 0 satu : positif
    @And("menambah 0 satu di field nominal transaksi")
    public void menambah_0_satu_di_field_nominal_transaksi(){
    verifikasiPage.changeNominalTransaksi();
    }
    @Then("verifikator berhasil mengubah nominal transaksi milik nasabah")
    public void verifikator_berhasil_mengubah_nominal_transaksi(){

    }

    //Nominal cashback berubah sesuai dengan perubahan nominal transaksi : positif
    @And("mengubah nominal transaksi diatas 300.000")
    public void mengubah_nominal_transaksi_diatas_300000(){
    verifikasiPage.changeTransaksi300Up();
    }
    @And("nominal cashback berubah sesuai perubahan nominal transaksi")
    public void nominal_cashback_berubah_sesuai_perubahan_nominal_transaksi(){
    verifikasiPage.setTxtNominalCashback();
    }
    @Then("Nominal cashback tidak sama dengan 0")
    public void nominal_cashback_tidak_sama_dengan_0(){
    verifikasiPage.txtValidCashback();
    }

    //Nominal transaksi kosong/dihapus : negatif
    @And("menghapus isi field nominal transaksi")
    public void menghapus_isi_field_nominal_transaksi(){
    verifikasiPage.deleteNominalTransaksi();
    }
    @And("muncul error \"The Nominal Transaksi field is required.\"")
    public void muncul_error_the_nominal_transaksi_field_is_required(){
    verifikasiPage.setErrorNominalTransaksiRequired();
    }
    @Then("field nominal transaksi tidak bisa kosong")
    public void field_nominal_transaksi_tidak_bisa_kosong(){
    verifikasiPage.setErrorNominalTransaksiRequired();
    }

    //Tanggal transaksi berubah menjadi tanggal sebelum hari ini : positif
    @And("klik field tanggal transaksi")
    public void klik_field_tanggal_transaksi(){
    verifikasiPage.clickTanggalTransaksi();
    }
    @And("pilih tanggal sebelum tanggal hari ini")
    public void pilih_tanggal_sebelum_tanggal_hari_ini(){

    }
    @Then("verifikator berhasil mengubah tanggal transaksi menjadi tanggal sebelum hari ini")
    public void verifikator_berhasil_mengubah_tanggal_transaksi_menjadi_tanggal_sebelum_hari_ini(){

    }

    //Tanggal transaksi berubah menjadi tanggal setelah hari ini : negatif
    @And("pilih tanggal sesudah tanggal hari ini")
    public void pilih_tanggal_sesudah_tanggal_hari_ini(){

    }
    @Then("verifikator tidak berhasil mengubah tanggal transaksi menjadi tanggal setelah hari ini")
    public void verifikator_tidak_berhasil_mengubah_tanggal_transaksi_menjadi_tanggal_setelah_hari_ini(){

    }

    //Merubah opsi lain pembayaran QRIS : positif
    @And("klik dropdown menu pembayaran QRIS")
    public void klik_dropdown_menu_pembayaran_QRIS(){
    verifikasiPage.clickPembayaranQRIS();
    }
    @And("memilih opsi selain pilihan sebelumnya")
    public void memilih_opsi_selain_pilihan_sebelumnya(){

    }
    @Then("verifikator berhasil mengubah pembayaran QRIS")
    public void verifikator_berhasil_mengubah_pembayaran_QRIS(){

    }

    //Memilih opsi pembayaran QRIS "--Pilih--" : negatif
    @And("memilih opsi \"--Pilih--\"")
    public void memilih_opsi_pilih(){

    }
    @And("muncul error \"The Qris field is required.\"")
    public void muncul_error_the_qris_field_is_required(){
    verifikasiPage.setErrorPembayaranQRISRequired();
    }
    @Then("verifikator tidak berhasil mengosongkan pembayaran QRIS")
    public void verifikator_tidak_berhasil_mengosongkan_pembayaran_QRIS(){
    verifikasiPage.setErrorPembayaranQRISRequired();
    }

    //Memilih opsi nama merchant "--Pilih--" : negatif
    @And("klik dropdown nama merchant")
    public void klik_dropdown_nama_merchant(){
    verifikasiPage.clickNamaMerchant();
    }
    @And("muncul error Required")
    public void muncul_error_required(){

    }
    @Then("muncul error message required")
    public void muncul_error_message_required(){

    }

    //search ===========================================
    //mencari nama depan customer : positif
    @When("menginput nama Septia ke dalam field search")
    public void menginput_nama_septia_ke_dalam_field_search(){
    verifikasiPage.inputFieldSearch();
    }
    @And("klik enter")
    public void klik_enter(){

    }
    @And("data muncul sesuai dengan inputan")
    public void  data_muncul_sesuai_dengan_inputan(){
    verifikasiPage.setTxtNamaCust();
    }
    @Then("isi tabel muncul sesuai dengan nama customer yang diinputkan")
    public void isi_tabel_muncul_sesuai_dengan_nama_customer_yang_diinputkan(){
    verifikasiPage.setTxtNamaCust();
    }

    //mencari berdasarkan nama sales : positif
    @When("menginput nama Rinzana ke dalam field search")
    public void menginput_nama_rinzana_ke_dalam_field_search(){
    verifikasiPage.inputNamaSales();
    }
    @Then("isi tabel muncul sesuai dengan nama sales yang diinputkan")
    public void isi_tabel_muncul_sesuai_dengan_nama_sales_yang_diinputkan(){
    verifikasiPage.txtNamaSales();
    }

    //mencari tanpa menginputkan apapun : negatif
    @And("hapus input search tersebut")
    public void hapus_input_search_tersebut(){

    }
    @And("klik enter untuk mencari search tanpa inputan")
    public void klik_enter_untuk_mencari_search_tanpa_inputan(){
    verifikasiPage.clickEnter();
    }

    @Then("isi tabel kembali seperti semula")
    public void isi_tabel_kembali_seperti_semula(){
    verifikasiPage.setTxtIsiTabel();
    }

    //pagination page ===============================
    //melihat isi tabel di page 3 : positif
    @When("klik tombol nomor 3 di bagian pagination page")
    public void klik_tombol_nomor_3_di_bagian_pagination_page(){
    verifikasiPage.clickPage3();
    }
    @And("tabel menampilkan data dari page 3")
    public void tabel_menampilkan_data_dari_page_3(){
    verifikasiPage.setTxtPage3();
    }
    @Then("verifikator dapat melihat isi tabel yang sesuai di page 3")
    public void verifikator_dapat_melihat_isi_tabel_yang_sesuai_di_page_3(){
    verifikasiPage.setTxtPage3();
    }

    //Melihat isi tabel pada page sebelumnya : positif
    @When("klik tombol Previous di bagian pagination page")
    public void klik_tombol_previous_di_bagian_pagination_page(){
    verifikasiPage.clickPrevious();
    }
    @And("tabel menampilkan data dari page sebelumnya")
    public void tabel_menampilkan_data_dari_page_sebelumnya(){
    verifikasiPage.setTxtPrevious();
    }
    @Then("verifikator dapat melihat isi tabel yang sesuai dengan page sebelumnya")
    public void verifikator_dapat_melihat_isi_tabel_yang_sesuai_dengan_page_sebelumnya(){
    verifikasiPage.setTxtPrevious();
    }

    //Melihat isi tabel pada page selanjutnya : positif
    @When("klik tombol Next di bagian pagination page")
    public void klik_tombol_next_di_bagian_pagination_page(){
    verifikasiPage.clickNext();
    }
    @And("tabel menampilkan data dari page selanjutnya")
    public void tabel_menampilkan_data_dari_page_selanjutnya(){
    verifikasiPage.setTxtNext();
    }
    @Then("verifikator dapat melihat isi tabel yang sesuai dengan page selanjutnya")
    public void verifikator_dapat_melihat_isi_tabel_yang_sesuai_dengan_page_selanjutnya(){
        verifikasiPage.setTxtNext();
    }

}
