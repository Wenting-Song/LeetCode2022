class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int k = 2; //follow up
        for(int i = k; i < nums.length; i++){
            int otherMax = 0;
            for(int j = 1; j<k; j++){
                otherMax = Math.max(dp[i-k+j], otherMax);
            }
            dp[i] = Math.max(otherMax, dp[i-k] + nums[i]);
        }
            
        return dp[n-1]; 
    }
}
