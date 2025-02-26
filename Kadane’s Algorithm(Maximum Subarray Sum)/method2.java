class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
        for(int num:nums){
            currSum += num;
            maxSum = (maxSum>currSum)?maxSum:currSum;
            if(currSum<0) currSum = 0;
        }
        return maxSum;
    }
}
