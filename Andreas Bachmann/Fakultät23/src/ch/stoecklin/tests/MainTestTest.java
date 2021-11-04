package ch.stoecklin.tests;

import static org.junit.jupiter.api.Assertions.*;

import static ch.stoecklin.Main.N23;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


class MainTestTest {

	
		
		@Test
		void N23of0equals1() {
			assertEquals(1,N23(0));
		}
		
		@Test
		void N23of1equals1() {
			assertEquals(1,N23(0));
		}
		
		@Test
		void N23of10equals35() {
			assertEquals(35,N23(10));
		}
		
		@Test
		void N23of20equals1616615() {
			assertEquals(1616615,N23(20));
		}
		
		@Test
		void N23of30equals26957055125() {
			long expectedResult = Long.parseLong("26957055125");
			assertEquals(expectedResult,N23(30));
		}
	}



