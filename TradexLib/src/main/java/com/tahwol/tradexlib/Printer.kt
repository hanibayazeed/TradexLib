package com.tahwol.tradexlib

interface Printer {
    fun SetLang_Api(lang: Int, encodeType: Int)
    fun print(string:String):String
}