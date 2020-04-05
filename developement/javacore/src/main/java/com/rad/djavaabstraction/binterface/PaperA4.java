package com.motaharinia.javacore.djavaabstraction.binterface;

public class PaperA4 implements PrintableA4, Previewable, Showable, Drawable, Nested.NestedChild {
    /**
     * پیش نمایش
     *
     * @return خروجی: پیش نمایش
     */
    @Override
    public String preview() {
        return null;
    }

    /**
     * تنظیمات اندازه چاپ را برای واسط پرینتر میفرستد
     *
     * @return خروجی: نتیجه
     */
    @Override
    public String setPrinterSize() {
        return "InheritanceInterfaceSetPrinterSize";
    }

    /**
     * پرینت محتویات
     *
     * @return خروجی: نتیجه
     */
    @Override
    public String print() {
        return null;
    }

    @Override
    public String messageNestedChild() {
        return "messageNestedChild";
    }
}
