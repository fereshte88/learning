//package com.rad.ajavaobjectclass.cobjectandclass;
//
//import com.rad.ajavaobjectclass.cobjectandclass.Student;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StudentTest {
//    @Test
//    void getIdTest(){
//        Student student = new Student();
//        assertEquals(0,student.getId());
//
//    }
//    @Test
//    void getNameTest(){
//        Student student = new Student();
//        assertNull(student.getName());
//    }
//
//    /*
//    There are 3 ways to initialize object in Java.
//
//    By reference variable
//    By method
//    By constructor
//
//     */
//
//    @Test
//    void referenceVariableTest(){
//        Student student = new Student();
//        student.setId(101);
//        student.setName("Fereshteh");
//        assertEquals(101,student.getId());
//        assertEquals("Fereshteh",student.getName());
//    }
//
//    @ParameterizedTest
//    void methodTest(){
//
//    }
//
//    @Test
//    void costructorTest(){
//        Student student = new Student(101,"Fereshteh");
//        assertEquals(101,student.getId());
//        assertEquals("Fereshteh",student.getName());
//    }
//}
