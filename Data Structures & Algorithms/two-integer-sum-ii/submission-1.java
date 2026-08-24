class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sumIndices = new int[2];
        int pointerOne = 0;
        int pointerTwo = numbers.length - 1;
        while (pointerOne < pointerTwo && numbers[pointerOne] + numbers[pointerTwo] != target) {
            if (numbers[pointerOne] + numbers[pointerTwo] > target) {
                pointerTwo--;
            } else {
                pointerOne++;
            }
        }
        sumIndices[0] = pointerOne + 1;
        sumIndices[1] = pointerTwo + 1;
        return sumIndices;
    }
}
