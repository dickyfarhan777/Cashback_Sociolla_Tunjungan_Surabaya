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
    T8("mengganti foto bukti transaksi 1 dengan foto format png"),
    T9("mengganti foto bukti transaksi 2 dengan foto format jpeg"),
    T10("mengganti foto bukti transaksi 3 dengan foto format png"),
    T11("tidak mengganti foto apapun"),
    T12("Sukses menambahkan catatan"),
    T13("Sukses menghapus catatan"),
    T14("Menyimpan catatan kosong"),
    T15("foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol"),
    T16("foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol"),
    T17("mengubah nama lengkap nasabah dengan angka dan karakter spesial"),
    T18("Nama lengkap nasabah kosong atau dihapus"),
    T19("Nominal transaksi ditambahkan 0 satu"),
    T20("Nominal cashback berubah sesuai dengan perubahan nominal transaksi"),
    T21("Nominal transaksi kosong/dihapus"),
    T22("Tanggal transaksi berubah menjadi tanggal sebelum hari ini"),
    T23("Tanggal transaksi berubah menjadi tanggal setelah hari ini"),
    T24("Merubah opsi lain pembayaran QRIS"),
    T25("Memilih opsi pembayaran QRIS \"--Pilih--\""),
    T26("Memilih opsi nama merchant \"--Pilih--\""),
    T27("field form tidak bisa diklik"),
    T28("verifikasi valid penukaran voucher"),



    //modul upload
    T29("Mencari nama customer"),
    T30("Mencari nama verifikator"),
    T31("Mencari tanpa input apapun"),
    T32("Tabel menampilkan maksimal 25 entries"),
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
