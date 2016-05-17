package Move_Zeroes;

import org.junit.Test;

public class MoveZeroesTest {

	@Test
	public void testMoveZeroes() {
		int[] nums = {0,1,0,3,12};
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(nums);
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}

}
