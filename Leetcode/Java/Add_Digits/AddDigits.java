package Add_Digits;

public class AddDigits {
	private int byte1;
	private int byte2;
	private int tempNum;

	public int addDigits(int num) {
		if (num >= 10) {
			byte1 = num / 10;
			byte2 = num % 10;
			System.out.println("byte1 = " + byte1 + "\tbyte2 = " + byte2);
			tempNum = byte1 + byte2;
			return addDigits(tempNum);
		} else {
			return num;
		}
	}
}
