import static org.junit.Assert.*;

import org.junit.Test;

public class lettergameTest {

	lettergame check = new lettergame();
	
	// English letter unit test
	
	@Test
	public void lettertest1() 
	{
		check.main(null);
		String actual = check.englishLetters.get(14);
		String expected = "O";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void letterstest2()
	{
		int actual = check.englishLetters.size();
		int expected = 26;
		
		assertEquals(expected, actual);
	}

	@Test
	public void lettertest3() 
	{
		String actual = check.englishLetters.get(4);
		String expected = "E";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void lettertest4()
	{
		String actual = check.englishLetters.get(0);
		String expected = "A";
		
		assertEquals(expected, actual);
	}
	
	// Spanish letter unit test
	
	@Test
	public void lettertest5() 
	{
		String actual = check.spanishLetters.get(13);
		String expected = "Ll";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void letterstest6()
	{
		int actual = check.spanishLetters.size();
		int expected = 30;
		
		assertEquals(expected, actual);
	}

	@Test
	public void lettertest7() 
	{
		String actual = check.spanishLetters.get(3);
		String expected = "Ch";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void lettertest8()
	{
		String actual = check.spanishLetters.get(29);
		String expected = "Z";
		
		assertEquals(expected, actual);
	}
	
	
}
