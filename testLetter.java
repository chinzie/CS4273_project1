import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Checkbox;

import org.junit.jupiter.api.Test;

class testLetter {

	lettergame check = new lettergame();
	
	// English letter unit test
	
	@Test
	void lettertest1() 
	{
		check.getLetters();
		String actual = check.englishLetters.get(15);
		String expected = "O";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void letterstest2()
	{
		int actual = check.englishLetters.size();
		int expected = 26;
		
		assertEquals(expected, actual);
	}

	@Test
	void lettertest3() 
	{
		String actual = check.englishLetters.get(4);
		String expected = "E";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void lettertest4()
	{
		String actual = check.englishLetters.get(0);
		String expected = "A";
		
		assertEquals(expected, actual);
	}
	
	// Spanish letter unit test
	
	@Test
	void lettertest5() 
	{
		String actual = check.spanishLetters.get(13);
		String expected = "Ll";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void letterstest6()
	{
		int actual = check.spanishLetters.size();
		int expected = 30;
		
		assertEquals(expected, actual);
	}

	@Test
	void lettertest7() 
	{
		String actual = check.spanishLetters.get(3);
		String expected = "Ch";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void lettertest8()
	{
		String actual = check.spanishLetters.get(28);
		String expected = "Z";
		
		assertEquals(expected, actual);
	}
	
	
}
