class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        int i = 0;
        while (!duplicate && i < nums.length) {
            if (numbers.contains(nums[i])) {
                return true;
            } else {
                numbers.add(nums[i]);
                i++;
            }
        }
        return false;
    }
}