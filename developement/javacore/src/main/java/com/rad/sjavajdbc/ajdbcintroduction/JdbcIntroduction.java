package com.rad.sjavajdbc.ajdbcintroduction;

public class JdbcIntroduction {
    /**
     * JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Java Standard Edition).
     * JDBC API uses JDBC drivers to connect with the database. There are four types of JDBC drivers:
     * ا JDBC مخفف عبارت Java Database Connectivity است. JDBC یک API جاوا برای اتصال و اجرای پرس و جو با پایگاه داده است
     * . این بخشی از JavaSE (Java Standard Edition) است. JDBC API از درایورهای JDBC برای ارتباط با پایگاه داده استفاده می کند. چهار نوع درایور JDBC وجود دارد:
     *     JDBC-ODBC Bridge Driver,
     *     Native Driver,
     *     Network Protocol Driver, and
     *     Thin Driver
     *
     * We have discussed the above four drivers in the next chapter.
     *
     * We can use JDBC API to access tabular data stored in any relational database. By the help of JDBC API, we can save, update, delete and fetch data from the database.
     * It is like Open Database Connectivity (ODBC) provided by Microsoft.
     * ما می توانیم از API JDBC برای دسترسی به داده های جدولی ذخیره شده در هر پایگاه داده رابطه ای استفاده کنیم.
     * با کمک JDBC API ، می توانیم داده را از پایگاه داده ذخیره ، به روز رسانی ، حذف و واکشی کنیم. مانند اتصال به بانک اطلاعاتی باز (ODBC) است که توسط مایکروسافت ارائه شده است.
     */
    /**
     * The current version of JDBC is 4.3. It is the stable release since 21st September, 2017. It is based on the X/Open SQL Call Level Interface.
     * The java.sql package contains classes and interfaces for JDBC API. A list of popular interfaces of JDBC API are given below:
     *نسخه فعلی JDBC 4.3 است. این نسخه پایدار از تاریخ 21 سپتامبر 2017 است. این مبتنی بر رابط سطح تماس X / Open SQL است.
     * بسته java.sql شامل کلاس ها و رابط هایی برای JDBC API است. لیستی از رابط های محبوب API JDBC در زیر آورده شده است:
     *     Driver interface
     *     Connection interface
     *     Statement interface
     *     PreparedStatement interface
     *     CallableStatement interface
     *     ResultSet interface
     *     ResultSetMetaData interface
     *     DatabaseMetaData interface
     *     RowSet interface
     *
     * A list of popular classes of JDBC API are given below:
     *
     *     DriverManager class
     *     Blob class
     *     Clob class
     *     Types class
     */
    /**
     * Why Should We Use JDBC
     *
     * Before JDBC, ODBC API was the database API to connect and execute the query with the database.
     * But, ODBC API uses ODBC driver which is written in C language (i.e. platform dependent and unsecured).
     * That is why Java has defined its own API (JDBC API) that uses JDBC drivers (written in Java language).
     *
     قبل از JDBC ، API ODBC برای اتصال و اجرای پرس و جو با پایگاه داده API پایگاه داده بود.
     اما ، API ODBC از درایور ODBC استفاده می کند که به زبان C نوشته شده است (یعنی بستر وابسته و نا امن).
     به همین دلیل جاوا API خود را (JDBC API) تعریف کرده است که از درایورهای JDBC استفاده می کند (به زبان جاوا نوشته شده است).
     * We can use JDBC API to handle database using Java program and can perform the following activities:
     *
     *     Connect to the database
     *     Execute queries and update statements to the database
     *     Retrieve the result received from the database.
     *
     ما می توانیم از API JDBC برای اداره پایگاه داده با استفاده از برنامه جاوا استفاده کنیم و می تواند فعالیت های زیر را انجام دهد:
     به بانک اطلاعات وصل شوید
     نمایش داده شد و بیانیه ها را به پایگاه داده به روز کنید
     نتیجه دریافتی از پایگاه داده را بازیابی کنید.
     */
    /**
     * What is API
     *
     * API (Application programming interface) is a document that contains a description of all the features of a product or software.
     * It represents classes and interfaces that software programs can follow to communicate with each other. An API can be created for applications, libraries, operating systems, etc.
     * ر API (رابط برنامه نویسی برنامه) سندی است که شامل توضیحی در مورد تمام ویژگی های یک محصول یا نرم افزار است.
     * این کلاس ها و رابط هایی را نشان می دهد که برنامه های نرم افزاری برای ارتباط با یکدیگر می توانند دنبال کنند. API را می توان برای برنامه ها ، کتابخانه ها ، سیستم عامل ها و غیره ایجاد کرد.
     */
}
