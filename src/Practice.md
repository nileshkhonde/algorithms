# Arrays:
- Given a sorted array, remove the duplicates such that element appear only once and return the new length. In place
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


## Dynamic Connectivity - 
  - Given n objects and with connectivity, can we add connection between two objects 
    and we would like to know if there is path from A to B.
  - Quick Find & Union Find
