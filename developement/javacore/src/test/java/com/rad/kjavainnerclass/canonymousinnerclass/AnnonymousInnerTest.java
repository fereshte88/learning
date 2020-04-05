package com.rad.kjavainnerclass.canonymousinnerclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnnonymousInnerTest {
    AnnonymousInner annonymousInner = new AnnonymousInner();

    @Test
    void testMsgFromClass() {
        String result = annonymousInner.msgFromClass();
        Assertions.assertEquals("nice fruits", result);
    }

    @Test
    void testMsgFromInterface() {
        String result = annonymousInner.msgFromInterface();
        Assertions.assertEquals("nice food", result);
    }
}

