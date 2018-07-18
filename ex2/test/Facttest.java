package com.ex2.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.ex2.Factorial;
class Facttest {
      private static Factorial fact;

		@Test
		public void testFact() {


		  assertEquals("hdafadaidha", 479001600, fact.printIntFactorials(1, 1));
		    assertEquals("hdafadaidha", 2432902008176640000L, fact.printLongFactorials(1, 1));
		}
	}


