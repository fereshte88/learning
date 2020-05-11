package com.rad.njavaio.zkfilterreader;
/**
 * Java FilterReader
 *
 * Java FilterReader is used to perform filtering operation on reader stream. It is an abstract class for reading filtered character streams.
 * The FilterReader provides default methods that passes all requests to the contained stream.
 * Subclasses of FilterReader should override some of its methods and may also provide additional methods and fields.
 *
 کلاس Java FilterReader برای انجام عملیات فیلتر کردن در جریان خواننده استفاده می شود. این یک کلاس انتزاعی برای خواندن جریان های کاراکتر فیلتر شده است.
 و FilterReader روشهای پیش فرض را ارائه می دهد که کلیه درخواست ها را به جریان موجود منتقل می کند.
 زیر کلاس های FilterReader باید برخی از روش های آن را نادیده بگیرد و همچنین ممکن است روش ها و زمینه های دیگری را ارائه دهد.

 *
 * Field
 * protected 	Reader 	in
 * The underlying character-input stream.
 *
 * Constructors
 * protected 	FilterReader(Reader in)
 * It creates a new filtered reader.
 *
 * Method
 * void 	close()
 * It closes the stream and releases any system resources associated with it.
 * void 	mark(int readAheadLimit)
 * It marks the present position in the stream.
 * boolean 	markSupported()
 * It tells whether this stream supports the mark() operation.
 * boolean 	ready()
 * It tells whether this stream is ready to be read.
 * int 	read()
 * It reads a single character.
 * int 	read(char[] cbuf, int off, int len)
 * It reads characters into a portion of an array.
 * void 	reset()
 * It resets the stream.
 * long 	skip(long n)
 * It skips characters.
 */

import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

class CustomFilterReader extends FilterReader {
    CustomFilterReader(Reader in) {
        super(in);
    }
    public int read() throws IOException {
        int x = super.read();
        if ((char) x == ' ')
            return ((int) '?');
        else
            return x;
    }
}
public class FilterReaderExample {
    public String filterResder(String filePath) {
        String value="";
        try  {
            Reader reader = new FileReader(filePath);
            CustomFilterReader fr = new CustomFilterReader(reader);
            int i;
            while ((i = fr.read()) != -1) {
                value = value+(char) i;
            }
            fr.close();
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return value;
    }
}