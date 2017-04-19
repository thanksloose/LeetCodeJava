package com.hmm.test;

public class RemoveElement {
	public int removeElementHmm(int[] nums, int val) {
		int id =0;
		for(int i = 0; i < nums.length; i++) {
			if(val==nums[i]);
			else nums[id++] = nums[i];
		}
		return  id;
	}
	public int removeElement(int[] nums, int val) {
		int id =0;
		for(int i = 0; i < nums.length; i++) {
			if(val!=nums[i])
				nums[id++] = nums[i];
		}
		return  id;
	}
	public static void main(String[] args) {
		RemoveElement removeElement = new RemoveElement();
		int[] nums = {3,3,2,3,2};
		int val = 3;
		System.out.println(removeElement.removeElement(nums, val));
	}
}
