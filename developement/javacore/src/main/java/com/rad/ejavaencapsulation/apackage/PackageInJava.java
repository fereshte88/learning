package com.rad.ejavaencapsulation.apackage;

//https://www.javatpoint.com/package
//A java package is a group of similar types of classes, interfaces and sub-packages.
//Package in java can be categorized in two form, built-in package and user-defined package.
//There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
//پکیج جاوا گروهی از انواع مشابه کلاسها ، رابط ها و زیر پکیج ها است.
//پکیج بندی در جاوا را می توان به دو صورت پکیج داخلی و پکیج تعریف شده توسط کاربر دسته بندی کرد.
//پکیج های داخلی بسیاری از جمله java, lang, awt, javax, swing, net, io, util, sql etc. وجود دارد.
//
//Here, we will have the detailed learning of creating and using user-defined packages.
//Advantage of Java Package:
//1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
//2) Java package provides access protection.
//3) Java package removes naming collision.
// در اینجا ، ما یادگیری دقیق در مورد ایجاد و استفاده از پکیج های تعریف شده توسط کاربر خواهیم داشت.
// مزیت پکیج های جاوا:
// 1) از پکیج جاوا برای طبقه بندی کلاس ها و رابط ها استفاده می شود تا بتوان به راحتی نگهداری کرد.
// 2) پکیج جاوا محافظت از دسترسی را فراهم می کند.
// 3) پکیج جاوا برخورد نامگذاری ها را حذف می کند.
//
//How to access package from another package?
//There are three ways to access the package from oًutside the package.
//1)import package.*:
//If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
//The import keyword is used to make the classes and interface of another package accessible to the current package.
//2)import package.classname:
//If you import package.classname then only declared class of this package will be accessible.
//3)fully qualified name:
//If you use fully qualified name then only declared class of this package will be accessible.
//Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface.
//It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.
//چگونه از پکیج دیگری دسترسی داشته باشیم؟
//سه روش برای دسترسی به پکیج بندی از خارج از بسته وجود دارد.
//1)import package.*:
// اگر از package.*  استفاده می کنید. در این صورت تمام کلاس ها و رابط های این پکیج در دسترس خواهند بود اما به صورت زیر پکیج نیستند.
// کلید واژه import برای ایجاد کلاس ها و رابط پکیج دیگری که در دسترس پکیج فعلی است استفاده می شود.
//2)import package.classname:
//اگر pack.classname را وارد کنید ، فقط کلاس اعلام شده این پکیج در دسترس خواهد بود.
//3)fully qualified name:
// اگر از نام کاملاً واجد شرایطی استفاده می کنید ، فقط کلاس اعلام شده این پکیج در دسترس خواهد بود.
// اکنون نیازی به import نیست. اما شما باید هر بار که به کلاس یا رابط دسترسی دارید ، از نام کاملاً واجد شرایط استفاده کنید.
// معمولاً وقتی استفاده می شود که دو پکیج دارای نام کلاس مشابه باشند ، به عنوان مثال پکیج های java.util و java.sql شامل کلاس Date هستند.
//
//Note: If you import a package, subpackages will not be imported.
//If you import a package, all the classes and interface of that package will be imported excluding the classes and interfaces of the subpackages.
//Hence, you need to import the subpackage as well.
// توجه: اگر پکیج ای را import کنید ، زیر پکیج ها import نمی شوند.
// در صورت import کردن یک پکیج ، تمام کلاس ها و رابط های آن پکیج به استثنای کلاس ها و رابط های زیر پکیج ها import می شوند.
// از این رو ، شما نیاز به import  زیر پکیج ها نیز دارید.
//
//Subpackage in java:
//Package inside the package is called the subpackage. It should be created to categorize the package further.
//Let's take an example, Sun Microsystem has definded a package named java that contains many classes like System, String, Reader, Writer, Socket etc.
//These classes represent a particular group e.g. Reader and Writer classes are for Input/Output operation, Socket and ServerSocket classes are for networking etc and so on.
//So, Sun has subcategorized the java package into subpackages such as lang, net, io etc.
//and put the Input/Output related classes in io package, Server and ServerSocket classes in net packages and so on.
//:زیر پکیج در جاوا
//پکیج بندی داخل پکیج بندی ، زیر پکیج نامیده می شود. باید برای طبقه بندی بیشتر پکیج ها ایجاد شود.
//بیایید مثالی بزنیم ، Sun Microsystem پکیج ای به نام جاوا را تعریف کرده است که شامل کلاس های زیادی مانند System ، String ، Reader ، Writer ، Socket و غیره می باشد.
//این کلاس ها گروه خاصی را به عنوان مثال نشان می دهند. کلاس های Reader و Writer برای عملیات Input / Output است ، کلاس Socket و ServerSocket برای شبکه و غیره و غیره است.
//بنابراین ، Sun پکیج بندی جاوا را در زیر مجموعه هایی مانند lang ، net ، io و غیره طبقه بندی کرده است.
//کلاسهای مربوط به Input / Output را در پکیج های io ، کلاسهای Server و ServerSocket در پکیج net و غیره قرار داده است.
//
//The standard of defining package is domain.company.package e.g. com.javatpoint.bean or org.sssit.dao.
//استاندارد تعریف پکیج ، domain.company.package است به عنوان مثال. com.javatpoint.bean یا org.sssit.dao.
//
public class PackageInJava {
}
