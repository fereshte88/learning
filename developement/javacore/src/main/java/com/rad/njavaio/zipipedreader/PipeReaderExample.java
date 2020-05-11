package com.rad.njavaio.zipipedreader;

/**
 * Java - PipedReader
 *
 * The PipedReader class is used to read the contents of a pipe as a stream of characters. This class is used generally to read text.
 * PipedReader class must be connected to the same PipedWriter and are used by different threads.
 *
 کلاس PipedReader برای خواندن مطالب یک لوله به عنوان جریان کاراکترها استفاده می شود. این کلاس معمولاً برای خواندن متن استفاده می شود.
 کلاس PipedReader باید به همان PipedWriter وصل شود و توسط موضوعات مختلف مورد استفاده قرار گیرد.
 *
 * Constructor
 *
 * PipedReader(int pipeSize)
 * It creates a PipedReader so that it is not yet connected and uses the specified pipe size for the pipe's buffer.
 * PipedReader را به گونه ای ایجاد می کند که هنوز به هم وصل نشده و از اندازه مشخص شده لوله برای بافر لوله استفاده می کند.
 * PipedReader(PipedWriter src)
 * It creates a PipedReader so that it is connected to the piped writer src.
 * PipedReader را به گونه ای ایجاد می کند که به پیوند نویسنده پیپ متصل شود.
 * PipedReader(PipedWriter src, int pipeSize)
 * It creates a PipedReader so that it is connected to the piped writer src and uses the specified pipe size for the pipe's buffer.
 * PipedReader را به گونه ای ایجاد می کند که به لوله نویس src وصل شود و از اندازه مشخص شده لوله برای بافر لوله استفاده کند.
 * PipedReader()
 * It creates a PipedReader so that it is not yet connected.
 * یک PipedReader ایجاد می کند به طوری که هنوز به هم وصل نشده است.
 * Method
 *
 * void 	close()
 * It closes this piped stream and releases any system resources associated with the stream.
 * void 	connect(PipedWriter src)
 * It causes this piped reader to be connected to the piped writer src.
 * int 	read()
 * It reads the next character of data from this piped stream.
 * int 	read(char[] cbuf, int off, int len)
 * It reads up to len characters of data from this piped stream into an array of characters.
 * boolean 	ready()
 * It tells whether this stream is ready to be read.
 */
public class PipeReaderExample {
}
