class Solution {
    public int minimumAverageDifference(int[] nums) {
        long min = Integer.MAX_VALUE, sum = 0;
        for (int i : nums) sum += i;
        int leftIndex = 0, resultIndex = -1;
        long prefixSum = 0;

        while (leftIndex < nums.length) {
            prefixSum += nums[leftIndex];
            long leftAverage = prefixSum / (leftIndex + 1);
            long sumRight = sum - prefixSum;
            if (sumRight != 0) sumRight /= nums.length - leftIndex - 1;
            long res = Math.abs(leftAverage - sumRight);
            if (res < min) {
                min = res;
                resultIndex = leftIndex;
            }
            leftIndex++;
        }
        return resultIndex;
    }
}