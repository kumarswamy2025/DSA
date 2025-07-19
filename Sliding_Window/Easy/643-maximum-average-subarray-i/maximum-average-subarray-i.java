class Solution {

    // sliding window
    public double findMaxAverage(int[] nums, int k) {
        // it is fixed window problem

        // calculating sum upto K ele
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int maxSum = sum;
        // now start windows and compare elements add and remove
        for (int i = k; i < nums.length; i++) {

            // remove first ele from sum
            sum = sum - nums[i - k];

            // adding i(current ele) element
            sum = sum + nums[i];

            maxSum = Math.max(maxSum, sum);

        }

        return (double) maxSum / k;
        // return bruteForceApporach(nums,k);

    }

    // brute force apporach
    static double bruteForceApporach(int[] nums, int k) {
        // outer loop iterate upto n-k times
        int maxSum = Integer.MIN_VALUE;
        int n=nums.length; // array length
        for (int i = 0; i <= n - k; i++) {
            // inner loop every iteration add this condtion j<i+k
            int sum = 0;
            for (int j = i; j < i + k; j++) {
               sum=sum+nums[j];
            }
            maxSum=Math.max(maxSum,sum);

        }

        return (double)maxSum/k;
    }
}