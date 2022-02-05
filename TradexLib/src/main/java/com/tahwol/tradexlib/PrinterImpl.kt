package com.tahwol.tradexlib

import com.vanstone.trans.api.PrinterApi

class PrinterImpl : Printer {
    companion object {
        private const val LANG_ENGLISH = 2
        private const val ENCODING_UTF8 = 3
    }

    override fun SetLang_Api(lang: Int, encodeType: Int) {
        PrinterApi.SetLang_Api(LANG_ENGLISH, ENCODING_UTF8)
    }

    override fun print(string: String): String {
        return string
    }


}