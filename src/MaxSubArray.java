class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];
        
        int maxstart = 0;
        int maxend = 0;
        
        int currstart = 0;
        int currend = 0;
        
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>currmax+nums[i]){
                currstart = i;
                currmax = nums[i];
                currend = i;
            }else{
                currend = i;
                currmax +=nums[i];
            }
            
            if(currmax>max){
                maxstart=currstart;
                maxend=currmax;
            }
            max = Math.max(max,currmax);
            
        }
        //System.out.println("start="+maxstart +" end="+maxend +" maxsum="+max);
        return max;
        
    }
}
