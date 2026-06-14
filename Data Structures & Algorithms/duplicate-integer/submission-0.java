class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = true;
            }
        }
        return duplicate;
    }
}