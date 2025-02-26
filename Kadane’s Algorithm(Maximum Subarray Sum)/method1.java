class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num:nums){
            currSum = Math.max(num,num+currSum);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
