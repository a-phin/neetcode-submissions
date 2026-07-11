class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int p1 = 0; // Pointer 1
        int p2 = 1; // Pointer 2
        while (numbers[p1] + numbers[p2] != target && p1 < numbers.length) {
            if (p2 == numbers.length - 1) {
                p2 = p1 + 1;
            }
            p1++;
            p2++;
        }
        indices[0] = p1 + 1;
        indices[1] = p2 + 1;
        return indices;
    }
}
