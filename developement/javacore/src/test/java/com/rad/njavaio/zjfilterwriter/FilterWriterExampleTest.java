package com.rad.njavaio.zjfilterwriter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FilterWriterExampleTest {
    FilterWriterExample filterWriterExample = new FilterWriterExample();

    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testFilterWriter() {
        Assertions.assertEquals("i love my country",filterWriterExample.filterWriter(rootPath+"filterwriter.txt", "I LOVE MY COUNTRY"));
    }
}
