package com.loops.jeevika;

public class TowSum {

	public static void main(String[] args) {
		int[] nums = { 2,7, 5, 4 , 6 };
		int target = 9;
		System.out.println(twoSum(nums, target));
	}

	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0;i < nums.length-1 ; i++){
	           for(int j=i+1; j<nums.length-1;j++) {    //
	                if(nums[i]+nums[j] ==target){
	                    return new int[] {i,j} ;
	                }
	           }
	    }
	        return new int[] {-1,-1};
	}
}
