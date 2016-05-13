package Reverse_String;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void testReverseString() {
		String str = "Hello";
		Solution solution = new Solution();
		String str2 = solution.reverseString(str);
		Assert.assertEquals("olleH", str2);
	}

	@Test
	public void testReverseString1() {
		String string = "";
		Solution solution = new Solution();
		String str2 = solution.reverseString(string);
		Assert.assertEquals("", str2);
	}

}
