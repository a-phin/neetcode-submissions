class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        HashSet<Integer> numbers = new HashSet<Integer>();
        int i = 0;
        while (!duplicate && i < nums.length) {
            if (numbers.contains(nums[i])) {
                duplicate = true;
            } else {
                numbers.add(nums[i]);
                i++;
            }
        }
        return duplicate;
    }
}