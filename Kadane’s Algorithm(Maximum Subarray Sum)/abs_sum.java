class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int maxSum = 0 , minSum = 0;
        for(int num:nums){
            maxSum = Math.max(num,maxSum+num);
            minSum = Math.min(num,minSum+num);
            // -minSum -> to convert the negative into positive (i.e,Math.abs)
            ans = Math.max(ans,Math.max(maxSum,-minSum));
        }
        return ans;
    }
}
