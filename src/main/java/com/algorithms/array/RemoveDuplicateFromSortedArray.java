package com.algorithms.array;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicateFromSortedArray o = new RemoveDuplicateFromSortedArray();
		System.out.println(o.removeDuplicate(nums));
	}
	int removeDuplicate(int[] nums) {
		int i=0, j=1;
	     for(;j<nums.length;){
	         if(nums[i] == nums[j]){
	             j++;
	         }else{
	             nums[++i]=nums[j++];
	         }
	     }
	     return i+1;
	}
	public int removeDuplicates(int[] nums) {
        if(nums != null && nums.length > 1){
            int i=0;
            for(int j=1;j<nums.length;j++){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
            return i+1;
        }else if(nums != null && nums.length == 1){
            return 1;
        }else{
            return 0;
        }
    }
}
