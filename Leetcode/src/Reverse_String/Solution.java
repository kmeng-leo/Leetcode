package Reverse_String;

public class Solution {
	public String reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
}
