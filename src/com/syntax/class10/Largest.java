package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find largest element from an array
		
		int[] nums= {200, 30, -1, 900, 56, 787, 3000};
		
		if (nums[0]>nums[1] && nums[0]>nums[2] && nums[0]>nums[3] && nums[0]>nums[4] && nums[0]>nums[5]) {
			System.out.println(nums[0]);
		}else if (nums[1]>nums[2] && nums[1]>nums[3] && nums[1]>nums[4] && nums[1]>nums[5]) {
			System.out.println(nums[1]);
		}else if (nums[2]>nums[3] && nums[2]>nums[4] && nums[2]>nums[5]) {
			System.out.println(nums[2]);
		}else if (nums[3]>nums[4] && nums[3]>nums[5]) {
			System.out.println(nums[3]);
		}else if (nums[4]>nums[5]) {
			System.out.println(nums[4]);
		}else {
			System.out.println(nums[5]);
		}
		//other way
		System.out.println("..............................");
		
		int largest=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>largest) {
				largest=nums[i];
		}
	
	}
		System.out.println("The largest num is "+ largest);
	}
}
