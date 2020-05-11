package com.rad.njavaio.pfilepermission;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/**
 * Java FilePermission Class
 *
 * Java FilePermission class contains the permission related to a directory or file. All the permissions are related with path. The path can be of two types:
 * 1) D:\\IO\\-: It indicates that the permission is associated with all sub directories and files recursively.
 * 2) D:\\IO\\*: It indicates that the permission is associated with all directory and files within this directory excluding sub directories.
 * کلاس FilePermission Java شامل مجوزهای مربوط به یکdirectory or file است. همه مجوزها مربوط به مسیر است. مسیر می تواند از دو نوع باشد:
 * 1) D: \\ IO \\ -: نشان می دهد که اجازه با همه زیر فهرست ها و پرونده ها به صورت بازگشتی همراه است.
 * 2) D: \\ IO \\ *: نشان می دهد که اجازه با کلیه دایرکتوری ها و پرونده های داخل این فهرست همراه است به استثنای زیر دایرکتوری ها.
 */

/**
 * ava FilePermission class declaration
 *
 * Let's see the declaration for Java.io.FilePermission class:
 *
 *     public final class FilePermission extends Permission implements Serializable
 */

/**
 * Java FilePermission class methods
 *
 * int hashCode()
 * It is used to return the hash code value of an object.
 * برای بازگشت مقدار کد هش یک شی استفاده می شود.
 * String getActions()
 * It is used to return the "canonical string representation" of an action.
 * برای بازگرداندن "بازنمایی رشته کانونی" از یک عمل استفاده می شود.
 * boolean equals(Object obj)
 * It is used to check the two FilePermission objects for equality.
 * برای بررسی برابری دو شیء FilePermission استفاده می شود.
 * boolean implies(Permission p)
 * It is used to check the FilePermission object for the specified permission.
 * برای چک کردن شیء FilePermission برای اجازه مشخص شده استفاده می شود.
 * PermissionCollection newPermissionCollection()
 * It is used to return the new PermissonCollection object for storing the FilePermission object.
 * برای برگرداندن شیء جدید PermissonCollection برای ذخیره سازی FilePermission مورد استفاده قرار می گیرد.
 */

public class FilePermissionExample {
    public  PermissionCollection addPermission(String folderPermission ,String fileExclude) throws IOException {

        FilePermission filePermission = new FilePermission(folderPermission, "read");
        PermissionCollection permissionCollection = filePermission.newPermissionCollection();
        permissionCollection.add(filePermission);
        FilePermission file2 = new FilePermission(fileExclude, "write");
        permissionCollection.add(file2);
        return permissionCollection;
    }
}
