package com.rad.ujava8feachers.pparameterreflection;

/**
 * Java provides a new feature in which you can get the names of formal parameters of any method or constructor.
 * The java.lang.reflect package contains all the required classes like Method and Parameter to work with parameter reflection.
 * جاوا ویژگی جدیدی را ارائه می دهد که در آن می توانید نام پارامترهای رسمی هر روش یا سازنده را بدست آورید.
 * بسته java.lang.reflect شامل کلیه کلاسهای مورد نیاز مانند روش و پارامتر برای کار با بازتاب پارامتر است.
 */

/**
 * Method class
 *
 * It provides information about single method on a class or interface. The reflected method may be a class method or an instance method.
 اطلاعات مربوط به روش واحد را در یک کلاس یا رابط ارائه می دهد. روش منعکس شده ممکن است یک روش کلاس یا یک روش نمونه باشد.
 */

/**
 * Method Class methods
 *
 * public boolean equals(Object obj)
 * It compares this Method against the specified object. It returns true if the objects are the same.
 * Two Methods are the same if they were declared by the same class and have the same name and formal parameter types and return type.
 * این روش را با شیء مشخص شده مقایسه می کند. اگر اشیاء یکسان باشند ، برمی گردد. دو روش یکسان هستند اگر توسط یک کلاس اعلام شده باشند و دارای یک نام و انواع پارامتر رسمی و نوع برگشتی باشند.
 *
 * public AnnotatedType getAnnotatedReturnType()
 * It returns an AnnotatedType object that represents the use of a type to specify the return type of the method/constructor.
 *این یک شیء AnnotatedType را نشان می دهد که نشان دهنده استفاده از یک نوع برای مشخص کردن نوع برگشتی متد / سازنده است.
 * public <T extends Annotation> T getAnnotation(Class<T> annotationClass)
 * It returns this element's annotation for the specified type if such an annotation is present otherwise returns null. NullPointerException - if the given annotation class is null
 *اگر چنین حاشیه نویسی وجود داشته باشد در غیر این صورت تهی است. NullPointerException - اگر کلاس حاشیه نویسی داده شده صفر باشد
 * public Annotation[] getDeclaredAnnotations()
 * It returns annotations that are directly present on this element. This method ignores inherited annotations. If there are no annotations directly present on this element, the return value is an array of length 0. The caller of this method is free to modify the returned array. it will have no effect on the arrays returned to other callers.
 *آن حاشیه نویسی را که مستقیماً در این عنصر موجود است ، برمی گرداند. این روش حاشیه نویسی های ارثی را نادیده می گیرد. اگر هیچ یادداشتی به طور مستقیم در مورد این عنصر موجود نباشد ، مقدار بازده آرایه ای از طول 0 است. تماس گیرنده این روش برای تغییر آرایه بازگشتی آزاد است. این هیچ تاثیری در آرایه های برگشتی به تماس گیرندگان دیگر نخواهد داشت.
 * public Class<?> getDeclaringClass()
 * It returns the Class object representing the class or interface that declares the executable represented by this object.
 *این شیء Class را نمایانگر کلاس یا رابط است که عملکردی را نشان می دهد که توسط این جسم اعلام می کند ، برمی گرداند.
 * public Object getDefaultValue()
 * It returns the default value for the annotation member represented by this Method instance.
 *مقدار پیش فرض مربوط به عضو حاشیه نویسی را نشان می دهد که توسط این روش متد ارائه شده است.
 * public Class<?>[] getExceptionTypes()
 * It returns an array of Class objects that represent the types of exceptions declared to be thrown by the underlying executable represented by this object.
 *این مجموعه ای از اشیاء کلاس را نشان می دهد که انواع استثنائاتی را که توسط عامل اجرایی زیر نشان داده شده توسط این شیء پرتاب شده اند ، نشان می دهد
 * public Type[] getGenericExceptionTypes()
 * It returns an array of Type objects that represent the exceptions declared to be thrown by this executable object. It returns an array of length 0 if the underlying executable declares no exceptions in its throws clause. It throws following exceptions: GenericSignatureFormatError - if the generic method signature does not conform to the format specified in The Java Virtual Machine Specification. TypeNotPresentException - if the underlying executable's throws clause refers to a non-existent type declaration. MalformedParameterizedTypeException - if the underlying executable's throws clause refers to a parameterized type that cannot be instantiated for any reason.
 *این مجموعه ای از اشیاء Type را نشان می دهد که استثنائاتی را که توسط این شی اجرایی پرتاب شده است نشان می دهد. این یک آرایه از طول 0 را برمی گرداند اگر عامل اجرایی زیر استثنائی را در بند پرتاب خود اعلام نکرده باشد. این موارد به شرح زیر استثناست: GenericSignatureFormatError - اگر امضای روش کلی با فرمت مشخص شده در مشخصات ماشین مجازی جاوا مطابقت نداشته باشد. TypeNotPresentException - اگر بند پرتاب اجرایی زیربنایی به یک بیانیه نوع غیر وجود اشاره دارد. MalformedParameterizedTypeException - اگر بند پرتاب زیرین اجرایی به یک نوع پارامتری اشاره دارد که به هر دلیلی نمی توان آنرا فاش کرد.
 * public Type[] getGenericParameterTypes()
 * It returns an array of Type objects that represent the formal parameter types. It throws following exceptions: GenericSignatureFormatError - if the generic method signature does not conform to the format specified in The Java Virtual Machine Specification. TypeNotPresentException - if any of the parameter types of the underlying executable refers to a non-existent type declaration. MalformedParameterizedTypeException - if any of the underlying executable's parameter types refer to a parameterized type that cannot be instantiated for any reason.
 *این مجموعه ای از اشیاء Type را نشان می دهد که انواع پارامتر رسمی را نشان می دهد. این موارد به شرح زیر استثناست: GenericSignatureFormatError - اگر امضای روش کلی با فرمت مشخص شده در مشخصات ماشین مجازی جاوا مطابقت نداشته باشد. TypeNotPresentException - در صورت وجود هر یک از انواع پارامترهای اجرایی اصلی ، به بیانیه نوع غیر وجودی اشاره دارد. MalformedParameterizedTypeException - در صورت وجود هر یک از انواع مهم پارامترهای اجرایی ، به یک نوع پارامتری گفته می شود که به هر دلیلی قابل فوریت نیست.
 * public int getModifiers()
 * It returns the Java language modifiers for the executable represented by this object.
 *این اصلاح کننده های زبان جاوا را برای اجرایی ارائه شده توسط این شی برمی گرداند.
 * public String getName()
 * It returns the name of the method represented by this Method object as a String.
 *این نام متد را نشان می دهد که توسط این شیء Method به عنوان یک String باز می گردد.
 * public Annotation[][] getParameterAnnotations()
 * It returns an array of arrays that represent the annotations on the formal and implicit parameters, in declaration order, of the executable represented by this object.
 *این مجموعه ای از آرایه ها را نشان می دهد که حاشیه نویسی در پارامترهای رسمی و ضمنی ، به ترتیب اظهارنامه ، از اجرایی است که توسط این شیء ارائه می شود.
 * public int getParameterCount()
 * It returns the number of formal parameters for the executable represented by this object.
 *این تعداد پارامترهای رسمی را برای اجرایی نمایش داده شده توسط این شی برمی گرداند.
 * public Class<?>[] getParameterTypes()
 * It returns an array of Class objects that represent the formal parameter types. in declaration order, of the executable represented by this object. It returns an array of length 0 if the underlying executable takes no parameters.
 *این مجموعه ای از اشیاء Class را نشان می دهد که انواع پارامتر رسمی را نشان می دهد. به دستور اعلامیه ، از اجرایی که توسط این شیء ارائه شده است. این یک آرایه از طول 0 را برمی گرداند اگر عامل اجرایی زیرین پارامتری نداشته باشد.
 * public Class<?> getReturnType()
 * It returns a Class object that represents the formal return type of the method represented by this Method object.
 *این یک شی کلاس را نشان می دهد که نوع بازگشت رسمی متدی را نشان می دهد که توسط این شیء متد ارائه شده است.
 * public TypeVariable<Method>[] getTypeParameters()
 * It returns an array of TypeVariable objects that represent the type variables declared by the generic declaration represented by this GenericDeclaration object, in declaration order. It throws GenericSignatureFormatError, if the generic signature of this generic declaration does not conform to the format specified in The Java Virtual Machine Specification
 *این مجموعه ای از اشیاء TypeVariable را نشان می دهد که متغیرهای نوع اعلام شده توسط بیانیه عمومی که توسط این شی GenericDeclaration ارائه شده است ، به ترتیب اظهارنامه باز می گردانند. این GenericSignatureFormatError را پرتاب می کند ، اگر امضای عمومی این بیانیه عمومی با فرمت مشخص شده در مشخصات ماشین مجازی جاوا مطابقت نداشته باشد.
 * public int hashCode()
 * It returns a hashcode for this Method. The hashcode is computed as the exclusive-or of the hashcodes for the underlying method's declaring class name and the method's name.
 * این یک کدک hashcode برای این روش بر می گرداند. کد هشک به عنوان منحصر به فرد یا کد hashcodes برای نام کلاس اعلامیه کلاس و نام روش محاسبه می شود.
 * public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
 * It invokes the underlying method represented by this Method object, on the specified object with the specified parameters. If the underlying method is static, the specified obj argument is ignored. It may be null. If the number of formal parameters required by the underlying method is 0, the supplied args array may be of length 0 or null. If the underlying method is an instance method, it is invoked using dynamic method lookup as documented in The Java Language Specification. If the underlying method is static, the class that declared the method is initialized if it has not already been initialized. If the method completes normally, the value it returns is returned to the caller of invoke.
 *این روش اصلی را که توسط این شیء متد ارائه شده است ، روی شیء مشخص شده با پارامترهای مشخص شده فراخوانی می کند. اگر روش زیر استاتیک باشد ، آرگومان اعتراض مشخص شده نادیده گرفته می شود. ممکن است تهی باشد. اگر تعداد پارامترهای رسمی مورد نیاز با روش زیر 0 باشد ، آرایه args ارائه شده ممکن است از طول 0 یا صفر باشد. اگر روش زیر یک روش نمونه است ، با استفاده از جستجوی روش پویا همانطور که در مشخصات زبان جاوا ثبت شده است ، فراخوانی می شود. اگر روش زیر استاتیک باشد ، کلاس که اعلام کرد این روش در صورتی که از قبل تنظیم نشده باشد ، اولیه می شود. اگر این روش به طور عادی تکمیل شود ، مقدار بازگشتی آن به تماس گیرنده فراخوان برمی گردد.
 *
 * public boolean isBridge()
 * It returns true if this method is a bridge method. otherwise returns false.
 *اگر این روش یک روش پل باشد صادق است. در غیر این صورت غلط برمی گردد.
 * public boolean isDefault()
 * It returns true if this method is a default method otherwise returns false. A default method is a public non-abstract instance method, that is, a non-static method with a body, declared in an interface type.
 *اگر این روش یک روش پیش فرض باشد در غیر این صورت نادرست باز می گردد. یک روش پیش فرض یک روش نمونه غیر انتزاعی عمومی است ، یعنی یک روش غیر استاتیک با بدن ، که در نوع رابط اعلام می شود.
 * public boolean isSynthetic()
 * It returns true if this executable is a synthetic construct; returns false otherwise.
 *اگر این سازه ساختاری مصنوعی باشد ، صادق است. در غیر این صورت کاذب برمی گردد.
 * public boolean isVarArgs()
 * It returns true if this executable was declared to take a variable number of arguments; returns false otherwise.
 *اگر این عامل اجرایی تعداد متغیرهای آرگومان را تصدیق کند ، برمی گردد. در غیر این صورت کاذب برمی گردد.
 * public String toGenericString()
 * It returns a string describing this Method, including type parameters.
 *رشته ای را توصیف می کند که این روش را توصیف می کند ، از جمله پارامترهای نوع.
 * public String toString()
 * It returns a string.
 * این رشته را برمی گرداند.
 */

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Parameter class
 *
 * Parameter class provides information about method parameters, including its name and modifiers. It also provides an alternate means of obtaining attributes for the parameter.
 * کلاس پارامتر اطلاعاتی در مورد پارامترهای متد ، از جمله نام و تغییر دهنده آن ارائه می دهد. همچنین یک وسیله جایگزین برای بدست آوردن ویژگی های پارامتر فراهم می کند.
 * Parameter Methods
 * Methods 	Description
 * public boolean equals(Object obj) 	It compares based on the executable and the index.
 * public AnnotatedType getAnnotatedType() 	It returns an AnnotatedType object that represents the use of a type to specify the type of the formal parameter represented by this Parameter.
 * public <T extends Annotation> T getAnnotation(Class<T> annotationClass) 	It returns this element's annotation for the specified type if such an annotation is present, else null. It throws NullPointerException, if the given annotation class is null.
 * public Annotation[] getAnnotations() 	It returns annotations that are present on this element. If there are no annotations present on this element, the return value is an array of length 0.
 * public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) 	It returns annotations that are associated with this element. If there are no annotations associated with this element, the return value is an array of length 0. The difference between this method and AnnotatedElement.getAnnotation(Class) is that this method detects if its argument is a repeatable annotation type (JLS 9.6), and if so, attempts to find one or more annotations of that type by "looking through" a container annotation. It throws NullPointerException, if the given annotation class is null.
 * public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) 	It returns this element's annotation for the specified type if such an annotation is directly present, else null. This method ignores inherited annotations. It throws NullPointerException, if the given annotation class is null.
 * public Annotation[] getDeclaredAnnotations() 	It returns annotations that are directly present on this element. This method ignores inherited annotations. If there are no annotations directly present on this element, the return value is an array of length 0.
 * public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) 	It returns this element's annotations for the specified type if such annotations are either directly present or indirectly present. This method ignores inherited annotations. If there are no specified annotations directly or indirectly present on this element, the return value is an array of length 0. The difference between this method and AnnotatedElement.getDeclaredAnnotation(Class) is that this method detects if its argument is a repeatable annotation type (JLS 9.6), and if so, attempts to find one or more annotations of that type by "looking through" a container annotation if one is present. The caller of this method is free to modify the returned array; it will have no effect on the arrays returned to other callers. It throws NullPointerException, if the given annotation class is null
 * public Executable getDeclaringExecutable() 	It returns the Executable which declares this parameter.
 * public int getModifiers() 	It returns the modifier flags for the parameter represented by this Parameter object.
 * public String getName() 	It returns the name of the parameter. If the parameter's name is present, this method returns the name provided by the class file. Otherwise, this method synthesizes a name of the form argN, where N is the index of the parameter in the descriptor of the method which declares the parameter.
 * public Type getParameterizedType() 	It returns a Type object that identifies the parameterized type for the parameter represented by this Parameter object.
 * public Class<?> getType() 	It returns a Class object that identifies the declared type for the parameter represented by this Parameter object.
 * public int hashCode()mul int arg0 int arg1 add int arg0 int arg1 	It returns a hash code based on the executable's hash code and the index.
 * public boolean isImplicit() 	It returns true if this parameter is implicitly declared in source code. Otherwise, returns false.
 * public boolean isNamePresent() 	It returns true if the parameter has a name according to the class file, otherwise, returns false.
 * public boolean isSynthetic() 	It returns true if this parameter is neither implicitly nor explicitly declared in source code. Otherwise returns false.
 * public boolean isVarArgs() 	It returns true if this parameter represents a variable argument list; returns false otherwise.
 * public String toString() 	It returns a string describing this parameter. The format is the modifiers for the parameter, if any, in canonical order as recommended by The Java? Language Specification.
 */
class Calculate {
    int add(int a, int b){
        return (a+b);
    }
    int mul(int a, int b){
        return (b*a);
    }
}
public class ParameterReflectionExample {
    public static void main(String[] args) {
        // Creating object of a class
        Calculate calculate = new Calculate();
        // instantiating Class class
        Class cls = calculate.getClass();
        // Getting declared methods inside the Calculate class
        Method[] method = cls.getDeclaredMethods(); // It returns array of methods
        // Iterating method array
        for (Method method2 : method) {
            System.out.println(method2.getName());    // getting name of method
            // Getting parameters of each method
            Parameter parameter[] = method2.getParameters(); // It returns array of parameters
            // Iterating parameter array
            for (Parameter parameter2 : parameter) {
                System.out.println("" + parameter2.getParameterizedType()); // returns type of parameter
                System.out.println("" + parameter2.getName()+ " ** "+ parameter2.isImplicit()); // returns parameter name
            }
            System.out.println();
        }
    }
}