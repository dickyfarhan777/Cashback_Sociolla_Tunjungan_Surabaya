package com.juaracoding.utils;

public enum TestCase {

    //verifikasi
    T1("verifikasi valid penukaran voucher"),
    T2("field form tidak bisa diklik"),
    T4("mengganti foto bukti transaksi 1 dengan foto format png"),
    T5("mengganti foto bukti transaksi 2 dengan foto format jpeg"),
    T6("mengganti foto bukti transaksi 3 dengan foto format png"),
    T7("tidak mengganti foto apapun"),
    T8("Tabel menampilkan maksimal 25 entries"),
    T9("Sukses menambahkan catatan"),
    T10("Sukses menghapus catatan"),
    T11("Menyimpan catatan kosong"),
    T12("foto bukti transaksi 1 bisa dirotasi sesuai dengan tombol"),
    T13("foto bukti transaksi kosong tidak bisa dirotasi sesuai dengan tombol"),
    T14("mengubah nama lengkap nasabah dengan angka dan karakter spesial"),
    T15("Nama lengkap nasabah kosong atau dihapus"),
    T16("Nominal transaksi ditambahkan 0 satu"),
    T17("Nominal cashback berubah sesuai dengan perubahan nominal transaksi"),
    T18("Nominal transaksi kosong/dihapus"),
    T19("Tanggal transaksi berubah menjadi tanggal sebelum hari ini"),
    T20("Tanggal transaksi berubah menjadi tanggal setelah hari ini"),
    T21("Merubah opsi lain pembayaran QRIS"),
    T22("Memilih opsi pembayaran QRIS \"--Pilih--\""),
    T23("Memilih opsi nama merchant \"--Pilih--\""),
    T24("mencari nama depan customer"),
    T25("mencari berdasarkan nama sales"),
    T26("mencari tanpa menginputkan apapun"),
    T27("melihat isi tabel di page 3"),
    T28("Melihat isi tabel pada page sebelumnya"),
    T29("Melihat isi tabel pada page selanjutnya"),
    //modul upload
    T30("field form tidak bisa diklik"),
    T31("Tabel menampilkan maksimal 25 entries"),
    T32("Mencari nama customer"),
    T33("Mencari nama verifikator"),
    T34("Mencari tanpa input apapun"),
    T35("meng-upload file berformat png"),
    T36("tidak meng-upload file"),
    T37("meng-upload file berformat jpg"),
    T38("meng-upload file berformat pdf"),
    T39("Melihat isi tabel di page 2"),
    T40("Melihat isi tabel pada page sebelumnya"),
    T41("Melihat isi tabel pada page setelahnya");


    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
