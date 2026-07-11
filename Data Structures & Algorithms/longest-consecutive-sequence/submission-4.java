class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            // Start only from the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                count = Math.max(count, length);
            }
        }

        return count;
    }
}
