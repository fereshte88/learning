package com.rad.njavaio.mjavaobjectstream;
/**
 * Java - ObjectStreamClass
 *
 * ObjectStreamClass act as a Serialization descriptor for class. This class contains the name and serialVersionUID of the class.
 * کلاس ObjectStreamClass به عنوان یک توصیف سریال برای کلاس عمل می کند. این کلاس شامل نام و serialVersionUID کلاس است.
 */
/**
 * Methods
 *
 * Class<?> 	forClass()
 * It returns the class in the local VM that this version is mapped to.
 * این کلاس را در VM محلی که این نسخه در آنmapped شده است برمی گرداند.
 * ObjectStreamField 	getField(String name)
 * It gets the field of this class by name.
 * فیلد این کلاس را با نام به دست می آورد.
 * ObjectStreamField[] 	getFields()
 * It returns an array of the fields of this serialization class.
 * این مجموعه ای از فیلد های این کلاس سریال سازی را برمی گرداند.
 * String 	getName()
 * It returns the name of the class described by this descriptor.
 * این نام کلاس را که توسط این توصیف کننده توصیف شده است برمی گرداند.
 * long 	getSerialVersionUID()
 * It returns the serialVersionUID for this class.
 * این سریالVersionUID را برای این کلاس برمی گرداند.
 * **************************************************
 * Static ObjectStreamClass 	lookup(Class<?> cl)
 * It finds the descriptor for a class that can be serialized.
 * این توصیف کننده را برای یک کلاس پیدا می کند که می تواند سریالی شود.
 * Find the descriptor for a class that can be serialized. Creates an ObjectStreamClass instance if one does not exist yet for class.
 * Null is returned if the specified class does not implement java.io.Serializable or java.io.Externalizable.
 * توصیفگر را برای یک کلاس که می تواند سریال شود پیدا کنید. اگر هنوز کلاس برای آن وجود نداشته باشد ، یک نمونه ObjectStreamClass ایجاد می کند.
 * اگر کلاس مشخص شده java.io.Serializable یا java.io.Externalizable را اجرا نکند ، Null برمی گردد.
 * ******************************************************
 * Static ObjectStreamClass 	lookupAny(Class<?> cl)
 * It returns the descriptor for any class, regardless of whether it implements Serializable.
 * این توصیف را برای هر کلاس برمی گرداند ، صرف نظر از اینکه Serializable را پیاده سازی می کند یا خیر.
 * String 	toString()
 * It returns a string describing this ObjectStreamClass.
 * رشته ای را توصیف می کند که این ObjectStreamClass را توصیف می کند.
 */

import java.io.ObjectStreamClass;
import java.util.ArrayList;

public class ObjectStreamClassExample {
    public  ObjectStreamClass objectStreamMethodLookUp(Class c) {

        // creating object stream class for Number
        ObjectStreamClass objectStreamClass = ObjectStreamClass.lookup(c);

        return objectStreamClass;
    }
    public  ObjectStreamClass objectStreamMethodLookUpAny(Class c) {

        ObjectStreamClass objectStreamClass = ObjectStreamClass.lookupAny(c);

        return objectStreamClass;
    }


}
