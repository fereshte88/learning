package com.rad.njavaio.zlfile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileExampleTest {
    FileExample fileExample = new FileExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testFileCreate() throws IOException {
        Assertions.assertEquals("New File is created!",fileExample.fileCreate(rootPath + "testfielcreate.txt"));
    }

    @Test
    void testFilePath() throws IOException {
        fileExample.filePath(rootPath + "testfielcreate.txt");
    }

    @Test
    void testFileList() {
        fileExample.fileList(rootPath);
    }
}