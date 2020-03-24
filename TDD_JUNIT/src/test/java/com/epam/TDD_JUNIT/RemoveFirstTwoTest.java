package com.epam.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class RemoveFirstTwoTest {

	
	/*
	 * TO DO LIST 
	 * 
	 * 1. first Character 		: ABCD 		-> BCD
	 * 2. Second Character 		: BACD 		-> BCD
	 * 3. First two characters 	: AACD 		-> CD
	 * 4. No character 			: BBAA 		-> BBAA
	 * 5. First and Last 		: AABAA 	-> BAA
	 * 6. Empty string 			: "" 		-> "" 
	 * 7. All same 				: AAAAAA 	-> AAAA
	 * 8. All different 		: XYZD 		-> XYZD
	 * 
	 */
	
	RemoveFirstTwo removeFirstTwo;
	
	@BeforeEach
	void setUp()
	{
		removeFirstTwo = new RemoveFirstTwo();
	}
	
	@Test
	void onlyFirstCharacter() 
	{
		assertEquals("BCD",removeFirstTwo.remove("ABCD"));
	}
	
	@Test
	void onlySecondCharacter() 
	{ 
		assertEquals("BCD", removeFirstTwo.remove("BACD"));
	}
	
	@Test
	void firstTwo() 
	{
		assertEquals("CD", removeFirstTwo.remove("AACD"));
	}
	
	@Test
	void noCharacter() 
	{
		assertEquals("BBAA", removeFirstTwo.remove("BBAA"));
	}
	
	@Test
	void firstAndLast() 
	{
		assertEquals("BAA", removeFirstTwo.remove("AABAA"));
	}
	
	@Test
	void passingEmptyString()
	{
		assertEquals("",removeFirstTwo.remove(""));
	}
	
	@Test
	void allSame()
	{
		assertEquals("AAAA",removeFirstTwo.remove("AAAAAA"));
	}
	
	@Test
	void allDifferent()
	{
		assertEquals("XYZD",removeFirstTwo.remove("XYZD"));
	}

}
