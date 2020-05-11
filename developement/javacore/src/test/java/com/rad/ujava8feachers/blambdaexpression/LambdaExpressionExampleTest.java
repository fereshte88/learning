package com.rad.ujava8feachers.blambdaexpression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LambdaExpressionExampleTest {
    LambdaExpressionExample lambdaExpressionExample = new LambdaExpressionExample();

    @Test
    void testWithoutLambda() {
        Assertions.assertEquals("Drawing without lambda10",  lambdaExpressionExample.withoutLambda(10));
    }

    @Test
    void testWithLambda() {
        Assertions.assertEquals("Drawing with lambda10",  lambdaExpressionExample.withLambda(10));
    }

    @Test
    void testNoParameter() {
        Assertions.assertEquals("I have nothing to say.", lambdaExpressionExample.noParameter());
    }

    @Test
    void testSingleParameter() {
        Assertions.assertEquals("without parentheses Hello, Sonoo **Hello, Sonoo",  lambdaExpressionExample.singleParameter());
    }

    @Test
    void testMultipleParameters() {
        Assertions.assertEquals(60, lambdaExpressionExample.multipleParameters(10, 20));
    }

    @Test
    void testForeachLoop() {
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        Assertions.assertEquals("ankit,mayank,irfan,jai,", lambdaExpressionExample.ForeachLoop(list));
    }

    @Test
    void testMultipleStatements() {
        Assertions.assertEquals("I would like to say, time is precious.", lambdaExpressionExample.multipleStatements("I would like to say, "));
    }

    @Test
    void testThreadExample() {
        lambdaExpressionExample.threadExample();
    }

    @Test
    void testComparator() {
        Assertions.assertEquals(" - 2 Dell Mouse 150.0 - 1 HP Laptop 25000.0 - 3 Keyboard 300.0", lambdaExpressionExample.comparator());
    }

    @Test
    void testFilterCollectionData() {
        Assertions.assertEquals("Iphone 6S: 65000.0,Sony Xperia: 25000.0,Redmi4 : 26000.0", lambdaExpressionExample.filterCollectionData());
    }

    @Test
    void testEventListener() {
        lambdaExpressionExample.eventListener();
    }
}

