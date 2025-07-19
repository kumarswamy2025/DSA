class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // it is fixed window problem

        // calculating sum upto K ele
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }

   
        int maxSum=sum;
        // now start windows and compare elements add and remove
        for(int i=k;i<nums.length;i++){

            // remove first ele from sum
            sum=sum-nums[i-k];

            // adding k+1 elem
            sum=sum+nums[i];
            maxSum=Math.max(maxSum,sum);


        }


        return (double)maxSum/k;





    }
}