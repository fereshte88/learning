package com.rad.ujava8feachers.iforeachmethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ForEachLoopTest {
    ForEachLoop forEachLoop = new ForEachLoop();
    List<String> gamesList = new ArrayList<String>();
    @BeforeEach
    void initUseCase() {
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Hocky");
        gamesList.add("Chess");
    }
    @Test
    void testForEachExample() {
        Assertions.assertEquals("Football,Cricket,Hocky,Chess,", forEachLoop.forEachExample(gamesList));
    }

    @Test
    void testForEachOrderExample() {
        Assertions.assertEquals("Football,Cricket,Hocky,Chess,", forEachLoop.forEachOrderExample(gamesList));
    }
}