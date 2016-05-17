package Move_Zeroes;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int i = 0;
		int j = 0;
		while (i < len) {
			if (nums[i] != 0) {
				i++;
				j++;
			} else
				break;
		}
		j++;
		while (j < len) {
			if (nums[j] == 0)
				j++;
			else {
				nums[i] = nums[j];
				nums[j] = 0;
				i++;
				j++;
			}
		}
	}
}
