package com.rad.njavaio.pfilepermission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionExampleTest {

    String rootPath= "javaiotemp";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(rootPath+"\\permission");
        if (file.exists()) {
            file.delete();
        }
        file.mkdir();
        file = new File(rootPath+"\\permission\\java");
        if (file.exists()) {
            file.delete();
        }
        file.mkdir();
        file = new File(rootPath+"\\permission\\java1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        file = new File(rootPath+"\\permission\\java2.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Test
    public void addPermissionTest() throws IOException {

        String fileExclude = rootPath+"\\permission\\java1.txt";
        String folderPermission =  rootPath+"\\permission\\-";
        FilePermissionExample  f = new FilePermissionExample();
        PermissionCollection permissionCollection = f.addPermission(folderPermission,fileExclude);
        System.out.println(new File(rootPath+"\\permission\\java2.txt").canWrite());
        Assertions.assertEquals(Boolean.TRUE,permissionCollection.implies(new FilePermission(fileExclude, "read,write")));

    }
}
