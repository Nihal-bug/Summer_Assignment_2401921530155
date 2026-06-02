class Solution {
    public int maxSubArray(int[] nums) {
        int answer = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }

            answer = Math.max(answer, sum);
        }

        return answer;
        
    }
}
