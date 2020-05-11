package com.rad.ujava8feachers.nparallelarraysort;

/**
 * Java provides a new additional feature in Array class which is used to sort array elements parallel.New methods has added to java.util.
 * Arrays package that use the JSR 166 Fork/Join parallelism common pool to provide sorting of arrays in parallel.
 * The methods are called parallelSort() and are overloaded for all the primitive data types and Comparable objects.
 * جاوا ویژگی جدید دیگری را در کلاس Array ارائه می دهد که برای مرتب سازی عناصر آرایه به صورت موازی استفاده می شود.
 * روش های جدید به بسته java.util.Arays اضافه شده است که از استخر مشترک JSR 166 Fork / Join parallelism استفاده می کند تا مرتب سازی آرایه ها به صورت موازی انجام شود.
 * روش ها paralSort () نامیده می شوند و برای کلیه انواع داده های اولیه و اشیاء قابل مقایسه ، بارگیری می شوند.
 */

import java.util.Arrays;

/**
 * The following table contains Arrays overloaded sorting methods.
 *
 * public static void parallelSort(byte[] a)
 * It sorts the specified array into ascending numerical order.
 *این مجموعه آرایه مشخص شده را به ترتیب عددی صعودی مرتب می کند.
 * public static void parallelSort(byte[] a, int fromIndex, int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive.
 * If fromIndex == toIndex, the range to be sorted is empty.
 *محدوده مشخص شده این آرایه را به ترتیب عددی صعودی مرتب می کند. دامنه مورد نظر برای مرتب سازی از نمایه از Index ، شامل ، تا شاخص toIndex ، منحصر به فرد گسترش می یابد.
 *  اگر fromIndex == toIndex باشد ، دامنه مرتب سازی خالی است.
 * public static void parallelSort(char[] a)
 * It sorts the specified array into ascending numerical order.
 *این مجموعه آرایه مشخص شده را به ترتیب عددی صعودی مرتب می کند.
 * public static void parallelSort(char[] a, int fromIndex, int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty.
 *محدوده مشخص شده این آرایه را به ترتیب عددی صعودی مرتب می کند. دامنه مورد نظر برای مرتب سازی از نمایه از Index ، شامل ، تا شاخص toIndex ، منحصر به فرد گسترش می یابد. اگر ازIndex == toIndex باشد ، دامنه مرتب سازی خالی است.
 * public static void parallelSort(double[] a)
 * It sorts the specified array into ascending numerical order.
 *
 * public static void parallelSort(double[] a, int fromIndex, int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty.
 *
 * public static void parallelSort(float[] a)
 * It sorts the specified array into ascending numerical order.
 *
 * public static void parallelSort(float[] a, int fromIndex, int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty.
 *
 * public static void parallelSort(int[] a)
 * It sorts the specified array into ascending numerical order.
 *
 * public static void parallelSort(int[] a,int fromIndex, int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty.
 *
 * public static void parallelSort(long[] a)
 * It sorts the specified array into ascending numerical order.
 *
 * public static void parallelSort(long[] a, int fromIndex, int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty.
 *
 * public static void parallelSort(short[] a)
 * It sorts the specified array into ascending numerical order.
 *
 * public static void parallelSort(short[] a,int fromIndex,int toIndex)
 * It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty.
 *
 * public static <T extends Comparable<? super T>> void parallelSort(T[] a)
 * Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
 * All elements in the array must implement the Comparable interface.
 * Furthermore, all elements in the array must be mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the array).
 * \با توجه به ترتیب طبیعی عناصر آن ، آرایه مشخص شده اشیاء را به ترتیب صعودی مرتب می کند. تمام عناصر موجود در آرایه باید رابط مقایسه ای را پیاده سازی کنند. علاوه بر این ، تمام عناصر موجود در آرایه باید با یکدیگر قابل مقایسه باشند (یعنی e1.compareTo (e2) نباید یک کلاس ClassCastException را برای هر عنصر e1 و e2 در آرایه پرتاب کند).
 * public static <T7gt; void parallelSort(T[] a,Comparator<? super T> cmp)
 * It sorts the specified array of objects according to the order induced by the specified comparator.
 * All elements in the array must be mutually comparable by the specified comparator (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the array).
 * این مجموعه آرایه های مشخص شده را مطابق ترتیب ناشی از مقایسه کننده مرتب می کند. کلیه عناصر موجود در آرایه باید با یکدیگر مقایسه شوند (یعنی c.compare (e1 ، e2) نباید یک کلاس ClassCastException را برای هر عنصر e1 و e2 در آرایه پرتاب کند).
 *
 * public static <T extends Comparable<? super T>> void parallelSort(T[] a,int fromIndex, int toIndex)
 * It sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements. The range to be sorted extends from index fromIndex, inclusive, to index toIndex, exclusive. (If fromIndex==toIndex, the range to be sorted is empty.) All elements in this range must implement the Comparable interface. Furthermore, all elements in this range must be mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the array).
 *این محدوده مشخص شده از مجموعه مشخص شده اشیاء را طبق ترتیب طبیعی عناصر آن مرتب می کند. دامنه مورد نظر برای مرتب سازی از نمایه از Index ، شامل ، به فهرست toIndex ، منحصر به فرد گسترش می یابد. (اگر ازIndex == toIndex باشد ، دامنه قابل مرتب سازی خالی است.) همه عناصر موجود در این محدوده باید رابط مقایسه را پیاده سازی کنند. علاوه بر این ، تمام عناصر موجود در این محدوده باید با یکدیگر قابل مقایسه باشند (یعنی e1.compareTo (e2) نباید یک کلاس ClassCastException را برای هر عنصر e1 و e2 در آرایه پرتاب کند).
 * public static <T> void parallelSort(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp)
 * It sorts the specified range of the specified array of objects according to the order induced by the specified comparator. The range to be sorted extends from index fromIndex, inclusive, to index toIndex, exclusive. (If fromIndex==toIndex, the range to be sorted is empty.) All elements in the range must be mutually comparable by the specified comparator (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the range).
 این محدوده مشخص شده از آرایه مشخص شده اشیاء را طبق ترتیب ناشی از مقایسه کننده مرتب می کند. دامنه مورد نظر برای مرتب سازی از نمایه از Index ، شامل ، به فهرست toIndex ، منحصر به فرد گسترش می یابد. (اگر ازIndex == toIndex باشد ، دامنه ای که باید مرتب شود خالی است.) کلیه عناصر این دامنه باید با یک مقایسه کننده مشخص شده قابل مقایسه باشند (یعنی c.compare (e1 ، e2) نباید یک ClassCastException را برای هر عنصر e1 پرتاب کند. و e2 در محدوده).

 */
public class ParallelArraySorting {
    public static void main(String[] args) {
        // Creating an integer array
        int[] arr = {5,8,1,0,6,9};
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }

        // Sorting array elements parallel
        Arrays.parallelSort(arr);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("***********");
        // Creating an integer array
        int[] arr2 = {5,8,1,0,6,9,50,-3};
        // Iterating array elements
        for (int i : arr2) {
            System.out.print(i+" ");
        }
        // Sorting array elements parallel and passing start, end index
        Arrays.parallelSort(arr2,0,4);
        System.out.println("\nArray elements after sorting");
        // Iterating array elements
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
}
