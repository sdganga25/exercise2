package com.ex2.test;
import com.ex2.Student;
import com.ex2.Fileread;
import com.ex2.Frequent;
import com.ex2.Newclass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;*/
import org.junit.Test;
public class Studenttest {
	private static Newclass ne;
	private static Frequent fq;
	 @Test
	public void testStudent() {
		String[] expect={"81.5","65","98"};
		int[] array={86,65,98,77};
		
		assertArrayEquals(expect,Student.findAvgMinMax(4,array));
		
	}
	 
	 @Test
	    public void testFileUpperCase() {
	        String expect = "HI";
	        assertEquals(expect, Fileread.convertUpper("/home/divya/Desktop/file.txt"));
	        assertEquals("3.0", Fileread.findLength("/home/divya/Desktop/file.txt"));

  }
	 @Test
	public void test() {
			
//	        String text1= "Hi hello";
	      assertEquals("hi",ne.query("/home/divya/Desktop/"));
	  }
	 @Test
	 public void testFreq() {
         assertEquals("{im=2, jason=2, hello=1}" , fq.output());
     }
}

