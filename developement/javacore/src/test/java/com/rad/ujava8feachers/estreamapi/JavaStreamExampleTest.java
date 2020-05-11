package com.rad.ujava8feachers.estreamapi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class JavaStreamExampleTest {
    JavaStreamExample javaStreamExample = new JavaStreamExample();
    List<Product> productsList = new ArrayList<Product>();
    @BeforeEach
    void initUseCase() {
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
    }
    @Test
    void testWithoutStream() {
        Assertions.assertEquals("25000.0,28000.0,28000.0,",javaStreamExample.withoutStream(productsList));
    }
    @Test
    void testWithStream() {
        Assertions.assertEquals("90000.0",javaStreamExample.withStream(productsList));
    }
    @Test
    void testIterateExample() {
        Assertions.assertEquals("7,14,21,28,35,42,49,",javaStreamExample.iterateExample(7));
    }
    @Test
    void testFilterExample() {
        Assertions.assertEquals("Dell Laptop,",javaStreamExample.filterExample(productsList));
    }
    @Test
    void testReduceExample() {
        Assertions.assertEquals(1,javaStreamExample.reduceExample(productsList));
    }
    @Test
    void testSumExample() {
        Assertions.assertEquals(201000.0,javaStreamExample.sumExample(productsList));
    }
    @Test
    void testMinMaxExample() {
        Assertions.assertEquals("Max is : 90000.0 Min is : 25000.0",javaStreamExample.minMaxExample(productsList));
    }
    @Test
    void testConvertListToMap() {
        Map<Integer,String> productPriceMap = new HashMap<>();
        productPriceMap.put(1,"HP Laptop");
        productPriceMap.put(2,"Dell Laptop");
        productPriceMap.put(3,"Lenevo Laptop");
        productPriceMap.put(4,"Sony Laptop");
        productPriceMap.put(5,"Apple Laptop");

        assertThat(productPriceMap, is(javaStreamExample.convertListToMap(productsList)));
    }

    @Test
    void testmethodReferencInStrem() {
        List<Float> productPriceList = new ArrayList<>();
        productPriceList.add(90000.0f);
        assertThat(productPriceList, is(javaStreamExample.methodReferencInStrem(productsList)));
    }

    @Test
    void testAllMatchExample(){
        Assertions.assertFalse(javaStreamExample.allMatchExample(productsList));
    }

    @Test
    void testAnyMatchExample(){
        Assertions.assertTrue(javaStreamExample.anyMatchExample(productsList));
    }
    @Test
    void testStreamBuilderExample(){
        Assertions.assertEquals("Geeks,for,Geeks,GeeksQuiz",javaStreamExample.streamBuilderExample());
    }

    @Test
    void testCollectExample() {
        List<String> productnameList = new ArrayList<>();
        productnameList.add("HP Laptop");
        productnameList.add("Dell Laptop");
        productnameList.add("Lenevo Laptop");
        productnameList.add("Sony Laptop");
        productnameList.add("Apple Laptop");
        assertThat(productnameList, is(javaStreamExample.collectExample(productsList)));
    }

    @Test
    void testConcatExample(){
        Assertions.assertEquals("Geeks,GeeksQuiz,GeeksforGeeks,GFG",javaStreamExample.concatExample());
    }

    @Test
    void testCountExample(){
        Assertions.assertEquals(5,javaStreamExample.countExample(productsList));
    }

    @Test
    void testDistinctExample(){
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        Assertions.assertEquals("1,2,3,4,5",javaStreamExample.distinctExample(list));
    }
}
