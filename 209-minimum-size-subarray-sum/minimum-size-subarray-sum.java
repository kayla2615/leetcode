class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1; 
        int left = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
            while(sum >= target){
                if (min > i - left + 1) {
                     min = i - left + 1;
                }
                sum = sum - nums[left++];       
            }
            if(min == 1) return min;
        }
        if(min == nums.length+1) return 0;
        return min;
    }
}