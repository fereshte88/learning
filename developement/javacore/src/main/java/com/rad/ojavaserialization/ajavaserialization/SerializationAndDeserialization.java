package com.rad.ojavaserialization.ajavaserialization;

/**
 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream. It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
 * The reverse operation of serialization is called deserialization where byte-stream is converted into an object.
 * The serialization and deserialization process is platform-independent, it means you can serialize an object in a platform and deserialize in different platform.
 * For serializing the object, we call the writeObject() method ObjectOutputStream, and for deserialization we call the readObject() method of ObjectInputStream class.
 * We must have to implement the Serializable interface for serializing the object.
 * سریال سازی در جاوا مکانیزمی برای نوشتن وضعیت یک شیء در یک بایت جریان است. این است که عمدتا در فن آوری های Hibernate ، RMI ، JPA ، EJB و JMS استفاده می شود.
 *
 * عملكرد معكوس سريال سازي ، در صورتي كه بيت-جريان به يك شيء تبديل شود ،بنام deserialization شناخته مي شود.
 * روند سریال سازی و deserialization مستقل از بستر نرم افزار است ، به این معنی که می توانید یک شیء را در یک پلتفرم سریال سازی کرده و در پلتفرم مختلف deserialize کنید.
 *
 * برای سریال سازی شیء ، ما متد writeObject () را ObjectOutputStream فراخوانی میکنیم و برای deserialization به روش readObject () از کلاس ObjectInputStream فراخوانی میکنیم.
 *
 * برای سریال سازی شیء باید واسط Serializable را پیاده سازی کنیم.
 */

/**
 * Advantages of Java Serialization
 *
 * It is mainly used to travel object's state on the network (which is known as marshaling).
 * این  عمدتاً برای مسافرت حالت شیء در شبکه (که به نام marshaling معروف است) استفاده می شود.
 */

/**
 * java.io.Serializable interface
 *
 * Serializable is a marker interface (has no data member and method). It is used to "mark" Java classes so that the objects of these classes may get a certain capability.
 * The Cloneable and Remote are also marker interfaces.
 * It must be implemented by the class whose object you want to persist.
 * The String class and all the wrapper classes implement the java.io.Serializable interface by default.
 *
 ذ Serializable یک رابط نشانگر است (هیچ عضو و متد داده ای ندارد).
 برای علامت گذاری کلاسهای جاوا استفاده می شود تا اشیاء این کلاس ها از توانایی خاصی برخوردار شوند. Cloneable و Remote همچنین رابط های نشانگر هستند.

 این باید توسط کلاس اجرا شود که شیء شما می خواهید پایدار بمانید.

 کلاس String و تمام wrapper classes  ، رابط java.io.Serializable را بطور پیش فرض پیاده سازی می کنند.

 * Let's see the example given below:
 *
 *     import java.io.Serializable;
 *     public class Student implements Serializable{
 *      int id;
 *      String name;
 *      public Student(int id, String name) {
 *       this.id = id;
 *       this.name = name;
 *      }
 *     }
 *     In the above example, Student class implements Serializable interface. Now its objects can be converted into stream.
 *     در مثال بالا ، کلاس Student رابط Serializable را پیاده سازی می کند. اکنون اشیاء آن می توانند به جریان تبدیل شوند.
 */

import java.io.*;

/**
 * ObjectOutputStream class
 *
 * The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream.
 * Only objects that support the java.io.Serializable interface can be written to streams.
 *
 کلاس ObjectOutputStream برای نوشتن انواع داده اولیه و اشیاء جاوا در OutputStream استفاده می شود.
 فقط اشیایی که از رابط java.io.Serializable پشتیبانی می کنند ، می توانند برای جریانها نوشته شوند.

 * ObjectInputStream class
 *
 * An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.
 * ب یک ObjectInputStream اشیاء و داده های بدست آمده را با استفاده از یک ObjectOutputStream deserializes می گیرد.
 */
public class SerializationAndDeserialization {
    /**
     * Example of Java Serialization
     *
     * In this example, we are going to serialize the object of Student class. The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object.
     * We are saving the state of the object in the file named f.txt.
     * در این مثال ، قصد داریم سری کلاس Student را به صورت سریالی انجام دهیم. روش writeObject () کلاس ObjectOutputStream عملکرد سریالی سازی شی را فراهم می کند.
     * ما در پرونده ای با نام f.txt وضعیت شی را ذخیره می کنیم.
     */
    public void serialized(){
        try{
            //Creating the object
            Student s1 =new Student(211,"ravi");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }

     class Student implements Serializable {
        int id;
        String name;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    /**
     * Example of Java Deserialization
     *
     * Deserialization is the process of reconstructing the object from the serialized state.
     * It is the reverse operation of serialization. Let's see an example where we are reading the data from a deserialized object.
     * پ Deserialization فرایند بازسازی جسم از حالت سریالی است. این عمل برعکس سریال سازی است. بیایید مثالی را ببینیم که در حال خواندن داده ها از یک deserialized object. هستیم.
     */
    public static void main(String args[]){
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }

    /**
     * Java Serialization with Inheritance (IS-A Relationship)
     *
     * If a class implements serializable then all its sub classes will also be serializable. Let's see the example given below:
     */
    class Person implements Serializable{
        int id;
        String name;
        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    class Student1 extends Person{
        String course;
        int fee;
        public Student1(int id, String name, String course, int fee) {
            super(id,name);
            this.course=course;
            this.fee=fee;
        }
    }
    /**
     * Now you can serialize the Student class object that extends the Person class which is Serializable.
     * Parent class properties are inherited to subclasses so if parent class is Serializable, subclass would also be.
     * اکنون می توانید شیء کلاس Student را که کلاس Person را که Serializable است گسترش دهد ، سریالی سازی کنید.
     * خصوصیات کلاس والدین به زیر کلاس ها به ارث می رسد بنابراین اگر کلاس والدین سریال باشد ، زیر کلاس نیز خواهد بود.
     */

    /**
     * Java Serialization with Aggregation (HAS-A Relationship)
     *
     * If a class has a reference to another class, all the references must be Serializable otherwise serialization process will not be performed.
     * In such case, NotSerializableException is thrown at runtime.
     *
     اگر یک کلاس به کلاس دیگری ارجاع داشته باشد ، تمام منابع باید Serializable باشند ، در غیر این صورت فرآیند سریال سازی انجام نمی شود
     . در چنین حالتی ، NotSerializableException در زمان اجرا پرتاب می شود.
     */
    class Address{
        String addressLine,city,state;
        public Address(String addressLine, String city, String state) {
            this.addressLine=addressLine;
            this.city=city;
            this.state=state;
        }
    }
    class Student3 implements Serializable{
        int id;
        String name;
        Address address;//HAS-A
        public Student3(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    /**
     * Since Address is not Serializable, you can not serialize the instance of Student class.
     * Note: All the objects within an object must be Serializable.
     * از آنجا که آدرس سریال نیست ، نمی توانید نمونه کلاس Student را سریالی کنید.
     * توجه: تمام اشیاء موجود در یک شی باید سریالی شوند.
     */
    /**
     * Java Serialization with the static data member
     *
     * If there is any static data member in a class, it will not be serialized because static is the part of class not object.
     * اگر در کلاس یک عضو داده استاتیک وجود داشته باشد ، آن را به صورت سریالی نمی کند زیرا استاتیک بخشی از کلاس است که مورد استفاده قرار نمی گیرد.
     * Java Serialization with array or collection
     *
     * Rule: In case of array or collection, all the objects of array or collection must be serializable. If any object is not serialiizable, serialization will be failed.
     * قانون: در صورت آرایه یا مجموعه ، تمام اشیاء آرایه یا مجموعه باید سریال شوند. اگر هر شیئی سریالی سازی نباشد ، سریال سازی شکست می خورد.
     * Externalizable in java
     *
     * The Externalizable interface provides the facility of writing the state of an object into a byte stream in compress format. It is not a marker interface.
     *رابط Externalizable امکان نوشتن وضعیت یک شیء را در یک جریان بایت با فرمت فشرده سازی فراهم می کند. این یک رابط نشانگر نیست.
     * The Externalizable interface provides two methods:
     *
     *     public void writeExternal(ObjectOutput out) throws IOException
     *     public void readExternal(ObjectInput in) throws IOException
     */
    /**
     * SerialVersionUID
     *
     * The serialization process at runtime associates an id with each Serializable class which is known as SerialVersionUID.
     * It is used to verify the sender and receiver of the serialized object. The sender and receiver must be the same.
     * To verify it, SerialVersionUID is used. The sender and receiver must have the same SerialVersionUID, otherwise, InvalidClassException will be thrown when you deserialize the object.
     * We can also declare our own SerialVersionUID in the Serializable class. To do so, you need to create a field SerialVersionUID and assign a value to it.
     * It must be of the long type with static and final. It is suggested to explicitly declare the serialVersionUID field in the class and have it private also. For example:
     *
     فرایند سریال سازی در زمان اجرا با هر کلاس Serializable که به عنوان SerialVersionUID شناخته می شود ، شناسه ای را مرتبط می کند.
     برای تأیید فرستنده و گیرنده شیء سریالی استفاده می شود. فرستنده و گیرنده باید یکسان باشند.
     برای تأیید آن ، از SerialVersionUID استفاده می شود. فرستنده و گیرنده باید همان SerialVersionUID را داشته باشند ،
     در غیر این صورت ، وقتی شما بی هدف را هدف قرار دهید ، InvalidClassException پرتاب خواهد شد.
      همچنین می توانید SerialVersionUID خودمان را در کلاس Serializable اعلام کنیم.
     برای انجام این کار ، شما باید یک فیلد SerialVersionUID ایجاد کنید و یک مقدار را به آن اختصاص دهید. باید از نوع طولانی با استاتیک و نهایی باشد.
     پیشنهاد می شود که به طور صریح فیلد serialVersionUID را در کلاس اعلام کرده و آن را نیز خصوصی کنید. مثلا:
     private static final long serialVersionUID=1L;
     */
}
