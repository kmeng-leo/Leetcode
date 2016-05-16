package Nim_Game;

public class Nim_Game {
	public boolean canWinNim(int n) {
		int temp = n % 4;
		System.out.println(temp);
		if (temp == 0)
			return false;
		else
			return true;
	}
}
