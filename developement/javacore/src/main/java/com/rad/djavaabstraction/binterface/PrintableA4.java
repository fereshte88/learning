package com.rad.djavaabstraction.binterface;

public interface PrintableA4 extends Printable {
    /**
     * تنظیمات اندازه چاپ را برای واسط پرینتر میفرستد
     *
     * @return خروجی: نتیجه
     */
    String setPrinterSize();
}
