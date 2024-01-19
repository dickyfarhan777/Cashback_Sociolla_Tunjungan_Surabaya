package com.juaracoding.utils;

public enum TestCase {

    //verifikasi
    T1("mencari nama depan customer"),
    T2("mencari berdasarkan nama sales"),
    T3("mencari tanpa menginputkan apapun"),
    T4("Tabel menampilkan maksimal 25 entries"),
    T5("melihat isi tabel di page 3"),
    T6("Melihat isi tabel pada page sebelumnya"),
    T7("Melihat isi tabel pada page selanjutnya"),
    T8("verifikasi valid penukaran voucher"),
    T9("field form tidak bisa diklik"),
    T10("mengganti foto bukti transaksi 1 dengan foto format png"),
    T11("mengganti foto bukti transaksi 2 dengan foto format jpeg"),
    T12("mengganti foto bukti transaksi 3 dengan foto format png"),
    T13("tidak mengganti foto apapun"),
    T14("Sukses menambahkan catatan"),
    T15("Sukses menghapus catatan"),
    T16("Menyimpan catatan kosong"),
    T17("foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol"),
    T18("foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol"),
    T19("mengubah nama lengkap nasabah dengan angka dan karakter spesial"),
    T20("Nama lengkap nasabah kosong atau dihapus"),
    T21("Nominal transaksi ditambahkan 0 satu"),
    T22("Nominal cashback berubah sesuai dengan perubahan nominal transaksi"),
    T23("Nominal transaksi kosong/dihapus"),
    T24("Tanggal transaksi berubah menjadi tanggal sebelum hari ini"),
    T25("Tanggal transaksi berubah menjadi tanggal setelah hari ini"),
    T26("Merubah opsi lain pembayaran QRIS"),
    T27("Memilih opsi pembayaran QRIS \"--Pilih--\""),
    T28("Memilih opsi nama merchant \"--Pilih--\""),


    //modul upload
    T29("Tabel menampilkan maksimal 25 entries"),
    T30("Mencari nama customer"),
    T31("Mencari nama verifikator"),
    T32("Mencari tanpa input apapun"),
    T33("Melihat isi tabel di page 2"),
    T34("Melihat isi tabel pada page sebelumnya"),
    T35("Melihat isi tabel pada page setelahnya"),
    T36("field form tidak bisa diklik"),
    T37("meng-upload file berformat png"),
    T38("tidak meng-upload file"),
    T39("meng-upload file berformat jpg"),
    T40("meng-upload file berformat pdf");


    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
