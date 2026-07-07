class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        Set<Integer> numbers = new HashSet<Integer>();
        for (int n: nums) {
            numbers.add(n);
        }
        for (int n: numbers) {
            int num = n;
            int tempCount = 0;
            while (numbers.contains(num)) {
                num++;
                tempCount++;
            }
            if (tempCount > count) {
                count = tempCount;
            }
        }
        return count;
    }
}
