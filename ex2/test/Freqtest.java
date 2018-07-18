package com.ex2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.ex2.Frequent;
class Freqtest {
   private static Frequent freq;
	@Test
	public void testFreq() {
        assertEquals("{hi=1, i=2, divya=2, am=2}"  , freq.output());
    }

}
