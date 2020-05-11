package com.rad.ujava8feachers.ajava8feachers;

public class Java8Features {
    /**
     * Oracle released a new version of Java as Java 8 in March 18, 2014. It was a revolutionary release of the Java for software development platform.
     * It includes various upgrades to the Java programming, JVM, Tools and libraries.
     * اوراکل نسخه جدیدی از جاوا را با نام جاوا 8 در 18 مارس 2014 منتشر کرد. این یک نسخه انقلابی از جاوا برای بستر توسعه نرم افزار بود.
     * این شامل ارتقاء های مختلف به برنامه نویسی جاوا ، JVM ، ابزارها و کتابخانه ها است.
     */
    /**
     * Java 8 Programming Language Enhancements
     *
     * Java 8 provides following features for Java Programming:
     *
     *     Lambda expressions,
     *     Method references,
     *     Functional interfaces,
     *     Stream API,
     *     Default methods,
     *     Base64 Encode Decode,
     *     Static methods in interface,
     *     Optional class,
     *     Collectors class,
     *     ForEach() method,
     *     Parallel array sorting,
     *     Nashorn JavaScript Engine,
     *     Parallel Array Sorting,
     *     Type and Repating Annotations,
     *     IO Enhancements,
     *     Concurrency Enhancements,
     *     JDBC Enhancements etc.
     */
    /**
     * Lambda Expressions
     *
     * Lambda expression helps us to write our code in functional style. It provides a clear and concise way to implement SAM interface(Single Abstract Method) by using an expression.
     * It is very useful in collection library in which it helps to iterate, filter and extract data.
     بیان لامبدا به ما کمک می کند تا کدهای خود را به سبک کاربردی بنویسیم. این یک متد روشن و مختصر برای پیاده سازی رابط SAM (متد انتزاعی تنها) با استفاده از یک عبارت ارائه می دهد.
     این کتابخانه مجموعه ای است که در آن به تکرار ، فیلتر و استخراج داده ها کمک می کند بسیار مفید است.
     */
    /**
     * Method References
     *
     * Java 8 Method reference is used to refer method of functional interface . It is compact and easy form of lambda expression.
     * Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
     *مرجع متد جاوا 8 برای ارجاع متد رابط کاربری استفاده می شود. این فرم کم و آسان بیان لامبدا است.
     *  هر بار که از عبارت lambda استفاده می کنید و فقط یک متد را ارجاع می دهید ، می توانید عبارت lambda را باmethod reference جایگزین کنید.
     */
    /**
     * Functional Interface
     *
     * An Interface that contains only one abstract method is known as functional interface.
     * It can have any number of default and static methods. It can also declare methods of object class.
     * Functional interfaces are also known as Single Abstract Method Interfaces (SAM Interfaces).
     *رابط که شامل تنها یک متد انتزاعی است به عنوان رابط کاربری شناخته شده است.
     *  این می تواند هر تعداد متد پیش فرض و استاتیک داشته باشد. همچنین می تواند متدهای کلاس شی را اعلام کند.
     رابطهای کاربردی همچنین به عنوان رابطهای متد انتزاعی (رابطهای SAM) معروف هستند.
     *
     */
    /**
     * Optional
     *
     * Java introduced a new class Optional in Java 8. It is a public final class which is used to deal with NullPointerException in Java application.
     * We must import java.util package to use this class. It provides methods to check the presence of value for particular variable.
     * جاوا کلاس جدید Optional را در جاوا 8 معرفی کرد. این یک کلاس public final  است که برای مقابله با NullPointerException در برنامه جاوا استفاده می شود.
     * برای استفاده از این کلاس باید بسته java.util را وارد کنیم. این متد ها را برای بررسی وجود مقدار متغیر خاص فراهم می کند.
     */
    /**
     * forEach
     *
     * Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interfaces.
     * It is a default method defined in the Iterable interface. Collection classes which extends Iterable interface can use forEach() method to iterate elements.
     * This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.
     *جاوا برای تکرار عناصر متد جدیدیforEach()  فراهم می کند. در رابط های Iterable و Stream تعریف شده است.
     این یک متد پیش فرض است که در رابط Iterable تعریف شده است. کلاسهای Collection که واسطIterable را گسترش می دهد می توانند از متد forEach () برای تکرار عناصر استفاده کنند.
     این متد یک پارامتر واحد رابط کاربری را به خود اختصاص می دهد. بنابراین ، می توانید بیان لامبدا را به عنوان آرگومان ارسال کنید
     */
    /**
     * Date/Time API
     *
     * Java has introduced a new Date and Time API since Java 8. The java.time package contains Java 8 Date and Time classes.
     * جاوا از زمان جاوا 8 API جدید تاریخ و زمان را معرفی کرده است. بسته java.time شامل کلاسهای Java 8 Date و Time است.
     */
    /**
     * Default Methods
     *
     * Java provides a facility to create default methods inside the interface. Methods which are defined inside the interface and tagged with default keyword are known as default methods.
     * These methods are non-abstract methods and can have method body.
     * جاوا امکان ایجاد متدهای پیش فرض در رابط را فراهم می کند.
     * متد هایی که درون رابط تعریف شده و با کلید واژه پیش فرض برچسب گذاری شده اند ، به عنوان متد های پیش فرض شناخته می شوند.
     * این متدها متدهای غیر انتزاعی بوده و می توانند دارای بدنه متد باشند.
     */
    /**
     * Nashorn JavaScript Engine
     *
     * Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine).
     * Java provides a command-line tool jjs which is used to execute JavaScript code.
     * You can execute JavaScript code by two ways:
     *     Using jjs command-line tool, and
     *     By embedding into Java source code.
     *
     پ Nashorn یک موتور جاوا اسکریپت است. برای اجرای کد جاوا اسکریپت به صورت پویا در JVM (ماشین مجازی جاوا) استفاده می شود.
     جاوا jjs ابزار خط فرمان را ارائه می دهد که برای اجرای کد JavaScript استفاده می شود.

     می توانید کد JavaScript را به دو متد اجرا کنید:

     با استفاده از ابزار خط فرمان jjs ، و
     با جاسازی در کد منبع جاوا.
     */
    /**
     * StringJoiner
     *
     * Java added a new final class StringJoiner in java.util package.
     * It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc.
     *
     جاوا کلاس  final جدید StringJoiner را در بسته java.util اضافه کرد. از آن برای ساختن دنباله ای از کاراکتر های جدا شده توسط جدا کننده استفاده می شود.
     اکنون می توانید با ارسال محدود کننده هایی مانند کاما (،) ، فن (()) و غیره رشته ایجاد کنید.

     */
    /**
     * Collectors
     *
     * Collectors is a final class that extends Object class.
     * It provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria etc.
     *
     پ Collectors کلاس final است که کلاس Object را گسترش می دهد. این عملیات کاهش می یابد ، مانند جمع آوری عناصر در مجموعه ها ، جمع بندی عناصر با توجه به معیارهای مختلف و غیره.

     */
    /**
     * Stream API
     *
     * Java 8 java.util.stream package consists of classes, interfaces and an enum to allow functional-style operations on the elements.
     * It performs lazy computation. So, it executes only when it requires.
     * بسته Java Java 8 java.util.stream از کلاس ها ، رابط ها و یک enum تشکیل شده است تا عملیات به سبک عملکردی روی عناصر امکان پذیر باشد.
     * محاسبات تنبل را انجام می دهد. بنابراین ، فقط در صورت نیاز اجرا می شود.
     */
    /**
     * Stream Filter
     *
     * Java stream provides a method filter() to filter stream elements on the basis of given predicate.
     * Suppose, you want to get only even elements of your list, you can do this easily with the help of filter() method.
     * This method takes predicate as an argument and returns a stream of resulted elements.
     * پ Javastream یک متد ()filter برای فیلتر کردن عناصر جریان بر اساس گزاره داده شده فراهم می کند.
     * فرض کنید ، شما می خواهید فقط عناصر لیست خود را بدست آورید ، می توانید این کار را به راحتی با کمک  ()filter انجام دهید.
     * این متد گزاره را به عنوان یک استدلال می گیرد و جریان عناصر حاصل را برمی گرداند.
     */
    /**
     * Java Base64 Encoding and Decoding
     *
     * Java provides a class Base64 to deal with encryption and decryption. You need to import java.util.Base64 class in your source file to use its methods.
     * This class provides three different encoders and decoders to encrypt information at each level.
     * جاوا کلاس Base64 را برای مقابله با رمزگذاری و رمزگشایی فراهم می کند. برای استفاده ازمتدهای آن ، باید کلاس java.util.Base64 را در پرونده منبع خود وارد کنید.
     * این کلاس سه رمزگذار و رمزگذار مختلف برای رمزگذاری اطلاعات در هر سطح ارائه می دهد.
     */
    /**
     * Java Parallel Array Sorting
     *
     * Java provides a new additional feature in Arrays class which is used to sort array elements parallelly.
     * The parallelSort() method has added to java.util.Arrays class that uses the JSR 166 Fork/Join parallelism common pool to provide sorting of arrays. It is an overloaded method.
     * جاوا یک ویژگی اضافی جدید در کلاس Arrays ارائه می دهد که برای مرتب سازی موازی عناصر آرایه استفاده می شود.
     * متد parallelSort () به کلاس java.util.Arays افزوده است که از استخر مشترک JSR 166 Fork / Join paralism برای تهیه مرتب سازی آرایه ها استفاده می کند. این verloaded method است.
     */
    /**
     * Java 8 Security Enhancements
     *
     * 1) The Java Secure Socket Extension(JSSE) provider enables the protocols Transport Layer Security (TLS) 1.1 and TLS 1.2 by default on the client side.
     1) ارائه دهنده Java Secure Socket Extension (JSSE) پروتکل های Transport Layer Security (TLS) 1.1 و TLS 1.2 را بطور پیش فرض در طرف مشتری فعال می کند     *
     * 2) A improved method AccessController.doPrivileged has been added which enables code to assert a subset of its privileges, without preventing the full traversal of the stack to check for other permissions.
     2) متدی بهبود یافته AccessController.doPrivileged اضافه شده است که کد را قادر می سازد زیر مجموعه ای از امتیازات خود را مطالبه کند ، بدون اینکه مانع از عبور کامل پشته برای بررسی سایر مجوزها شود
     * 3) Advanced Encryption Standard (AES) and Password-Based Encryption (PBE) algorithms, such as PBEWithSHA256AndAES_128 and PBEWithSHA512AndAES_256 has been added to the SunJCE provider.
     *
     3) الگوریتم های رمزگذاری پیشرفته استاندارد (AES) و رمزگذاری مبتنی بر رمز عبور (PBE) مانند PBEWithSHA256AndAES_128 و PBEWithSHA512AndAES_256 به ارائه دهنده SunJCE اضافه شده است.

     * 4) Java Secure Socket Extension (SunJSSE) has enabled Server Name Indication (SNI) extension for client applications by default in JDK 7 and JDK 8 supports the SNI extension for server applications. The SNI extension is a feature that extends the SSL/TLS protocols to indicate what server name the client is attempting to connect to during handshaking.
     *
     4) افزونه Java Secure Socket (SunJSSE) افزونه نام سرور (SNI) را برای برنامه های مشتری بصورت پیش فرض در JDK 7 فعال کرده است و JDK 8 از پسوند SNI برای برنامه های سرور پشتیبانی می کند. برنامه افزودنی SNI ویژگی ای است که پروتکل های SSL / TLS را گسترش می دهد تا مشخص کند چه مشتری نام مشتری را در حین انجام دستیابی به آن متصل می کند.
     * 5) The SunJSSE is enhanced to support Authenticated Encryption with Associated Data (AEAD) algorithms. The Java Cryptography Extension (SunJCE) provider is enhanced to support AES/GCM/NoPadding cipher implementation as well as Galois/Counter Mode (GCM) algorithm parameters.
     *
     5) پ SunJSSE برای پشتیبانی از رمزگذاری معتبر با الگوریتم های داده های مرتبط (AEAD) تقویت شده است. ارائه دهنده رمزنگاری جاوا رمزنگاری (SunJCE) برای پشتیبانی از پیاده سازی رمزگذاری AES / GCM / NoPadding و همچنین پارامترهای الگوریتم Galois / Counter Mode (GCM) بهبود یافته است.
     * 6) A new command flag -importpassword is added to the keytool utility. It is used to accept a password and store it securely as a secret key. Classes such as java.security.DomainLoadStoreParameter andjava.security.PKCS12Attribute is added to support DKS keystore type.
     *
     6) یک دستور پرچم جدید -importpassword به ابزار keytool اضافه می شود. برای پذیرش رمزعبور و ذخیره ایمن آن به عنوان کلید مخفی استفاده می شود. کلاسهایی مانند java.security.DomainLoadStoreParameter andjava.securance.PKCS12Attribute برای پشتیبانی از نوع keystore DKS اضافه شده است.
     * 7) In JDK 8, the cryptographic algorithms have been enhanced with the SHA-224 variant of the SHA-2 family of message-digest implementations.
     *
     7) در JDK 8 ، الگوریتم های رمزنگاری با نوع SHA-224 از خانواده SHA-2 از پیاده سازی های message-digest  بهبود یافته است.

     * 8) Enhanced support for NSA Suite B Cryptography which includes:
     *
     *     OID registration for NSA Suite B cryptography algorithms
     *     Support for 2048-bit DSA key pair generation and additional signature algorithms for 2048-bit DSA keys such as SHA224withDSA and SHA256withDSA.
     *     Lifting of the keysize restriction from 1024 to 2048 for Diffie-Hellman (DH) algorithm.
     *
     8) پشتیبانی پیشرفته از رمزنگاری NSA Suite B که شامل موارد زیر است:

     ثبت OID برای الگوریتم های رمزنگاری NSA Suite B
     پشتیبانی از تولید جفت کلید DSA 2048 بیتی و الگوریتم های امضای اضافی برای کلیدهای DSA 2048 بیتی مانند SHA224withDSA و SHA256withDSA.
     بلند کردن محدودیت کلید سازی از 1024 تا 2048 برای الگوریتم Diffie-Hellman (DH).

     * 9) SecureRandom class provides the generation of cryptographically strong random numbers which is used for private or public keys, ciphers and signed messages. The getInstanceStrong() method was introduced in JDK 8, which returns an instance of the strongest SecureRandom. It should be used when you need to create RSA private and public key. SecureRandom includes following other changes:
     *
     *     Two new implementations has introduced for UNIX platforms, which provide blocking and non-blocking behavior.
     *
     9) کلاس SecureRandom تولید اعداد تصادفی از نظر رمزنگاری قوی را فراهم می کند که برای کلیدهای خصوصی یا عمومی ، رمزها و پیامهای امضا شده استفاده می شود. متد getInstanceStrong () در JDK 8 معرفی شد که نمونه ای از قوی ترین SecureRandom را برمی گرداند. این باید هنگام استفاده از کلید خصوصی و عمومی RSA مورد استفاده قرار گیرد. SecureRandom شامل تغییرات زیر است:

     دو پیاده سازی جدید برای سیستم عامل های UNIX معرفی شده است که رفتار مسدود کننده و غیر مسدود کننده را ارائه می دهند.

     * 10) A new PKIXRevocationChecker class is included which checks the revocation status of certificates with the PKIX algorithm. It supports best effort checking, end-entity certificate checking, and mechanism-specific options.
     *
     10) یک کلاس جدید PKIXRevocationChecker گنجانده شده است که وضعیت ابطال گواهینامه ها را با الگوریتم PKIX بررسی می کند. این پشتیبانی از بهترین تلاش ، بررسی گواهی موجودیت انتهایی و گزینه های خاص مکانیزم را پشتیبانی می کند.

     * 11) The Public Key Cryptography Standards 11 (PKCS) has been expanded to include 64-bit supports for Windows.
     *
     11) استانداردهای رمزنگاری عمومی کلید 11 (PKCS) گسترش یافته است که شامل پشتیبانی 64 بیتی برای ویندوز است.

     * 12) Two new rcache types are added to Kerberos 5. Type none means no rcache at all, and type dfl means the DFL style file-based rcache. Also, the acceptor requested subkey is now supported. They are configured using the sun.security.krb5.rcache and sun.security.krb5.acceptor.subkey system properties.
     *
     12) دو نوع جدید rcache به Kerberos اضافه می شود 5. نوع هیچ به معنای بدون rcache نیست ، و نوع dfl به معنای rcache مبتنی بر پرونده سبک DFL است. همچنین ، زیر نامه درخواستی پذیرنده اکنون پشتیبانی می شود. آنها با استفاده از ویژگی های سیستم sun.security.krb5.rcache و sun.security.krb5.acceptor.subkey پیکربندی شده اند.

     * 13) In JDK 8, Kerberos 5 protocol transition and constrained delegation are supported within the same realm.
     *
     13) در JDK 8 ، انتقال پروتکل Kerberos 5 و نمایندگی محدود در همان قلمرو پشتیبانی می شوند.

     * 14) Java 8 has disabled weak encryption by default. The DES-related Kerberos 5 encryption types are not supported by default. These encryption types can be enabled by adding allow_weak_crypto=true in the krb5.conf file.
     *
     14) جاوا 8 به طور پیش فرض رمزگذاری ضعیف را غیرفعال کرده است. انواع رمزگذاری Kerberos 5 مربوط به DES به طور پیش فرض پشتیبانی نمی شوند. این نوع رمزگذاری را می توان با اضافه کردنallow_weak_crypto=true در پرونده krb5.conf فعال كرد.
     * 15) You can set server name to null to denote an unbound server. It means a client can request for the service using any server name. After a context is established, the server can retrieve the name as a negotiated property with the key name SASL.BOUND_SERVER_NAME.
     *
     15) می توانید نام سرور را غیرفعال کنید تا سرور نامحدود را مشخص کند. این بدان معنی است که مشتری می تواند با استفاده از هر نام سرور درخواست خدمات را بکند. پس از ایجاد زمینه ، سرور می تواند نام را به عنوان یک ویژگی مورد مذاکره با نام اصلی SASL.BOUND_SERVER_NAME بازیابی کند.
     * 16) Java Native Interface (JNI) bridge to native Java Generic Security Service (JGSS) is now supported on Mac OS X. You can set system property sun.security.jgss.native to true to enable it.
     *
     16) پل رابط بومی جاوا (JNI) به سرویس امنیت بومی جاوا (JGSS) اکنون در Mac OS X پشتیبانی شده است.

     * 17) A new system property, jdk.tls.ephemeralDHKeySize is defined to customize the ephemeral DH key sizes. The minimum acceptable DH key size is 1024 bits, except for exportable cipher suites or legacy mode (jdk.tls.ephemeralDHKeySize=legacy).
     *
     17) یک ویژگی خاص سیستم ، jdk.tls.ephemeralDHKeySize برای سفارشی کردن اندازه های کلیدی DHK تعریف شده است. حداقل اندازه قابل قبول DH 1024 بیت است ، به استثنای مجموعه های رمزگذاری شده صادر شده یا حالت میراث (jdk.tls.ephemeralDHKeySize = میراث).
     * 18) Java Secure Socket Extension (JSSE) provider honors the client's cipher suite preference by default. However, the behavior can be changed to respect the server's cipher suite preference by calling SSLParameters.setUseCipherSuitesOrder(true) over the server.
     18) ارائه دهنده Java Secure Socket Extension (JSSE) به طور پیش فرض از اولویت های رمزگذاری شده مشتری پشتیبانی می کند. با این وجود ، با فراخوانی کردن SSLParameters.setUseCipherSuitesOrder (درست) روی سرور ، می توان رفتار را برای احترام به رمزگذاری مجموعه سرور تغییر داد.

     */
    /**
     * Java 8 Tools Enhancements
     *
     * 1) A jjs command is introduced, which invokes the Nashorn engine either in interactive shell mode, or to interpret script files.
     *
     1) دستور jjs معرفی می شود ، که موتور Nashorn را در حالت پوسته تعاملی فراخوانی می کند ، یا فایل های اسکریپت را تفسیر می کند.
     * 2) The java command is capable of launching JavaFX applications, provided that the JavaFX application is packaged correctly.
     *
     2) دستور java قادر به راه اندازی برنامه های JavaFX است ، به شرط آنکه برنامه JavaFX به درستی بسته بندی شود.
     * 3) The java command man page (both nroff and HTML) has been completely reworked. The advanced options are now divided into Runtime, Compiler, Garbage Collection, and Serviceability, according to the area that they affect. Several previously missing options are now described. There is also a section for options that were deprecated or removed since the previous release.
     *) صفحه فرمان java (هر دو نوع شماره و HTML) به طور کامل بازسازی شده است. اکنون گزینه های پیشرفته با توجه به منطقه ای که روی آنها تأثیر می گذارد ، به Runtime ، کامپایلر ، جمع آوری زباله و سرویس پذیری تقسیم می شوند. چندین گزینه از دست رفته قبلاً توضیح داده شده است. همچنین یک بخش برای گزینه هایی که از نسخه قبلی کاهش یافته یا حذف شده اند وجود دارد.
     * 4) New jdeps command-line tool allows the developer to analyze class files to determine package-level or class-level dependencies.
     *
     4) ابزار خط فرمان جدید jdeps به توسعه دهنده امکان می دهد پرونده های کلاس را برای تعیین وابستگی های سطح بسته یا سطح کلاس آنالیز کند.

     * 5) You can access diagnostic commands remotely, which were previously accessible only locally via the jcmd tool. Remote access is provided using the Java Management Extensions (JMX), so diagnostic commands are exposed to a platform MBean registered to the platform MBean server. The MBean is the com.sun.management.DiagnosticCommandMBean interface.
     *
     5) می توانید از راه دور به دستورات تشخیصی دسترسی داشته باشید ، که قبلاً فقط از طریق ابزار jcmd به صورت محلی قابل دسترسی بودند. دسترسی از راه دور با استفاده از برنامه های افزودنی مدیریت جاوا (JMX) ارائه می شود ، بنابراین دستورات تشخیصی در معرض یک پلتفرم MBean که در سرور MBean به سیستم عامل ثبت شده است ، قرار می گیرند. MBean رابط com.sun.management.DiagnosticCommandMBean است.

     * 6) A new option -tsapolicyid is included in the jarsigner tool which enables you to request a signed time stamp from a Time Stamping Authority and attach it to a signed JAR file.
     *
     6) یک گزینه جدید -sapolicyid در ابزار jarsigner گنجانده شده است که به شما امکان می دهد تمبر زمان امضا شده را از یک Time Stamping Authority درخواست کنید و آن را به یک پرونده JAR امضا شده وصل کنید.

     * 7) A new method java.lang.reflect.Executable.getParameters is included which allows you to access the names of the formal parameters of any method or constructor. However, .class files do not store formal parameter names by default. To store formal parameter names in a particular .class file, and thus enable the Reflection API to retrieve formal parameter names, compile the source file with the -parameters option of the javac compiler.
     *
     7) یک متد جدید java.lang.reflect.Exohibable.getParameters گنجانده شده است که به شما امکان می دهد به نام پارامترهای رسمی هر متد یا سازنده دسترسی پیدا کنید. با این حال ، فایلهای کلاس به طور پیش فرض نام پارامترهای رسمی را ذخیره نمی کنند. برای ذخیره نام های پارامترهای رسمی در یک پرونده خاص .class ، و در نتیجه فعال کردن Reflection API برای بازیابی نام پارامترهای رسمی ، فایل منبع را با گزینه -parameters از کامپایلر javac کامپایل کنید.
     * 8) The type rules for binary comparisons in the Java Language Specification (JLS) Section 15.21 will now be correctly enforced by javac.
     *
     8) قوانین نوع برای مقایسه های باینری در مشخصات زبان جاوا (JLS) بخش 15.21 اکنون توسط javac به درستی اجرا می شود.

     * 9) In this release, the apt tool and its associated API contained in the package com.sun.mirror have been removed.
     * ) در این نسخه ، ابزار apt و API همراه آن موجود در بسته com.sun.mirror حذف شده اند.
     */
    /**
     * Javadoc Enhancements
     *
     * In Java SE 8, the following new APIs were added to the Javadoc tool.
     *
     *     A new DocTree API introduce a scanner which enables you to traverse source code that is represented by an abstract syntax tree.
     *     This extends the Compiler Tree API to provide structured access to the content of javadoc comments.
     *  یک APT جدید DocTree اسکنر را معرفی می کند که به شما امکان می دهد کد منبع را که توسط یک درخت نحو انتزاعی نشان داده شده است عبور دهید.
     *  این کار API کامپایلر Tree را گسترش می دهد تا دسترسی ساختار یافته ای به محتوای نظرات javadoc داشته باشد.
     *     The javax.tools package contains classes and interfaces that enable you to invoke the Javadoc tool directly from a Java application, without executing a new process.
     *   بسته javax.tools شامل کلاس ها و رابط هایی است که شما را قادر می سازد مستقیماً از یک برنامه جاوا ، بدون اجرای یک فرآیند جدید ، از ابزار Javadoc فراخوانی کنید.
     *     The "Method Summary" section of the generated documentation of a class or interface has been restructured.
     *     Method descriptions in this section are grouped by type. By default, all methods are listed.
     *     You can click a tab to view methods of a particular type (static, instance, abstract, concrete, or deprecated, if they exist in the class or interface).
     *   بخش "خلاصه متد" از مستندات تولید شده از یک کلاس یا رابط بازسازی شده است. توضیحات متد در این بخش براساس نوع طبقه بندی می شوند. به طور پیش فرض ، تمام متد ها ذکر شده اند.
     *   برای مشاهده متدهای نوع خاص (استاتیک ، نمونه ، انتزاعی ، بتونی یا مستهلک ، در صورت وجود در کلاس یا رابط) می توانید روی زبانه کلیک کنید.
     *     The javadoc tool now has support for checking the content of javadoc comments for issues that could lead to various problems, such as invalid HTML or accessibility issues, in the files that are generated by javadoc.
     *     The feature is enabled by default, and can also be controlled by the new -Xdoclint option.
     *
     ابزار javadoc اکنون در پرونده هایی که توسط javadoc تولید می شوند ،
     از بررسی محتوای نظرات javadoc برای موضوعاتی که می تواند منجر به مشکلات مختلفی از جمله HTML نامعتبر یا مشکلات دسترسی شود ، پشتیبانی می کند.
     این ویژگی به طور پیش فرض فعال شده است و همچنین می توانید با گزینه جدید -Xdoclint کنترل کنید.

     */
    /**
     * Pack200 Enhancements
     *
     * The Java class file format has been updated because of JSR 292 which Supports Dynamically Typed Languages on the Java Platform.
     * The Pack200 engine has been updated to ensure that Java SE 8 class files are compressed effectively.
     * Now, it can recognize constant pool entries and new bytecodes introduced by JSR 292.
     * As a result, compressed files created with this version of the pack200 tool will not be compatible with older versions of the unpack200 tool.
     * قالب پرونده کلاس جاوا به دلیل JSR 292 به روز شده است که از زبانهای پویا تایپ شده بر روی بستر جاوا پشتیبانی می کند.
     * موتور Pack200 به روز شده است تا اطمینان حاصل شود که پرونده های کلاس Java Java 8 فشرده شده اند.
     * اکنون ، می تواند ورودی های استخر ثابت و بایت کد های جدید معرفی شده توسط JSR 292 را تشخیص دهد.
     * در نتیجه ، فایل های فشرده شده ایجاد شده با این نسخه از ابزار pack200 با نسخه های قدیمی تر ابزار unack200 سازگار نخواهد بود.
     */
    /**
     * Java 8 I/O Enhancements
     *
     * In Java 8, there are several improvements to the java.nio.charset.Charset and extended charset implementations. It includes the following:
     *
     *     A New SelectorProvider which may improve performance or scalability for server. The /dev/poll SelectorProvider continues to be the default.
     *     To use the Solaris event port mechanism, run with the system property java.nio.channels.spi.Selector set to the value sun.nio.ch.EventPortSelectorProvider.
     *     The size of <JDK_HOME>/jre/lib/charsets.jar file is decreased.
     *     Performance has been improvement for the java.lang.String(byte[], ∗) constructor and the java.lang.String.getBytes() method.
     در جاوا 8 ، چندین مورد در اجرای java.nio.charset.Charset و اجرای charset بهبود یافته است. این موارد شامل موارد زیر است:

     پ SelectorProvider جدید که ممکن است عملکرد یا مقیاس پذیری سرور را بهبود بخشد. / dev / نظرسنجی SelectorProvider همچنان پیش فرض است.
     برای استفاده از مکانیسم پورت رویداد Solaris ، با خاصیت سیستم java.nio.channels.spi.Selector تنظیم کنید تا مقدار sun.nio.ch.EventPortSelectorProvider تنظیم شود.
     اندازه پرونده <JDK_HOME> /jre/lib/charsets.jar کاهش می یابد.
     عملکرد برای سازنده java.lang.String (بایت [] ، ∗) و متد java.lang.String.getBytes () بهبود یافته است.
     */
    /**
     * Java 8 Networking Enhancements
     *
     * 1) A new class java.net.URLPermission has been added. It represents a permission for accessing a resource defined by a given URL.
     *
     * 2) A package jdk.net has been added which contains platform specific socket options and a mechanism for setting these options on all of the standard socket types. The socket options are defined in jdk.net.ExtendedSocketOptions.
     *
     * 3) In class HttpURLConnection, if a security manager is installed, and if a method is called which results in an attempt to open a connection, the caller must possess either a "connect"SocketPermission to the host/port combination of the destination URL or a URLPermission that permits this request.
     *
     * If automatic redirection is enabled, and this request is redirected to another destination, the caller must also have permission to connect to the redirected host/URL.
     *
     1) کلاس جدید java.net.URLPermission اضافه شده است. این یک مجوز برای دسترسی به منبعی است که توسط URL مشخص مشخص شده است.

     2) یک بسته jdk.net اضافه شده است که شامل گزینه های سوکت اختصاصی پلتفرم و مکانیزمی برای تنظیم این گزینه ها بر روی انواع مختلف سوکت است.
     گزینه های سوکت در jdk.net.ExtendedSocketOptions تعریف شده است.

     3) در کلاس HttpURLConnection ، اگر یک مدیر امنیتی نصب شده باشد ، و اگر متدی فراخوانی شده باشد که منجر به تلاش برای باز کردن یک اتصال شود ،
     تماس گیرنده باید دارای یک "اتصال" SocketPermission به ترکیب میزبان / پورت ترکیبی از مقصد باشد یا یک URLPermission که این درخواست را مجاز می کند.

     در صورت فعال شدن تغییر مسیر خودکار ، و این درخواست به مقصد دیگری هدایت می شود ، تماس گیرنده همچنین باید مجوز اتصال به میزبان / URL هدایت شده را داشته باشد.
     */
    /**
     * Java 8 Concurrency Enhancements
     *
     * The java.util.concurrent package added two new interfaces and four new classes.

     * Java.util.concurrent Interfaces
     *
     * public static interface CompletableFuture.AsynchronousCompletionTask
     * It is a marker interface which is used to identify asynchronous tasks produced by async methods. It may be useful for monitoring, debugging, and tracking asynchronous activities.
     * این یک رابط نشانگر است که برای شناسایی وظایف ناهمزمان تولید شده با متدهای async استفاده می شود. این ممکن است برای نظارت ، اشکال زدایی و ردیابی فعالیت های ناهمزمان مفید باشد.
     * public interface CompletionStage<T>
     * It creates a stage of a possibly asynchronous computation, that performs an action or computes a value when another CompletionStage completes.
     *این مرحله از یک محاسبات احتمالاً ناهمزمان ایجاد می کند ، که یک عمل را انجام می دهد یا با کامل شدن دیگری CompletionStage مقدار را محاسبه می کند
     *
     * Java.util.concurrent Classes
     *
     * public class CompletableFuture<T> extends Object implements Future<T>, CompletionStage<T>
     * It is aFuture that may be explicitly completed, and may be used as a CompletionStage, supporting dependent functions and actions that trigger upon its completion.
     * این یک اتفاقی است که به صراحت تکمیل می شود ، و ممکن است به عنوان یک CompletionStage مورد استفاده قرار گیرد ،
     * از توابع و عملکردهای وابسته پشتیبانی می کند که پس از اتمام آن شروع می شود.
     * public static class ConcurrentHashMap.KeySetView<K,V> extends Object implements Set<K>, Serializable
     * It is a view of a ConcurrentHashMap as a Set of keys, in which additions may optionally be enabled by mapping to a common value.
     *    این نمایی از ConcurrentHashMap به عنوان مجموعه ای از کلیدها است که در آن گزینه های اضافی می توانند با نقشه برداری به یک مقدار مشترک فعال شوند.
     * public abstract class CountedCompleter<T> extends ForkJoinTask<T>
     * A ForkJoinTask with a completion action performed when triggered and there are no remaining pending actions.
     *  پ A ForkJoinTask با یک عمل تکمیل که هنگام شروع انجام می شود و هیچ عملی در انتظار باقی نمی ماند.
     * public class CompletionException extends RuntimeException
     * It throws an exception when an error or other exception is encountered in the course of completing a result or task.
     * در هنگام تکمیل نتیجه یا کار ، خطایی یا استثنائی دیگر با آن روبرو می شود.
     */
    /**
     * New Methods in java.util.concurrent.ConcurrentHashMap class
     *
     * ConcurrentHashMap class introduces several new methods in its latest release.
     * It includes various forEach methods (forEach, forEachKey, forEachValue, and forEachEntry), search methods (search, searchKeys, searchValues, and searchEntries)
     * and a large number of reduction methods (reduce, reduceToDouble, reduceToLong etc.). Other miscellaneous methods (mappingCount and newKeySet) have been added as well.
     * کلاس ConcurrentHashMap در آخرین نسخه خود چندین متد جدید را معرفی می کند.
     * این شامل متد های مختلفی forEach methods  ((برای هر قسمت ، forEachKey ، forEachValue و forEachEntry) ، 
     * متد های جستجو (جستجو ، جستجوKeys ، searchValues ، و searchEntries)) و
     * تعداد زیادی از متد های کاهش (کاهش ، کاهشToDouble ، کاهش TTLong و غیره) می باشد. 
     * متد های دیگر متفرقه (mappingCount و newKeySet) نیز اضافه شده است.
     */
    /**
     * New classes in java.util.concurrent.atomic
     *
     * Latest release introduces scalable, updatable, variable support through a small set of new classes DoubleAccumulator, DoubleAdder, LongAccumulator andLongAdder.
     * It internally employ contention-reduction techniques that provide huge throughput improvements as compared to Atomic variables.
     *
     آخرین نسخه پشتیبانی مقیاس پذیر ، به روز رسانی و متغیر را از طریق مجموعه کوچکی از کلاس های جدید DoubleAccumulator ، DoubleAdder ، LongAccumulator وLongAdder معرفی می کند.
     در داخل از تکنیک های کاهش مشاجره استفاده می کند که در مقایسه با متغیرهای اتمی ، پیشرفت توان عظیمی را ارائه می دهد.

     * public class DoubleAccumulator extends Number implements Serializable
     * It is used for one or more variables that together maintain a running double value updated using a supplied function.
     * این برای یک یا چند متغیر استفاده می شود که در کنار هم ، یک مقدار دو برابر را اجرا می کنند که با استفاده از یک تابع تهیه شده ، به روز شده اند.
     * public class DoubleAdder extends Number implements Serializable
     * It is used for one or more variables that together maintain an initially zero double sum.
     * این برای یک یا چند متغیر استفاده می شود که در کنار هم جمعاً جمعاً صفر مضاعف را حفظ می کنند.
     * public class LongAccumulator extends Number implements Serializable
     * It is used for one or more variables that together maintain a running long value updated using a supplied function.
     * این برای یک یا چند متغیر استفاده می شود که در کنار هم یک مقدار طولانی در حال اجرا را که با استفاده از یک تابع عرضه شده به روز می شود ، استفاده می شود.
     * public class LongAdder extends Number implements Serializable
     * It is used for one or more variables that together maintain an initially zero long sum.
     * این برای یک یا چند متغیر استفاده می شود که در کنار هم جمع اولیه صفر طولانی را حفظ می کنند.
     */
    /**
     * New methods in java.util.concurrent.ForkJoinPool Class
     *
     * This class has added two new methods getCommonPoolParallelism() and commonPool(),
     * which return the targeted parallelism level of the common pool, or the common pool instance, respectively.
     *    این کلاس دو روش جدید getCommonPoolParallelism () و CommonPool () را اضافه کرده است که سطح موازی گرایی هدفمند استخر مشترک یا نمونه استخر مشترک را برمی گرداند.
     public static ForkJoinPool commonPool()
     It returns the common pool instance.
     این نمونه استخر مشترک را برمی گرداند.
     Public static int getCommonPoolParallelism()
     It returns the targeted parallelism level of the common pool.
     سطح موازی هدفمند استخر مشترک را برمی گرداند.
     */
    /**
     * New class java.util.concurrent.locks.StampedLock
     *
     * A new class StampedLock is added which is used to add capability-based lock with three modes for controlling read/write access (writing, reading, and optimistic reading). This class also supports methods that conditionally provide conversions across the three modes.
     *
     کلاس جدید StampedLock اضافه شده است که برای اضافه کردن قفل مبتنی بر قابلیت با سه حالت برای کنترل دسترسی به خواندن و نوشتن (نوشتن ، خواندن و خواندن خوش بینانه) استفاده می شود.
     این کلاس همچنین از روشهایی پشتیبانی می کند که به صورت مشروط امکان تبدیل در سه حالت را فراهم می کنند.
     * public class StampedLock extends Object implements Serializable
     * This class represents a capability-based lock with three modes for controlling read/write access.
     * این کلاس یک قفل مبتنی بر قابلیت را با سه حالت برای کنترل دسترسی خواندن و نوشتن نشان می دهد.
     */
    /**
     * Java API for XML Processing (JAXP) 1.6 Enhancements
     *
     * In Java 8, Java API is added for XML Processing (JAXP) 1.6.
     * It requires the use of the service provider loader facility which is defined by java.util.ServiceLoader to load services from service configuration files.
     * The rationale for this is to allow for future modularization of the Java SE platform where service
     * providers may be deployed by means other than JAR files and perhaps without the service configuration files.
     *
     در Java 8 ، Java API برای پردازش XML (JAXP) 1.6 اضافه شده است. برای بارگیری خدمات از پرونده های پیکربندی سرویس
     نیاز به استفاده از امکانات لودر ارائه دهنده خدمات دارد که توسط java.util.ServiceLoader تعریف شده است.

     دلیل اصلی این امر امکان modularization در آینده در بستر Java SE است كه ارائه دهندگان خدمات ممكن است از طریق دیگر فایلهای JAR و شاید بدون فایلهای پیكربندی سرویس مستقر شوند.

     */
    /**
     * Java Virtual Machine Enhancements
     *
     * The verification of invokespecial instructions has been tightened so that only an instance initialization method in the current class or its direct super class may be invoked.
     *
     تأیید دستورالعملهای ویژه فراخوانی شده است به گونه ای که بطور کامل ممکن است از یک روش ابتکاری اولیه در کلاس فعلی یا super class مستقیم آن استفاده شود.
     */
    /**
     * Java Mission Control 5.3 is included in Java 8
     *
     * Java Mission Control (JMC) is an advanced set of tools that enables efficient and detailed data analysis and delivers advanced, unobtrusive Java monitoring and management.
     * JMC provides sections for common analysis areas such as code performance, memory and latency.
     *
     * Babel Language Packs in Japanese and Simplified Chinese are now included by default in the Java Mission Control that is included in the JDK 8.
     *
     کنترل کنترل ماموریت جاوا (JMC) مجموعه ای پیشرفته از ابزارهایی است که تجزیه و تحلیل داده های کارآمد و مفصل را قادر می سازد و مانیتورینگ و مدیریت پیشرفته ،
     محجوب جاوا را ارائه می دهد. JMC بخش هایی را برای مناطق تجزیه و تحلیل رایج مانند عملکرد کد ، حافظه و زمان تأخیر ارائه می دهد.

     بسته های زبان Babel به زبان ژاپنی و ساده شده چینی اکنون به طور پیش فرض در کنترل ماموریت جاوا که در JDK 8 گنجانده شده است قرار می گیرد.

     */
    /**
     * Java 8 Internationalization Enhancements
     * 1) Unicode Enhancements
     *
     * The JDK 8 includes support for Unicode 6.2.0. It contains the following features.
     *
     *     733 new characters including Turkish Lira sign.
     *
     *     7 new scripts:
     *         Meroitic Hieroglyphs
     *         Meroitic Cursive
     *         Sora Sompeng
     *         Chakma
     *         Sharada
     *         Takri
     *         Miao
     *
     *     11 new blocks: including 7 blocks for the new scripts listed above and 4 blocks for the following existing scripts:
     *     Arabic Extended-A
     *     Sundanese Supplement
     *     Meetei Mayek Extensions
     *     Arabic Mathematical Alphabetical Symbols
     */
    /**
     * Adoption of Unicode CLDR Data and the java.locale.providers System Property
     *
     * The Unicode Consortium has released the Common Locale Data Repository (CLDR) project to "support the world's languages, with the largest and most extensive standard repository of locale data available." The CLDR is becoming the de-facto standard for locale data. The CLDR's XML-based locale data has been incorporated into the JDK 8 release, however it is disabled by default.
     *
     * There are four distinct sources for locale data:
     *
     *     CLDR represents the locale data provided by the Unicode CLDR project.
     *     HOST represents the current user's customization of the underlying operating system's settings. It works only with the user's default locale, and the customizable settings may vary depending on the OS, but primarily Date, Time, Number, and Currency formats are supported.
     *     SPI represents the locale sensitive services implemented in the installed SPI providers.
     *     JRE represents the locale data that is compatible with the prior JRE releases.
     *
     * To select the desired locale data source, use the java.locale.providers system property. listing the data sources in the preferred order. For example: java.locale.providers=HOST,SPI,CLDR,JRE The default behavior is equivalent to the following setting: java.locale.providers=JRE,SPI
     *
     کنسرسیوم یونیکد پروژه "مخزن داده مشترک محلی (CLDR)" را برای "پشتیبانی از زبانهای جهان ، با بزرگترین و گسترده ترین مخزن استاندارد داده محلی در دسترس"
     منتشر کرده است. CLDR به استاندارد de-facto برای داده های محلی تبدیل می شود. داده های محلی مبتنی بر XML CLDR در نسخه JDK 8 گنجانیده شده است ، اما به طور پیش فرض غیرفعال است.

     چهار منبع مجزا برای داده های محلی وجود دارد:

     پ CLDR نشان دهنده داده های محلی ارائه شده توسط پروژه یونیکد CLDR است.
     پ HOST نمایش شخصی سازی کاربر فعلی از تنظیمات سیستم عامل اساسی است. این فقط با محلی پیش فرض کاربر کار می کند ،
     و تنظیمات قابل تنظیم بسته به سیستم عامل ممکن است متفاوت باشد ، اما در درجه اول فرمت های تاریخ ، زمان ، شماره و ارز پشتیبانی می شوند.
     پ SPI نمایانگر خدمات حساس به محلی است که در ارائه دهندگان SPI نصب شده اجرا می شود.
     پ JRE نشان دهنده داده های محلی است که با نسخه های قبلی JRE سازگار است.

     برای انتخاب منبع داده محلی مورد نظر ، از ویژگی سیستم java.locale.providers استفاده کنید. فهرست منابع داده به ترتیب دلخواه. به عنوان مثال: java.locale.providers = HOST، SPI، CLDR، JRE رفتار پیش فرض معادل تنظیم زیر است: java.locale.providers = JRE، SPI

     */
    /**
     * Date
     */
    /**
     * Enhancements in JDK 8u5
     *
     * 1) The frequency in which the security prompts are shown for an application has been reduced.
     * 1) تعداد که در آن درخواست های امنیتی برای یک برنامه نشان داده شده است کاهش یافته است.
     */
    /**
     * Enhancements in JDK 8u11
     *
     * 1) An option to suppress offers from sponsors when the JRE is installed or updated is available in the Advanced tab of the Java Control Panel.
     *
     * 2) The Entry-Point attribute can be included in the JAR file manifest to identify one or more classes as a valid entry point for your RIA(Rich Internet application).
     *
     1) گزینه ای برای سرکوب پیشنهادات از طرف حامیان مالی هنگام نصب یا به روزرسانی JRE در تب پیشرفته کنترل پنل جاوا وجود دارد.

     2) ویژگی Entry-Point می تواند در پرونده JAR گنجانده شود تا یک یا چند کلاس را به عنوان یک نقطه ورود معتبر برای RIA (برنامه غنی اینترنت) شناسایی کند.

     */
    /**
     * Enhancements in JDK 8u20
     *
     * 1) The javafxpackager tool has been renamed to javapackager. This tool has been enhanced with new arguments for self-contained application bundlers.
     *
     * Follwing enhancements are related to the java tool:
     *
     *     An experimental JIT compiler option related to Restricted Transactional Memory (RTM) has been added.
     *     Several options related to string deduplication have been added.
     *     Several options related to Advanced Encryption Standard (AES) intrinsics have been added.
     *     Combinations of garbage collection options have been deprecated.
     *
     * 2) Garbage Collection Tuning Guide has been added to the Java HotSpot Virtual Machine.
     * It describes the garbage collectors included with the Java HotSpot VM and helps you to decide which garbage collector can best optimize the performance of your application,
     * especially if it handles large amounts of data (multiple gigabytes), has many threads, and has high transaction rates.
     *
     1) ابزار javafxpackager به javapackager تغییر نام داد. این ابزار با استدلال های جدید برای ارائه دهنده برنامه های کاربردی در خود بهبود یافته است.

     پیشرفت های دنبال شده به ابزار جاوا مربوط می شوند:

     یک گزینه کامپایلر JIT آزمایشی مربوط به حافظه کاربردی محدود (RTM) اضافه شده است.
     گزینه های مختلفی درباره deduplication رشته اضافه شده است.
     چندین گزینه مربوط به ذاتی Advanced Encryption Standard (AES) اضافه شده است.
     ترکیبی از گزینه های جمع آوری زباله کاهش یافته است.

     2) راهنمای تنظیم زباله به ماشین مجازی جاوا HotSpot اضافه شده است. این جمع آوری زباله های موجود با Java HotSpot VM را توصیف می کند و به شما کمک می کند تا تصمیم بگیرید کدام یک از جمع آوری زباله ها می توانند به بهترین نحو عملکرد برنامه شما را بهینه کنند ، به خصوص اگر به مقادیر زیادی از داده ها (چندین گیگابایت) دست داشته باشد ، موضوعات زیادی دارد و میزان معاملات بالایی دارد. .

     */
    /**
     * Enhancements in JDK 8u31
     *
     * 1) In this release, the SSLv3 protocol is removed from the Java Control Panel Advanced options.
     *
     1) در این نسخه پروتکل SSLv3 از گزینه های Advanced Control Panel Java حذف می شود.
     */
    /**
     * Enhancements in JDK 8u40
     * Java tool
     *
     * 1) The -XX:+CheckEndorsedAndExtDirs has been added because the endorsed-standards override mechanism (JDK-8065675) and the extension mechanism (JDK-8065702) have been deprecated. The option helps identify any existing uses of these mechanisms and is supported in JDK 7u80 and JDK 8u40.
     *
     * 2) Java Flight Recorder (JFR) offers a variety of ways to unlock commercial features and enable JFR during the runtime of an application.
     *
     * It includes java command line options such as jcmd diagnostic commands and Graphical User Interface (GUI) controls within Java Mission Control. This flexibility enables you to provide the appropriate options at startup, or interact with JFR later.
     *
     * 3) The option -XX:StartFlightRecording=parameter=value has a new parameter, dumponexit={true|false}, which specifies whether a dump file of JFR data should be generated when the JVM terminates in a controlled manner.
     *
     * 4) The options related to Restricted Transactional Memory (RTM) are no longer experimental. These options include -XX:RTMAbortRatio=abort_ratio, -XX:RTMRetryCount=number_of_retries, -XX:+UseRTMDeopt, and -XX:+UseRTMLocking.
     *
     * 5) In Java 8, Application Class Data Sharing (AppCDS) has been introduced. AppCDS extends CDS (Class Data Sharing) to enable classes from the standard extensions directories and the application class path to be placed in the shared archive. This is a commercial feature and is no longer considered experimental.
     *
     * 6) New options -XX:+ResourceManagement and -XX:ResourceManagementSampleInterval=value have been added.
     *
     * 7) Additional information about large pages has been added. Large Pages, also known as huge pages, are memory pages that are significantly larger than the standard memory page size. Large pages optimize processor Translation-Lookaside Buffers. The Linux options -XX:+UseHugeTLBFS, -XX:+UseSHM, and -XX:+UseTransparentHugePages have been documented.
     *
     * 8) The option -XX:ObjectAlignmentInBytes=alignment has been documented.
     * JJS tool
     *
     * 1) The option --optimistic-types=[true|false] has been added. It enables or disables optimistic type assumptions with deoptimizing recompilation.
     *
     * 2) The option --language=[es5] has been added to the jjs tool. It specifies the ECMAScript language version.
     * Javapackager tool
     *
     * 1) New arguments are available for OS X bundlers. The mac.CFBundleVersion argument identifies the internal version number to be used.
     *
     * 2) The mac.dmg.simple argument indicates if DMG customization steps that depend on executing AppleScript code are skipped.
     *
     * Jcmd tool
     * Jcmd tool is used to dynamically interact with Java Flight Recorder (JFR).
     * You can use it to unlock commercial features, enable/start/stop flight recordings, and obtain various status messages from the system.
     *  از ابزار Jcmd برای تعامل پویا با ضبط کننده جاوا پرواز (JFR) استفاده می شود.
     *  شما می توانید از آن برای باز کردن ویژگی های تجاری ، فعال / شروع / متوقف کردن ضبط پرواز و به دست آوردن پیام های وضعیت مختلف از سیستم استفاده کنید.


     * Jstat tool
     * The jstat tool has been updated with information about compressed class space which is a special part of metaspace.
     *    ابزار jstat با اطلاعاتی در مورد فضای کلاس فشرده سازی که قسمت خاصی از متاسپاس است به روز شده است.

     * Virtual machine
     * The Scalable Native Memory Tracking HotSpot VM feature helps diagnose VM memory leaks and clarify users when memory leaks are not in the VM.
     * Native Memory Tracker can be run without self-shutdown on large systems and without causing a significant performance impact beyond what is considered acceptable for small programs.
     * ویژگی قابلیت ردیابی حافظه بومی مقیاس پذیر HotSpot VM به تشخیص نشت حافظه VM کمک می کند و کاربران را در صورت عدم نشت حافظه در VM کمک می کند.
     * ردیاب حافظه بومی می تواند بدون خاموش کردن سیستم های بزرگ و بدون ایجاد تأثیر عملکرد قابل توجهی فراتر از آنچه برای برنامه های کوچک قابل قبول است ، اجرا شود.
     */
}
