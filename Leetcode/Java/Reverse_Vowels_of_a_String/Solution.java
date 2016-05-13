package Reverse_Vowels_of_a_String;

public class Solution {
	public boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}

	public String reverseVowels(String str) {
		if (str == null)
			return null;
		else if ("".equals(str.trim()) || str.trim().length() == 1)
			return str;
		else {
			int i = 0;
			int j = str.length() - 1;
			char ch1;
			char ch2;
			StringBuffer sb = new StringBuffer(str);
			while (i <= j) {
				while (!isVowel((ch1 = str.charAt(i))) && i < j) {
					i++;
				}
				while (!isVowel((ch2 = str.charAt(j))) && i < j) {
					j--;
				}
				if (i == j) 
					return sb.toString();
				else {
					sb.setCharAt(i, ch2);
					sb.setCharAt(j, ch1);
					i++;
					j--;
				}
			}
			return sb.toString();
		}
	}
}
