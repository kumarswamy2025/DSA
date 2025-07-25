class Solution {
    // sloving using brute force
    public int subarraySum(int[] nums, int k) {
        int count=0;

        // outer loop
        for(int i=0;i<nums.length;i++){
            int sum=0;
            // inner loop
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];

                // checking if sum is equal to k
                if(sum==k){
                    count++;
                }

            }
        }
        return count;
    }
}