class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowTotal = 0;

for (int i = 0; i < k; i++) {
windowTotal += nums[i];
}

long highestTotal = windowTotal;

for (int right = k; right < nums.length; right++) {
windowTotal += nums[right];
windowTotal -= nums[right - k];

if (windowTotal > highestTotal) {
highestTotal = windowTotal;
}
}

return (double) highestTotal / k;
        
    }
}
