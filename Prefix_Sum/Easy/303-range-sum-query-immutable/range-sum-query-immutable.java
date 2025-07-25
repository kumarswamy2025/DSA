class NumArray {

    int[] prefixSum;

    public NumArray(int[] nums) {

        // calculating prefix sum and save to prefixSum array

        prefixSum = new int[nums.length];
        // inisalizing zero index value for default
        prefixSum[0]=nums[0];
        // prefix sum loop
        for (int i = 1; i < nums.length; i++) {

            prefixSum[i] = nums[i] + prefixSum[i - 1]; // finding prefix sum

        }

    

    }

    public int sumRange(int left, int right) {

        if(left==0){
            return prefixSum[right];
        }
        return prefixSum[right]-prefixSum[left-1];

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */