package Nim_Game;
import org.junit.Assert;
import org.junit.Test;

public class Nim_GameTest {

	@Test
	public void testCanWinNim() {
		int n = 1;
		Nim_Game ng = new Nim_Game();
		Assert.assertEquals(false, ng.canWinNim(n));
	}

}
