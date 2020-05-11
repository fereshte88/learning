package com.rad.njavaio.zepushbackreader;

/**
 * Java PushbackReader Class
 *
 * Java PushbackReader class is a character stream reader. It is used to pushes back a character into stream and overrides the FilterReader class.
 کلاس Java PushbackReader خواننده جریان کاراکتر است. برایpushes back یک  character به جریان و  از کلاس FilterReader استفاده می شود.

 * Class declaration
 * Let' s see the declaration for java.io.PushbackReader class:
 *     public class PushbackReader extends FilterReader
 */

import java.io.CharArrayReader;
import java.io.PushbackReader;

/**
 * Class Methods
 *
 * int read()
 * It is used to read a single character.
 * void mark(int readAheadLimit)
 * It is used to mark the present position in a stream.
 * boolean ready()
 * It is used to tell whether the stream is ready to be read.
 * boolean markSupported()
 * It is used to tell whether the stream supports mark() operation.
 * long skip(long n)
 * It is used to skip the character.
 * void unread (int c)
 * It is used to pushes back the character by copying it to the pushback buffer.
 * void unread (char[] cbuf)
 * It is used to pushes back an array of character by copying it to the pushback buffer.
 * void reset()
 * It is used to reset the stream.
 * void close()
 * It is used to close the stream.
 */
public class PushbackReaderExample {
    public static void main(String[] args) throws Exception {
        char ary[] = {'1','-','-','2','-','3','4','-','-','-','5','6'};
        CharArrayReader reader = new CharArrayReader(ary);
        PushbackReader push = new PushbackReader(reader);
        int i;
        while( (i = push.read())!= -1) {
            if(i == '-') {
                int j;
                if( (j = push.read()) == '-'){
                    System.out.print("#*");
                }else {
                    push.unread(j); // push back single character
                    System.out.print((char)i);
                }
            }else {
                System.out.print((char)i);
            }
        }
    }
}
