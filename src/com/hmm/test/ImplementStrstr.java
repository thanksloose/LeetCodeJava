package com.hmm.test;

public class ImplementStrstr {
	public int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	public static void main(String[] args) {
		ImplementStrstr implementStrstr = new ImplementStrstr();
		String haystack = "abcde";
		String needle = "asd";
		System.out.println(implementStrstr.strStr(haystack, needle));
	}
}
