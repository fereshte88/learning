package com.rad.ujava8feachers.estreamapi;

/**
 * Java provides a new additional package in Java 8 called java.util.stream.
 * This package consists of classes, interfaces and enum to allows functional-style operations on the elements.
 * You can use stream by importing java.util.stream package.
 *جاوا بسته جدید دیگری را در Java 8 با نام java.util.stream ارائه می دهد. این بسته از کلاس ها ، رابط ها و enum تشکیل شده است تا عملیات به سبک عملکردی روی عناصر امکان پذیر باشد.
 * با وارد کردن بسته java.util.stream می توانید از جریان استفاده کنید.
 * Stream provides following features:
 *
 *     Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
 *     جریان عناصر را ذخیره نمی کند. آن را به سادگی عناصر را از منبع مانند ساختار داده ، یک آرایه یا کانال I / O از طریق خط لوله ای از عملیات محاسباتی انتقال می دهد.
 *     Stream is functional in nature. Operations performed on a stream does not modify it's source.
 *     For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
 *       جریان در طبیعت کاربردی است. عملیات انجام شده بر روی یک جریان منبع آن را تغییر نمی دهد.
 *       به عنوان مثال ، فیلتر کردن یک جریان به دست آمده از یک مجموعه ، به جای حذف عناصر از مجموعه منبع ، جریان جدیدی را بدون عناصر فیلتر شده تولید می کند.
 *     Stream is lazy and evaluates code only when required.
 *      جریان تنبل است و کد را تنها در صورت لزوم ارزیابی می کند.
 *     The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
 * عناصر یک جریان فقط یک بار در طول زندگی یک جریان مشاهده می شوند. مانند Iterator ، باید جریان جدیدی برای مرور مجدد همان عناصر منبع ایجاد شود.
 * You can use stream to filter, collect, print, and convert from one data structure to other etc. In the following examples, we have apply various operations with the help of stream.
 * می توانید از فیلتر برای جمع آوری ،  چاپ و تبدیل از یک ساختار داده به داده های دیگر استفاده کنید. در مثال های زیر ، ما عملیات مختلفی را با کمک جریان اعمال کرده ایم.
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class JavaStreamExample {
    String result="";
    //*********************************************************************
    /**
     * Java Example: Filtering Collection without using Stream
     *
     * In the following example, we are filtering data without using stream. This approach we are used before the stream package was released.
     */
    public String withoutStream(List<Product> productsList) {
        String price = "";
        for(Product product: productsList){
            // filtering data of list
            if(product.price<30000){
                price+=product.price+",";
            }
        }
        return price;
    }
    //*********************************************************************
    /**
     * Java Stream Example: Filtering Collection by using Stream
     *
     * Here, we are filtering data by using stream. You can see that code is optimized and maintained. Stream provides fast execution.
     * در اینجا ، ما با استفاده از جریان در حال فیلتر کردن داده ها هستیم. مشاهده می کنید که کد بهینه شده و نگهداری می شود. جریان اجرای سریع را فراهم می کند.
     */
    public String withStream(List<Product> productsList) {
        String priceString = (productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p-> String.valueOf(p.price))        // fetching price
                .collect(Collectors.joining(","))); // collecting as list
        return priceString;
    }
    //*********************************************************************
    /**
     * Java Stream Iterating Example
     *
     * You can use stream to iterate any number of times. Stream provides predefined methods to deal with the logic you implement.
     * In the following example, we are iterating, filtering and passed a limit to fix the iteration.
     * برای تکرار هر تعداد بار می توانید از جریان استفاده کنید.
     * جریان متدهای از پیش تعریف شده برای مقابله با منطقی را که اجرا می کنید فراهم می کند. در مثال زیر ، ما در حال تکرار ، فیلتر کردن هستیم و محدودیتی را برای رفع تکرار عبور داده ایم.
     */
    public String iterateExample(int i){
        this.result="";
        Stream.iterate(1, element->element+1)
                .filter(element->element%i==0)
                .limit(i)
                .forEach(item->this.append(String.valueOf(item)));
        return this.result;
    }
    public  void append(String s){
        this.result +=s+",";
    }
    //*********************************************************************
    /**
     * Java Stream Example: Filtering and Iterating Collection
     *
     * In the following example, we are using filter() method. Here, you can see code is optimized and very concise.
     * در مثال زیر از متد filter()  استفاده می کنیم. در اینجا می توانید کد را بهینه و بسیار مختصر ببینید.
     */
    public String filterExample(List<Product> productsList) {
        this.result="";
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> this.append(product.name));
        return this.result;
    }
    //*********************************************************************
    /**
     * Java Stream Example : reduce() Method in Collection
     *
     * This method takes a sequence of input elements and combines them into a single summary result by repeated operation.
     * For example, finding the sum of numbers, or accumulating elements into a list.
     *
     * In the following example, we are using reduce() method, which is used to sum of all the product prices.
     * این روش دنباله ای از عناصر ورودی را در بر می گیرد و با استفاده از عملکرد مکرر ، آنها را به یک نتیجه مختصر تبدیل می کند. به عنوان مثال ، یافتن تعداد اعداد ، یا جمع آوری عناصر در یک لیست.
     *
     * در مثال زیر ، ما از روش کاهش () استفاده می کنیم ، که برای جمع بندی تمام قیمت های محصول استفاده می شود.
     */
    public Float reduceExample(List<Product> productsList) {
        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        return totalPrice /totalPrice2;

    }
    //*********************************************************************
    /**
     * Java Stream Example: Sum by using Collectors Methods
     *
     * We can also use collectors to compute sum of numeric values. In the following example, we are using Collectors class and it?s specified methods to compute sum of all the product prices.
     * همچنین می توانیم از جمع کننده ها برای محاسبه مجموع مقادیر عددی استفاده کنیم. در مثال زیر ، ما از کلاس Collectors استفاده می کنیم و برای محاسبه مبلغ کل قیمت محصول از روش های مشخص شده استفاده می کند.
     */
    public double sumExample(List<Product> productsList) {
        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        return totalPrice3;
    }
    //*********************************************************************
    /**
     * Java Stream Example: Find Max and Min Product Price
     *
     * Following example finds min and max product price by using stream. It provides convenient way to find values without using imperative approach.
     * مثال زیر حداقل و حداکثر قیمت محصول را با استفاده از جریان می یابد. این روش مناسب برای یافتن مقادیر بدون استفاده از رویکرد ضروری است.
     *
     */
    public String minMaxExample(List<Product> productsList) {
        // max() method to get max Product price
        Product productA = productsList.stream()
                .max((product1, product2)-> product1.price > product2.price ? 1: -1).get();
        // min() method to get min Product price
        Product productB = productsList.stream()
                .max((product1, product2)->
                        product1.price < product2.price ? 1: -1).get();
        return "Max is : "+String.valueOf(productA.price) +" Min is : "+String.valueOf(productB.price);
    }
    //*********************************************************************
    /**
     * Java Stream Example : Convert List into Map
     */
    public Map<Integer,String>  convertListToMap(List<Product> productsList ) {
        // Converting Product List into a Map
        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));

        System.out.println(productPriceMap);
        return productPriceMap;
    }
    //*********************************************************************
    /**
     * Method Reference in stream
     */
    public List<Float> methodReferencInStrem(List<Product> productsList ) {
        List<Float> productPriceList =
                productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);
        return productPriceList;
    }
    //*********************************************************************
    /**
     * 1	boolean allMatch(Predicate<? super T> predicate)
     * It returns all elements of this stream which match the provided predicate. If the stream is empty then true is returned and the predicate is not evaluated.
     * این عناصر این جریان را که مطابق با گزاره ارائه شده است برمی گرداند. اگر جریان خالی باشد ، درست استرداد می شود و predicate ارزیابی نمی شود.
     * Where, T is the type of the input to the predicate
     * and the function returns true if either all elements
     * of the stream match the provided predicate or
     * the stream is empty, otherwise false.
     *
     */
    public boolean allMatchExample(List<Product> productsList) {
        boolean answer = productsList.stream().allMatch(product -> product.id > 2);
        return answer;
    }

/**
 * 2	boolean anyMatch(Predicate<? super T> predicate)
 * It returns any element of this stream that matches the provided predicate. If the stream is empty then false is returned and the predicate is not evaluated.
 * این عنصر این جریان را که مطابق با گزاره ارائه شده است ، برمی گرداند. اگر جریان خالی باشد ، کاذب بازگردانده می شود و محمول ارزیابی نمی شود.
 * Where, T is the type of the input to the predicate
 * and the function returns true if any elements of
 * the stream match the provided predicate,
 * otherwise false.
 */
public boolean anyMatchExample(List<Product> productsList) {
    boolean answer = productsList.stream().anyMatch(product -> product.price > 30000f);
    return answer;
}
/**
 * 3	static <T> Stream.Builder<T> builder()
 * It returns a builder for a Stream.
 * این سازنده را برای یک جریان باز می گرداند.
 */
public  String streamBuilderExample(){
    // Using Stream builder()
    Stream.Builder<String> builder = Stream.builder();

    // Adding elements in the stream of Strings
    Stream<String> stream = builder.add("Geeks")
            .add("for")
            .add("Geeks")
            .add("GeeksQuiz")
            .build();

    // Displaying the elements in the stream
    return stream.collect(Collectors.joining(","));
}
 /**
 * 4	<R,A> R collect(Collector<? super T,A,R> collector)
 * It performs a mutable reduction operation on the elements of this stream using a Collector.
 * A Collector encapsulates the functions used as arguments to collect(Supplier, BiConsumer, BiConsumer),
 * allowing for reuse of collection strategies and composition of collect operations such as multiple-level grouping or partitioning.
 * با استفاده از یک جمع کننده ، یک عملیات کاهش قابل تغییر روی عناصر این جریان را انجام می دهد.
 * جمع کننده توابع مورد استفاده به عنوان آرگومان را برای جمع آوری (تأمین کننده ، BiConsumer ، BiConsumer) کپی می کند
 * و امکان استفاده مجدد از استراتژی های جمع آوری و ترکیب عملیات جمع آوری مانند گروه بندی چند سطح یا پارتیشن بندی را فراهم می کند.
 */
 public  List<String> collectExample(List<Product> productsList) {
     List<String> names = productsList
             .stream()
             .map(product -> product.name)
             .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
     return names;
 }
 /**
  * 5	<R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
 * It performs a mutable reduction operation on the elements of this stream.
 * A mutable reduction is one in which the reduced value is a mutable result container, such as an ArrayList,
 * and elements are incorporated by updating the state of the result rather than by replacing the result.
 * این عمل کاهش قابل تغییر روی عناصر این جریان را انجام می دهد.
 * کاهش قابل تغییر جهشی است که در آن مقدار کاهش یافته ، یک ظروف نتیجه قابل تغییر است ، مانند یک ArrayList ، و عناصر با به روز کردن وضعیت نتیجه و نه با جایگزین کردن نتیجه ترکیب می شوند.
 */

 /**
  * 6	static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 * It creates a lazily concatenated stream whose elements are all the elements of the first stream followed by all the elements of the second stream.
 * The resulting stream is ordered if both of the input streams are ordered, and parallel if either of the input streams is parallel.
 * When the resulting stream is closed, the close handlers for both input streams are invoked.
 * این یک جریان تنبلی مختصر ایجاد می کند که عناصر آن همه عناصر جریان اول هستند که توسط همه عناصر جریان دوم دنبال می شوند.
 * در صورت سفارش هر دو جریان ورودی ، جریان به دست آمده سفارش داده می شود ، و اگر هر یک از جریان های ورودی موازی باشد ، موازی است.
 * هنگامی که جریان بدست آمده بسته شود ، کنترل کننده های نزدیک هر دو جریان ورودی فراخوانی می شوند.
  */
 public String concatExample()
 {

     // Creating more than two Streams
     Stream<String> stream1 = Stream.of("Geeks");
     Stream<String> stream2 = Stream.of("GeeksQuiz");
     Stream<String> stream3 = Stream.of("GeeksforGeeks");
     Stream<String> stream4 = Stream.of("GFG");

     // concatenating all the Streams
     // with Stream.concat() function
     // and displaying the result
     return Stream.concat(Stream.concat(Stream.concat(stream1,
             stream2), stream3), stream4)
             .collect(Collectors.joining(","));
 }
    /**
     * 7	long count()
    * It returns the count of elements in this stream. This is a special case of a reduction.
    * تعداد عناصر موجود در این جریان را برمی گرداند. این یک مورد خاص از کاهش است.
   */
    public Long countExample(List<Product> productsList){
        return productsList.stream().count();
    }
    /**
    * 8	Stream<T> distinct()
    * It returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
    * این یک جریان متشکل از عناصر مجزا (مطابق با Object. Equals (Object)) این جریان را برمی گرداند.
    */
    public String distinctExample(List<Integer> list){
        return list.stream().distinct().map(m->String.valueOf(m)).collect(Collectors.joining(","));
    }
    /**
     * 9	static <T> Stream<T> empty()
    * It returns an empty sequential Stream.
    * این یک جریان متوالی خالی را برمی گرداند.
    */

    /**
     * 10	Stream<T> filter(Predicate<? super T> predicate)
    * It returns a stream consisting of the elements of this stream that match the given predicate.
    * این جریانی را تشکیل می دهد که از عناصر این جریان مطابقت با گزاره داده شده است.
    */
    /**
     * 11	Optional<T> findAny()
    * It returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
    * اگر یک جریان خالی باشد ، یک اختیاری را توصیف برخی از عناصر جریان یا یک اختیاری خالی برمی گرداند.
    */
    // Driver code
    public static void main1(String[] args) {

        // Creating an IntStream
        IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16)
                .parallel();

        // Using Stream findAny().
        // Executing the source code multiple times
        // may not return the same result.
        // Every time you may get a different
        // Integer which is divisible by 4.
        stream = stream.filter(i -> i % 4 == 0);

        OptionalInt answer = stream.findAny();
        if (answer.isPresent())
        {
            System.out.println(answer.getAsInt());
        }
    }
    /**
     * 12	Optional<T> findFirst()
    * It returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty. If the stream has no encounter order, then any element may be returned.
    * اگر یک جریان خالی باشد ، یک اختیاری را توصیف می کند که اولین عنصر این جریان را توصیف می کند ، یا یک اختیاری خالی را نشان می دهد. اگر جریان نظم برخورد نداشته باشد ، ممکن است هر عنصری بازگردانده شود.
    */
    /**
     * 13	<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
    * It returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
    * Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)
    * این یک جریان متشکل از نتایج جایگزینی هر عنصر از این جریان با محتویات یک جریان نقشه برداری شده با استفاده از عملکرد نقشه برداری ارائه شده به هر عنصر باز می گردد.
    * پس از قرار دادن محتویات آن در این جریان ، هر جریان نقشه برداری بسته می شود. (اگر یک جریان نقشه برداری تهی باشد ، از جریان خالی استفاده می شود.)
     * flatMap() V/s map() :
     * 1) map() takes a Stream and transform it to another Stream. It applies a function on each element of Stream and store return value into new Stream.
     * It does not flatten the stream. But flatMap() is the combination of a map and a flat operation i.e, it applies a function to elements as well as flatten them.
     * 2) map() is used for transformation only, but flatMap() is used for both transformation and flattening.
     * ) نقشه () یک جریان را می گیرد و آن را به یک جریان دیگر تبدیل می کند. این تابع را در هر عنصر جریان و مقدار بازگشت مقدار ذخیره شده در جریان جدید اعمال می کند. جریان را صاف نمی کند
     * . اما flatMap () ترکیبی از نقشه و یک عمل مسطح است ، یعنی یک تابع را برای عناصر و همچنین صاف کردن آنها اعمال می کند.
     * 2) نقشه () فقط برای تبدیل استفاده می شود ، اما flatMap () هم برای تبدیل و هم برای صاف کردن استفاده می شود.
    */
    // Driver code
    public static void main4(String[] args)
    {
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);
    }
    /**
     * 14	DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)
    * It returns a DoubleStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
    * Each mapped stream is closed after its contents have placed been into this stream. (If a mapped stream is null an empty stream is used, instead.)
    * این یک DoubleStream متشکل از نتایج جایگزینی هر عنصر از این جریان با محتویات یک جریان نقشه برداری شده با استفاده از عملکرد نقشه برداری ارائه شده به هر عنصر را برمی گرداند.
    * پس از قرار دادن محتویات آن در این جریان ، هر جریان نقشه برداری بسته می شود. (اگر یک جریان نقشه برداری تهی باشد ، از جریان خالی استفاده می شود.)
    */
    /**
     * 15	IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
    * It returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
    * Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)
    * این یک IntStream متشکل از نتایج جایگزینی هر عنصر از این جریان با محتویات یک جریان نقشه برداری شده با استفاده از عملکرد نقشه برداری ارائه شده برای هر عنصر را برمی گرداند.
    * پس از قرار دادن محتویات آن در این جریان ، هر جریان نقشه برداری بسته می شود. (اگر یک جریان نقشه برداری تهی باشد ، از جریان خالی استفاده می شود.)
    */
    /**
     * 16	LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
    * It returns a LongStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
    * Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)
    * این یک LongStream متشکل از نتایج جایگزینی هر عنصر از این جریان با محتویات یک جریان نقشه برداری شده با استفاده از عملکرد نقشه برداری ارائه شده برای هر عنصر را برمی گرداند.
    * پس از قرار دادن محتویات آن در این جریان ، هر جریان نقشه برداری بسته می شود. (اگر یک جریان نقشه برداری تهی باشد ، از جریان خالی استفاده می شود.)
    */
    /**
     * 17	void forEach(Consumer<? super T> action)
    * It performs an action for each element of this stream.
    * برای هر عنصر این جریان عملی را انجام می دهد.
     */
    /**
     * 18	void forEachOrdered(Consumer<? super T> action)
    * It performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order.
    * اگر جریان دارای یک ترتیب برخورد مشخص باشد ، برای هر عنصر از این جریان یک عمل را انجام می دهد.
     */
    /**
     * 19	static <T> Stream<T> generate(Supplier<T> s)
    * It returns an infinite sequential unordered stream where each element is generated by the provided Supplier. This is suitable for generating constant streams, streams of random elements, etc.
    * این یک جریان نامحدود متوالی بی نهایت نامحدود را برمی گرداند که در آن هر عنصر توسط تأمین کننده ارائه شده تولید می شود. این برای تولید جریانهای ثابت ، جریانهای عناصر تصادفی و غیره مناسب است.
     */
    // Driver code
    public static void main5(String[] args) {

        // using Stream.generate() method
        // to generate 5 random Integer values
        Stream.generate(new Random()::nextInt)
                .limit(5).forEach(System.out::println);
    }
    /**
     * 20	static <T> Stream<T> iterate(T seed,UnaryOperator<T> f)
    * It returns an infinite sequential ordered Stream produced by iterative application of a function f to an initial element seed, producing a Stream consisting of seed, f(seed), f(f(seed)), etc.
    * این یک جریان نامحدود متوالی سفارش داده شده جریان را با استفاده از تکرار یک تابع f به بذر عنصر اولیه باز می گرداند ، و یک جریان متشکل از دانه ، f (دانه) ، f (f (دانه)) و غیره تولید می کند.
     */
    /**
     * 21	Stream<T> limit(long maxSize)
    * It returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
    * این جریانی را تشکیل می دهد که از عناصر این جریان تشکیل شده است ، کوتاه شده تا طول آن بیش از حداکثر نباشد.
     */
    /**
     * 22	<R> Stream<R> map(Function<? super T,? extends R> mapper)
    * It returns a stream consisting of the results of applying the given function to the elements of this stream.
    * این یک جریان متشکل از نتایج اعمال تابع داده شده بر روی عناصر این جریان را برمی گرداند.
     */
    /**
     * 23	DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)
    * It returns a DoubleStream consisting of the results of applying the given function to the elements of this stream.
    * این یک DoubleStream متشکل از نتایج اعمال تابع داده شده بر روی عناصر این جریان را برمی گرداند.
     */
    /**
     * 24	IntStream mapToInt(ToIntFunction<? super T> mapper)
    * It returns an IntStream consisting of the results of applying the given function to the elements of this stream.
    * این یک IntStream متشکل از نتایج اعمال تابع داده شده بر روی عناصر این جریان را برمی گرداند.
     */
    /**
     * 25	LongStream mapToLong(ToLongFunction<? super T> mapper)
    * It returns a LongStream consisting of the results of applying the given function to the elements of this stream.
    * این یک LongStream متشکل از نتایج اعمال تابع داده شده بر روی عناصر این جریان را برمی گرداند.
     */
    /**
     * 26	Optional<T> max(Comparator<? super T> comparator)
    * It returns the maximum element of this stream according to the provided Comparator. This is a special case of a reduction.
    * حداکثر عنصر این جریان را مطابق با مقایسه ساز ارائه شده باز می گرداند. این یک مورد خاص از کاهش است.
     */
    /**
     * 27	Optional<T> min(Comparator<? super T> comparator)
    * It returns the minimum element of this stream according to the provided Comparator. This is a special case of a reduction.
    * حداقل عنصر این جریان را مطابق با مقایسه ساز ارائه شده باز می گرداند. این یک مورد خاص از کاهش است.
     */
    /**
     * 28	boolean noneMatch(Predicate<? super T> predicate)
    * It returns elements of this stream match the provided predicate. If the stream is empty then true is returned and the predicate is not evaluated.
    * عناصر این جریان را با پیش نویس ارائه شده مطابقت می دهد. اگر جریان خالی باشد ، درست استرداد می شود و محمول ارزیابی نمی شود.
     */
    /**
     * 29	@SafeVarargs static <T> Stream<T> of(T... values)
    * It returns a sequential ordered stream whose elements are the specified values.
    * این یک جریان مرتب مرتب شده را که عناصر آن مقادیر مشخص شده هستند ، برمی گرداند.
     */
    /**
     * 30	static <T> Stream<T> of(T t)
    * It returns a sequential Stream containing a single element.
    * این یک جریان پی در پی حاوی یک عنصر واحد را برمی گرداند.
     */
    /**
     * 31	Stream<T> peek(Consumer<? super T> action)
    * It returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.
    * این یک جریان متشکل از عناصر این جریان را برمی گرداند ، علاوه بر این که عناصر از جریان حاصل از آن استفاده می شوند ، عملکرد ارائه شده را روی هر عنصر نیز انجام می دهند.
     */
    /**
     * 32	Optional<T> reduce(BinaryOperator<T> accumulator)
    * It performs a reduction on the elements of this stream, using an associative accumulation function, and returns an Optional describing the reduced value, if any.
    * این عنصر با استفاده از یک تابع انباشت انجمنی ، عناصر این جریان را کاهش می دهد و یک اختیاری را توصیف می کند که در صورت وجود مقدار کاهش یافته را توصیف می کند.
     */
    /**
     * 33	T reduce(T identity, BinaryOperator<T> accumulator)
    * It performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value.
    * این عنصر با استفاده از مقدار هویت ارائه شده و عملکرد انباشت انجمنی ، عناصر این جریان را کاهش می دهد و مقدار کاهش یافته را برمی گرداند.
     */
    /**
     * 34	<U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
    * It performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions.
    * با استفاده از ویژگی های ارائه شده در هویت ، تجمع و ترکیب ، کاهش عناصر این جریان را انجام می دهد.
     */
    /**
     * 35	Stream<T> skip(long n)
    * It returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.
    * If this stream contains fewer than n elements then an empty stream will be returned.
    * این یک جریان متشکل از عناصر باقیمانده این جریان پس از دور انداختن اولین عناصر n جریان را برمی گرداند. اگر این جریان دارای کمتر از n عناصر باشد ، یک جریان خالی بازگردانده می شود.
     */
    /**
     * 36	Stream<T> sorted()
    * It returns a stream consisting of the elements of this stream, sorted according to natural order. I
    * f the elements of this stream are not Comparable, a java.lang.ClassCastException may be thrown when the terminal operation is executed.
    * این جریانی را تشکیل می دهد که از عناصر این جریان مرتب شده و بر اساس نظم طبیعی مرتب شده است.
    * اگر عناصر این جریان قابل مقایسه نباشند ، ممکن است هنگام اجرای عملیات ترمینال ، java.lang.ClassCastException پرتاب شود.
     */
    /**
     * 37	Stream<T> sorted(Comparator<? super T> comparator)
    * It returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
    * این یک جریان متشکل از عناصر این جریان را برمی گرداند ، مطابق با مقایسه کننده ارائه شده طبقه بندی می شود.
     */
    /**
     * 38	Object[] toArray()
    * It returns an array containing the elements of this stream.
    * آن یک آرایه حاوی عناصر این جریان را برمی گرداند.
     */
    /**
     * 39	<A> A[] toArray(IntFunction<A[]> generator)
    * It returns an array containing the elements of this stream, using the provided generator function to allocate the returned array,
    * as well as any additional arrays that might be required for a partitioned execution or for resizing.
    * این یک آرایه حاوی عناصر این جریان را با استفاده از عملکرد ژنراتور ارائه شده برای تخصیص آرایه بازگردانده شده ،
    * و همچنین هر آرایه اضافی که ممکن است برای اجرای یک پارتیشن بندی شده یا برای تغییر اندازه لازم باشد ، برمی گرداند.
    */
}
