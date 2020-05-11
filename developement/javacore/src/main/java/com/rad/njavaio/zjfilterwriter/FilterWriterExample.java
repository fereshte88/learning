package com.rad.njavaio.zjfilterwriter;
/**
 * java FilterWriter
 *
 * Java FilterWriter class is an abstract class which is used to write filtered character streams.
 *
 * The sub class of the FilterWriter should override some of its methods and it may provide additional methods and fields also.
 *
 کلاس Java FilterWriter یک کلاس انتزاعی است که برای نوشتن جریان کاراکترهای فیلتر شده استفاده می شود.
 طبقه زیر FilterWriter باید برخی از روش های آن را نادیده بگیرد و ممکن است روش ها و فیلدهای دیگری نیز ارائه دهد.
 زمینه های
 *
 * Fields
 * protected 	Writer 	out
 * The underlying character-output stream.
 * Constructors
 *
 * protected 	FilterWriter(Writer out)
 * It creates InputStream class Object
 * Methods
 *
 * void 	close()
 * It closes the stream, flushing it first.
 * void 	flush()
 * It flushes the stream.
 * void 	write(char[] cbuf, int off, int len)
 * It writes a portion of an array of characters.
 * void 	write(int c)
 * It writes a single character.
 * void 	write(String str, int off, int len)
 * It writes a portion of a string.
 */

import java.io.*;

class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }
    public void write(String str) throws IOException {
        super.write(str.toLowerCase());
    }
}
public class FilterWriterExample {
    public String filterWriter(String filePath, String text) {
        String value="";
        try {
            FileWriter fw = new FileWriter(filePath);
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);
            filterWriter.write(text);
            filterWriter.close();
            FileReader fr = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fr);
            int k;
            while ((k = bufferedReader.read()) != -1) {
                value = value + (char) k;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
