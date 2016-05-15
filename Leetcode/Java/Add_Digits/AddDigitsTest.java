package Add_Digits;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsTest {

	@Test
	public void testAddDigits() {
		int num = 10;
		AddDigits ad = new AddDigits();
		Assert.assertEquals(1, ad.addDigits(num));
	}

}
