package com.ex2.test;

import static org.junit.Assert.assertEquals;



import com.ex2.Frequent;


public class Frequenttest {
	private static Frequent freq;
	public void testFreq() {
        assertEquals("{im=2, jason=2, hello=1}" , freq.output());
    }
	
}
