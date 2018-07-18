package com.ex2.test;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.ex2.Fileread;


class Freadtest {
     @BeforeClass
     public static void setup() {
         new Fileread();

     }

     @AfterClass
     public static void teardown() {

     }  

     @Test
	    public void testFileUpperCase() {
	        String expect = "HI HELLO";
	        assertEquals(expect, Fileread.convertUpper("/home/divya/Desktop/file.txt"));
	        assertEquals("9.0", Fileread.findLength("/home/divya/Desktop/file.txt"));

     }
}