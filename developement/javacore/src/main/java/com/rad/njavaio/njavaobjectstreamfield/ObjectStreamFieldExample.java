package com.rad.njavaio.njavaobjectstreamfield;

/**
 * Java ObjectStreamField class
 *
 * A description of a Serializable field from a Serializable class. An array of ObjectStreamFields is used to declare the Serializable fields of a class.
 *
 * The java.io.ObjectStreamClass.getField(String name) method gets the field of this class by name.
 *
 شرح یک فیلد Serializable از یک کلاس Serializable. مجموعه ای از ObjectStreamFields برای اعلام فیلد های Serializable یک کلاس استفاده می شود.

 روش java.io.ObjectStreamClass.getField (نام رشته) رشته این کلاس را با نام دریافت می کند.
 */

/**
 * Constructor
 *
 * ObjectStreamField(String name, Class<?> type)
 * It creates a Serializable field with the specified type.
 * یک فیلد Serializable با نوع مشخص ایجاد می کند.
 * ObjectStreamField(String name, Class<?> type, boolean unshared)
 * It creates an ObjectStreamField representing a serializable field with the given name and type.
 * این یک ObjectStreamField ایجاد می کند که یک قسمت سریالی را با نام و نوع داده شده نشان می دهد.
 */

import java.io.ObjectStreamClass;
import java.util.Calendar;

/**
 * Methods
 *
 * int 	compareTo(Object obj)
 * It compares this field with another ObjectStreamField.
 * این قسمت را با دیگر ObjectStreamField مقایسه می کند.
 * String 	getName()
 * It gets the name of this field.
 * نام این قسمت را می گیرد.
 * int 	GetOffset()
 * Offset of field within instance data.
 * Class<?> 	getType()
 * It get the type of the field.
 * char 	getTypeCode()
 * It returns character encoding of field type.
 * String 	getTypeString()
 * It return the JVM type signature.
 * boolean 	isPrimitive()
 * It return true if this field has a primitive type.
 * boolean 	isUnshared()
 * It returns boolean value indicating whether or not the serializable field represented by this ObjectStreamField instance is unshared.
 * protected void 	setOffset(int offset)
 * Offset within instance data.
 * String 	toString()
 * It return a string that describes this field.
 */

public class ObjectStreamFieldExample {
    public ObjectStreamClass objectStreamFieldMethod(Class c) {

        // create a new object stream class for Integers
        ObjectStreamClass osc = ObjectStreamClass.lookupAny(c);
          return osc;

    }
}
