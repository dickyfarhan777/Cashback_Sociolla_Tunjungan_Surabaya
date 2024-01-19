package com.juaracoding.utils;

public enum TestCase {

    T1("Admin Login Valid"),
    T2("Click menu admin privilage"),
    T3("Admin submit data without input data"),
    T4("Admin input data register valid"),
    T5("Admin input soco id yang sudah terdaftar sebelumnya"),
    T6("Admin input nomor hp yang sudah terdaftar sebelumnya"),
    T7("Admin input soco id menggunakan campuran huruf dan angka"),
    T8("Admin input Soco Id dengan menggunakan Karakter @"),
    T9("Admin input soco id dengan menggunakan Karakter >"),
    T10("Admin input soco id dengan menggunakan Karakter <"),
    T11("Admin input soco id dengan menggunakan Karakter '"),
    T12("Admin input soco id dengan menggunakan Karakter \""),
    T13("Admin input nama lengkap dengan full angka"),
    T14("Admin input nama lengkap dengan menggunakan Karakter <"),
    T15("Admin input nama lengkap dengan menggunakan Karakter \""),
    T16("Admin input nama lengkap dengan menggunakan Karakter >"),
    T17("Admin input nama lengkap dengan menggunakan Karakter '"),
    T18("Admin input nama lengkap dengan menggunakan Karakter _"),
    T19("Admin input nama lengkap dengan menggunakan Karakter @"),
    T20("Admin input nama lengkap dengan menggunakan huruf dan angka"),
    T21("Admin input nama lengkap dengan menggunakan karakter !"),
    T22("Admin input nama lengkap dengan menggunakan < > kutip satu kutip dua"),
    T23("Admin input nama lengkap dengan menggunakan karakter #"),
    T24("Admin input nama lengkap dengan menggunakan karakter -"),
    T25("Admin input rrn dengan rrn yang sudah terdaftar"),
    T26("Admin input tanggal transaksi melebihi tanggal hari ini"),
    T27("Admin input soco id menggunakan full huruf"),
    T28("Admin input no rekening bca yang sudah terdaftar sebelumnya"),
    T29("Admin tidak memilih pembayaran qris"),
    T30("Admin tidak memilih nama merchant"),
    T31("Admin menginput soco id dengan angka dan emoticon"),
    T32("Admin menginput nama lengkap dengan huruf dan emoticon"),
    T33("Admin input soco id dengan menggunakan karakter #"),
    T34("Admin input soco id dengan menggunakan karakter -"),
    T35("Admin input soco id dengan menggunakan karakter ^"),
    T36("Admin input soco id dengan menggunakan karakter *"),
    T37("Admin input nama lengkap dengan menggunakan karakter ^"),
    T38("Admin input nama lengkap dengan menggunakan karakter *"),
    T39("Admin input soco id dengan <>'\""),
    T40("Admin menampilkan semua status"),
    T41("Admin menampilkan data berstatus new data"),
    T42("Admin menampilkan data berstatus validated"),
    T43("Admin menampilkan data berstatus transfered"),
    T44("Admin menampilkan data berstatus uploaded"),
    T45("Admin melakukan pencarian menggunakan search yang terdata"),
    T46("Admin melakukan pencarian menggunakan search yang tidak terdata"),
    T47("Admin melakukan klik icon aksi"),
    T48("Admin menampilkan maximal 10 data perhamalam"),
    T49("Admin menampilkan maximal 25 data perhamalam"),
    T50("Admin menampilkan maximal 50 data perhamalam"),
    T51("Admin menampilkan maximal 100 data perhamalam"),
    T52("Admin memfilter tanggal periode yang sama dengan tanggal sampe dengan untuk cashback"),
    T53("Admin memfilter data tgl sebelum hari ini dan sesudah hari ini untuk cashback"),
    T54("Admin memfilter data tgl hari ini dan sebelum hari ini untuk cashback"),
    T55("Admin memfilter data tgl sesudah hari ini dan sesudah hari ini"),
    T56("Admin mendownload data dashboard nominal cashback berbentuk excel"),
    T57("Admin memfilter data untuk mencari data spg"),
    T58("Admin mendownload data dashboard spg berbentuk excel");


    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
