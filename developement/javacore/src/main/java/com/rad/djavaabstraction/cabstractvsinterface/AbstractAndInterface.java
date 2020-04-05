package com.rad.javacore.djavaabstraction.cabstractvsinterface;

//Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods.
//Abstract class and interface both can't be instantiated.
//But there are many differences between abstract class and interface that are given below.
//کلاس انتزاعی و رابط برای هر دو برای دستیابی به انتزاع مورد استفاده قرار می گیرند که می توانیم روشهای انتزاعی را اعلام کنیم.
//کلاس و رابط هر دو را نمی توان نمونه گیری کرد.
//اما تفاوتهای زیادی بین کلاس انتزاعی و رابط وجود دارد که در زیر آورده شده است.
//
//1) Abstract class can have abstract and non-abstract methods.
// Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
//2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
//3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
//4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
//5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
//6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
//7) An abstract class can be extended using keyword "extends".	An interface can be implemented using keyword "implements".
//8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
//1) کلاس چکیده می تواند دارای روشهای انتزاعی و غیر انتزاعی باشد.
// رابط فقط می تواند روشهای انتزاعی داشته باشد. از جاوا 8 ، رابط می تواند روش های پیش فرض و استاتیک نیز داشته باشد.
// 2) کلاس چکیده از ارث چندگانه پشتیبانی نمی کند. رابط از وراثت چندگانه پشتیبانی می کند.
// 3) کلاس چکیده می تواند متغیرهای نهایی ، غیر نهایی ، استاتیک و غیر استاتیک داشته باشد. رابط فقط متغیرهای استاتیک و نهایی دارد.
// 4) کلاس چکیده می تواند اجرای رابط را فراهم کند. رابط نمی تواند اجرای کلاس انتزاعی را فراهم کند.
// 5) کلمه کلیدی abstract برای اعلام کلاس انتزاعی استفاده می شود. کلمه کلیدی interface برای اعلام رابط استفاده می شود.
// 6) یک کلاس انتزاعی می تواند کلاس جاوا دیگری را extend کند و چندین رابط جاوا را پیاده سازی کند. یک رابط فقط یک رابط جاوا دیگر می تواند گسترش دهد.
// 7) یک کلاس انتزاعی با استفاده از کلید واژه "extends" قابل extend است. رابط با استفاده از کلید واژه "implements" قابل پیاده سازی است.
// 8) یک کلاس انتزاعی جاوا می تواند اعضای کلاس مانند خصوصی ، محافظت شده و غیره داشته باشد. اعضای یک رابط جاوا به طور پیش فرض عمومی هستند.
public class AbstractAndInterface {
}
