class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        int previous = 0;
        // for (int i = 0; i < temperatures.length; i++) {
        //     int current = temperatures[i];
        //     int j = i + 1;
        //     while (j < temperatures.length) {
        //         if (current < temperatures[j]) {
        //             result[i] = j - i;
        //             break;
        //         }
        //         j++;
        //     }
        // }

        for (int i = 0; i < temperatures.length; i++) {
            int current = temperatures[i];

            if (stack.empty()) {
                stack.push(i);
            } else {
                previous = stack.peek();
                while (!stack.empty() && temperatures[previous] < current) {
                    int j = stack.pop();
                    result[j] = i - j;
                    if (!stack.empty()) {
                        previous = stack.peek();
                    }
                }
                stack.push(i);
            }
        }

        return result;
    }
}
