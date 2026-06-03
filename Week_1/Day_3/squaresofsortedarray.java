class Solution {
    public int[] sortedSquares(int[] nums) {
        
          int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int ind= n - 1;

        while (left <= right) {
            int leftSq= nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[ind] = leftSq;
                left++;
            } else {
                result[ind] = rightSq;
                right--;
            }

            ind--;
        }

        return result;
    }
}
