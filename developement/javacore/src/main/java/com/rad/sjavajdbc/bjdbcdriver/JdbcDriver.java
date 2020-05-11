package com.rad.sjavajdbc.bjdbcdriver;

public class JdbcDriver {
    /**
     * JDBC Driver is a software component that enables java application to interact with the database. There are 4 types of JDBC drivers:
     *درایور JDBC یک جزء نرم افزاری است که برنامه جاوا را قادر می سازد تا با بانک اطلاعاتی ارتباط برقرار کند. 4 نوع درایور JDBC وجود دارد:
     *     JDBC-ODBC bridge driver
     *     Native-API driver (partially java driver)
     *     Network Protocol driver (fully java driver)
     *     Thin driver (fully java driver)
     */
    /**
     * 1) JDBC-ODBC bridge driver
     * The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls.
     * This is now discouraged because of thin driver.
     * درایور پل JDBC-ODBC از درایور ODBC برای اتصال به پایگاه داده استفاده می کند. درایور پل JDBC-ODBC فراخوانی روش JDBC را به تماس های عملکرد ODBC تبدیل می کند.
     * این اکنون به دلیلthin driver دلسرد شده است.
     * In Java 8, the JDBC-ODBC Bridge has been removed.
     * در جاوا 8 ، پل JDBC-ODBC برداشته شده است.
     * Oracle does not support the JDBC-ODBC Bridge from Java 8. Oracle recommends that you use JDBC drivers provided by the vendor of your database instead of the JDBC-ODBC Bridge.
     * اوراکل از JDBC-ODBC Bridge از Java پشتیبانی نمی کند 8. Oracle توصیه می کند که از درایورهای JDBC تهیه شده توسط فروشنده پایگاه داده خود به جای Bridge JDBC-ODBC استفاده کنید.
     * Advantages:
     *     easy to use.
     *     can be easily connected to any database.
     آسان برای استفاده.
     به راحتی به هر بانک اطلاعاتی وصل می شود.
     * Disadvantages:
     *     Performance degraded because JDBC method call is converted into the ODBC function calls.
     *     The ODBC driver needs to be installed on the client machine.
     عملکرد کاهش یافته زیرا تماس با روش JDBC به تماس های عملکرد ODBC تبدیل می شود.
     درایور ODBC باید روی دستگاه مشتری نصب شود.

     */
}
