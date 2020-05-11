package com.rad.ljavamultithreading.pgarbagecollection;

/**
 * Java Garbage Collection
 * In java, garbage means unreferenced objects.
 * Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.
 * To do so, we were using free() function in C language and delete() in C++.
 * But, in java it is performed automatically. So, java provides better memory management.
 در جاوا ، زباله به معنای اشیاء غیر مرجع است.
 جمع آوری زباله فرآیند بازیابی حافظه استفاده نشده به طور خودکار است. به عبارت دیگر ، راهی برای از بین بردن اشیاء بلااستفاده است.
 برای انجام این کار ، ما از تابع () free در زبان C استفاده کرده و ()delete را در C ++  استفاده می کنیم.
 اما ، در جاوا به صورت خودکار انجام می شود. بنابراین ، جاوا مدیریت بهتر حافظه را فراهم می کند.
 */

/**
 * Advantage of Garbage Collection
 *     It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
 *     It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
 *     مزیت مجموعه زباله
 *      این باعث می شود حافظه جاوا کارآمد باشد زیرا جمع آوری زباله اشیای غیر ارجاعی را از حافظه پشته خارج می کند.
 *      این کار به طور خودکار توسط جمع آوری زباله (بخشی از JVM) انجام می شود ، بنابراین نیازی به تلاش اضافی نداریم.
 */

/**
 * How can an object be unreferenced?
 * There are many ways:
 *     By nulling the reference
 *     By assigning a reference to another
 *     By anonymous object etc.
 *     چگونه می توان یک شیء را ارجاع نداد؟
 * راه های زیادی وجود دارد:
 *      با ابطال مرجع
 *      با اختصاص مرجع به دیگری
 *      توسط یک شیء ناشناس و غیره
 */

/**
 * 1) By nulling a reference:
 *     Employee e=new Employee();
 *     e=null;
 *
 * 2) By assigning a reference to another:
 *     Employee e1=new Employee();
 *     Employee e2=new Employee();
 *     e1=e2;//now the first object referred by e1 is available for garbage collection
 *
 * 3) By anonymous object:
 *     new Employee();
 */

/**
 * finalize() method
 * The finalize() method is invoked each time before the object is garbage collected.
 * This method can be used to perform cleanup processing. This method is defined in Object class as:
 *متد () finalize هر بار قبل از جمع آوری زباله مورد استفاده قرار می گیرد. از این متد می توان برای انجام پردازش پاکسازی استفاده کرد. این روش در کلاس Object تعریف شده است:
 *     protected void finalize(){}
 * Note: The Garbage collector of JVM collects only those objects that are created by new keyword.
 * So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).
 * توجه: جمع آوری زباله JVM فقط آن دسته از اشیایی را که با کلمه کلیدی جدید ایجاد می شوند ، جمع آوری می کند.
 * بنابراین اگر شما هیچ شیء را بدون جدید ایجاد کرده اید می توانید از متد finalize برای انجام پردازش پاکسازی (از بین بردن اشیاء باقیمانده) استفاده کنید.
 */

/**
 * gc() method
 * The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.
 *
 از متد gc () برای فراخوانیgarbage collector  برای انجام پردازش پاکسازی استفاده می شود. gc () در کلاسهای System و Runtime یافت می شود.
 public static void gc(){}

 Note: Garbage collection is performed by a daemon thread called Garbage Collector(GC). This thread calls the finalize() method before object is garbage collected.
 توجه: جمع آوری زباله توسط نخی به نام Garbage Collector (GC) انجام می شود. این thread قبل از جمع آوری زباله شی ، متد  () finalize  را فراخوانی می کند.
 */
public class GarbageCollectionSample {
    public void finalize(){System.out.println("object is garbage collected");}
    public static void main(String args[]){
        GarbageCollectionSample s1=new GarbageCollectionSample();
        GarbageCollectionSample s2=new GarbageCollectionSample();
        s1=null;
        s2=null;
        System.gc();
    }
}
//Note: Neither finalization nor garbage collection is guaranteed.