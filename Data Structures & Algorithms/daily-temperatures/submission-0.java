class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysBeforeWarmer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    daysBeforeWarmer[i] = j - i;
                    break;
                }
            }
        }
        return daysBeforeWarmer;
    }
}
