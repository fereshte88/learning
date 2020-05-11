package com.rad.njavaio.zojavautilscanner;

/**
 * Scanner class in Java is found in the java.util package. Java provides various ways to read input from the keyboard, the java.util.Scanner class is one of them.
 *
 * The Java Scanner class breaks the input into tokens using a delimiter which is whitespace by default. It provides many methods to read and parse various primitive values.
 *
 * The Java Scanner class is widely used to parse text for strings and primitive types using a regular expression.
 * It is the simplest way to get input in Java. By the help of Scanner in Java, we can get input from the user in primitive types such as int, long, double, byte, float, short, etc.
 * کلاس اسکنر در جاوا در بسته java.util یافت می شود. جاوا متدهای مختلفی برای خواندن ورودی از صفحه کلید ارائه می دهد ، کلاس java.util.Scanner یکی از آنهاست.
 *
 * کلاس Java Scanner با استفاده از جدا کننده ای که به طور پیش فرض فضای سفید است ، ورودی را به توکن ها  می شکند.
 * این متد های بسیاری را برای خواندن و تجزیه ارزشهای ابتدایی ارائه می دهد.
 *
 * کلاس Java Scanner به طور گسترده ای برای تجزیه متن برای رشته ها و primitive types با استفاده از یکregular expression استفاده می شود. این ساده ترین راه برای ورود به زبان جاوا است.
 * با کمک اسکنر در جاوا می توانیم در انواع ابتدایی مانند int، long، double، byte، float، short و غیره از کاربر دریافت کنیم.
 */

/**
 * The Java Scanner class extends Object class and implements Iterator and Closeable interfaces.
 * The Java Scanner class provides nextXXX() methods to return the type of value such as nextInt(), nextByte(), nextShort(), next(), nextLine(), nextDouble(), nextFloat(), nextBoolean(), etc.
 * To get a single character from the scanner, you can call next().charAt(0) method which returns a single character.
 * کلاس Java Scanner کلاس Object را گسترش می دهد و رابط های Iterator و Closeable را پیاده سازی می کند.
 * کلاس Java Scanner روش های nextXXX () را برای بازگشت نوع مقدار
 * مانند nextInt () ، nextByte () ، nextShort () ، next () ، nextLine () ، nextDouble () ، nextFloat () ، nextBoolean () و غیره فراهم می کند.
 * برای به دست آوردن یک کاراکتر از اسکنر ، می توانید next().charAt(0) فراخوانی کنیدکه یک کاراکتر واحد را برمی گرداند.
 */

/**
 * How to get Java Scanner
 *
 * To get the instance of Java Scanner which reads input from the user, we need to pass the input stream (System.in) in the constructor of Scanner class. For Example:
 *
 برای به دست آوردن نمونه Java Scanner که ورودی را از کاربر می خواند ، باید جریان ورودی (System.in) را در سازنده کلاس Scanner بگذرانیم. مثلا:
 *
 *     Scanner in = new Scanner(System.in);
 *
 * To get the instance of Java Scanner which parses the strings, we need to pass the strings in the constructor of Scanner class. For Example:
 *
 برای به دست آوردن نمونه ای از Java Scanner که رشته ها را تجزیه می کند ، باید رشته ها را در سازنده کلاس Scanner بگذرانیم. مثلا:
 *
 *     Scanner in = new Scanner("Hello Javatpoint");
 */

/**
 * Java Scanner Class Constructors
 *
 * 1) 	Scanner(File source)
 * It constructs a new Scanner that produces values scanned from the specified file.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از پرونده مشخص شده را تولید می کند.
 * 2) 	Scanner(File source, String charsetName)
 * It constructs a new Scanner that produces values scanned from the specified file.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از پرونده مشخص شده را تولید می کند.
 * 3) 	Scanner(InputStream source)
 * It constructs a new Scanner that produces values scanned from the specified input stream.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از جریان ورودی مشخص را تولید می کند.
 * 4) 	Scanner(InputStream source, String charsetName)
 * It constructs a new Scanner that produces values scanned from the specified input stream.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از جریان ورودی مشخص را تولید می کند.
 * 5) 	Scanner(Readable source)
 * It constructs a new Scanner that produces values scanned from the specified source.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از منبع مشخص شده را تولید می کند.
 * 6) 	Scanner(String source)
 * It constructs a new Scanner that produces values scanned from the specified string.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از رشته مشخص شده را تولید می کند.
 * 7) 	Scanner(ReadableByteChannel source)
 * It constructs a new Scanner that produces values scanned from the specified channel.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از کانال مشخص شده را تولید می کند.
 * 8) 	Scanner(ReadableByteChannel source, String charsetName)
 * It constructs a new Scanner that produces values scanned from the specified channel.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از کانال مشخص شده را تولید می کند.
 * 9) 	Scanner(Path source)
 * It constructs a new Scanner that produces values scanned from the specified file.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از پرونده مشخص شده را تولید می کند.
 * 10) 	Scanner(Path source, String charsetName)
 * It constructs a new Scanner that produces values scanned from the specified file.
 * این اسکنر جدید را تولید می کند که مقادیر اسکن شده از پرونده مشخص شده را تولید می کند.
 */

import java.util.Scanner;

/**
 * Java Scanner Class Methods
 * 1) 	void 	close()
 * It is used to close this scanner.
 * 2) 	pattern 	delimiter()
 * It is used to get the Pattern which the Scanner class is currently using to match delimiters.
 * برای بدست آوردن الگویی که کلاس Scanner در حال حاضر برای مطابقت با محدود کننده ها استفاده میکند ، استفاده می شود.
 * 3) 	Stream<MatchResult> 	findAll()
 * It is used to find a stream of match results that match the provided pattern string.
 * برای پیدا کردن یک جریان از نتایج مطابقت با رشته الگوی ارائه شده استفاده می شود.
 * 4) 	String 	findInLine()
 * It is used to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
 * از آن برای یافتن وقوع بعدی یک الگوی ساخته شده از رشته مشخص استفاده می شود ، بدون در نظر گرفتن محدود کننده ها.
 * 5) 	string 	findWithinHorizon()
 * It is used to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
 * از آن برای یافتن وقوع بعدی یک الگوی ساخته شده از رشته مشخص استفاده می شود ، بدون در نظر گرفتن محدود کننده ها.
 * 6) 	boolean 	hasNext() 	It returns true if this scanner has another token in its input.
 * اگر این اسکنر توکن دیگری را در ورودی خود داشته باشد ، برمی گردد.
 * 7) 	boolean 	hasNextBigDecimal()
 * It is used to check if the next token in this scanner's input can be interpreted as a BigDecimal using the nextBigDecimal() method or not.
 * این مورد برای بررسی اینکه آیا نشانه بعدی در ورودی این اسکنر می تواند به عنوان BigDecimal با استفاده از متد nextBigDecimal () تعبیر شود یا خیر ، استفاده می شود.
 * 8) 	boolean 	hasNextBigInteger()
 * It is used to check if the next token in this scanner's input can be interpreted as a BigDecimal using the nextBigDecimal() method or not.
 * 9) 	boolean 	hasNextBoolean()
 * It is used to check if the next token in this scanner's input can be interpreted as a Boolean using the nextBoolean() method or not.
 * 10) 	boolean 	hasNextByte()
 * It is used to check if the next token in this scanner's input can be interpreted as a Byte using the nextBigDecimal() method or not.
 * 11) 	boolean 	hasNextDouble()
 * It is used to check if the next token in this scanner's input can be interpreted as a BigDecimal using the nextByte() method or not.
 * 12) 	boolean 	hasNextFloat()
 * It is used to check if the next token in this scanner's input can be interpreted as a Float using the nextFloat() method or not.
 * 13) 	boolean 	hasNextInt()
 * It is used to check if the next token in this scanner's input can be interpreted as an int using the nextInt() method or not.
 * 14) 	boolean 	hasNextLine()
 * It is used to check if there is another line in the input of this scanner or not.
 * 15) 	boolean 	hasNextLong()
 * It is used to check if the next token in this scanner's input can be interpreted as a Long using the nextLong() method or not.
 * 16) 	boolean 	hasNextShort()
 * It is used to check if the next token in this scanner's input can be interpreted as a Short using the nextShort() method or not.
 * 17) 	IOException 	ioException()
 * It is used to get the IOException last thrown by this Scanner's readable.
 * استفاده می شود برای آخرین بار IOException توسط این اسکنر قابل خواندن است.
 * 18) 	Locale 	locale()
 * It is used to get a Locale of the Scanner class.
 * برای بدست آوردن محلی از کلاس اسکنر استفاده می شود.
 * 19) 	MatchResult 	match()
 * It is used to get the match result of the last scanning operation performed by this scanner.
 * برای بدست آوردن نتیجه مطابقت آخرین عملیات اسکن انجام شده استفاده می شود.
 * 20) 	String 	next()
 * It is used to get the next complete token from the scanner which is in use.
 * برای بدست آوردن نشان کامل از اسکنر مورد استفاده استفاده می شود.
 * 21) 	BigDecimal 	nextBigDecimal()
 * It scans the next token of the input as a BigDecimal.
 * 22) 	BigInteger 	nextBigInteger()
 * It scans the next token of the input as a BigInteger.
 * 23) 	boolean 	nextBoolean()
 * It scans the next token of the input into a boolean value and returns that value.
 * 24) 	byte 	nextByte()
 * It scans the next token of the input as a byte.
 * 25) 	double 	nextDouble()
 * It scans the next token of the input as a double.
 * 26) 	float 	nextFloat()
 * It scans the next token of the input as a float.
 * 27) 	int 	nextInt()
 * It scans the next token of the input as an Int.
 * 28) 	String 	nextLine()
 * It is used to get the input string that was skipped of the Scanner object.
 * 29) 	long 	nextLong()
 * It scans the next token of the input as a long.
 * 30) 	short 	nextShort()
 * It scans the next token of the input as a short.
 * 31) 	int 	radix()
 * It is used to get the default radix of the Scanner use.
 * برای بدست آوردن ردیف پیش فرض اسکنر استفاده می شود.
 * 32) 	void 	remove()
 * It is used when remove operation is not supported by this implementation of Iterator.
 * هنگامی که عملیات حذف توسط این اجرای Iterator پشتیبانی نمی شود ، استفاده می شود.
 * 33) 	Scanner 	reset()
 * It is used to reset the Scanner which is in use.
 * برای تنظیم مجدد اسکنر مورد استفاده ، استفاده می شود.
 * 34) 	Scanner 	skip()
 * It skips input that matches the specified pattern, ignoring delimiters
 * این ورودی را که با الگوی مشخص شده مطابقت دارد ، رد می کند ، و از تعیین کننده ها صرف نظرمی کند
 * 35) 	Stream<String> 	tokens()
 * It is used to get a stream of delimiter-separated tokens from the Scanner object which is in use.
 * برای بدست آوردن جریانی از نشانه های جداکننده از جسم اسکنر که در حال استفاده است ، استفاده می شود.
 * 36) 	String 	toString()
 * It is used to get the string representation of Scanner using.
 *برای بدست آوردن نمایش رشته ای از اسکنر استفاده می شود.
 * 37) 	Scanner 	useDelimiter()
 * It is used to set the delimiting pattern of the Scanner which is in use to the specified pattern.
 * برای تنظیم الگوی تعیین کننده اسکنر که از الگوی مشخص شده استفاده می شود.
 * 38) 	Scanner 	useLocale()
 * It is used to sets this scanner's locale object to the specified locale.
 * برای تنظیم شیء محلی این اسکنر در محل مشخص شده استفاده می شود.
 * 39) 	Scanner 	useRadix()
 * It is used to set the default radix of the Scanner which is in use to the specified radix.
 * از آن برای تنظیم ردیف پیش فرض اسکنر استفاده می شود که در استفاده از ردیف مشخص شده است.
 */
public class ScannerExample {
    public static void main(String args[]){
        String s = "Hello, This is JavaTpoint.";
        //Create scanner Object and pass string in it
        Scanner scan = new Scanner(s);
        //Check if the scanner has a token
        System.out.println("Boolean Result: " + scan.hasNext());
        //Print the string
        System.out.println("String: " +scan.nextLine());
        scan.close();
        System.out.println("--------Enter Your Details-------- ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: ");
        int i = in.nextInt();
        System.out.println("Age: " + i);
        System.out.print("Enter your salary: ");
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        in.close();
    }
}
