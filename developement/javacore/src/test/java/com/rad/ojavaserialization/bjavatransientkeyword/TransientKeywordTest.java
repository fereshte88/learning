package com.rad.ojavaserialization.bjavatransientkeyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class TransientKeywordTest {
    TransientKeyword transientKeyword = new TransientKeyword();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testPersist() throws Exception {
        transientKeyword.persist(rootPath+"transient.txt", new Student(211,"ravi",22));
    }

    @Test
    void testDepersist() throws Exception {
        String result = transientKeyword.depersist(rootPath+"transient.txt");
        Assertions.assertEquals("211 ravi 0", result);
    }
}
