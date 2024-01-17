package com.juaracoding.utils;

public enum TestCase {

    T1("Admin Login Valid"),
    T2("Click menu admin privilage"),
    T3("Admin submit data without input data"),
    T5("Admin input data register valid"),
    T6("Admin input soco id yang sudah terdaftar sebelumnya"),
    T7("Admin input nomor hp yang sudah terdaftar sebelumnya"),
    T8("Admin input soco id menggunakan campuran huruf dan angka"),
    T9("Admin input Soco Id dengan menggunakan Karakter @"),
    T10("Admin input soco id dengan menggunakan Karakter >"),
    T11("Admin input soco id dengan menggunakan Karakter <"),
    T12("Admin input soco id dengan menggunakan Karakter '"),
    T13("Admin input soco id dengan menggunakan Karakter \""),
    T14("Admin input nama lengkap dengan full angka"),
    T15("Admin input nama lengkap dengan menggunakan Karakter <"),
    T16("Admin input nama lengkap dengan menggunakan Karakter \""),
    T17("Admin input nama lengkap dengan menggunakan Karakter >"),
    T18("Admin input nama lengkap dengan menggunakan Karakter '"),
    T19("Admin input nama lengkap dengan menggunakan Karakter _"),
    T20("Admin input nama lengkap dengan menggunakan Karakter @"),
    T21("Admin input nama lengkap dengan menggunakan huruf dan angka"),
    T22("Admin input nama lengkap dengan menggunakan karakter !"),
    T23("Admin input nama lengkap dengan menggunakan < > kutip satu kutip dua"),
    T24("Admin input nama lengkap dengan menggunakan karakter #"),
    T25("Admin input nama lengkap dengan menggunakan karakter -"),
    T26("Admin input nama lengkap dengan menggunakan karakter -"),
    T27("Admin input rrn dengan rrn yang sudah terdaftar"),
    T28("Admin input tanggal transaksi melebihi tanggal hari ini"),
    T29("Admin input soco id menggunakan full huruf"),
    T30("Admin input no rekening bca yang sudah terdaftar sebelumnya"),
    T31("Admin tidak memilih pembayaran qris"),
    T32("Admin tidak memilih nama merchant"),
    T33("Admin menginput soco id dengan angka dan emoticon"),
    T34("Admin menginput nama lengkap dengan huruf dan emoticon"),
    T35("Admin input soco id dengan menggunakan karakter #"),
    T36("Admin input soco id dengan menggunakan karakter -"),
    T37("Admin input soco id dengan menggunakan karakter #"),
    T38("Admin input soco id dengan menggunakan karakter ^"),
    T39("Admin input dengan benar dan menampilkan error saving data"),
    T40("Admin input soco id dengan menggunakan karakter *"),
    T41("Admin menampilkan semua status"),
    T42("Admin menampilkan maximal 10 data perhamalam"),
    T43("Admin menampilkan maximal 25 data perhamalam"),
    T44("Admin menampilkan maximal 50 data perhamalam"),
    T45("Admin menampilkan maximal 100 data perhamalam"),
    T46("Admin melakukan pencarian menggunakan search yang terdata"),
    T47("Admin melakukan pencarian menggunakan search yang tidak terdata"),
    T48("Admin melakukan klik icon aksi"),
    T49("Admin menampilkan data berstatus new data"),
    T50("Admin menampilkan data berstatus validated"),
    T51("Admin menampilkan data berstatus transfered"),
    T52("Admin menampilkan data berstatus uploaded"),
    T53("Admin menampilkan halaman selanjutnya"),
    T54("Admin menampilkan halaman previous");
    //T41(""),

    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
