package com.rad.ujava8feachers.gbase64encodedecode;

/**
 * java provides a class Base64 to deal with encryption. You can encrypt and decrypt your data by using provided methods.
 * You need to import java.util.Base64 in your source file to use its methods.
 * This class provides three different encoders and decoders to encrypt information at each level. You can use these methods at the following levels.
 *  کلاس Base64 را برای مقابله با رمزگذاری فراهم می کند.
 *  با استفاده از روشهای ارائه شده می توانید داده های خود را رمزگذاری و رمزگشایی کنید. برای استفاده از روشهای آن باید java.util.Base64 را در پرونده منبع خود وارد کنید.
 * این کلاس سه رمزگذار مختلف برای رمزگذاری اطلاعات در هر سطح ارائه می دهد. می توانید از این روش ها در سطوح زیر استفاده کنید.
 */

/**
 * Basic Encoding and Decoding
 * It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations.
 * The encoder does not add any line separator character. The decoder rejects data that contains characters outside the base64 alphabet.
 از الفبای Base64 مشخص شده توسط جاوا در RFC 4648 و RFC 2045 برای عملیات رمزگذاری و رمزگشایی استفاده می کند.
 رمزگذار هیچ کاراکتر جداکننده خط را اضافه نمی کند. رمزگشاده داده های حاوی نویسه های خارج از الفبای base64 را رد می کند.
 * URL and Filename Encoding and Decoding
 * It uses the Base64 alphabet specified by Java in RFC 4648 for encoding and decoding operations. The encoder does not add any line separator character.
 * The decoder rejects data that contains characters outside the base64 alphabet.
 *از الفبای Base64 مشخص شده توسط جاوا در RFC 4648 برای عملیات رمزگذاری و رمزگشایی استفاده می کند.
 *  رمزگذار هیچ شخصیت جداکننده خط را اضافه نمی کند. رمزگشاده داده های حاوی نویسه های خارج از الفبای base64 را رد می کند.
 * MIME
 * It uses the Base64 alphabet as specified in RFC 2045 for encoding and decoding operations.
 * The encoded output must be represented in lines of no more than 76 characters each and uses a carriage return '\r' followed immediately by a linefeed '\n' as the line separator.
 * No line separator is added to the end of the encoded output. All line separators or other characters not found in the base64 alphabet table are ignored in decoding operation.
 * از الفبای Base64 همانطور که در RFC 2045 مشخص شده است برای عملیات رمزگذاری و رمزگشایی استفاده می کند. خروجی رمزگذاری شده باید در سطرهای بیش از 76 نویسه نمایش داده شود
 * و از یک carriage return  استفاده می شود و بلافاصله توسط یک خط خط \ n به عنوان جداکننده خط دنبال می شود. هیچ جداکننده خطی به انتهای خروجی رمزگذاری شده اضافه نمی شود.
 * تمام جداکننده های خط یا سایر شخصیت های موجود در جدول الفبای base64 در عملیات رمزگشایی نادیده گرفته می شوند.
 */

/**
 * Nested Classes of Base64
 *
 * Base64.Decoder
 * This class implements a decoder for decoding byte data using the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
 * این کلاس رمزگشایی را برای رمزگشایی داده های بایت با استفاده از طرح رمزگذاری Base64 همانطور که در RFC 4648 و RFC 2045 مشخص شده است ، پیاده سازی می کند.
 * Base64.Encoder
 * This class implements an encoder for encoding byte data using the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
 * این کلاس یک رمزگذار را برای رمزگذاری داده های بایت با استفاده از طرح رمزگذاری Base64 همانطور که در RFC 4648 و RFC 2045 مشخص شده است ، پیاده سازی می کند.
 */

/**
 * Base64 Methods
 * public static Base64.Decoder getDecoder()
 * It returns a Base64.Decoder that decodes using the Basic type base64 encoding scheme.
 * public static Base64.Encoder getEncoder()
 * It returns a Base64.Encoder that encodes using the Basic type base64 encoding scheme.
 * public static Base64.Decoder getUrlDecoder()
 * It returns a Base64.Decoder that decodes using the URL and Filename safe type base64 encoding scheme.
 * public static Base64.Decoder getMimeDecoder()
 * It returns a Base64.Decoder that decodes using the MIME type base64 decoding scheme.
 * public static Base64.Encoder getMimeEncoder()
 * It Returns a Base64.Encoder that encodes using the MIME type base64 encoding scheme.
 * public static Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator)
 * It returns a Base64.Encoder that encodes using the MIME type base64 encoding scheme with specified line length and line separators.
 * public static Base64.Encoder getUrlEncoder()
 * It returns a Base64.Encoder that encodes using the URL and Filename safe type base64 encoding scheme.
 */

/**
 * Base64.Decoder Methods
 * public byte[] decode(byte[] src)
 * It decodes all bytes from the input byte array using the Base64 encoding scheme, writing the results into a newly-allocated output byte array.
 * The returned byte array is of the length of the resulting bytes.
 * با استفاده از طرح رمزگذاری Base64 ، همه بایت ها را از آرایه بایت ورودی رمزگشایی می کند و نتایج را در یک آرایه بایت خروجی تازه تخصیص می دهد. آرایه بایت برگشتی از طول بایت های حاصل است.
 * public byte[] decode(String src)
 * It decodes a Base64 encoded String into a newly-allocated byte array using the Base64 encoding scheme.
 * با استفاده از طرح رمزگذاری Base64 ، یک رشته کدگذاری شده Base64 را به آرایه بایت اختصاص داده شده رمزگشایی می کند.
 * public int decode(byte[] src, byte[] dst)
 * It decodes all bytes from the input byte array using the Base64 encoding scheme, writing the results into the given output byte array, starting at offset 0.
 * تمام بایت های موجود از آرایه بایت ورودی را با استفاده از طرح رمزگذاری Base64 رمزگشایی می کند ، و نتایج را در آرایه بایت خروجی داده شده می نویسد ، و از افست 0 شروع می کند.
 * public ByteBuffer decode(ByteBuffer buffer)
 * It decodes all bytes from the input byte buffer using the Base64 encoding scheme, writing the results into a newly-allocated ByteBuffer.
 * با استفاده از طرح رمزگذاری Base64 ، همه بایت ها را از بافر ورودی بایت ورودی رمزگشایی می کند ، و نتایج را در یک بایت تخصیص داده شده می نویسد.
 * public InputStream wrap(InputStream is)
 * It returns an input stream for decoding Base64 enc
 * این یک جریان ورودی برای رمزگشایی Base64 enc است
 */

import java.util.Base64;

/**
 * Base64.Encoder Methods
 * public byte[] encode(byte[] src)
 * It encodes all bytes from the specified byte array into a newly-allocated byte array using the Base64 encoding scheme. The returned byte array is of the length of the resulting bytes.
 *این کلیه بایت ها را از آرایه بایت مشخص شده با استفاده از طرح رمزگذاری Base64 به آرایه بایت تازه اختصاص داده شده ، رمزگذاری می کند. آرایه بایت برگشتی از طول بایت های حاصل است.
 * public int encode(byte[] src, byte[] dst)
 * It encodes all bytes from the specified byte array using the Base64 encoding scheme, writing the resulting bytes to the given output byte array, starting at offset 0.
 *این کلیه بایت ها را از طریق آرایه بایت مشخص شده با استفاده از طرح رمزگذاری Base64 کدگذاری می کند ، و بایت های حاصل را به آرایه بایت خروجی داده شده می نویسد و از offset 0 شروع می کند.
 * public String encodeToString(byte[] src)
 * It encodes the specified byte array into a String using the Base64 encoding scheme.
 *این آرایه بایت مشخص شده را با استفاده از طرح رمزگذاری Base64 در یک رشته رمزگذاری می کند.
 * public ByteBuffer encode(ByteBuffer buffer)
 * It encodes all remaining bytes from the specified byte buffer into a newly-allocated ByteBuffer using the Base64 encoding scheme.
 * Upon return, the source buffer's position will be updated to its limit; its limit will not have been changed.
 * The returned output buffer's position will be zero and its limit will be the number of resulting encoded bytes.
 *با استفاده از طرح رمزگذاری Base64 ، همه بایت های باقیمانده از بافر مشخص شده بایت را در یک ByteBuffer تازه تخصیص یافته رمزگذاری می کند.
 *  پس از بازگشت ، موقعیت بافر مبدا به حداکثر مقدار خود به روز می شود.
 *  حد آن تغییر نخواهد کرد موقعیت بافر خروجی برگشتی صفر و حد آن تعداد بایت های رمزگذاری شده حاصل خواهد بود.
 * public OutputStream wrap(OutputStream os)
 * It wraps an output stream for encoding byte data using the Base64 encoding scheme.
 *این یک جریان خروجی برای رمزگذاری داده های بایت با استفاده از طرح رمزگذاری Base64 می باشد.
 * public Base64.Encoder withoutPadding()
 * It returns an encoder instance that encodes equivalently to this one, but without adding any padding character at the end of the encoded byte data.
 * این یک نمونه رمزگذار است که معادل آن را کدگذاری می کند ، اما بدون اضافه کردن هیچpadding character  در انتهای داده های بایت رمزگذاری شده ، برمی گرداند.
 */
public class Base64BasicEncryptionExample {

    /**
     * Java Base64 Example: Basic Encoding and Decoding
     */
    public static void main1(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();
        // Creating byte array
        byte byteArr[] = {1,2};
        // encoding byte array
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encoded byte array: "+byteArr2);
        byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes
        int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written
        System.out.println("Encoded byte array written to another array: "+byteArr3);
        System.out.println("Number of bytes written: "+x);

        // Encoding string
        String str = encoder.encodeToString("JavaTpoint".getBytes());
        System.out.println("Encoded string: "+str);
        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();
        // Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: "+dStr);
    }
    //***********************************************************************
    /**
     * Java Base64 Example: URL Encoding and Decoding
     */
    public static void main2(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getUrlEncoder();
        // Encoding URL
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
        System.out.println("Encoded URL: "+eStr);
        // Getting decoder
        Base64.Decoder decoder = Base64.getUrlDecoder();
        // Decoding URl
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded URL: "+dStr);
    }
    //***********************************************************************
    /**
     * Java Base64 Example: MIME Encoding and Decoding
     */
    public static void main(String[] args) {
        // Getting MIME encoder
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, \nYou are informed regarding your inconsistency of work";
        String eStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: "+eStr);

        // Getting MIME decoder
        Base64.Decoder decoder = Base64.getMimeDecoder();
        // Decoding MIME encoded message
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded message: "+dStr);
    }
}
