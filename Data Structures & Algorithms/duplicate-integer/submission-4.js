class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let uniqueNums = new Set();
        for (let num of nums) {
            if (uniqueNums.has(num)) {
                return true;
            } else {
                uniqueNums.add(num);
            }
        }
        return false;
    }
}
