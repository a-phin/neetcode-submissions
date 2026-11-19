class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!numbers.containsKey(num)) {
                numbers.put(num, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}