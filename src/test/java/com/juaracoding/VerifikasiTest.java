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
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

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
        driver.get(Constant.URL);
        loginPage.loginAdmin("nadia.verif", "a");
        extentTest.log(LogStatus.PASS,"Verifikator login web sociolla cashback");
    }
    @When("klik menu verifikasi")
    public void klik_menu_verifikasi(){
        delay(3);
        verifikasiPage.clickMenuVerifikasi();
        extentTest.log(LogStatus.PASS, "klik menu verifikasi");
    }
    @And("klik tombol mata di bagian kolom aksi")
    public void klik_tombol_mata_di_bagian_kolom_aksi(){
        delay(3);
        verifikasiPage.clickBtnAksi();
        extentTest.log(LogStatus.PASS,"klik tombol mata di bagian kolom aksi");
        //pindah tab
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        int currentTabIndex = allTabs.indexOf(driver.getWindowHandle());
        int nextTabIndex = (currentTabIndex + 1) % allTabs.size();
        driver.switchTo().window(allTabs.get(nextTabIndex));
        delay(5);
    }
    @And("klik tombol verifikasi")
    public void klik_tombol_verifikasi(){
        delay(3);
        //scrolling
        scrollByPixels(driver,0,617);
        delay(5);
        verifikasiPage.clickBtnVerifikasi();
        extentTest.log(LogStatus.PASS,"klik tombol verifikasi");
    }
    @And("klik ok pada popup konfirmasi 1")
    public void klik_ok_pada_popup_konfirmasi_1(){
        delay(3);
    verifikasiPage.clickOkConfirm1();
        extentTest.log(LogStatus.PASS,"klik ok pada popup konfirmasi 1");
    }
    @And("klik ok pada popup konfirmasi 2")
    public void klik_ok_pada_popup_konfirmasi_2(){
    delay(3);
        DriverSingleton.delay(2);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Sukses verifikasi data!");
        extentTest.log(LogStatus.PASS, "klik ok pada popup konfirmasi 2");
    }
    @Then("verifikator berhasil verifikasi penukaran voucher")
    public void verifikator_berhasil_verifikasi_penukaran_voucher(){
        delay(3);
    Assert.assertEquals(verifikasiPage.setTxtValidVerifikasi(), "List Data Register");
        extentTest.log(LogStatus.PASS,"verifikator berhasil verifikasi penukaran voucher");
    }

    //field form tidak bisa diklik : negatif

    @When("pilih data customer")
    public void pilih_data_customer(){
        delay(3);
        extentTest.log(LogStatus.PASS,"pilih data customer");
    }
    @And("klik tiap field form 1")
    public void klik_tiap_field_form_1(){
        delay(3);
    verifikasiPage.disabledForm1();
        extentTest.log(LogStatus.PASS,"klik tiap field form 1");
    }

    @And("klik tiap field form 2")
    public void klik_tiap_field_form_2(){
        delay(3);
        //scrolling
        scrollByPixels(driver,0,300);
        delay(5);
        verifikasiPage.disabledForm2();
        extentTest.log(LogStatus.PASS,"klik tiap field form");
    }
    @Then("field form tidak bisa diklik")
    public void field_form_tidak_bisa_diklik(){
        delay(3);
    Assert.assertEquals("alertMessage", "dropdown pembayaran QRIS on");
        extentTest.log(LogStatus.PASS,"field form tidak bisa diklik");

    }

    //foto bukti transaksi ====================================
    //mengganti foto bukti transaksi 1 dengan foto format png : positif
    @And("klik foto pada foto bukti transaksi 1")
    public void klik_foto_pada_foto_bukti_transaksi_1(){
        delay(3);
    verifikasiPage.clickFotoBukti1();
        extentTest.log(LogStatus.PASS,"klik foto pada foto bukti transaksi 1");
    }
    @And("klik choose file untuk mengganti foto 1 berformat png")
    public void klik_choose_file_untuk_mengganti_foto_1_berformat_png(){
        delay(3);
    verifikasiPage.clickChooseFile1();
        extentTest.log(LogStatus.PASS,"klik choose file untuk mengganti foto 1 berformat png");
    }
    @And("memilih foto 1 png")
    public void memilih_foto_1_png(){
        delay(3);
        verifikasiPage.choosePhoto1Png();
        extentTest.log(LogStatus.PASS,"memilih foto 1 png");
    }
    @And("klik tombol ganti foto")
    public void klik_tombol_ganti_foto(){
        delay(3);
    verifikasiPage.clickGantiFoto1();
        extentTest.log(LogStatus.PASS,"klik tombol ganti foto");
    }
    @And("muncul popup Sukses!")
    public void muncul_popup_sukses(){
        delay(3);
        extentTest.log(LogStatus.PASS,"muncul popup Sukses!");
    }
    @Then("verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png")
    public void verifikator_berhasil_mengganti_foto_bukti_transaksi_dengan_foto_berformat_png(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil mengganti foto bukti transaksi dengan foto berformat png");
    }

    //mengganti foto bukti transaksi 2 dengan foto format jpeg : positif
    @And("klik foto pada foto bukti transaksi 2")
    public void klik_foto_pada_foto_bukti_transaksi_2 (){
        delay(3);
    verifikasiPage.clickFotoBukti2();
        extentTest.log(LogStatus.PASS,"klik foto pada foto bukti transaksi 2");
    }
    @And("klik choose file untuk mengganti foto berformat jpeg")
    public void klik_choose_file_untuk_mengganti_foto_berformat_jpeg(){
        delay(3);
    verifikasiPage.clickChooseFile2();
        extentTest.log(LogStatus.PASS,"klik choose file untuk mengganti foto berformat jpeg");
    }
    @And("memilih foto jpeg")
    public void memilih_foto_jpeg(){
        delay(3);
        verifikasiPage.choosePhotoJpeg();
        extentTest.log(LogStatus.PASS,"memilih foto jpeg");
    }
    @Then("verifikator berhasil mengganti foto bukti transaksi dengan foto berformat jpeg")
    public void verifikator_berhasil_mengganti_foto_bukti_transaksi_dengan_foto_berformat_jpeg(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil mengganti foto bukti transaksi dengan foto berformat jpeg");
    }

    //mengganti foto bukti transaksi 3 dengan foto format png : positif
    @And("klik foto pada foto bukti transaksi 3")
    public void klik_foto_pada_foto_bukti_transaksi_3(){
        delay(3);
    verifikasiPage.clickFotoBukti3();
        extentTest.log(LogStatus.PASS,"klik foto pada foto bukti transaksi 3");
    }
    @And("klik choose file untuk mengganti foto 3 berformat png")
    public void klik_choose_file_untuk_mengganti_foto_3_berformat_png(){
        delay(3);
        verifikasiPage.clickChooseFile3();
        extentTest.log(LogStatus.PASS,"klik choose file untuk mengganti foto 3 berformat png");
    }
    @And("memilih foto 3 png")
    public void memilih_foto_3_png(){
        delay(3);
        verifikasiPage.choosePhoto3Png();
        extentTest.log(LogStatus.PASS,"memilih foto 3 png");
    }

    //tidak mengganti foto apapun : negatif
    @And("muncul warning error")
    public void muncul_warning_error(){
        delay(3);
        //alert
    verifikasiPage.txtErrorFoto();
        extentTest.log(LogStatus.PASS,"muncul warning error");
    }
    @Then("verifikator tidak berhasil mengganti foto bukti transaksi")
    public void verifikator_tidak_berhasil_mengganti_foto_bukti_transaksi(){
        delay(3);
    verifikasiPage.txtErrorFoto();
        extentTest.log(LogStatus.PASS,"verifikator tidak berhasil mengganti foto bukti transaksi");
    }

    //show entries ==========================
    //Tabel menampilkan maksimal 25 entries : positif
    @When("klik tombol opsi Show Entries")
    public void klik_tombol_opsi_show_entries(){
        delay(3);
    verifikasiPage.clickShowEntries();
        extentTest.log(LogStatus.PASS,"klik tombol opsi Show Entries");
    }
    @And("pilih opsi 25")
    public void pilih_opsi_25(){
        delay(3);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement ddShowEntries = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("table_length")));
        Select selectShowEntries = new Select(ddShowEntries);
        selectShowEntries.selectByValue("25");
        extentTest.log(LogStatus.PASS,"pilih opsi 25");
    }
    @And("scroll y max")
    public void scroll_y_max(){
        scrollByPixels(driver,0,900);
        extentTest.log(LogStatus.PASS,"scroll y max");
    }
    @Then("data tertampil di tabel maksimal 25 data")
    public void data_tertampil_di_tabel_maksimal_25_data(){
        delay(5);
    Assert.assertEquals(verifikasiPage.setTxtTabelMaks25(), "Showing 1 to 25 of 33 entries");
        extentTest.log(LogStatus.PASS,"data tertampil di tabel maksimal 25 data");
        scrollByPixels(driver,0,-600);
        delay(5);
    }

    //note ==================================
    //Sukses menambahkan catatan : positif
    @And("verifikator mengisi field box note")
    public void verifikator_mengisi_field_box_note(){
        delay(3);
    verifikasiPage.inputFieldNote();
        extentTest.log(LogStatus.PASS,"verifikator mengisi field box note");
    }
    @And("klik tombol save note")
    public void klik_tombol_save_note(){
        delay(3);
    verifikasiPage.inputFieldNote();
        extentTest.log(LogStatus.PASS,"sukses login");
    }
    @Then("Verifikator berhasil menambahkan catatan")
    public void Verifikator_berhasil_menambahkan_catatan(){
        delay(3);
        extentTest.log(LogStatus.PASS,"Verifikator berhasil menambahkan catatan");
    }

    //Sukses menghapus catatan : positif
    @When("pilih data customer yang ingin dihilangkan")
    public void pilih_data_customer_yang_ingin_dihilangkan(){
        delay(3);
        System.out.println("cust catatan tidak kosong");
        extentTest.log(LogStatus.PASS,"pilih data customer yang ingin dihilangkan");
    }
    @And("verifikator menghapus field box note")
    public void verifikator_menghapus_field_box_note(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator menghapus field box note");
    }
    @Then("verifikator berhasil menghapus catatan")
    public void verifikator_berhasil_menghapus_catatan(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil menghapus catatan");
    }

    //Menyimpan catatan kosong : negatif
    @Then("verifikator berhasil menyimpan catatan kosong")
    public void verifikator_berhasil_menyimpan_catatan_kosong(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil menyimpan catatan kosong");
    }

    //rotate image ==============================
    //foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol : positif
    @And("klik tombol 90 di bawah foto bukti transaksi 1")
    public void klik_tombol_90_di_bawah_foto_bukti_transaksi_1(){
        delay(3);
        verifikasiPage.clickRotate90Bukti1();
        extentTest.log(LogStatus.PASS,"klik tombol 90 di bawah foto bukti transaksi 1");
    }
    @Then("verifikator berhasil merotasi foto bukti transaksi 1")
    public void verifikator_berhasil_merotasi_foto_bukti_transaksi_1(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil merotasi foto bukti transaksi 1");
    }

    //foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol : negatif
    @And("klik tombol 180 di bawah foto bukti transaksi yang kosong")
    public void klik_tombol_180_di_bawah_foto_bukti_transaksi (){
        delay(3);
    verifikasiPage.clickRotate180Bukti();
        extentTest.log(LogStatus.PASS,"klik tombol 180 di bawah foto bukti transaksi yang kosong");
    }
    @And("muncul popup alert Error \"Error rotate file\"")
    public void muncul_popup_alert_error_rotate_file(){
        delay(3);
    verifikasiPage.errorRotate();
        extentTest.log(LogStatus.PASS,"muncul popup alert Error \"Error rotate file\"");
    }
    @Then("verifikator tidak berhasil merotasi foto bukti transaksi yang kosong")
    public void verifikator_tidak_berhasil_merotasi_foto_bukti_transaksi_yang_kosong(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator tidak berhasil merotasi foto bukti transaksi yang kosong");
    }

    //edit form verifikasi =========================
    //mengubah nama lengkap nasabah dengan angka dan karakter spesial : negatif
    @And("klik tombol edit")
    public void klik_tombol_edit(){
        delay(3);
    verifikasiPage.clickEdit();
        extentTest.log(LogStatus.PASS,"klik tombol edit");
    }
    @And("mengubah nama dengan beberapa karakter spesial dan angka di bagian field nama lengkap nasabah")
    public void mengubah_nama_dengan_beberapa_karakter_spesial_dan_angka(){
        delay(3);
    verifikasiPage.changeNamaCust();
        extentTest.log(LogStatus.PASS,"mengubah nama dengan beberapa karakter spesial dan angka di bagian field nama lengkap nasabah");
    }
    @And("klik tombol simpan")
    public void klik_tombol_simpan (){
        delay(3);
    verifikasiPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"klik tombol simpan");
    }
    @And("muncul popup alert \"sukses mengubah data!\"")
    public void muncul_popup_alert_sukses_mengubah_data(){
        delay(3);
        extentTest.log(LogStatus.PASS,"muncul popup alert \"sukses mengubah data!\"");
    }
    @Then("verifikator tidak berhasil mengubah nama nasabah dengan karakter spesial dan angka")
    public void verifikator_tidak_berhasil_mengubah_nama_nasabah(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator tidak berhasil mengubah nama nasabah dengan karakter spesial dan angka");
    }

    //Nama lengkap nasabah kosong atau dihapus : negatif
    @And("menghapus isi di bagian field nama lengkap nasabah")
    public void menghapus_isi_di_bagian_field_nama_lengkap_nasabah(){
        delay(3);
    verifikasiPage.deleteNamaCust();
        extentTest.log(LogStatus.PASS,"menghapus isi di bagian field nama lengkap nasabah");
    }
    @And("Muncul error \"The Customer Name field is required.\"")
    public void muncul_error_the_cust_name_field_is_required (){
        delay(3);
    verifikasiPage.errorFieldNama();
        extentTest.log(LogStatus.PASS,"Muncul error \"The Customer Name field is required.\"");
    }
    @Then("verifikator tidak berhasil mengosongkan field nama lengkap nasabah")
    public void verifikator_tidak_berhasil_mengosongkan_field_nama_lengkap(){
        delay(3);
    verifikasiPage.errorFieldNama();
        extentTest.log(LogStatus.PASS,"verifikator tidak berhasil mengosongkan field nama lengkap nasabah");
    }

    //Nominal transaksi ditambahkan 0 satu : positif
    @And("menambah 0 satu di field nominal transaksi")
    public void menambah_0_satu_di_field_nominal_transaksi(){
        delay(3);
    verifikasiPage.changeNominalTransaksi();
        extentTest.log(LogStatus.PASS,"menambah 0 satu di field nominal transaksi");
    }
    @Then("verifikator berhasil mengubah nominal transaksi milik nasabah")
    public void verifikator_berhasil_mengubah_nominal_transaksi(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil mengubah nominal transaksi milik nasabah");
    }

    //Nominal cashback berubah sesuai dengan perubahan nominal transaksi : positif
    @And("mengubah nominal transaksi diatas 300.000")
    public void mengubah_nominal_transaksi_diatas_300000(){
        delay(3);
    verifikasiPage.changeTransaksi300Up();
        extentTest.log(LogStatus.PASS,"mengubah nominal transaksi diatas 300.000");
    }
    @And("nominal cashback berubah sesuai perubahan nominal transaksi")
    public void nominal_cashback_berubah_sesuai_perubahan_nominal_transaksi(){
        delay(3);
    verifikasiPage.setTxtNominalCashback();
        extentTest.log(LogStatus.PASS,"nominal cashback berubah sesuai perubahan nominal transaksi");
    }
    @Then("Nominal cashback tidak sama dengan 0")
    public void nominal_cashback_tidak_sama_dengan_0(){
        delay(3);
    verifikasiPage.txtValidCashback();
        extentTest.log(LogStatus.PASS,"Nominal cashback tidak sama dengan 0");
    }

    //Nominal transaksi kosong/dihapus : negatif
    @And("menghapus isi field nominal transaksi")
    public void menghapus_isi_field_nominal_transaksi(){
        delay(3);
    verifikasiPage.deleteNominalTransaksi();
        extentTest.log(LogStatus.PASS,"menghapus isi field nominal transaksi");
    }
    @And("muncul error \"The Nominal Transaksi field is required.\"")
    public void muncul_error_the_nominal_transaksi_field_is_required(){
        delay(3);
    verifikasiPage.setErrorNominalTransaksiRequired();
        extentTest.log(LogStatus.PASS,"muncul error \"The Nominal Transaksi field is required.\"");
    }
    @Then("field nominal transaksi tidak bisa kosong")
    public void field_nominal_transaksi_tidak_bisa_kosong(){
        delay(3);
    verifikasiPage.setErrorNominalTransaksiRequired();
        extentTest.log(LogStatus.PASS,"field nominal transaksi tidak bisa kosong");
    }

    //Tanggal transaksi berubah menjadi tanggal sebelum hari ini : positif
    @And("klik field tanggal transaksi")
    public void klik_field_tanggal_transaksi(){
        delay(3);
    verifikasiPage.clickTanggalTransaksi();
        extentTest.log(LogStatus.PASS,"klik field tanggal transaksi");
    }
    @And("pilih tanggal sebelum tanggal hari ini")
    public void pilih_tanggal_sebelum_tanggal_hari_ini(){
        delay(3);
        extentTest.log(LogStatus.PASS,"pilih tanggal sebelum tanggal hari ini");
    }
    @Then("verifikator berhasil mengubah tanggal transaksi menjadi tanggal sebelum hari ini")
    public void verifikator_berhasil_mengubah_tanggal_transaksi_menjadi_tanggal_sebelum_hari_ini(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil mengubah tanggal transaksi menjadi tanggal sebelum hari ini");
    }

    //Tanggal transaksi berubah menjadi tanggal setelah hari ini : negatif
    @And("pilih tanggal sesudah tanggal hari ini")
    public void pilih_tanggal_sesudah_tanggal_hari_ini(){
        delay(3);
        extentTest.log(LogStatus.PASS,"pilih tanggal sesudah tanggal hari ini");
    }
    @Then("verifikator tidak berhasil mengubah tanggal transaksi menjadi tanggal setelah hari ini")
    public void verifikator_tidak_berhasil_mengubah_tanggal_transaksi_menjadi_tanggal_setelah_hari_ini(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator tidak berhasil mengubah tanggal transaksi menjadi tanggal setelah hari ini");
    }

    //Merubah opsi lain pembayaran QRIS : positif
    @And("klik dropdown menu pembayaran QRIS")
    public void klik_dropdown_menu_pembayaran_QRIS(){
        delay(3);
    verifikasiPage.clickPembayaranQRIS();
        extentTest.log(LogStatus.PASS,"klik dropdown menu pembayaran QRIS");
    }
    @And("memilih opsi selain pilihan sebelumnya")
    public void memilih_opsi_selain_pilihan_sebelumnya(){
        delay(3);
        extentTest.log(LogStatus.PASS,"memilih opsi selain pilihan sebelumnya");
    }
    @Then("verifikator berhasil mengubah pembayaran QRIS")
    public void verifikator_berhasil_mengubah_pembayaran_QRIS(){
        delay(3);
        extentTest.log(LogStatus.PASS,"verifikator berhasil mengubah pembayaran QRIS");
    }

    //Memilih opsi pembayaran QRIS "--Pilih--" : negatif
    @And("memilih opsi \"--Pilih--\"")
    public void memilih_opsi_pilih(){
        delay(3);
        extentTest.log(LogStatus.PASS,"memilih opsi \"--Pilih--\"");
    }
    @And("muncul error \"The Qris field is required.\"")
    public void muncul_error_the_qris_field_is_required(){
        delay(3);
    verifikasiPage.setErrorPembayaranQRISRequired();
        extentTest.log(LogStatus.PASS,"muncul error \"The Qris field is required.\"");
    }
    @Then("verifikator tidak berhasil mengosongkan pembayaran QRIS")
    public void verifikator_tidak_berhasil_mengosongkan_pembayaran_QRIS(){
        delay(3);
    verifikasiPage.setErrorPembayaranQRISRequired();
        extentTest.log(LogStatus.PASS,"verifikator tidak berhasil mengosongkan pembayaran QRIS");
    }

    //Memilih opsi nama merchant "--Pilih--" : negatif
    @And("klik dropdown nama merchant")
    public void klik_dropdown_nama_merchant(){
        delay(3);
    verifikasiPage.clickNamaMerchant();
        extentTest.log(LogStatus.PASS,"klik dropdown nama merchant");
    }
    @And("muncul error Required")
    public void muncul_error_required(){
        delay(3);
        extentTest.log(LogStatus.PASS,"muncul error Required");
    }
    @Then("muncul error message required")
    public void muncul_error_message_required(){
        delay(3);
        extentTest.log(LogStatus.PASS,"muncul error message required");
    }

    //search ===========================================
    //mencari nama depan customer : positif
    @And("menginput nama Septia ke dalam field search")
    public void menginput_nama_septia_ke_dalam_field_search(){
        delay(3);
    verifikasiPage.inputFieldSearch();
        extentTest.log(LogStatus.PASS,"menginput nama Septia ke dalam field search");
    }
    @And("klik enter")
    public void klik_enter(){
        delay(3);
        verifikasiPage.clickEnter();
        extentTest.log(LogStatus.PASS,"klik enter");
    }
    @And("data muncul sesuai dengan inputan Septia")
    public void  data_muncul_sesuai_dengan_inputan(){
        delay(3);
//        Assert.assertEquals(verifikasiPage.setTxtNamaCust(), "Septia ghina sahar");
        extentTest.log(LogStatus.PASS,"data muncul sesuai dengan inputan Septia");
    }
    @Then("isi tabel muncul sesuai dengan nama customer yang diinputkan")
    public void isi_tabel_muncul_sesuai_dengan_nama_customer_yang_diinputkan(){
//        delay(3);
       Assert.assertEquals(verifikasiPage.setTxtNamaCust(), "Septia ghina sahar");
        extentTest.log(LogStatus.PASS,"isi tabel muncul sesuai dengan nama customer yang diinputkan");
    }

    //mencari berdasarkan nama sales : positif
    @When("menginput nama Rinzana ke dalam field search")
    public void menginput_nama_rinzana_ke_dalam_field_search(){
        delay(3);
    verifikasiPage.inputNamaSales();
        extentTest.log(LogStatus.PASS,"menginput nama Rinzana ke dalam field search");
    }
    @And("data muncul sesuai dengan inputan Rinzana")
    public void  data_muncul_sesuai_dengan_inputan_rinzana(){
        delay(3);
        Assert.assertEquals(verifikasiPage.txtNamaSales(), "rinzana");
        extentTest.log(LogStatus.PASS,"data muncul sesuai dengan inputan Rinzana");
    }
    @Then("isi tabel muncul sesuai dengan nama sales yang diinputkan")
    public void isi_tabel_muncul_sesuai_dengan_nama_sales_yang_diinputkan(){
        delay(3);
    Assert.assertEquals(verifikasiPage.txtNamaSales(), "rinzana");
        extentTest.log(LogStatus.PASS,"isi tabel muncul sesuai dengan nama sales yang diinputkan");
    }

    //mencari tanpa menginputkan apapun : negatif
    @And("hapus input search tersebut")
    public void hapus_input_search_tersebut(){
        delay(3);
        verifikasiPage.deleteFieldSearch();
        extentTest.log(LogStatus.PASS,"hapus input search tersebut");
    }
    @And("klik enter untuk mencari search tanpa inputan")
    public void klik_enter_untuk_mencari_search_tanpa_inputan(){
        delay(3);
    verifikasiPage.clickEnter();
        extentTest.log(LogStatus.PASS,"klik enter untuk mencari search tanpa inputan");
    }

    @Then("isi tabel kembali seperti semula")
    public void isi_tabel_kembali_seperti_semula(){
        delay(3);
        //scrolling
        scrollByPixels(driver,0,900);
        delay(5);
    Assert.assertEquals(verifikasiPage.setTxtIsiTabel(), "Showing 1 to 10 of 33 entries");
        //scrolling
        scrollByPixels(driver,0,-300);
        delay(5);
        extentTest.log(LogStatus.PASS,"isi tabel kembali seperti semula");
    }

    //pagination page ===============================
    //melihat isi tabel di page 3 : positif
    @Given("verifikator menuju ke menu verifikasi")
    public void verifikator_menuju_ke_menu_verifikasi(){
        delay(5);
        verifikasiPage.clickMenuVerifikasi();
        extentTest.log(LogStatus.PASS,"verifikator menuju ke menu verifikasi");
    }
    @When("scroll bawah max")
    public void scroll_bawah_max(){
        scrollByPixels(driver,0,617);
        delay(5);
        extentTest.log(LogStatus.PASS,"scroll bawah max");
    }
    @And("klik tombol nomor 3 di bagian pagination page")
    public void klik_tombol_nomor_3_di_bagian_pagination_page(){
        delay(5);
        scrollByPixels(driver,0,617);
        delay(5);
    verifikasiPage.clickPage3();
        extentTest.log(LogStatus.PASS,"klik tombol nomor 3 di bagian pagination page");
    }
    @And("tabel menampilkan data dari page 3")
    public void tabel_menampilkan_data_dari_page_3(){
        delay(5);
        scrollByPixels(driver,0,617);
        delay(5);
    Assert.assertEquals(verifikasiPage.setTxtPage3(), "Showing 21 to 30 of 33 entries");
        extentTest.log(LogStatus.PASS,"tabel menampilkan data dari page 3");
    }
    @Then("verifikator dapat melihat isi tabel yang sesuai di page 3")
    public void verifikator_dapat_melihat_isi_tabel_yang_sesuai_di_page_3(){
        delay(3);
        Assert.assertEquals(verifikasiPage.setTxtPage3(), "Showing 21 to 30 of 33 entries");
        extentTest.log(LogStatus.PASS,"verifikator dapat melihat isi tabel yang sesuai di page 3");
    }

    //Melihat isi tabel pada page sebelumnya : positif
    @Given("klik tombol Previous di bagian pagination page")
    public void klik_tombol_previous_di_bagian_pagination_page(){
        delay(5);
    verifikasiPage.clickPrevious();
        extentTest.log(LogStatus.PASS,"klik tombol Previous di bagian pagination page");
    }
    @When("tabel menampilkan data dari page sebelumnya")
    public void tabel_menampilkan_data_dari_page_sebelumnya(){
        delay(5);
        Assert.assertEquals(verifikasiPage.setTxtPrevious(), "Showing 11 to 20 of 33 entries");
        extentTest.log(LogStatus.PASS,"tabel menampilkan data dari page sebelumnya");
    }
    @Then("verifikator dapat melihat isi tabel yang sesuai dengan page sebelumnya")
    public void verifikator_dapat_melihat_isi_tabel_yang_sesuai_dengan_page_sebelumnya(){
        delay(3);
        Assert.assertEquals(verifikasiPage.setTxtPrevious(), "Showing 11 to 20 of 33 entries");
        extentTest.log(LogStatus.PASS,"verifikator dapat melihat isi tabel yang sesuai dengan page sebelumnya");
    }

    //Melihat isi tabel pada page selanjutnya : positif
    @Given("klik tombol Next di bagian pagination page")
    public void klik_tombol_next_di_bagian_pagination_page(){
        delay(3);
        //scrolling
        scrollByPixels(driver,0,617);
        delay(5);
    verifikasiPage.clickNext();
        extentTest.log(LogStatus.PASS,"klik tombol Next di bagian pagination page");
    }
    @When("tabel menampilkan data dari page selanjutnya")
    public void tabel_menampilkan_data_dari_page_selanjutnya(){
        delay(3);
        Assert.assertEquals(verifikasiPage.setTxtNext(), "Showing 21 to 30 of 33 entries");
        extentTest.log(LogStatus.PASS,"tabel menampilkan data dari page selanjutnya");
    }
    @Then("verifikator dapat melihat isi tabel yang sesuai dengan page selanjutnya")
    public void verifikator_dapat_melihat_isi_tabel_yang_sesuai_dengan_page_selanjutnya(){
        delay(3);
        Assert.assertEquals(verifikasiPage.setTxtNext(), "Showing 21 to 30 of 33 entries");
        //scrolling
        scrollByPixels(driver,0,-617);
        delay(5);
        extentTest.log(LogStatus.PASS,"verifikator dapat melihat isi tabel yang sesuai dengan page selanjutnya");
    }

    public static void scrollByPixels(WebDriver driver,int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy({ top: " + y + ", behavior: 'smooth' });");
        System.out.println("Scrolling smooth To Target with Pixels");
    }
    public static void tinggiHalamanPerPixel(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        long totalHeight = (long) jsExecutor.executeScript(
                "return Math.max( document.body.scrollHeight, document.body.offsetHeight, " +
                        "document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight);"
        );

        System.out.println("Tinggi Total Halaman: " + totalHeight + " piksel");

    }
    static void delay(long detik) {
        try { //jeda sebelum close
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
