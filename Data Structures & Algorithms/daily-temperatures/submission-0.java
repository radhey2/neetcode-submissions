class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int current = temperatures[i];
            int j = i + 1;
            while (j < temperatures.length) {
                if (current < temperatures[j]) {
                    result[i] = j - i;
                    break;
                }
                j++;
            }
        }

        return result;
    }
}
