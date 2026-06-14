class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        HashMap<Integer, Integer> differences = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (differences.containsKey(target - nums[i])) {
                twoSum[0] = differences.get(target - nums[i]);
                twoSum[1] = i;
                break;
            } else {
                // Store the CURRENT element, not difference
                differences.put(nums[i], i);
            }
        }
        return twoSum;
    }
}
