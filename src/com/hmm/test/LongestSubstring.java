package com.hmm.test;

import java.util.HashMap;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			maxLength = Math.max(maxLength, i - j + 1);
		}
		return maxLength;
	}
	public static void main(String[] args) {
		LongestSubstring longestSubstring = new LongestSubstring();
		String s = "abcacbdddd";
		System.out.println(longestSubstring.lengthOfLongestSubstring(s));
	}
}
