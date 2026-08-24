class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int p1 = 0;
        int p2 = heights.length - 1;
        while (p1 < p2) {
            int water = (p2 - p1) * Math.min(heights[p1], heights[p2]);
            if (heights[p1] < heights[p2]) {
                p1++;
            } else {
                p2--;
            }
            if (water > area) {
                area = water;
            }
        }
        return area;
    }
}
