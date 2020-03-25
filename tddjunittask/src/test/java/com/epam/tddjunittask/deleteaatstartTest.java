package com.epam.tddjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class deleteaatstartTest {
	/*
	 * 
	 * removing A if present in two letters of the word
	 * 1.  "ABCD" ----->>>>"BCD"
	 * 2.  "AACD" ----->>>>"CD"
	 * 3.  "BACD" ----->>>>"BCD"
	 * 4.  "BBAA" ----->>>>"BBAA"
	 * 5. "AABAA" ----->>>>"BAA"    
	 */
		DeleteAInFirstTwo removeA;
	    @BeforeEach
		void setup() {
			removeA=new DeleteAInFirstTwo();
		}
		@Test
		void test1() {
			assertEquals("BCD", removeA.remove("ABCD"));
		}
		@Test
		void test2() {
			assertEquals("CD", removeA.remove("AACD"));
		}
		@Test
		void test3() {
			assertEquals("BCD", removeA.remove("BACD"));
		}
		@Test
		void test4() {
			assertEquals("BBAA", removeA.remove("BBAA"));
		}
		@Test
		void test5() {
			assertEquals("BAA",removeA.remove("AABAA"));
		}

	}

