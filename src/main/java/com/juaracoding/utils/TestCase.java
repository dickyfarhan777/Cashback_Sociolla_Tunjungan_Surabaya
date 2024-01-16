package com.juaracoding.utils;

public enum TestCase {

    //verifikasi
    T1("verifikasi valid penukaran voucher");
//    T2("field form tidak bisa diklik"),
//    T4("mengganti foto bukti transaksi 1 dengan foto format png"),
//    T5("mengganti foto bukti transaksi 2 dengan foto format jpeg"),
//    T6("mengganti foto bukti transaksi 3 dengan foto format png"),
//    T7("tidak mengganti foto apapun"),
//    T8(""),
//    T9(""),
//    T10(""),
//    T11(""),
//    T12(""),
//    T13(""),
//    T14(""),
//    T15(""),
//    T16(""),
//    T17(""),
//    T18(""),
//    T19(""),
//    T20(""),
//    T21(""),
//    T22(""),
//    T23("");


    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
